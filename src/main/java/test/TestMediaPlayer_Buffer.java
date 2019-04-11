package test;

import com.jfoenix.controls.JFXSpinner;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.util.concurrent.CompletableFuture;

public class TestMediaPlayer_Buffer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Stage stage = null;
    private MediaPlayer mediaPlayer = null;
    private MediaView mediaView = null;

    private HBox hBox = new HBox(10);
    private HBox hBox2 = new HBox(10);
    private BorderPane root = new BorderPane();

    JFXSpinner spinner = new JFXSpinner();
    Slider sliderBuffer = new Slider();
    Button btnChangeUrl = new Button("换视频1");
    Button btnChangeUrl2 = new Button("换视频2");

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setScene(new Scene(root, 500, 800));
        stage.setTitle("测试MediaPlayer的缓冲");
        stage.show();

        initView();
    }

    private void initView() {
//        mediaPlayer = new MediaPlayer(new Media("http://vjs.zencdn.net/v/oceans.mp4"));
//        mediaPlayer = new MediaPlayer(new Media("http://ra01.sycdn.kuwo.cn/resource/n3/32/56/3260586875.mp3"));

        playVideo(0);

        root.setCenter(mediaView);
        root.setBottom(hBox);
        hBox2.setAlignment(Pos.CENTER);
        hBox2.getChildren().addAll(this.spinner, btnChangeUrl, btnChangeUrl2);
        root.setTop(hBox2);


        mediaPlayer.setOnReady(() -> {
            System.out.println("\nready\n");
            System.out.println("\n时长：" + mediaPlayer.getStopTime().toMillis());
            sliderBuffer.setMax(mediaPlayer.getStopTime().toMillis());
        });

        Button btnPlay = new Button("播放");
        Button btnPause = new Button("暂停");
        spinner.setVisible(false);

        hBox.getChildren().addAll(btnPlay, btnPause, sliderBuffer);

        btnPlay.setOnAction(ae -> {
            mediaPlayer.play();
        });

        btnPause.setOnAction(ae -> {
            mediaPlayer.pause();
        });

        btnChangeUrl.setOnAction(ae -> {
            mediaPlayer = new MediaPlayer(new Media("http://vjs.zencdn.net/v/oceans.mp4"));
            playVideo(1);
        });
        btnChangeUrl2.setOnAction(ae -> {
            mediaPlayer = new MediaPlayer(new Media("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4"));
            playVideo(1);
        });
    }

    private void playVideo(int flag) {
        if (flag == 0) mediaPlayer = new MediaPlayer(new Media("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4"));

        if (mediaView == null) {
            mediaView = new MediaView(mediaPlayer);
        } else {
            mediaView.setMediaPlayer(mediaPlayer);
        }

        mediaPlayer.setAutoPlay(true);

        mediaPlayer.bufferProgressTimeProperty().addListener((observable, oldValue, newValue) -> {
            System.out.print(newValue + " - ");
            sliderBuffer.setValue(newValue.toMillis());
            if (newValue.toMillis() >= mediaPlayer.getStopTime().toMillis()) {
                System.out.println("缓冲完成");
                mediaPlayer.play();
                spinner.setVisible(false);
            } else if (newValue.toMillis() >= 5000.0 + mediaPlayer.getCurrentTime().toMillis()) {
                System.out.println("缓冲超过5秒，可以播放了。。");
                mediaPlayer.play();
                spinner.setVisible(false);
            } else if (newValue.toMillis() - mediaPlayer.getCurrentTime().toMillis() < 5000){
                System.out.println("缓冲小于5秒，缓冲较慢。。。");
                mediaPlayer.pause();
                spinner.setVisible(true);
            } else {
                System.out.println("...................啦啦啦");
                mediaPlayer.play();
                spinner.setVisible(false);
            }
        });
    }
}
