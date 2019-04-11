package test;

import com.jfoenix.controls.JFXButton;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * 淡入淡出动画Demo
 */
public class TestAnimation extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Stage stage = null;
    TextArea textArea = new TextArea();
    JFXButton btn = new JFXButton("淡入淡出");
    BorderPane rootPane = new BorderPane(textArea, btn, null, null, null);

    //是否TextArea正在显示
    boolean flag = true;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        stage.setScene(new Scene(rootPane));
        initView();
        initEvent();
        stage.show();
    }

    private void initView() {
        textArea.setPadding(new Insets(50));
        textArea.setText("这是一个文本域");
        textArea.setFont(Font.font("Microsoft YaHei", 20));
        rootPane.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, null, null)));
    }

    private void initEvent() {
        btn.setOnMouseClicked(me -> playFadeAnimation() );
    }

    private void playFadeAnimation() {
        FadeTransition fadeTransition = new FadeTransition(Duration.millis(1000), textArea);
        if (flag) {
            fadeTransition.setFromValue(1.0);
            fadeTransition.setToValue(0.0);
            flag = false;
        } else {
            fadeTransition.setFromValue(0.0);
            fadeTransition.setToValue(1.0);
            flag = true;
        }
        fadeTransition.play();
    }
}
