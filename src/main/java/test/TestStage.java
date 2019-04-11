package test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import utils.LoadUtil;

public class TestStage extends Application {

    private BorderPane root = new BorderPane();
    Scene scene;
    Stage stage = null;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;

//        root.setCenter(LoadUtil.loadFXML("fxml/items/rank_music_view.fxml"));
//        root.setCenter(LoadUtil.loadFXML("fxml/items/music_table_view.fxml"));
//        root.setCenter(LoadUtil.loadFXML("fxml/items/singer_view.fxml"));
//        root.setCenter(LoadUtil.loadFXML("fxml/items/song_list_view.fxml"));
//        root.setCenter(LoadUtil.loadFXML("fxml/main_view.fxml"));
//        root.setCenter(LoadUtil.loadFXML("fxml/items/lyric_view.fxml"));
//        root.setCenter(LoadUtil.loadFXML("fxml/main_view.fxml"));
//        root.setCenter(LoadUtil.loadFXML("fxml/items/left_view.fxml"));
        root.setCenter(LoadUtil.loadFXML("fxml/items/bottom_view.fxml"));
//        root.setCenter(LoadUtil.loadFXML("fxml/items/setting_view.fxml"));
//        root.setCenter(LoadUtil.loadFXML("fxml/test_item/test_progress_view.fxml"));
        initScene();

//        scene = new Scene(LoadUtil.loadFXML("fxml/test_item/test_dialog_view.fxml"), 300, 300);
//        initStageStyle(scene);
    }

    private void initScene() {
        stage.setScene(new Scene(root));
        Image image = new Image("icon/icon2.png", 25, 25, true, true);
        stage.getIcons().add(image);
        stage.show();
    }

    private void initStageStyle(Scene scene) {
        stage.initStyle(StageStyle.UTILITY);
        scene.setFill(Color.TRANSPARENT);
        Image image = new Image("icon/音乐-2.png", 25, 25, true, true);
        stage.getIcons().add(image);
        stage.show();
    }
}
