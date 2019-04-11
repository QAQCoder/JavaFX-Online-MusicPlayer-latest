package controller;

import base.BaseController;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXSpinner;
import database.DbServiceImpl;
import database.IDbService;
import entity.KuGouMusicPlay;
import entity.NewMusicList;
import entity.RankList;
import entity.RankListContains;
import flag.CommonResources;
import flag.MusicResources;
import javafx.application.Platform;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.Pagination;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import net.ParseHTML;
import net.SurfTheNet;
import service.IMusicService;
import service.MusicServiceImple;
import utils.QuickUtils;
import view.NewSongCell;

import java.net.URL;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

/**
 * 音乐榜单controller
 */
public class RankMusicViewController extends BaseController implements Initializable {

    public Pagination pagination;
    public ImageView imgVBanner;
    public ListView<NewSongCell> jfxLvNewSongList;
    public ListView<RankList.RankBean.ListBean> jfxLvHotRank;
    public ListView<RankList.RankBean.ListBean> jfxLvSpecialRank;
    public ListView<RankList.RankBean.ListBean> jfxLvGlobalRank;
    public ListView<NewSongCell> jfxLvShowRankSongs;
    public JFXButton btnPlayAllNewSong;
    public JFXSpinner jfxSpinnerLoadData;
    public JFXButton btnPlayAllRankSong;
    public Text textRankName;

    private Image[] cacheImg = null;
    private NewMusicList list;
    private Map<Integer, List<NewSongCell>> mapNewSong = new HashMap<>();
    private Map<Integer, List<KuGouMusicPlay.DataBean>> mapNewSongData = new HashMap<>();
    private Map<String, List<NewSongCell>> mapRankSong = new HashMap<>();
    private Map<String, List<KuGouMusicPlay.DataBean>> mapRankSongData = new HashMap<>();

    private IMusicService iMusicService = new MusicServiceImple();

    private static final byte NEW_LV = 0;
    private static final byte RANK_LV = 1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cacheImg = new Image[]{
                new Image("icon/华语-ljj.jpg", 300, 120, false, false),
                new Image("icon/欧美-taile.jpeg", 300, 120, false, false),
                new Image("icon/韩国-icon.jpg", 300, 120, false, false),
                new Image("icon/日本-timg.jpg", 300, 120, false, false),
        };
        initView();
        initEvent();
        initData(null);
    }

    private void initView() {
        //设置成圆点
        pagination.getStyleClass().add(Pagination.STYLE_CLASS_BULLET);
        //
        jfxLvHotRank.setCellFactory(param -> new ListCell<RankList.RankBean.ListBean>(){
            @Override
            protected void updateItem(RankList.RankBean.ListBean item, boolean empty) {
                super.updateItem(item, empty);
                if (item != null) setText(item.getRankname());
            }
        });
        jfxLvSpecialRank.setCellFactory(param -> new ListCell<RankList.RankBean.ListBean>(){
            @Override
            protected void updateItem(RankList.RankBean.ListBean item, boolean empty) {
                super.updateItem(item, empty);
                if (item != null) setText(item.getRankname());
            }
        });
        jfxLvGlobalRank.setCellFactory(param -> new ListCell<RankList.RankBean.ListBean>(){
            @Override
            protected void updateItem(RankList.RankBean.ListBean item, boolean empty) {
                super.updateItem(item, empty);
                if (item != null) setText(item.getRankname());
            }
        });
    }

    private void initEvent() {
        pagination.setPageFactory(param -> {
            imgVBanner.setImage(cacheImg[param]);

            if (mapNewSong.isEmpty()) {
                initNewSongData();
            } else {
                if (jfxLvNewSongList.getItems().size() > 0) jfxLvNewSongList.getItems().clear();
                System.out.println(jfxLvNewSongList.getItems().size());
                jfxLvNewSongList.getItems().addAll(mapNewSong.get(param));
            }
            return CommonResources.getNode();
        });

        imgVBanner.setOnMouseClicked(me -> {
            System.out.println("imgVBanner.setOnMouseClicked");
            QuickUtils.showNotification("title", "内容", null);

            initNewSongData();
        });

        initLvSelect(jfxLvHotRank);
        initLvSelect(jfxLvSpecialRank);
        initLvSelect(jfxLvGlobalRank);

        jfxLvShowRankSongs.setOnMouseClicked(me -> {
            if (me.getClickCount() == 2) {
                NewSongCell selectedItem = jfxLvShowRankSongs.getSelectionModel().getSelectedItem();
                if (null == selectedItem) return;
//                ((BottomController)BaseController.BC_CONTEXT.get(BottomController.class.getName())).playMusic(, true);
            }
        });

        btnPlayAllNewSong.setOnAction(ae -> {
            List<KuGouMusicPlay.DataBean> cellsData = mapNewSongData.get(pagination.getCurrentPageIndex());
            //添加到[播放列表]，先保存到数据库
            IDbService dbService = DbServiceImpl.getInstance();
            CompletableFuture.supplyAsync(() -> {
                //判断是否添加的是同一列表
                boolean head = dbService.searchAlbumContainSongs("curr_playing", cellsData.get(0));
                boolean middle = dbService.searchAlbumContainSongs("curr_playing", cellsData.get(cellsData.size() / 2));
                boolean tail = dbService.searchAlbumContainSongs("curr_playing", cellsData.get(cellsData.size() - 1));
                if (head && middle && tail) return false;

                return dbService.insertMusicListToSpecialAlbum("curr_playing", cellsData);
            }).whenComplete((insertRes, throwable) -> {
                if (null != throwable) throwable.printStackTrace();
                System.out.println("btnPlayAllNewSong.setOnAction---是否是UI线程：" + Platform.isFxApplicationThread());
                if (insertRes) {
                    BaseController.BC_CONTEXT.get(LeftController.class.getName()).updateUi("播放列表", 0);
                    MusicResources.getInstance().setCurrMusicList(cellsData);
                } else {
                    System.out.println("添加到[播放列表]，出现异常");
                }
            });
        });

        btnPlayAllRankSong.setOnAction(ae -> {
            if (jfxLvShowRankSongs.getItems().isEmpty()) {
                System.out.println("RankMusicViewController---jfxLvShowRankSongs.getItems().isEmpty()");
                return;
            } else {
                MusicResources.getInstance().setCurrMusicList(mapRankSongData.get(jfxLvShowRankSongs.getItems().get(0).getAttribute()));
            }
        });
    }//initEvent

    private void initNewSongData() {
//        System.out.println("RankMusicViewController---initNewSongData");
        CompletableFuture.supplyAsync(() -> {
            //显示进度条
            imgVBanner.setOpacity(0.3);
            if (jfxSpinnerLoadData.isVisible()){
                System.out.println("不急，上次的请求还没完成呢");
                return null;
            } else {
                jfxSpinnerLoadData.setVisible(true);
            }

            List<List<String>> newSongHashs = ParseHTML.getInstance().getNewSongHashs();
            List<List<KuGouMusicPlay>> lists = new ArrayList<>();
            newSongHashs.forEach(item -> lists.add(iMusicService.handleHashs(item)));
            return lists;
        }).whenComplete((lists, t) -> {
            //隐藏进度条
            if (null == t && null != lists) {
                imgVBanner.setOpacity(1.0);
                jfxSpinnerLoadData.setVisible(false);
            }

            if (null != t) {
                System.out.println("RankMusicViewController---initNewSongData--出现异常");
                t.printStackTrace();
            }
            /*Stream.iterate(0, i -> i+1).limit(lists.size()).forEach(i -> {
                List<NewSongCell> cells = new ArrayList<>();
                List<KuGouMusicPlay.DataBean> cellsData = new ArrayList<>();
                lists.forEach(bean -> {
                    Stream.iterate(0, j -> j+1).limit(bean.size()).forEach(j -> {
                        KuGouMusicPlay.DataBean data = bean.get(j).getData();
                        cellsData.add(data);
                        cells.add(new NewSongCell(j+1, data));
                    });
                    *//*for (int j = 0; j < bean.size(); j++) {
                        KuGouMusicPlay.DataBean data = bean.get(j).getData();
                        cellsData.add(data);
                        cells.add(new NewSongCell(j+1, data));
                    }*//*
                });
                mapNewSong.put(i, cells);
                mapNewSongData.put(i, cellsData);
            });*/
            if (null == lists) return;

            //优化代码结构，不要在循环里面new对象
            List<NewSongCell> cells = null;
            List<KuGouMusicPlay.DataBean> cellsData = null;
            NewSongCell cell = null;

            for (int i = 0; i < lists.size(); i++) {
                cells = new ArrayList<>();
                cellsData = new ArrayList<>();
                List<KuGouMusicPlay> plays = lists.get(i);
                for (int j = 0; j < plays.size(); j++) {
                    KuGouMusicPlay.DataBean data = plays.get(j).getData();
                    cellsData.add(data);
                    cell = new NewSongCell(j+1, data, NEW_LV);
                    cells.add(cell);
                }
                mapNewSong.put(i, cells);
                mapNewSongData.put(i, cellsData);
            }
            if (jfxLvNewSongList.getItems().size() > 0) Platform.runLater(() -> jfxLvNewSongList.getItems().clear());
            Platform.runLater(() -> jfxLvNewSongList.getItems().addAll(mapNewSong.get(pagination.getCurrentPageIndex())));
        });
    }//

    private void initLvSelect(ListView<RankList.RankBean.ListBean> listView) {
        listView.setOnMouseClicked(me -> {
            if (me.getClickCount() == 2) {
                CompletableFuture.supplyAsync(() -> {
                    RankList.RankBean.ListBean selectedItem = listView.getSelectionModel().getSelectedItem();
                    //先判断是否已经缓存
                    if (!mapRankSong.containsKey(selectedItem.getRankname())) {
                        RankListContains rankListContains = iMusicService.getRankListContains(selectedItem.getRankid());
                        RankListContains.SongsBean songs = rankListContains.getSongs();

                        List<String> hashList = new ArrayList<>();
                        songs.getList().forEach(item -> hashList.add(item.getHash()));

                        return iMusicService.handleHashs(hashList);
                    } else {
                        return null;
                    }
                }).handle((kuGouMusicPlays, throwable) -> {
                    RankList.RankBean.ListBean selectedItem = listView.getSelectionModel().getSelectedItem();

                    if (null == kuGouMusicPlays) {
                        return mapRankSong.get(selectedItem.getRankname());
                    } else {
                        List<NewSongCell> newSongCells = new ArrayList<>(kuGouMusicPlays.size());
                        List<KuGouMusicPlay.DataBean> cellsData = new ArrayList<>();
                        Stream.iterate(0, i -> i+1).limit(kuGouMusicPlays.size()).forEach(i -> {
                            NewSongCell newSongCell = new NewSongCell(i + 1, kuGouMusicPlays.get(i).getData(), RANK_LV, true);
                            newSongCell.setAttribute(selectedItem.getRankname());
                            newSongCells.add(newSongCell);
                            cellsData.add(kuGouMusicPlays.get(i).getData());
                        });
                        mapRankSong.put(selectedItem.getRankname(), newSongCells);
                        mapRankSongData.put(selectedItem.getRankname(), cellsData);
                        return newSongCells;
                    }
                }).whenComplete((newSongCells, throwable) -> {
                    if (jfxLvShowRankSongs.getItems().size() > 0) Platform.runLater(() -> jfxLvShowRankSongs.getItems().clear());
                    Platform.runLater(() -> jfxLvShowRankSongs.getItems().addAll(newSongCells));
                });
            }
        });
    }//

    @Override
    public void initData(Object data) {
//        System.out.println("RankMusicViewController-----initData获取音乐榜单数据");
        if (data != null) {
            list = (NewMusicList) data;
            return;
        }

        CompletableFuture.runAsync(() -> {
            list = SurfTheNet.visitTheNetword(SurfTheNet.NEWEST_MUSIC_LIST, NewMusicList.class);
        }).whenComplete((v, t) ->
            updateUi(list, 0)
        );

        CompletableFuture.runAsync(() -> {
            RankList rankList = iMusicService.getRankList();
            List<RankList.RankBean.ListBean> beanList = rankList.getRank().getList();
            //热门榜单
            for (int i = 0; i < 12; i++)  jfxLvHotRank.getItems().add(beanList.get(i));
            //特色音乐
            for (int i = 12; i < 18; i++) jfxLvSpecialRank.getItems().add(beanList.get(i));
            //全球榜
            for (int i = 18; i < 23; i++) jfxLvGlobalRank.getItems().add(beanList.get(i));
        });
    }//initData

    @Override
    public void updateUi(Object data, int flag) {

    }//updateUI

    public ListView<NewSongCell> getLvWithFlag(byte flag) {
        switch (flag) {
            case 0:
                return jfxLvNewSongList;
            case 1:
                return jfxLvShowRankSongs;
            default:
                return null;
        }
    };
};
