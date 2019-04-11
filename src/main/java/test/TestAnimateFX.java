package test;

import animatefx.animation.ZoomInRight;
import animatefx.animation.ZoomOutRight;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.util.Duration;
import utils.LoadUtil;

import java.net.URL;
import java.util.ResourceBundle;
public class TestAnimateFX extends Application implements Initializable {
    public AnchorPane pane1;
    public AnchorPane pane2;
    public Button btnOpen;
    public Button btnClose;
    public SplitPane sp;
    private ObservableList<Node> observableList;

    private Node node2 = null;

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("fxml/test_item/animate_view.fxml"));
        primaryStage.setScene(new Scene(loader.load(), 500, 300));
        primaryStage.setTitle("使用AnimateFX");
        primaryStage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        observableList = sp.getItems();
        initEvent();

        node2 = LoadUtil.loadFXML("fxml/test_item/test_dialog_view.fxml");
    }

    private void initEvent() {
        btnOpen.setOnAction(ae -> {

            sp.getItems().add(node2);
            new ZoomInRight(node2).setResetOnFinished(true).play();
            sp.setDividerPositions(0.5);

            sp.getDividers().forEach(item -> System.out.println(item.getPosition()));
        });

        btnClose.setOnAction(ae -> {

            sp.getItems().remove(node2);
            new ZoomOutRight(node2).setResetOnFinished(true).play();
            sp.setDividerPositions(1.0);

            sp.getDividers().forEach(item -> System.out.println(item.getPosition()));
        });
    }
}
