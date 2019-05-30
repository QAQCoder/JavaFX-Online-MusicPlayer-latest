package utils;

import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import flag.CommonResources;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.value.WritableValue;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

import java.util.Arrays;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public class QuickUtils {

    private static JFXDialogLayout dialogLayout = null;
    private static JFXDialog dialog = null;
    private static VBox vBox;

    public static void showNotification(String title, String content, Node graphic) {
        Notifications.create().title(title).text(content).graphic(graphic).showInformation();
    }

    public static <T> void quickAnimation(WritableValue<T> target, T endValue,  Interpolator interpolator) {
        KeyValue kv = new KeyValue(target, endValue, interpolator);
        KeyFrame kf = new KeyFrame(Duration.seconds(CommonResources.animationDuration), kv);
        new Timeline(kf).play();
    }

    public static void showJFXDialog(StackPane container, String title, String...contents) {

        if (dialogLayout == null) {
            dialogLayout = new JFXDialogLayout();
            dialog = new JFXDialog();
            vBox = new VBox(20);
        }
        dialogLayout.setHeading(new Text(title));
        Arrays.stream(contents).forEach(item -> vBox.getChildren().add(new TextField(item)));
        vBox.getChildren().add(new Text("目前版本暂不提供下载支持，嘻嘻嘻~"));
        dialogLayout.setBody(vBox);
        dialog.setContent(dialogLayout);
        dialog.setOnDialogClosed(event -> vBox.getChildren().clear());
        dialog.show(container);
    }
}
