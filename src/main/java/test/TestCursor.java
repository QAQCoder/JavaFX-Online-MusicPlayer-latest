package test;

import flag.CommonResources;
import javafx.application.Application;
import javafx.application.HostServices;
import javafx.application.Platform;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.net.URL;

public class TestCursor extends Application {

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

        URL url = getClass().getClassLoader().getResource("icon/music_control/收藏-五角星-red.png");
        scene.setCursor(Cursor.cursor(url.toExternalForm()));

        System.out.println(Platform.isAccessibilityActive());


        System.out.println(Platform.isFxApplicationThread()); //true

        new Thread(() -> {
            System.out.println(Platform.isFxApplicationThread()); //false
        }).start();

        Platform.setImplicitExit(false);
        System.out.println(Platform.isImplicitExit());  //false
    }
}
