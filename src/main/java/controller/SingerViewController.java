package controller;

import base.BaseController;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXMasonryPane;
import com.jfoenix.controls.JFXSpinner;
import entity.SingerClassify;
import entity.SingerList;
import flag.CommonResources;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import node.MyButton;
import org.controlsfx.control.Notifications;
import service.IMusicService;
import service.MusicServiceImple;
import view.SingerCell;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public class SingerViewController extends BaseController implements Initializable {

    public JFXMasonryPane jfxMasonryPaneDetail;
    private ObservableList<Node> jfxMPaneDetailChildren;
    public JFXMasonryPane jfxMasonryPaneAZ;
    public ScrollPane scrollPane;
    public JFXButton btnRefresh;
    public JFXSpinner jfxSpinner;

    private JFXButton[] btnA_Z = new JFXButton[26];
    private MyButton[] btnSingerClassify = new MyButton[10];
    public VBox vbox;
    private int currSelectClassifyId = 88;
    private IMusicService iMusicService = MusicServiceImple.getInstance();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initView();
        initEvent();
    }

    private void initView() {
        jfxMasonryPaneAZ.prefHeightProperty().addListener((observable, oldValue, newValue) -> AnchorPane.setTopAnchor(jfxMasonryPaneDetail, newValue.doubleValue() + 3.0));
        jfxMasonryPaneDetail.prefWidthProperty().bind(scrollPane.widthProperty());
        jfxMPaneDetailChildren = jfxMasonryPaneDetail.getChildren();

        initData(88);
        //初始化26个按钮
        init_AZ_Button();
        //初始化歌手分类的10个按钮
        init_SingerClassify_Button();
    }

    private void init_AZ_Button() {
        for (int i = 0; i < 26; i++) {
            btnA_Z[i] = new JFXButton(String.valueOf((char)(96 + i + 1)).toUpperCase());
            jfxMasonryPaneAZ.getChildren().add(btnA_Z[i]);
            init_AZ_Btn_Event(btnA_Z[i]);
        }
    }

    private void init_AZ_Btn_Event(JFXButton btn) {
        btn.setOnAction(ae -> {
            System.out.println(btn.getText());
        });
    }//

    private void init_SingerClassify_Button() {

        CompletableFuture.supplyAsync(() -> {
            return iMusicService.getAllSingerClassify().getList();
        }).whenComplete((singerClassifyList, throwable) -> {
            if (null != throwable){
                Notifications.create().title("错误").text("获取歌手分类出错-->" + throwable.getMessage()).showError();
                throwable.printStackTrace();
            } else if (null != singerClassifyList){
                for (int i = 0; i < 10; i++) {
                    SingerClassify.ListBean bean = singerClassifyList.get(i);
                    btnSingerClassify[i] = new MyButton(bean.getClassname());
                    btnSingerClassify[i].setAttribute(String.valueOf(bean.getClassid()));
                    init_SingerClassify_Button_Event(btnSingerClassify[i]);
                }
                Platform.runLater(() -> vbox.getChildren().addAll(Arrays.stream(btnSingerClassify).collect(Collectors.toList())));
            }
        });
    }//

    private void init_SingerClassify_Button_Event(MyButton btn) {
        btn.setOnAction(ae -> {
//            System.out.println("请求歌手分类：" + btn.getText() + " - " + btn.getAttribute());
            currSelectClassifyId = Integer.parseInt(btn.getAttribute());
            updateUi(null, currSelectClassifyId);
        });
    }

    private void initEvent() {
        btnRefresh.setOnAction(ae -> {
            if (vbox.getChildren().size() <= 1) init_SingerClassify_Button();
            initData(currSelectClassifyId);
        });
    }//

    @Override
    public void initData(Object data) { //这里data暂时无用
//        System.out.println("SingerViewController---initData----" + (int)data);
        if (!CommonResources.isSingerRefreshDone) {
            Notifications.create().title("不急").text("上次获取歌手列表没完成").showInformation();
            return;
        }

        CompletableFuture.supplyAsync(() -> {
//            System.out.println("SingerViewController---initData---runAsync");
            CommonResources.isSingerRefreshDone = false;    //改标志
            jfxSpinner.setVisible(true);    //显示进度条
            return iMusicService.getSingerList((int) data);   //根据id得到歌手
        }).whenComplete((list, throwable) -> {
            CommonResources.isSingerRefreshDone = true; //改标志

            if (throwable != null) {    //判断是否发生异常
                throwable.printStackTrace();    //打印异常调用栈
                Platform.runLater(() -> jfxSpinner.setVisible(false)); //隐藏进度条
                System.out.println("SingerViewController---initData--获取歌手--抛异常" + throwable.getMessage());
            } else if (null != list){
                if (jfxMPaneDetailChildren.size() > 0)
                    Platform.runLater(() -> jfxMPaneDetailChildren.clear() );
                List<SingerList.SingersBean.ListBean.InfoBean> singersListInfo = list.getSingers().getList().getInfo();
//                System.out.println("歌手数量：" + singersListInfo.size());

                ObservableList<SingerCell> singerCellObservableList = FXCollections.observableArrayList();
                singersListInfo.forEach(item -> singerCellObservableList.add(new SingerCell(item)));
                Platform.runLater(() -> jfxMPaneDetailChildren.addAll(singerCellObservableList));
//                Notifications.create().title("成功").text("获取歌手列表成功").showInformation();
                Platform.runLater(() -> jfxSpinner.setVisible(false)); //隐藏进度条
            }
        });
    }//

    @Override
    public void updateUi(Object data, int flag) {
        //这里就把flag当初classID了
        initData(flag);
    }
}
