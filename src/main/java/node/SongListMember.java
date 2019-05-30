package node;

import com.jfoenix.controls.JFXButton;
import entity.KuGouMusicPlay;
import flag.MusicResources;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public class SongListMember extends HBox {

    private KuGouMusicPlay.DataBean dataBean = null;
    private JFXButton btnIndex = new JFXButton("01");
    private Label labelSongName = new Label("爱笑的眼睛");
    private Label labelSongAuthor = new Label("林俊杰");
//    private JFXButton btnLike = new JFXButton("♥");
    private JFXButton btnDelete = new JFXButton("☹");
    private Tooltip tooltip = new Tooltip();
    private static StringBuilder strB = new StringBuilder();

    public SongListMember() {
        setSpacing(8.0);
        setPrefWidth(295);
        labelSongAuthor.setFont(Font.font(10.0));
        VBox vBoxSongInfo = new VBox(3.0);
        Region region = new Region();
//        getChildren().addAll(btnIndex, vBoxSongInfo, region, btnLike, btnDelete);
        getChildren().addAll(btnIndex, vBoxSongInfo, region, btnDelete);
        setHgrow(region, Priority.ALWAYS);

        vBoxSongInfo.getChildren().addAll(labelSongName, labelSongAuthor);
        vBoxSongInfo.setPrefWidth(150);
        labelSongName.prefWidth(145);
        labelSongAuthor.prefWidth(145);

        tooltip.setFont(Font.font(15));
        this.getStylesheets().add("css/my_btn_css.css");
        initEvent();
    }//

    private void initEvent() {
        labelSongName.setOnMouseEntered(this::showToolTip);
        labelSongName.setOnMouseExited(me -> tooltip.hide());

        btnDelete.setOnAction(ae -> MusicResources.getInstance().removeSongFromQueue(Integer.parseInt(btnIndex.getText())-1));
    }//

    private void showToolTip(MouseEvent event) {
        if (tooltip.isShowing()) {
            tooltip.hide();
        } else {
            tooltip.setText(dataBean.getAudio_name());
            tooltip.show(getScene().getWindow(), event.getScreenX()+5.0, event.getScreenY()+5.0);
        }
    }//

    public KuGouMusicPlay.DataBean getDataBean() {
        return dataBean;
    }

    public SongListMember(int index, KuGouMusicPlay.DataBean dataBean) {
        this(dataBean);
        setIndex(index);
    }//

    public SongListMember(KuGouMusicPlay.DataBean dataBean) {
        this();
        this.dataBean = dataBean;
        initData();
    }//

    public void setIndex(int index) {
        if (index < 10) btnIndex.setText("0" + String.valueOf(index));
        else btnIndex.setText(String.valueOf(index));
    }//

    private void initData() {
        strB.delete(0, strB.length());
        strB.append(dataBean.getAudio_name());
        int indexOf = strB.indexOf(" - ");
        if (indexOf == -1) {
            labelSongName.setText(strB.toString());
            labelSongAuthor.setText(dataBean.getAuthor_name());
        } else {
            labelSongAuthor.setText(strB.substring(0, indexOf));
            labelSongName.setText(strB.substring(indexOf+3));
        }
    }//
}
