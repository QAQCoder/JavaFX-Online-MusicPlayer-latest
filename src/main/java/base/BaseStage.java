package base;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import utils.LoadUtil;

import java.io.IOException;
import java.util.Map;
import java.util.Optional;
import java.util.WeakHashMap;

public abstract class BaseStage extends Stage {
    public static Map<String, BaseStage> BS_CONTEXT = new WeakHashMap<>();

    public BaseStage(String fxml) {
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("fxml/main_view.fxml"));
        Parent root = null;
        try {
            root = loader.load();
            setScene(new Scene(root, 1000, 700));
            centerOnScreen();
            setTitle("JavaFX在线音乐播放器");
            Image image = new Image("icon/音乐-2.png", 50, 50, true, true);
            getIcons().add(image);

            initStyle(StageStyle.UNDECORATED);

            show();
        } catch (IOException e) {
            e.printStackTrace();
        }

        setOnCloseRequest(event -> {
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
    }

}
