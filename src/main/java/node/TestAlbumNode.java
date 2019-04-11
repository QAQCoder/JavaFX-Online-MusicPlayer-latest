package node;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TestAlbumNode extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    ListView<HBox> listView = new ListView<>();
    BorderPane root = new BorderPane(listView);

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

//        initView();
    }

    private void initView() {
        for (int i = 0; i < 5; i++) {
//            listView.getItems().add(new AlbumMemberNode());
        }
    }//
}