package view;

import base.BaseController;
import controller.MainViewController;
import controller.MusicTvController;
import entity.KuGouMusicPlay;
import entity.SingerList;
import entity.SingerListContains;
import entity.TableViewPlayInfoBean;
import flag.CommonResources;
import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import service.IMusicService;
import service.MusicServiceImple;
import utils.QuickUtils;
import utils.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static flag.CommonResources.BACKGROUND_HOVER;
import static flag.CommonResources.BACKGROUND_NORMAL;

/**
 * 歌手显示单元格
 */
public class SingerCell extends AnchorPane {

    private ImageView icon = new ImageView("icon/girl_FX2.png");
    private Label labSingerName = new Label("林俊杰");
    //存储当前cell的信息
    private SingerList.SingersBean.ListBean.InfoBean infoBean = null;
    IMusicService iMusicService = new MusicServiceImple();
    //hash  list
    List<String> hashList = new ArrayList<>();

    public SingerCell() {
        this.setBackground(BACKGROUND_NORMAL);
        this.setPrefWidth(150D);
        this.setPrefHeight(150D);

        icon.setFitWidth(120);
        icon.setFitHeight(120);

        getChildren().addAll(icon, labSingerName);

        AnchorPane.setTopAnchor(icon, 5D);
        AnchorPane.setBottomAnchor(icon, 5D);
        AnchorPane.setLeftAnchor(icon, 15D);
        AnchorPane.setRightAnchor(icon, 15D);

        AnchorPane.setTopAnchor(labSingerName, 130D);
        AnchorPane.setBottomAnchor(labSingerName, 5D);
        AnchorPane.setLeftAnchor(labSingerName, 15D);
        AnchorPane.setRightAnchor(labSingerName, 15D);

        setIconEvent();

        this.setOnMouseEntered(me -> this.setBackground(BACKGROUND_HOVER));
        this.setOnMouseExited(me -> this.setBackground(BACKGROUND_NORMAL));
    }

    public SingerCell(String iconUrl, String singerName) {
        this();
        setLabSingerName(singerName);
        setIcon(iconUrl);
    }

    public SingerCell(SingerList.SingersBean.ListBean.InfoBean infoBean) {
        this();
        this.infoBean = infoBean;
        setLabSingerName(infoBean.getSingername());
        setIcon(infoBean.getImgurl());
    }

    @Deprecated
    private void setIconEvent() {
        icon.setOnMouseClicked(me -> {
//            QuickUtils.showNotification("title", icon.getImage().impl_getUrl(), null);
            CompletableFuture.runAsync(() -> {
                ((MainViewController) BaseController.BC_CONTEXT.get(MainViewController.class.getName())).showSpinnerSearch(true);
                //点击歌手图片，取出infoBean的singerID
                int singerid = this.infoBean.getSingerid();
                CommonResources.singerId = singerid;
                CommonResources.currSelUrl = 2;
                SingerListContains singerListContains = iMusicService.getSingerListContains(singerid, 1);
                //得到歌手介绍信息
                SingerListContains.InfoBean info = singerListContains.getInfo();
                String imgurl = info.getImgurl();//得到歌手图片
                String singername = info.getSingername();//歌手姓名
                //info.getHas_long_intro();   //是否有长介绍
                String intro = info.getIntro();//得到介绍
                int songcount = info.getSongcount();//得到该歌手的所有歌曲数目
                //封装信息，传送到tableView显示
                TableViewPlayInfoBean tableViewPlayInfoBean = new TableViewPlayInfoBean(imgurl, singername, String.valueOf(songcount), intro);
                Platform.runLater(() -> {
                    ((MusicTvController) BaseController.BC_CONTEXT.get(MusicTvController.class.getName())).setPlayData(tableViewPlayInfoBean);
                });
                //得到歌手的歌曲信息
                SingerListContains.SongsBean songs = singerListContains.getSongs();
                songs.getPagesize();
                int total = songs.getTotal();
                List<SingerListContains.SongsBean.ListBean> songsList = songs.getList();
                //遍历得到所有hash值
                songsList.forEach(item -> hashList.add(item.getHash()));
                //获取每个hash对应的歌曲
                List<KuGouMusicPlay.DataBean> beanList = new ArrayList<>();
                iMusicService.handleHashs(hashList).forEach(item -> beanList.add(item.getData()));
                BaseController.BC_CONTEXT.get(MusicTvController.class.getName()).updateUi(beanList, 0);
                //允许分页控件setFactory
                CommonResources.isPaginationInit = true;
                Platform.runLater(() -> {
                    BaseController.BC_CONTEXT.get(MusicTvController.class.getName()).initData(total);
                });
            }).whenComplete((v, t) -> {
                System.out.println("icon.setOnMouseClicked--CompletableFuture结束");
                ((MainViewController) BaseController.BC_CONTEXT.get(MainViewController.class.getName())).showSpinnerSearch(false);
            });
        });
    }

    public void setLabSingerName(String name) {
        this.labSingerName.setText(name);
    }

    public void setIcon(String iconUrl) {
        this.icon.setImage(new Image(StringUtils.getImgUrl(iconUrl)));
    }
}
