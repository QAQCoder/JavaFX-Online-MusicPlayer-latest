package controller;

import base.BaseController;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import entity.KuGouMusicPlay;
import entity.SingerListContains;
import entity.SongListContains;
import entity.TableViewPlayInfoBean;
import flag.CommonResources;
import flag.MusicResources;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import service.IMusicService;
import service.MusicServiceImple;
import utils.LoadUtil;
import utils.QuickUtils;
import utils.StringUtils;
import utils.TimeUtils;
import view.CommonView;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class MusicTvController extends BaseController implements Initializable {

    @FXML public Pagination pagination;
    @FXML public TableView<KuGouMusicPlay.DataBean> tableView;
    @FXML public TableColumn tColumn_first;
    @FXML public TableColumn tColumn_music;
    @FXML public TableColumn tColumn_musical;
    @FXML public TableColumn tColumn_album;
    @FXML public TableColumn tColumn_time;
    public TableColumn tColumn_operate;

    public BorderPane music_pane;
    public ImageView imgViewIcon;
    public Label labTitle;
    public Button btnPlay;
    public JFXTextArea jfxTextAreaIntro;
    public Label labOtherInfo;
    //标志位，记录LyricController是否已经load
    private boolean isLyricLoad = false;
    //顶部数据实体
    private TableViewPlayInfoBean tableViewPlayInfoBean = new TableViewPlayInfoBean("icon/search_music_icon_2.png", "搜索结果", null, "无介绍");
    //service
    private IMusicService iMusicService = new MusicServiceImple();
    //
    private List<String> hashList = new ArrayList<>();
    //
    private List<KuGouMusicPlay.DataBean> beanList = new ArrayList<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initView();
        //初始化event
        initEvent();
    }

    private void initView() {
        tColumn_first.setCellFactory(param -> new TableCell(){
            @Override
            protected void updateItem(Object item, boolean empty) {
                if (!empty) setText(String.valueOf(getIndex()+1));
            }
        });
        tColumn_music.setCellValueFactory(new PropertyValueFactory<>("audio_name"));
        tColumn_music.setCellFactory(param -> new TableCell(){
            @Override
            protected void updateItem(Object item, boolean empty) {
                if (item != null) {
                    String s = String.valueOf(item);
                    int begin = s.indexOf("- ");
                    setText(s.substring(begin+1));
                }
            }
        });
        tColumn_musical.setCellValueFactory(new PropertyValueFactory<>("author_name"));
        tColumn_album.setCellValueFactory(new PropertyValueFactory<>("album_name"));
        tColumn_time.setCellValueFactory(new PropertyValueFactory<>("timelength"));
        tColumn_time.setCellFactory(param -> new TableCell(){
            @Override
            protected void updateItem(Object item, boolean empty) {
                if (item != null) setText(TimeUtils.handleSecond((Integer)item));
            }
        });
        tColumn_operate.setCellFactory(param -> new TableCell(){
            @Override
            protected void updateItem(Object item, boolean empty) {
                setGraphic(new JFXButton("+"));
                //难题：怎么知道当前是哪一行，已解决，使用getIndex();
                tvAddBtnEventBatchInit(getGraphic(), getIndex());
            }
        });
    }

    private void tvAddBtnEventBatchInit(Node btn, int currIndex) {
//        System.out.println("---------------tvAddBtnEventBatchInit------------------------");
        //点击添加按钮后，显示一个ContextMenu，选择添加到哪个收藏夹
        btn.setOnMouseClicked(me -> {
            System.out.println("添加点击事件触发------------");
            tableView.getSelectionModel().select(currIndex);
            //更新当前选择的音乐
            CommonResources.currMusicBean = tableView.getSelectionModel().getSelectedItem();

            ContextMenu cm = CommonView.getInstance().getAddAlbumContextMenu();
            cm.show(btn.getScene().getWindow(), me.getScreenX()-50, me.getScreenY()+20);
            cm.setHideOnEscape(false);
        });
    }

    private void initEvent() {
        tableView.setOnMouseClicked(me -> {
            if (me.getClickCount() == 2) {
                MusicResources.getInstance().setCurrMusicList(tableView.getSelectionModel().getSelectedItem());
                ((BottomController) BaseController.BC_CONTEXT.get(BottomController.class.getName())).playMusic(tableView.getSelectionModel().getSelectedItem(), true);
            }
        });

        btnPlay.setOnAction(ae -> {
            if (tableView.getItems() != null && tableView.getItems().size() > 0)
                MusicResources.getInstance().setCurrMusicList(tableView.getItems());
        });

        //分页控件事件
        pagination.setPageFactory(param -> {
            if (!CommonResources.isPaginationInit) {
                pagination.setDisable(true);
                System.out.println("pagination setPageFactory stop");
                return null;
            } else {
                System.out.println("pagination setPageFactory start");
                pagination.setDisable(false);
                if (!CommonResources.isPaginationDone) {
                    System.out.println("不急不急，上次分页请求还没完成呢----------");
                    return CommonResources.getNode();
                }
                requestMusic(param);
                return CommonResources.getNode();
            }
        });
    }//

    private MusicResources.CurrentSelectIndexCallback currentSelectIndexCallback = index -> {
        tableView.getSelectionModel().select(index);
        tableView.scrollTo(index <= 5 ? 0 : index - 5);
    };

    /**
     * 配合分页控件使用的
     * @param page 哪一页
     */
    private void requestMusic(int page) {
        CompletableFuture.runAsync(() -> {
            CommonResources.isPaginationDone = false;

            System.out.println("获取指定页" + page + "的音乐");
            ((MainViewController)BC_CONTEXT.get(MainViewController.class.getName())).showSpinnerSearch(true);
            /*
             * 说明一下：
             * 由于表格中存放的数据不一定都是搜索数据，所以每次点击分页控件，不应该总是去搜索
             * 应该设置【标志位】，记录当前需要的url，好让pagination获取正确的url
             */
            switch (CommonResources.currSelUrl) {
                case 0: //搜索
                    System.out.println("分页控件点击---->搜索模式");
                    pagination.setDisable(true);
                    String keyword = ((MainViewController) BC_CONTEXT.get(MainViewController.class.getName())).getKeyword();
                    updateUi(iMusicService.getSearchMusicList(keyword, page+1, 30), 0);
                    break;
                case 1: //歌单
                    System.out.println("分页控件点击---->歌单模式");
                    pagination.setDisable(true);
                    SongListContains songListContains = iMusicService.getSongListContains(CommonResources.specialid, page + 1);
                    hashList.clear();
                    songListContains.getList().getList().getInfo().forEach(item -> hashList.add(item.getHash()));
                    beanList.clear();
                    //处理hash列表
                    iMusicService.handleHashs(hashList).forEach(item -> beanList.add(item.getData()));
                    updateUi(beanList, 0);
                    break;
                case 2: //歌手
                    System.out.println("分页控件点击---->歌手信息模式");
                    pagination.setDisable(true);
                    SingerListContains singerListContains = iMusicService.getSingerListContains(CommonResources.singerId, page + 1);
                    hashList.clear();
                    singerListContains.getSongs().getList().forEach(item -> hashList.add(item.getHash()));
                    //处理hash列表
                    beanList.clear();
                    iMusicService.handleHashs(hashList).forEach(item -> beanList.add(item.getData()));
                    updateUi(beanList, 0);
                    break;
            }
        }).whenComplete((v, t) -> {
            CommonResources.isPaginationDone = true;

            ((MainViewController)BC_CONTEXT.get(MainViewController.class.getName())).showSpinnerSearch(false);
            if (t != null)
                System.out.println("获取指定页的音乐抛异常" + t.getMessage());
        });
    }//

    private void playMusic() {
        KuGouMusicPlay.DataBean selectedItem = tableView.getSelectionModel().getSelectedItem();
        /*List<Lyric> lyricList = IOUtils.getInitLyricList(selectedItem.getLyrics());
        Map<String, Object> map = new HashMap<>();
        map.put("musicInfo", selectedItem);
        map.put("musicLyric", lyricList);*/

        //先判断LyricController是否实例化了，判空
        CompletableFuture.runAsync(() -> {
            if (!isLyricLoad) {
                System.out.println("。。。歌词面板未实例化。。。");
                LoadUtil.loadFXML("fxml/items/lyric_view.fxml");
                isLyricLoad = true;
            } else {
                System.out.println("。。。歌词面板已实例化。。。");
            }
        }).whenComplete((v, t) -> {
            if (t != null) {
                t.printStackTrace();
                QuickUtils.showNotification("错误 ", "播放音乐出现错误", null);
            }
        });
        //双击就播放
        ((BottomController)BC_CONTEXT.get(BottomController.class.getName())).playMusic(selectedItem, true);
        //并且把音乐加到播放列表
        MusicResources.getInstance().setCurrMusicList(tableView.getItems());
        MusicResources.getInstance().setSelectIndexCallback(currentSelectIndexCallback);
    }

    @Override
    public void updateUi(Object data, int flag) {
        List<KuGouMusicPlay.DataBean> beanList = (List<KuGouMusicPlay.DataBean>) data;
        CompletableFuture.runAsync(() ->{
            Platform.runLater(() -> tableView.getItems().clear());
        }).whenComplete((v, t) -> {
            pagination.setDisable(false);
            if (t != null) {
                t.printStackTrace();
                QuickUtils.showNotification("错误 ", "向表格添加音乐数据，出现异常", null);
            } else {
                List<KuGouMusicPlay.DataBean> collect = beanList.stream().filter(bean -> !"".equals(bean.getSong_name().trim()) ).collect(Collectors.toList());
                Platform.runLater(() -> tableView.getItems().addAll(collect));
            }
        });
    }

    @Override
    public void initData(Object data) {
        initTopViewInfo();
        initPagination((int)data);
    }

    public void setPlayData(TableViewPlayInfoBean bean) {
        if (bean == null) return;
        tableViewPlayInfoBean = bean;
    }

    //初始化顶部view的信息
    public void initTopViewInfo() {
        System.out.println("initTopViewInfo--初始化顶部view的信息");
        imgViewIcon.setImage(new Image(StringUtils.getImgUrl(tableViewPlayInfoBean.getImgUrl())));
        labTitle.setText(tableViewPlayInfoBean.getTitle());
        labOtherInfo.setText(tableViewPlayInfoBean.getOtherInfo());
        jfxTextAreaIntro.setText(tableViewPlayInfoBean.getIntroduction());
    }

    //初始化分页控件，在每次有新数据到达TableView之后
    private void initPagination(int totalCount) {
        pagination.setCurrentPageIndex(0);
        //设置pagination的页数
        pagination.setPageCount((totalCount%30) > 0 ? (totalCount/30 + 1) : totalCount/30);
    }

    public TableView<KuGouMusicPlay.DataBean> getTableView() {
        return tableView;
    }

    public boolean isTvSelected() {
        if (tableView.getSelectionModel().getSelectedItem() != null)
            return true;
        else
            return false;
    }

    public KuGouMusicPlay.DataBean getTvSelectItem() {
        if (!isTvSelected()) tableView.getSelectionModel().select(0);

        return tableView.getSelectionModel().getSelectedItem();
    }
};
