package view;

import com.jfoenix.controls.JFXMasonryPane;
import entity.SongListClassify;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import service.IMusicService;
import service.MusicServiceImple;

import java.util.List;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public class TestCell extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    TilePane tilePane = new TilePane(10, 10);
    JFXMasonryPane masonryPane = new JFXMasonryPane();
    VBox vBox = new VBox(10.0);
    IMusicService iMusicService = new MusicServiceImple();

    @Override
    public void start(Stage primaryStage) throws Exception {

//        for (int i = 0; i < 5; i++) {
//            vBox.getChildren().add(new SongListCell());
            SongListClassify songListClassify = iMusicService.getSongListClassify();

            List<SongListClassify.DataBean.InfoBean> infoBeans = songListClassify.getData().getInfo();
            infoBeans.forEach(item -> {
                vBox.getChildren().add(new SongListClassifySelectView(item));
            });
//            tilePane.getChildren().add(new SingerCell());
//            tilePane.getChildren().add(new NewSongCell());
//        }
        primaryStage.setScene(new Scene(vBox));
        primaryStage.show();
    }
}
