package test;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import utils.LoadUtil;

import java.net.URL;
import java.util.ResourceBundle;

public class TestDialog implements Initializable {

    public JFXButton btnClose;
    public AnchorPane ap;
    public Button btnDialog;
    public StackPane sp;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initView();
        initEvent();
    }

    private void initView() {
        ap.setOnMouseDragged(me -> {
            System.out.println("mouse drag");

            System.out.println(me.getScreenX() + "---" + me.getScreenY());

            ap.getScene().getWindow().setX(me.getScreenX());
            ap.getScene().getWindow().setY(me.getScreenY());
        });

        ap.setOnMouseReleased(event -> {
            System.out.println("mouse release");
        });

        btnDialog.setOnAction(ae -> {
            JFXDialogLayout dialogLayout = new JFXDialogLayout();
            dialogLayout.setHeading(new Text("设置"));
            dialogLayout.setBody(LoadUtil.loadFXML("fxml/items/setting_view.fxml"));
            JFXDialog dialog = new JFXDialog(sp, dialogLayout, JFXDialog.DialogTransition.TOP);
            dialog.show();
        });
    }

    private void initEvent() {
        btnClose.setOnMouseClicked(me -> btnClose.getScene().getWindow().hide());
    }
}
