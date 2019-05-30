package node;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;
import org.controlsfx.control.PopOver;

import java.time.LocalDate;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public class TestNode extends Application {

    public static void main(String[] args) {
        launch(args);
    }

//    BorderPane root = new BorderPane(new MyTitlePane("AAA", new Button("AAA")));
    Button btn = new Button("Show Dialog");
    StackPane root = new StackPane();
    Stage stage = null;
    Stage searchPopup = null;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        primaryStage.setScene(new Scene(root, 500, 300));
        primaryStage.show();

        final MyButton myBtn = new MyButton("我的按鈕");
        myBtn.setHoverStyle();
        root.getChildren().add(myBtn);

//        initView();
    }

    private void initView() {

        StackPane.setAlignment(btn, Pos.TOP_CENTER);

        System.out.println(System.getProperty("user.dir"));
        PopOver popOver = new PopOver();
        System.out.println(this.getClass().getClassLoader().getResource("css/test_css/PopOver.css").toExternalForm());
        String s = this.getClass().getClassLoader().getResource("css/test_css/PopOver.css").toExternalForm();

        btn.setOnAction(ae -> {
            SearchViewNode node = SearchViewNode.getInstance();
            node.setHeading(new Text(LocalDate.now().toString()));
            popOver.setContentNode(node);
            popOver.setArrowSize(0);
            popOver.setCloseButtonEnabled(true);
            popOver.setHeaderAlwaysVisible(true);
            Window window = btn.getScene().getWindow();
            popOver.show(btn.getScene().getWindow(), window.getX()+65, window.getY()+145);
            ((Parent) popOver.getSkin().getNode()).getStylesheets().add(s);
        });
    }

    private void createSearchPopup() {
        try {
            VBox view = new VBox();
            Stage popup = new Stage();
            view.getStyleClass().addAll(" -fx-background-color: pink;\n" +
                    "    -fx-border-width: 2;\n" +
                    "    -fx-border-color: #dadada;");
            popup.setScene(new Scene(view, 260, 500));
            popup.initStyle(StageStyle.UNDECORATED);
            popup.initOwner(stage);

            popup.show();
            popup.hide();

            searchPopup = popup;
        } catch (Exception ex) {

            ex.printStackTrace();
        }
    }//
}