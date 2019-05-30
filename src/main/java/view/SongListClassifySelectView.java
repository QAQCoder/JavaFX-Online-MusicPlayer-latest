package view;

import base.BaseController;
import com.jfoenix.controls.JFXMasonryPane;
import controller.SongListController;
import entity.SongClassifyContains;
import entity.SongListClassify;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import node.MyButton;
import org.controlsfx.control.Notifications;
import service.IMusicService;
import service.MusicServiceImple;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public class SongListClassifySelectView extends HBox {

    private MyButton btnClassifyName = new MyButton();
    private JFXMasonryPane jfxMP_Detail = new JFXMasonryPane();
    private SongListClassify.DataBean.InfoBean infoBean;
    private IMusicService musicService = new MusicServiceImple();
    private String currentCategoryId = "0";
    private int timestamp = 0;

    public SongListClassifySelectView() {

        getChildren().addAll(btnClassifyName, jfxMP_Detail);
        setPrefSize(1120, 100);
        setAlignment(Pos.TOP_LEFT);
        HBox.setHgrow(jfxMP_Detail, Priority.ALWAYS);
        jfxMP_Detail.setCellWidth(25);
        jfxMP_Detail.setCellHeight(8);
        getStylesheets().add("css/my_button_css.css");

        btnClassifyName.setDisable(true);
    }

    public SongListClassifySelectView(SongListClassify.DataBean.InfoBean infoBean) {
        this();
        this.infoBean = infoBean;
        newDataIsComing();
    }

    //新数据来了，更新UI
    private void newDataIsComing() {

        btnClassifyName.setText(infoBean.getCategoryname());
        btnClassifyName.setAttribute(infoBean.getCategoryid());
        //获取当前歌单类别，遍历取出子项显示在Label
        List<SongListClassify.DataBean.InfoBean.ChildBean> child = infoBean.getChild();
        child.forEach(label -> {
            MyButton btn = new MyButton(label.getCategoryname());
            btn.getStyleClass().add("btnQAQ");
            btn.setAttributesss(label.getCategoryid(), label.getCategoryname());
            jfxMP_Detail.getChildren().add(btn);
            setOnEvent_MyButton(btn);
        });
    }//

    private void setOnEvent_MyButton(MyButton btn) {
        btn.setOnMouseClicked(me -> {
            System.out.println("点击了：" + btn.getAttributes()[1]);
            CompletableFuture.supplyAsync(() -> {
                return musicService.getSongClassifyContains(btn.getAttributes()[0]);
            }).whenComplete((songClassifyContains, throwable) -> {
                int status = songClassifyContains.getStatus();
                if (1 != status) {
                    Notifications.create().title("错误").text("获取歌单类别：" + btn.getAttribute() + "发生网络异常").showInformation();
                } else {
                    SongClassifyContains.DataBean data = songClassifyContains.getData();
                    HashMap<String, Object> map = new HashMap<>();
                    map.put("classify", btn.getAttributes()[1]);
                    map.put("data", data);

                    if (currentCategoryId.equals(btn.getAttributes()[0])) { //两次点击的都是同一个类别，那么要比较时间戳，看是否要更新UI
                        if (this.timestamp == data.getTimestamp())
                            System.out.println("时间戳相同，不更新UI");
                        else {
                            BaseController.BC_CONTEXT.get(SongListController.class.getName()).updateUi(map, 2);
                            timestamp = data.getTimestamp();
                        }
                    } else {
                        BaseController.BC_CONTEXT.get(SongListController.class.getName()).updateUi(map, 2);
                        timestamp = data.getTimestamp();
                    }
                }
            });
        });
    }//
}
