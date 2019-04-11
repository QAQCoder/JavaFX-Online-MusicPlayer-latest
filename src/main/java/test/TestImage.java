package test;

import flag.CommonResources;
import javafx.application.Application;
import javafx.application.HostServices;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;

public class TestImage extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Stage stage = null;
    BorderPane root = new BorderPane();
    Scene scene = new Scene(root);

    @Override
    public void start(Stage primaryStage) throws Exception {

        stage = primaryStage;
        stage.setScene(scene);
        stage.show();
        root.setBackground(CommonResources.BACKGROUND_NORMAL);

//        File file = new File("D:\\我的图片\\安卓壁纸\\20150904161645_sZuX2.jpeg");
//        System.out.println(file.exists());
        FileInputStream fis = new FileInputStream("D:\\我的图片\\安卓壁纸\\20150904161645_sZuX2.jpeg");

        Image image = new Image(fis);

        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(800);
        //保持宽高比例
        imageView.setPreserveRatio(true);

        Rectangle rectangle = new Rectangle(800, 500);
        rectangle.setArcWidth(50);
        rectangle.setArcHeight(50);

        imageView.setClip(rectangle);

        root.setCenter(imageView);
    }
}
