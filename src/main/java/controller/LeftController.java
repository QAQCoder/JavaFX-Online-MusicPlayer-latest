package controller;

import base.BaseController;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTabPane;
import com.jfoenix.controls.JFXTextField;
import database.DbServiceImpl;
import database.IDbService;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import entity.CollectionAlbum;
import entity.KuGouMusicPlay;
import entity.SearchData;
import javafx.animation.*;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.event.Event;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Window;
import javafx.util.Duration;
import node.AlbumMemberNode;
import node.MyTitlePane;
import node.SearchPopOver;
import node.SearchViewNode;
import org.controlsfx.control.Notifications;
import org.controlsfx.control.PopOver;
import view.CommonView;

import java.net.URL;
import java.util.*;
import java.util.concurrent.CompletableFuture;

import static flag.CommonResources.animationDuration;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public class LeftController extends BaseController implements Initializable {

    public JFXTabPane leftTabPane;
    public AnchorPane leftAnchorPane;
    public Tab tabMusic;
//    public ImageView imgClick;
    public VBox vbox;
    public Accordion accordion;
    public JFXButton jfxBtnSearch;
    public JFXButton jfxBtnAddAlbumList;
    public JFXButton jfxBtnRefresh;
    public HBox hbox;
    public JFXTextField tfSearchWord;
    public MaterialDesignIconView mdView;
    private boolean isTabShow = true;
    private double currWidth = 0d;

    private IDbService dbService = new DbServiceImpl();
    //存储所有LeftView的ListView，以便更新数据
    private Map<String, ListView<AlbumMemberNode>> mapNewAlbum = new HashMap<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initView();
        initEvent();
        initData(null);
    }

    private void initView() {
        tfSearchWord.lengthProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.intValue() <= oldValue.intValue()) return;

            if (tfSearchWord.getLength() > 25) {
                tfSearchWord.setText(tfSearchWord.getText().substring(0, 25));
            }
        });
    }

    private void initEvent() {
        /*tfSearchWord.focusColorProperty().addListener((observable, oldValue, newValue) -> {

        });*/

        tfSearchWord.textProperty().addListener((observable, oldValue, newValue) -> {
            SearchViewNode node = SearchViewNode.getInstance();
            node.setHeading(new Text("搜索：" + newValue));
            PopOver popOver = SearchPopOver.getPopOver();
            Window window = tfSearchWord.getScene().getWindow();

            //查询的异步线程
            CompletableFuture.supplyAsync(() -> getSearchDataList(newValue.trim()))
                    .whenComplete((searchData, throwable) -> {
                if (null != throwable)  throwable.printStackTrace();

                if (null != searchData && searchData.size() > 0) {
                    node.setSearchDataAndUpdateUI(searchData);
                }
            });

            if (popOver.isShowing() && tfSearchWord.getLength() == 0) {
                popOver.hide(Duration.millis(200));
            }

            if (popOver.isShowing()) {
                popOver.setContentNode(node);
            } else {
                popOver.setContentNode(node);
                popOver.show(window, window.getX()+35, window.getY()+130);
                ((Parent)popOver.getSkin().getNode()).getStylesheets().add(this.getClass().getClassLoader().getResource("css/test_css/PopOver.css").toExternalForm());
            }
        });

        jfxBtnAddAlbumList.setOnMouseClicked(me -> {
            Label label = new Label("收藏夹:");
            JFXTextField jfxTextField = new JFXTextField("嗯哼蹦擦擦");
            final ChangeListener<Number> tChangeListener = (observable, oldValue, newValue) -> {
                if (jfxTextField.getLength() > 25) jfxTextField.setText(jfxTextField.getText().substring(0, 25));
            };
            jfxTextField.lengthProperty().addListener(tChangeListener);
            JFXButton jfxButtonOK = new JFXButton("确定");
            HBox hBox = new HBox(5, label, jfxTextField, jfxButtonOK);
            MenuItem itemField = new MenuItem(null, hBox);
            ContextMenu contextMenu = new ContextMenu(itemField);
            contextMenu.setHideOnEscape(false);
            contextMenu.show(jfxBtnAddAlbumList.getScene().getWindow(), me.getScreenX()-230, me.getScreenY()+20);
            jfxButtonOK.setOnAction(ae -> {
                CollectionAlbum searchAlbum = dbService.searchAlbum(jfxTextField.getText().trim());
                if (searchAlbum != null) {
                    Notifications.create().title("收藏夹名称重复").text("收藏夹名称重复").showInformation();
                    ae.consume();
                } else {
                    String text = jfxTextField.getText();
                    String album = dbService.insertNewAlbum(text.trim());
                    if (album != null) {
                        boolean res = dbService.createAlbumContainTable(album);
                        if (!res) {
                            ListView<AlbumMemberNode> lv = CommonView.getInstance().getAlbumListView();
                            mapNewAlbum.put(album, lv);
                            accordion.getPanes().add(new MyTitlePane(jfxTextField.getText(), lv));
                            //bug-2019/04/29-这里创建收藏夹之后，没有通知CommonView收藏夹更新了，这里应该主动通知
                            CommonView.notifyAlbumListUpdate();
                        } else {
                            System.out.println("创建收藏夹失败");
                        }
                    }
                }
                contextMenu.hide();
                jfxTextField.lengthProperty().removeListener(tChangeListener);
            });
        });
        //阻止点击事件下发
//        hbox.setOnMouseClicked(Event::consume);
        //发现一旦点击hbox，还是是执行这里，所以迷思苦想，才想到event.consume()
        mdView.setOnMouseClicked(me -> {
            if (isTabShow) {
                vbox.setVisible(false);
                //保存当前宽度值
                if (currWidth == 0)
                    currWidth = leftAnchorPane.getPrefWidth();
                //设置隐藏动画
                Timeline timeline = new Timeline();
                //设置pane的宽度为30，并有动画效果
                KeyValue kv1 = new KeyValue(leftAnchorPane.prefWidthProperty(), 30, Interpolator.EASE_IN);
                KeyFrame keyFrame = new KeyFrame(Duration.seconds(animationDuration), kv1);
                //设置accordion的淡出动画
                FadeTransition fadeOut = new FadeTransition(Duration.seconds(animationDuration), accordion);
                fadeOut.setFromValue(1.0);
                fadeOut.setToValue(0.0);
                timeline.getKeyFrames().addAll(keyFrame);
                fadeOut.play();
                timeline.play();
                isTabShow = false;
            } else {
                vbox.setVisible(true);
                //设置显示动画
                Timeline timeline = new Timeline();
                //设置pane的宽度为currWidth，并有动画效果
                KeyValue kv1 = new KeyValue(leftAnchorPane.prefWidthProperty(), currWidth, Interpolator.EASE_OUT);
                KeyFrame keyFrame = new KeyFrame(Duration.seconds(animationDuration), kv1);
                //设置accordion的淡入动画
                FadeTransition fadeIn = new FadeTransition(Duration.seconds(animationDuration), accordion);
                fadeIn.setFromValue(0.0);
                fadeIn.setToValue(1.0);
                timeline.getKeyFrames().addAll(keyFrame);
                fadeIn.play();
                timeline.play();
                isTabShow = true;
            }
        });

        jfxBtnRefresh.setOnAction(ae -> {
            System.out.println("LeftController---刷新----");
            System.out.println(mapNewAlbum.size());
            updateUi(dbService.getAllAlbum(8), 2);
        });
    }//initEvent

    /**
     * 查找搜索音乐
     * @param keyword 关键字
     * @return List<SearchData>
     */
    private List<SearchData> getSearchDataList(String keyword) {
        Map<String, List<KuGouMusicPlay.DataBean>> map = dbService.searchMusicInAlbums(keyword);
        Set<Map.Entry<String, List<KuGouMusicPlay.DataBean>>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, List<KuGouMusicPlay.DataBean>>> iterator = entrySet.iterator();

        List<SearchData> list = new ArrayList<>();
        SearchData data = null;
        Map.Entry<String, List<KuGouMusicPlay.DataBean>> next = null;

        while (iterator.hasNext()) {
            next = iterator.next();
            data = new SearchData(next.getKey(), next.getValue());
            list.add(data);
        }

        /*iterator.forEachRemaining(stringListEntry -> {
            data = new SearchData(stringListEntry.getKey(), stringListEntry.getValue());
            list.add(data);
        });*/
        return list;
    }//

    /**
     * 左边部分的面板，主要是更新收藏夹里面的歌曲，当有新的歌曲添加时
     * @param data 保存着已经有数据更新的收藏夹名称，或者要移除的TitlePane对象
     * @param flag 0 表示(String)data， 1 表示List<String>, 2 表示收藏夹列表List<CollectionAlbum>，3以上的数字：表示更新整个Accordion
     */
    @Override
    public void updateUi(Object data, int flag) {
        if (data == null) return;

        System.out.println("----------LeftController - updateUi-----------flag=" + flag);

        switch (flag) {
            case 0:
                updateLV((String)data);
                break;
            case 1:
                //获取要更新的{收藏夹}名单
                List<String> albumList = (List<String>) data;
                //遍历名单，查询数据库得到数据，然后更新对应的ListView
                albumList.forEach(this::updateLV);
                break;
            case 2:
                List<CollectionAlbum> list = (List<CollectionAlbum>) data;
                list.forEach(item -> {
                    List<KuGouMusicPlay.DataBean> beanList = dbService.getAlbumContainSongs(item.getAlbumName());
                    System.out.println("当前album：" + item);
                    ListView<AlbumMemberNode> lv = mapNewAlbum.get(item.getAlbumName());
                    System.out.println("取出map：" + lv);
                    if (lv.getItems().size() > 0) lv.getItems().clear();
                    lv.refresh();

                    List<AlbumMemberNode> albumMemberNodeList = new ArrayList<>();
                    beanList.forEach(item2 -> albumMemberNodeList.add(new AlbumMemberNode(item2)));
                    lv.getItems().addAll(albumMemberNodeList);
                });
                break;
            default:
                System.out.println("LeftController---移除收藏夹---");
                accordion.getPanes().remove(data);
                break;
        }
    }//

    private void updateLV(String item) {
        System.out.println("待更新收藏夹：" + item);
        CollectionAlbum album = dbService.searchAlbum(item);
        List<KuGouMusicPlay.DataBean> beanList = dbService.getAlbumContainSongs(album.getAlbumName());
        System.out.println("取出map：" + mapNewAlbum.get(album.getAlbumName()));

        List<AlbumMemberNode> albumMemberNodeList = new ArrayList<>();
        beanList.forEach(item2 -> albumMemberNodeList.add(new AlbumMemberNode(item2)));

        if (Platform.isFxApplicationThread()) {
            if (mapNewAlbum.get(album.getAlbumName()).getItems().size() > 0)
                mapNewAlbum.get(album.getAlbumName()).getItems().clear();
            mapNewAlbum.get(album.getAlbumName()).getItems().addAll(albumMemberNodeList);
        } else {
            Platform.runLater(() -> {
                mapNewAlbum.get(album.getAlbumName()).getItems().clear();
                mapNewAlbum.get(album.getAlbumName()).getItems().addAll(albumMemberNodeList);
            });
        }
    }//

    /**
     * 全部更新LeftController的ListView数据
     * @param data 这里的data无用，可以为null
     */
    @Override
    public void initData(Object data) {
        System.out.println("----------LeftController - initData-----------");

        //清空原有的titlePane
        if (accordion.getPanes() != null && accordion.getPanes().size() > 0)
            accordion.getPanes().clear();

        //获取用户自己创建的收藏夹
        List<CollectionAlbum> allAlbum = dbService.getAllAlbum(8);
//        System.out.println("获取所有收藏夹：" + allAlbum.size());
//        allAlbum.forEach(item -> System.out.println("遍历收藏夹：" + item));
        //遍历所有第三方收藏夹
        allAlbum.forEach(item -> {
            //获取ListView
            ListView<AlbumMemberNode> tempLv = CommonView.getInstance().getAlbumListView();
            //把当前ListView存到map，对于第三方收藏夹，key-存的是表名称
            mapNewAlbum.put(item.getAlbumName(), tempLv);
            //把这个ListView放到TitledPane
            accordion.getPanes().add(new MyTitlePane(item.getCollectionName(), tempLv));
            //获取这个收藏夹对应数据库的歌曲数据
            List<KuGouMusicPlay.DataBean> dataBeanList = dbService.getAlbumContainSongs(item.getAlbumName());
            //把数据放到当前ListView中
            List<AlbumMemberNode> albumMemberNodeList = new ArrayList<>();
            dataBeanList.forEach(item2 -> albumMemberNodeList.add(new AlbumMemberNode(item2)));
            tempLv.getItems().addAll(albumMemberNodeList);
        });
    }//

    public TitledPane getExpandedPane() {
        return accordion.getExpandedPane();
    }

    public TitledPane getTitledPane(String paneName) {
        if (paneName == null || "".equals(paneName))
            throw new IllegalArgumentException("LeftController---getTitledPane--paneName为空");
        return accordion.getPanes().filtered(pane -> pane.getText().equals(paneName)).get(0);
    }
}
