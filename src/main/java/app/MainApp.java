package app;

import base.BaseStage;
import controller.LyricController;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import listener.ResizeHelper;
import main.MainStage;

import java.util.Optional;

public class MainApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage stage = null;
    private static double xOffset = 0;
    private static double yOffset = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = new MainStage("fxml/main_view.fxml");
        ResizeHelper.addResizeListener(stage);
    }//

    /*public static void closeApp() {
        stage.setOnCloseRequest(event -> {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "要退出了吗？", ButtonType.OK, ButtonType.CANCEL);
            Optional<ButtonType> buttonType = alert.showAndWait();
            if (buttonType.get().equals(ButtonType.OK)) {
                Platform.exit();
                System.exit(0);
            } else {
                alert.hide();
                event.consume();
            }
        });
    }*/

    public static void setXYOffset(double x, double y) {
        xOffset = x;
        yOffset = y;
    }

    public static void StageDraged(double screenX, double screenY) {
        stage.setX(screenX - xOffset);
        stage.setY(screenY - yOffset);
    }//
}
