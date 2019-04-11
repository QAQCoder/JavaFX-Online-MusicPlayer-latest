package test;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Date;

public class TestListViewObservableList extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    BorderPane root = new BorderPane();
    Button btn = new Button("Click Me");
    ListView<String> listView = new ListView<>();
    ObservableList<String> list = listView.getItems();

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        root.setCenter(listView);
        root.setBottom(btn);

        btn.setOnMouseClicked(me -> {
//            list.add(new Date().toLocaleString());
        });
    }
}
