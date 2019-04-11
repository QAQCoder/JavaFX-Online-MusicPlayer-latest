package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TestView extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Button btn = new Button("Click Me");
    BorderPane root = new BorderPane(btn);

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        initView();
    }

    private void initView() {
        btn.setOnMouseClicked(me -> {
            CommonView.getInstance().getAddAlbumContextMenu().show(btn.getScene().getWindow(), me.getScreenX()-50, me.getScreenY()+10);
        });
    }
}
