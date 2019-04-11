package view;

import base.BaseController;
import com.jfoenix.controls.JFXButton;
import controller.MainViewController;
import controller.MusicTvController;
import entity.*;
import flag.CommonResources;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import service.IMusicService;
import service.MusicServiceImple;
import utils.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static flag.CommonResources.BACKGROUND_HOVER;
import static flag.CommonResources.BACKGROUND_NORMAL;

public class SongListCell extends AnchorPane {

    private static IMusicService iMusicService = new MusicServiceImple();

    private ImageView icon = new ImageView("icon/girl_FX2.png");
    private Label labSongListName = new Label("歌单名");
    private JFXButton btnPlaySongList = new JFXButton("Play");
    private HBox hBox = new HBox(labSongListName, btnPlaySongList);
    //存储当前歌单信息-1
    private SongList.PlistBean.ListBean.InfoBean infoBean;
    //存储当前歌单信息-2
    private SongClassifyContains.DataBean.InfoBean infoBean2;
    //提示
    private static Tooltip tooltip = new Tooltip("歌单~~~");
    //hash  list
    List<String> hashList = new ArrayList<>();

    public SongListCell(SongList.PlistBean.ListBean.InfoBean bean) {
        this(); //调用无参构造

        this.infoBean = bean;
        setIcon(StringUtils.getImgUrl(infoBean.getImgurl()));
        setLabSongListName(infoBean.getSpecialname());
    }//构造

    public SongListCell(SongClassifyContains.DataBean.InfoBean bean) {
        this(); //调用无参构造

        this.infoBean2 = bean;
        setIcon(StringUtils.getImgUrl(infoBean2.getImgurl()));
        setLabSongListName(infoBean2.getSpecialname());
    }//构造

    public SongListCell() {
        icon.setFitWidth(150);
        icon.setFitHeight(150);

        hBox.setPadding(new Insets(5, 2, 5, 2));
        hBox.setPrefWidth(150);
        hBox.setPrefHeight(17);
        getChildren().addAll(icon, hBox);

        //设置歌单播放按钮的事件
        btnPlaySongList.setOnMouseClicked(me -> {
            if (null != infoBean)
                playList(infoBean.getSpecialid());
            else if ((null != infoBean2))
                playList(infoBean2.getSpecialid());
        });

        this.setOnMouseEntered(me -> hBox.setBackground(BACKGROUND_HOVER));
        this.setOnMouseExited(me -> hBox.setBackground(BACKGROUND_NORMAL));

        labSongListName.setPrefWidth(105);
        btnPlaySongList.setPrefWidth(45);

        AnchorPane.setTopAnchor(icon, 0D);
        AnchorPane.setBottomAnchor(icon, 0D);
        AnchorPane.setLeftAnchor(icon, 0D);
        AnchorPane.setRightAnchor(icon, 0D);

        AnchorPane.setTopAnchor(hBox, 140D);
        AnchorPane.setBottomAnchor(hBox, 0D);
        AnchorPane.setLeftAnchor(hBox, 0D);
        AnchorPane.setRightAnchor(hBox, 0D);

        hBox.setBackground(BACKGROUND_NORMAL);

        labSongListName.setOnMouseEntered(me -> {
            tooltip.setText(labSongListName.getText());
            tooltip.setFont(Font.font(13));
            tooltip.show(labSongListName.getScene().getWindow());
            tooltip.setX(me.getScreenX());
            tooltip.setY(me.getScreenY());
        });

        labSongListName.setOnMouseExited(me -> tooltip.hide());
    }//无参构造

    public void setLabSongListName(String name) {
//        System.out.println("注入name" + name);
        this.labSongListName.setText(name);
    }

    public void setIcon(String imgUrl) {
//        System.out.println("注入imgUrl" + imgUrl);
        this.icon.setImage(new Image(imgUrl));
    }

    public void playList(int specialid) {
        //如果点击了播放歌单的按钮，把当前歌单的数据传送到TableView
        CommonResources.specialid = specialid;
        CommonResources.currSelUrl = 1;
        SongListContains songListContains = iMusicService.getSongListContains(specialid, 1);
        //目标：得到所有歌曲的hash值
        SongListContains.InfoBeanX.ListBeanXX listBeanXX = songListContains.getInfo().getList();
        //三个需要的信息
        String imgurl = listBeanXX.getImgurl();
        String specialname = listBeanXX.getSpecialname();
        String intro = listBeanXX.getIntro();
        int songcount = listBeanXX.getSongcount();
        //封装起来
        TableViewPlayInfoBean tableViewPlayInfoBean = new TableViewPlayInfoBean(imgurl, specialname, String.valueOf(songcount), intro);
        ((MusicTvController)BaseController.BC_CONTEXT.get(MusicTvController.class.getName())).setPlayData(tableViewPlayInfoBean);
        //显示
        List<SongListContains.ListBeanX.ListBean.InfoBean> beanXListInfo = songListContains.getList().getList().getInfo();

        CompletableFuture.runAsync(() -> {
            ((MainViewController)BaseController.BC_CONTEXT.get(MainViewController.class.getName())).showSpinnerSearch(true);
            //这里得到hash了，接下来，处理hash
            beanXListInfo.forEach(item -> hashList.add(item.getHash()) );
            List<KuGouMusicPlay.DataBean> beanList = new ArrayList<>();
            //处理hash列表
            iMusicService.handleHashs(hashList).forEach(item -> beanList.add(item.getData()));
            //更新表格和分页控件
            BaseController.BC_CONTEXT.get(MusicTvController.class.getName()).updateUi(beanList, 0);
            //允许分页控件setFactory
            CommonResources.isPaginationInit = true;
            Platform.runLater(() -> BaseController.BC_CONTEXT.get(MusicTvController.class.getName()).initData(songcount));
        }).whenComplete((v, t) -> {
            ((MainViewController)BaseController.BC_CONTEXT.get(MainViewController.class.getName())).showSpinnerSearch(false);
        });
    }
}
