package view;

import database.DbServiceImpl;
import database.IDbService;
import entity.KuGouMusicPlay;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import node.AlbumMemberNode;
import node.SongListMember;
import org.controlsfx.control.PopOver;
import org.junit.jupiter.api.Test;
import service.IMusicService;
import service.MusicServiceImple;

import java.util.ArrayList;
import java.util.List;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public class TestView extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Button btn = new Button("Click Me");
    BorderPane root = new BorderPane();

    @Override
    public void start(Stage primaryStage) throws Exception {
        root.setBottom(btn);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        initView();
    }

    PlayListsView playListsView = new PlayListsView();
    private void initView() {

        btn.setOnMouseClicked(me -> {
//            CommonView.getInstance().getAddAlbumContextMenu().show(btn.getScene().getWindow(), me.getScreenX()-50, me.getScreenY()+10);
            if (playListsView.isShowing()) {
                playListsView.hide();
            } else {
                if (playListsView.getNodeList() == null) {
                    initNode();
                }
                playListsView.show(btn);
                ((Parent)playListsView.getSkin().getNode()).getStylesheets().add(this.getClass().getClassLoader().getResource("css/test_css/PopOver.css").toExternalForm());
//                playListsView.getSkin().getNode().prefWidth(500.0);
            }
        });
    }//

    private void initNode() {
        List<SongListMember> nodeList = new ArrayList<>();
        List<KuGouMusicPlay.DataBean> data = getData();
        for (int i = 0; i < data.size(); i++) {
            SongListMember node = new SongListMember(data.get(i));
            node.setIndex(i+1);
            nodeList.add(node);
        }
//        getData().forEach(item -> nodeList.add(new SongListMember(item)));
        playListsView.setNodeList(nodeList);
    }

    private List<KuGouMusicPlay.DataBean> getData() {
        IDbService dbService = DbServiceImpl.getInstance();
        List<KuGouMusicPlay.DataBean> myLove = dbService.getAlbumContainSongs("my_love");
        return myLove;
    }//
}
