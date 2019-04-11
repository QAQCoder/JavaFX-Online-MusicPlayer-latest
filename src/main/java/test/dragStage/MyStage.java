package test.dragStage;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

public class MyStage extends Stage {

    StackPane sp = new StackPane();

    public MyStage(Window window) {

        this.initOwner(window);

        setScene(new Scene(sp, 300, 150));

        Button btn = new Button("Close");
        sp.getChildren().add(btn);
        StackPane.setAlignment(btn, Pos.CENTER);

        btn.setOnAction(ae -> this.close());

        sp.setBackground(new Background(new BackgroundFill(Color.PINK, null, null)));
    }

    public void setStyleOfStage() {
        this.centerOnScreen();
        initModality(Modality.WINDOW_MODAL);

        initStyle(StageStyle.UNDECORATED);

        ResizeHelper.addResizeListener(this);

        showAndWait();
    }
}
