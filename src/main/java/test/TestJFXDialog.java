package test;

import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import utils.LoadUtil;

public class TestJFXDialog extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Button btn = new Button("JFXDialog");
    StackPane root = new StackPane(btn);

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(root, 500, 300));
        primaryStage.show();

        root.setBackground(new Background(new BackgroundFill(Color.GRAY, null, null)));

        btn.setOnAction(ae -> {
            JFXDialogLayout dialogLayout = new JFXDialogLayout();
            dialogLayout.setBody(LoadUtil.loadFXML("fxml/items/setting_view.fxml"));
            dialogLayout.setPrefSize(600, 400);
            JFXDialog dialog = new JFXDialog(root, dialogLayout, JFXDialog.DialogTransition.TOP);
            dialog.show();
        });
    }
}
