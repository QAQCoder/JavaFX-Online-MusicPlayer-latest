package view;

import com.jfoenix.controls.JFXListView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TestNewSongCell extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    JFXListView listView = new JFXListView();
    VBox rootPane = new VBox(listView);

    @Override
    public void start(Stage primaryStage) throws Exception {
        for (int i = 0; i < 10; i++) {
            listView.getItems().add(new NewSongCell(10));
        }

        primaryStage.setScene(new Scene(rootPane));
        primaryStage.show();
    }
}
