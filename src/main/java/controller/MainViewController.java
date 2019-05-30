package controller;

import app.MainApp;
import base.BaseController;
import com.jfoenix.controls.*;
import entity.KuGouMusicPlay;
import entity.TableViewPlayInfoBean;
import flag.CommonResources;
import flag.Flags;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import listener.ResizeHelper;
import org.controlsfx.control.Notifications;
import service.IMusicService;
import service.MusicServiceImple;
import utils.LoadUtil;

import java.awt.*;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.*;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static flag.FxmlFiles.BOTTOM_FXML;
import static flag.FxmlFiles.LEFT_FXML;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public class MainViewController extends BaseController implements Initializable {

    public SplitPane splitPane;
    public ObservableList<Node> centerPaneList;
    public StackPane stackPane;
    @FXML BorderPane mainPane;
    @FXML JFXTabPane centerTabPane;
    @FXML VBox vBoxToDrag;

    HBox hBoxForDoubleClick;
    JFXButton btnUser;
    Text textUserName;
    JFXTextField tfSearchKeyword;
    JFXButton btnSearch;
    JFXButton btnMin;
    JFXButton btnClose;
    JFXSpinner spinnerSearch;
    JFXButton btnSetting;

    private IMusicService iMusicService = new MusicServiceImple();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initLoad();
        initView();
        initEvent();
    }

    private void initEvent()  {
        btnSearch.setOnAction(me -> {
            System.out.println("btnSearch click event");
            searchMusic();
        });

        tfSearchKeyword.setOnKeyPressed(kp -> {
            if (kp.getCode().equals(KeyCode.ENTER)) searchMusic();
        });

        final Parent[] settingsPane = {null};
        btnSetting.setOnAction(ae -> {
            JFXDialogLayout dialogLayout = new JFXDialogLayout();
            if (settingsPane[0] == null) {
                settingsPane[0] = LoadUtil.loadFXML("fxml/items/setting_view.fxml");
            }
            dialogLayout.setBody(settingsPane[0]);
            dialogLayout.setPrefSize(600, 340);
            new JFXDialog(stackPane, dialogLayout, JFXDialog.DialogTransition.TOP).show();
        });

        btnMin.setOnAction(ae -> {
            boolean iconified = MainApp.stage.isIconified();
            if (iconified) {
                MainApp.stage.setIconified(false);
            } else {
                MainApp.stage.setIconified(true);
            }
        });

        btnClose.setOnAction(ae -> {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "要退出了吗？", ButtonType.OK, ButtonType.CANCEL);
            Optional<ButtonType> buttonType = alert.showAndWait();
            if (buttonType.get().equals(ButtonType.OK)) {
                Platform.exit();
                System.exit(0);
            } else {
                alert.hide();
                ae.consume();
            }
        });

        hBoxForDoubleClick.setOnMouseClicked(me -> {
            if (me.getClickCount() == 2) {
                //判断Stage是否是最大化状态
                boolean maximized = MainApp.stage.isMaximized();
                if (maximized) {
                    MainApp.stage.setMaximized(false);
                    MainApp.stage.setWidth(ResizeHelper.currWidthOfStage);
                    MainApp.stage.setHeight(ResizeHelper.currHeightOfStage);
                } else {
                    System.out.println("最大化了吗：" + maximized);
                    Rectangle bounds = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
                    MainApp.stage.setMaximized(true);
                    System.out.println("屏幕大小：" + bounds.width + "- " + bounds.height);
                    MainApp.stage.setWidth(bounds.width);
                    MainApp.stage.setHeight(bounds.height);
                }
            }
        });

//        splitPane.getDividers().get(0).positionProperty().addListener((observable, oldValue, newValue) -> Flags.LYRIC_PANE_DIVISION = newValue.doubleValue());
    }//initEvent

    private void searchMusic() {

        //只有在执行了搜索【或者歌单-歌手音乐到达】，将标志位isPaginationInit置为true，才允许分页控件setFactory
        CommonResources.isPaginationInit = true;
        CommonResources.currSelUrl = 0;

        if (tfSearchKeyword.getText().trim().equals("")) {
            Notifications notf = Notifications.create().title("！").position(Pos.TOP_RIGHT)
                    .text("请输入关键词");
            notf.showInformation();
            return;
        } else {
            //判断是否可以搜索
            if (!CommonResources.isSearchDone) {
                System.out.println("不急，上次搜索没完成呢");
                return;
            }

            //使用java8的提供的异步类工具
            CompletableFuture.runAsync(() -> {
//                System.out.println("runAsync begin ");
                //把标志置为false，表示正在搜索
                CommonResources.isSearchDone = false;
                spinnerSearch.setVisible(true);
                updateUi(tfSearchKeyword.getText().trim(), 0);
            }).whenComplete((v, throwable) -> {
                CommonResources.isSearchDone = true;
                spinnerSearch.setVisible(false);
                if (throwable != null) {
                    System.out.println("搜索音乐抛异常" + throwable.getMessage());
                    if (throwable instanceof UnknownHostException)
                        Notifications.create().title("错误").text("网络出现异常咯！").showWarning();
                }
            });
        }
    }//searchMusic

    private void initView() {

        Tab tab1 = new Tab("歌曲列表", LoadUtil.loadFXML("fxml/items/music_table_view.fxml"));
        Tab tab2 = new Tab("排行榜", LoadUtil.loadFXML("fxml/items/rank_music_view.fxml"));
        Tab tab3 = new Tab(" 歌手 ", LoadUtil.loadFXML("fxml/items/singer_view.fxml"));
        Tab tab4 = new Tab(" 歌单 ", LoadUtil.loadFXML("fxml/items/song_list_view.fxml"));
        centerTabPane.getTabs().addAll(tab1, tab2, tab3, tab4);
        centerPaneList = splitPane.getItems();

        //luukup顶部的控件
        initDragAble(vBoxToDrag);
        hBoxForDoubleClick = (HBox) vBoxToDrag.lookup("#hBoxForDoubleClick");
        btnUser = (JFXButton) vBoxToDrag.lookup("#btnUser");
        textUserName = (Text) vBoxToDrag.lookup("#textUserName");
        tfSearchKeyword = (JFXTextField) vBoxToDrag.lookup("#tfSearchKeyword");
        btnSearch = (JFXButton) vBoxToDrag.lookup("#btnSearch");
        btnMin = (JFXButton) vBoxToDrag.lookup("#btnMin");
        btnClose = (JFXButton) vBoxToDrag.lookup("#btnClose");
        spinnerSearch = (JFXSpinner) vBoxToDrag.lookup("#spinnerSearch");
        btnSetting = (JFXButton) vBoxToDrag.lookup("#btnSetting");
    }

    /**
     * 使窗口可以拖动
     * @param nodeToDrag 顶部VBox
     */
    private void initDragAble(Node nodeToDrag) {
        nodeToDrag.setOnMousePressed(me -> MainApp.setXYOffset(me.getSceneX(), me.getSceneY()));
        nodeToDrag.setOnMouseDragged(me -> MainApp.StageDraged(me.getScreenX(), me.getScreenY()));
    }//

    private void initLoad() {
        mainPane.setBottom(LoadUtil.loadFXML(BOTTOM_FXML)); //加载bottom view
        mainPane.setLeft(LoadUtil.loadFXML(LEFT_FXML));  //加载Left view
    }

    @Override
    public void updateUi(Object data, int flag) {
        String keyword = (String) data;
        if (keyword != null && !keyword.equals("")) {
            Map<String, Object> map = iMusicService.getSearchMusicHash(tfSearchKeyword.getText().trim(), 1, 30);
            List<String> hashs = (List<String>) map.get("list");
            int total = (int) map.get("total");
            //封装表格顶部信息
            TableViewPlayInfoBean infoBean = new TableViewPlayInfoBean(CommonResources.KUGOU_ICON, "搜索"+keyword, String.valueOf(total), null);
            //显示
            ((MusicTvController)BaseController.BC_CONTEXT.get(MusicTvController.class.getName())).setPlayData(infoBean);

            //封装歌曲list
            List<KuGouMusicPlay> playList = iMusicService.handleHashs(hashs);
            List<KuGouMusicPlay.DataBean> beanList = new ArrayList<>();
            playList.forEach(playItem -> beanList.add(playItem.getData()));
            BaseController.BC_CONTEXT.get(MusicTvController.class.getName()).updateUi(beanList, 1);
            Platform.runLater(() -> BaseController.BC_CONTEXT.get(MusicTvController.class.getName()).initData(total));
        }
    }//

    public String getKeyword() {
        return tfSearchKeyword.getText();
    }

    public void showSpinnerSearch(boolean visibility) {
        spinnerSearch.setVisible(visibility);
    }

    public StackPane getStackPane() {
        return stackPane;
    }
}