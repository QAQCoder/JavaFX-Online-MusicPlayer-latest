package app;

import javafx.application.Application;
import javafx.stage.Stage;
import listener.ResizeHelper;
import main.MainStage;
import utils.StringUtils;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public class MainApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage stage = null;
    private static double xOffset = 0;
    private static double yOffset = 0;

    @Override
    public void start(Stage primaryStage) {
        stage = new MainStage("fxml/main_view.fxml");
        ResizeHelper.addResizeListener(stage);
        if (StringUtils.readProperties() != null) {
            stage.setAlwaysOnTop(Boolean.parseBoolean(StringUtils.readProperties()[1]));
        }
    }//

    public static void setXYOffset(double x, double y) {
        xOffset = x;
        yOffset = y;
    }

    public static void StageDraged(double screenX, double screenY) {
        stage.setX(screenX - xOffset);
        stage.setY(screenY - yOffset);
    }//
}
