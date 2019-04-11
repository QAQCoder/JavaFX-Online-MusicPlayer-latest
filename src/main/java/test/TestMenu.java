package test;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TestMenu extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Menu menu = new Menu("嗯哼");
    MenuBar menuBar = new MenuBar(menu);
    BorderPane root = new BorderPane();
    Stage stage = null;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setScene(new Scene(root));
        stage.show();

        initView();
    }

    private void initView() {
        root.setTop(menuBar);

        CheckMenuItem cb1 = new CheckMenuItem("AAA");
        CheckMenuItem cb2 = new CheckMenuItem("AAA");

        menu.getItems().addAll(cb1, cb2);

        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                CheckMenuItem checkMenuItem = (CheckMenuItem) e.getSource();

                if (checkMenuItem.isSelected()) {
                    System.out.println("selected");
                } else {
                    System.out.println("no selected");
                }
            }
        };

        cb1.setOnAction(handler);
        cb2.setOnAction(handler);
    }
}
