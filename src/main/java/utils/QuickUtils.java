package utils;

import flag.CommonResources;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.beans.value.WritableValue;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

public class QuickUtils {

    private static Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
    private static TextArea textArea = new TextArea();

    public static void showNotification(String title, String content, Node graphic) {
        Notifications.create().title(title).text(content).graphic(graphic).showInformation();
    }

    public static <T> void quickAnimation(WritableValue<T> target, T endValue,  Interpolator interpolator) {
        KeyValue kv = new KeyValue(target, endValue, interpolator);
        KeyFrame kf = new KeyFrame(Duration.seconds(CommonResources.animationDuration), kv);
        new Timeline(kf).play();
    }

    public static void showAlert(String title, String content) {
        alert.setGraphic(textArea);
        textArea.clear();
        textArea.appendText(content);
        alert.setTitle(title);
        alert.showAndWait();
    }
}
