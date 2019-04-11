package test;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.controlsfx.control.PopOver;

/**
 *
 * @author Sedrick
 */
public class TestPopOver extends Application {

    @Override
    public void start(Stage primaryStage) {
        //Build PopOver look and feel
        Label lblName = new Label("John Doe");
        Label lblStreet = new Label("123 Hello Street");
        Label lblCityStateZip = new Label("MadeUpCity, XX 55555");
        VBox vBox = new VBox(lblName, lblStreet, lblCityStateZip);
        //Create PopOver and add look and feel
        PopOver popOver = new PopOver(vBox);

        popOver.setTitle("title");
        //设置箭头朝下
        popOver.setArrowLocation(PopOver.ArrowLocation.BOTTOM_CENTER);
        //
        popOver.setArrowSize(0);
        //
        popOver.setPrefWidth(20);


        Label label = new Label("Mouse mouse over me");
        label.setOnMouseEntered(mouseEvent -> {
            //Show PopOver when mouse enters label
            popOver.show(label);
        });

        label.setOnMouseExited(mouseEvent -> {
            //Hide PopOver when mouse exits label
            popOver.hide();
        });

        Button btn = new Button("click me to show PopOver");
        btn.setOnMouseClicked(me -> {
            popOver.show(btn.getScene().getWindow(), btn.getLayoutX(), btn.getLayoutY());
//            popOver.show(btn, me.getScreenX(), me.getScreenY());
        });

        btn.setOnMouseReleased(rele -> {
            popOver.hide(Duration.millis(500));
        });

        StackPane root = new StackPane();
        root.getChildren().addAll(label, btn);

        btn.setPadding(new Insets(50));

        StackPane.setAlignment(btn, Pos.BOTTOM_CENTER);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}