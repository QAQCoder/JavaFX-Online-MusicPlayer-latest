package controller;

import base.BaseController;
import com.jfoenix.controls.*;
import entity.SongClassifyContains;
import entity.SongList;
import entity.SongListClassify;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import node.MyButton;
import org.controlsfx.control.Notifications;
import service.IMusicService;
import service.MusicServiceImple;
import view.SongListCell;
import view.SongListClassifySelectView;

import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.CompletableFuture;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：歌单列表Controller
 */
public class SongListController extends BaseController implements Initializable {

    public ScrollPane scrollPane;
    public JFXButton btnRefresh;
    public JFXMasonryPane jfxMasonryPane;
    public JFXSpinner jfxSpinner;
    public JFXButton btnSelectClassify;
    public StackPane stackPane;
    public Text textCurrSongListClassifyName;

    IMusicService musicService = new MusicServiceImple();

    private ObservableList<Node> jfxMasonryPaneChildren = null;
    private List<SongListCell> songListCells = new ArrayList<>();
    private SongList.PlistBean.ListBean listBean = null;
    private SongClassifyContains.DataBean listBean2 = null;

    private List<SongListClassify.DataBean.InfoBean> classifyList = null;
    private VBox classifyVBox = null;

    private TextArea textArea = new TextArea();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initView();
        initEvent();
        //初始化歌单数据
        initData(null);
    }

    private void initView() {
         jfxMasonryPaneChildren = jfxMasonryPane.getChildren();
        //绑定宽度高度
        jfxMasonryPane.prefWidthProperty().bind(scrollPane.widthProperty());
        scrollPane.prefHeightProperty().addListener((observable, oldValue, newValue) -> jfxMasonryPane.setPrefHeight(newValue.doubleValue()));
    }

    //刷新按钮事件
    private void initEvent() {
        btnRefresh.setOnMouseClicked(me -> this.initData(null));

        btnSelectClassify.setOnMouseClicked(me -> {
            if (classifyVBox != null && !classifyVBox.getChildren().isEmpty()) {
                showJFX_Dialog(classifyVBox);
            } else {
                CompletableFuture.supplyAsync(() -> {
                    return musicService.getSongListClassify().getData().getInfo();
                }).handle((infoBeans, throwable) -> {
                    if (null != throwable) {
                        throwable.printStackTrace();
                        if (throwable instanceof UnknownHostException)
                            Notifications.create().title("错误").text("网络出现异常咯！").showWarning();
                    }
                    else if (null != infoBeans){
                        if (classifyVBox == null) classifyVBox = new VBox();
                        infoBeans.forEach(bean -> Platform.runLater(() -> classifyVBox.getChildren().add(new SongListClassifySelectView(bean))));
                        Platform.runLater(() -> showJFX_Dialog(classifyVBox));
                    }
                    return null;
                });
            }
        });
    }

    private void showJFX_Dialog(Node node) {
        JFXDialogLayout content = new JFXDialogLayout();
        content.setBody(node);
        MyButton btnClose = new MyButton("关闭");
        content.setActions(btnClose);
        content.setPrefSize(1120, 580);
        JFXDialog dialog = new JFXDialog(stackPane, content, JFXDialog.DialogTransition.CENTER);
        dialog.show();
        btnClose.setOnAction(ae -> dialog.close() );
    }

    @Override
    public void initData(Object data) {
        //得到所有歌单数据
        CompletableFuture.runAsync(() -> {
            jfxSpinner.setVisible(true);
            //把得到的数据存在listBean
            SongList.PlistBean.ListBean tempList = musicService.getSongList();
            //如果listBean为null或者最新请求的时间戳跟老的不一样，那么就更新UI
            if (listBean == null || (tempList.getTimestamp() != listBean.getTimestamp()) || jfxMasonryPaneChildren.size() < listBean.getInfo().size() )  {
                listBean = tempList;
                this.updateUi(listBean, 1);
            }
            //时间戳相同，不更新UI
            else {
                System.out.println("获取歌单，getTimestamp()相同，不更新UI");
            }
        }).whenComplete((v, t) -> {
            Platform.runLater(() -> jfxSpinner.setVisible(false));
            if (t != null) {
                t.printStackTrace();
                System.out.println("SongListController--initData--异常情况：" + t);
                if (t instanceof UnknownHostException)
                    Notifications.create().title("错误").text("网络出现异常咯！").showWarning();
            }
        });


    }

    //这里flag可以用来确定是什么bean
    @Override
    public void updateUi(Object data, int flag) {
        if (data == null)
            throw new IllegalArgumentException("SongListController--updateUi--data=null");

        Platform.runLater(() -> {
            jfxMasonryPaneChildren.clear();
            songListCells.clear();
            jfxSpinner.setVisible(true);
        });

        switch (flag) {
            case 1:
                listBean = (SongList.PlistBean.ListBean) data;
                listBean.getInfo().forEach(item -> songListCells.add(new SongListCell(item)));
                textCurrSongListClassifyName.setText("热门推荐");
                break;
            case 2:
                HashMap<String, Object> map = (HashMap<String, Object>) data;
                listBean2 = (SongClassifyContains.DataBean) map.get("data");
                listBean2.getInfo().forEach(item -> songListCells.add(new SongListCell(item)));
                textCurrSongListClassifyName.setText((String) map.get("classify"));
                break;
        }
        //这句为什么不执行？？？，发现问题了，jfxMasonryPaneChildren.add要加Platform.runLater
        //这里有个疑问，Platform.runLater加了之后貌似会卡顿，暂时不知为何：已知，不要执行耗时操作
        Platform.runLater(() -> {
            jfxMasonryPaneChildren.addAll(songListCells);
            jfxSpinner.setVisible(false);
        });
    }//
};
