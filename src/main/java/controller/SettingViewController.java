package controller;

import app.MainApp;
import base.BaseController;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXSpinner;
import com.jfoenix.controls.JFXTextField;
import com.sun.org.apache.xpath.internal.operations.Bool;
import database.DbServiceImpl;
import database.IDbService;
import entity.KuGouMusicPlay;
import javafx.application.Platform;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TitledPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import node.AlbumMemberNode;
import utils.ScanLocalSong;
import utils.StringUtils;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.CompletableFuture;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public class SettingViewController extends BaseController implements Initializable {

    public JFXTextField tfScanPath;
    public JFXButton btnSelectPath;
    public JFXButton btnScan;
    public JFXSpinner jfxSpinner;
    public Label labShowMsg;
    public JFXButton btnFullScreen;
    public JFXCheckBox checkBoxAlwaysOnTop;
    private String[] properties;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initEvent();
        initView();
        tfScanPath.setEditable(false);
    }

    private void initView() {
        System.out.println("initView-settings");
        if (properties == null || properties.length < 1) {
            properties = StringUtils.readProperties();
        }
        tfScanPath.setText(properties[0]);
        checkBoxAlwaysOnTop.setSelected(Boolean.parseBoolean(properties[1]));
        if (labShowMsg.getText() != null && !labShowMsg.getText().isEmpty()) labShowMsg.setText(null);
    }

    private void initEvent() {
        btnSelectPath.setOnAction(ae -> {
            DirectoryChooser chooser = new DirectoryChooser();
            chooser.setTitle("选择音乐扫描路径");
            String path = chooser.showDialog(btnSelectPath.getScene().getWindow()).getAbsolutePath();
            StringUtils.writeProperties("scanPath", path);
            this.properties[0] = path;
            initView();
        });

        checkBoxAlwaysOnTop.setOnMouseClicked(me -> {
            boolean b = checkBoxAlwaysOnTop.isSelected();
            StringUtils.writeProperties("alwaysOnTop", String.valueOf(!b));
            MainApp.stage.setAlwaysOnTop(b);
        });

        btnScan.setOnAction(ae -> {
            CompletableFuture.supplyAsync(() -> {
                jfxSpinner.setVisible(true);
                return ScanLocalSong.getInstance().getSongs(tfScanPath.getText().trim());
            }).whenComplete(((files, throwable) -> {
                files.forEach(item -> System.out.println(item.getAbsolutePath()));
                List<KuGouMusicPlay.DataBean> beanList = ScanLocalSong.getInstance().convertFilesToDataBean(files);
                //扫描完成后，还需要保存数据到数据库
                CompletableFuture.runAsync(() -> {
                    IDbService dbService = DbServiceImpl.getInstance();
                    //先清空原来的数据
                    dbService.removeLocalMusic();
//                    if (!dbService.removeLocalMusic())
//                        throw new IllegalStateException("移除音乐出现异常");
                    beanList.forEach(item -> dbService.insertMusicToSpecialAlbum("local_music", item));
                }).whenComplete((v, t) -> {
                    if (t != null) t.printStackTrace();
                    else {
                        Platform.runLater(() -> {
                            jfxSpinner.setVisible(false);
                            labShowMsg.setText(labShowMsg.getText() + ", 扫描的数据保存到数据，完成");
                        });
                        System.out.println("扫描的数据保存到数据，完成");
                    }
                });

                Platform.runLater(() -> labShowMsg.setText("扫描完成，共有[" + files.size() +"]首歌") );
                TitledPane pane = ((LeftController) BaseController.BC_CONTEXT.get(LeftController.class.getName())).getTitledPane("本地音乐");
                ListView<AlbumMemberNode> listView = (ListView<AlbumMemberNode>) pane.getContent();
                if (!listView.getItems().isEmpty())
                    Platform.runLater(() -> listView.getItems().clear());
                List<AlbumMemberNode> albumMemberNodes = new ArrayList<>();
                beanList.forEach(item -> {
                    if (item != null)
                        albumMemberNodes.add(new AlbumMemberNode(item));
                });
                Platform.runLater(() -> listView.getItems().addAll(albumMemberNodes) );
                pane.setExpanded(true);
            }));
        });

        btnFullScreen.setOnAction(ae -> {
            Stage stage = MainApp.stage;
            if (stage.isFullScreen()) {
                stage.setFullScreen(false);
            } else {
                stage.setFullScreen(true);
            }
        });
    }//
}
