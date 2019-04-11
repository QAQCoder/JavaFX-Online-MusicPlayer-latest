package controller;

import animatefx.animation.BounceInRight;
import animatefx.animation.BounceOutRight;
import base.BaseController;
import com.jfoenix.controls.JFXButton;
import entity.KuGouMusicPlay;
import entity.Lyric;
import flag.Flags;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.util.Callback;
import javafx.util.Duration;
import org.controlsfx.control.PopOver;
import utils.LoadUtil;

import java.net.URL;
import java.util.*;

import static flag.Flags.IS_LYRIC_VISIBLE;

public class LyricController extends BaseController implements Initializable {

    @FXML public Button btnBackG;
    @FXML public ListView<Lyric> listViewLyric;
    @FXML public AnchorPane rootPane;
    public JFXButton btnSetLyricTime;

    private double currPosition = 0.8;

    private ObservableList<Lyric> lyricObservableList = null;
    private List<Lyric> lyricList = new ArrayList<>();
    private TreeMap<Long, Integer> lyricMap = new TreeMap<>();
    private SimpleIntegerProperty delayTimeProperty = new SimpleIntegerProperty(1000);
    //
    private KuGouMusicPlay.DataBean dataBean = null;
    private MainViewController mvc = (MainViewController) BC_CONTEXT.get(MainViewController.class.getName());

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("LyricController-----initialize---");
        BC_CONTEXT.put(LyricController.class.getName(), this);
        initView();
        initEvent();
    }

    private void initEvent() {
        btnSetLyricTime.setOnMouseClicked(me -> {
            PopOver popOver = new PopOver();
            TextField tf = new TextField("1000");
            tf.textProperty().addListener((observable, oldValue, newValue) -> delayTimeProperty.set(Integer.parseInt(newValue)));
            popOver.setContentNode(tf);
            popOver.show(btnSetLyricTime.getScene().getWindow(), me.getScreenX(), me.getScreenY());
        });

        btnBackG.setOnAction(ae -> {
            System.out.println("btnBackG.setOnAction");
            updateUi(null, 0);
        });
    }

    private void initView() {
        System.out.println("LyricController-->initView()");
         //设置歌词ListView的cell填充方式
        listViewLyric.setCellFactory(new Callback<ListView<Lyric>, ListCell<Lyric>>() {
            @Override
            public ListCell<Lyric> call(ListView<Lyric> param) {
                return new ListCell<Lyric>(){
                    @Override
                    protected void updateItem(Lyric item, boolean empty) {
                        super.updateItem(item, empty);
                        if (null != item) setText(item.getText());
                    }
                };
            }
        });
        lyricObservableList = listViewLyric.getItems();
    }// initView over

    /**
     * 更新歌词
     * @param data 这里data没用
     * @param flag
     */
    @Override
    public void updateUi(Object data, int flag) {
        System.out.println("-----LyricController--->updateUi---");

        switch (flag) {
            case 0:
                if (lyricList.isEmpty()) return;
                Lyric lyric = lyricList.get(0);
                Lyric lyric1 = lyricObservableList.get(0);
                if (lyric.getTime().toMillis() != lyric1.getTime().toMillis() && !lyric.getText().equals(lyric1.getText())) {
                    lyricObservableList.clear();
                    lyricObservableList.addAll(lyricList);
                    btnBackG.setText(dataBean.getAuthor_name() + " - " + dataBean.getSong_name());
                }
                break;
            case 1:
                lyricObservableList.clear();
                lyricObservableList.addAll(lyricList);
                btnBackG.setText(dataBean.getAuthor_name() + " - " + dataBean.getSong_name());
                break;
        }
    }//updateUi

    @Override
    public void initData(Object data) {
        System.out.println("LyricController---initData---");
        Map<String, Object> objectMap = (Map<String, Object>) data;
        //取出歌手名字和歌曲名称
        dataBean = (KuGouMusicPlay.DataBean) objectMap.get("musicInfo");
        //取出歌词
        System.out.println("歌曲名称：" + dataBean.getAuthor_name() + " - " + dataBean.getSong_name());
        //把数据临时保存
        Map<String, Object> dataMap = (Map<String, Object>) objectMap.get("musicLyric");
        if (!this.lyricMap.isEmpty()) this.lyricMap.clear();
        this.lyricMap = (TreeMap<Long, Integer>) dataMap.get("map_index");
        this.lyricList = (List<Lyric>) dataMap.get("lyric_list");
        updateUi(null, 1);
    }//

    //begin 20190122-加入歌词回调显示，当前的显示歌词由MediaPlayer管理，时间容错待优化
    public SyncLyricCallback callback = (Duration duration) -> {
        if (listViewLyric == null || !IS_LYRIC_VISIBLE.get()) {
            return;
        }
        long time = Long.parseLong(String.format("%.0f", duration.toSeconds()));
        if (lyricMap.containsKey(time)) {
            Integer index = lyricMap.get(time);
            updateGui(index);
        }
    };//

    private void updateGui(int index) {
        final KeyFrame kf1 = new KeyFrame(Duration.millis(0));
        final KeyFrame kf2 = new KeyFrame(Duration.millis(delayTimeProperty.get()), e -> {
            listViewLyric.getSelectionModel().select(index);
            listViewLyric.scrollTo(index >= 5 ? index-5: 0);
        });
        final Timeline timeline = new Timeline(kf1, kf2);
        Platform.runLater(timeline::play);
    }

    public interface SyncLyricCallback { void syncLyric(Duration duration);}
    //end 20190122-加入歌词回调显示

    /**
     * 显示歌词面板方法
     */
    public void showLyric() {
        if (Flags.lyricPane == null) Flags.lyricPane = LoadUtil.loadFXML("fxml/items/lyric_view.fxml");

        if (IS_LYRIC_VISIBLE.get()) {
            new BounceOutRight(Flags.lyricPane).setResetOnFinished(true).play();
            currPosition = mvc.splitPane.getDividerPositions()[0];
            mvc.centerPaneList.remove(Flags.lyricPane);
            IS_LYRIC_VISIBLE.setValue(false);
        } else {
            mvc.centerPaneList.add(Flags.lyricPane);
            new BounceInRight(Flags.lyricPane).setResetOnFinished(true).play();
            mvc.splitPane.setDividerPositions(currPosition);
            IS_LYRIC_VISIBLE.setValue(true);
            updateUi(null, 0);
        }
    }//
};
