package test;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXSpinner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Stage;
import utils.LoadUtil;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.CompletableFuture;

public class TestJFoenix extends Application implements Initializable {

    public JFXButton btnNet;
    public JFXSpinner sp;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(FXMLLoader.load(ClassLoader.getSystemResource("fxml/items/jfoenix_view.fxml"))));
        primaryStage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnNet.setOnAction( ae -> {
            CompletableFuture.runAsync(() -> {
                int res = 0;
                sp.setVisible(true);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).whenComplete((v, t) -> {
                sp.setVisible(false);
                System.out.println("结束了");
            });
        });
    }
}
