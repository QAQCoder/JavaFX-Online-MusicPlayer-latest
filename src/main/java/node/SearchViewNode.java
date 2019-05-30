package node;

import com.jfoenix.controls.JFXDialogLayout;
import entity.SearchData;
import javafx.application.Platform;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.Orientation;
import javafx.scene.control.ListView;
import javafx.scene.control.Separator;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.util.List;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public class SearchViewNode extends JFXDialogLayout {

    private SimpleObjectProperty<List<SearchData>> seachDataProperty = new SimpleObjectProperty<>();
    private VBox vBox = new VBox(10);

    private static SearchViewNode node = null;
    public static SearchViewNode getInstance() {
        if (node == null) {
            synchronized (SearchViewNode.class) {
                if (node == null) node = new SearchViewNode();
            }
        }
        return node;
    }

    private SearchViewNode() {
        setPrefWidth(260d);
        setMaxHeight(600d);
        setBody(vBox);
        vBox.setMaxHeight(600);

        seachDataProperty.addListener((observable, oldValue, newValue) -> {
            if (newValue != null && !newValue.equals(oldValue)) {
                if (!vBox.getChildren().isEmpty()) Platform.runLater(() -> vBox.getChildren().clear());

                newValue.forEach(item -> {
                    if (item.getBeanList().size() <= 0) return;
                    Platform.runLater(() -> vBox.getChildren().add(new Text(item.getAlbumName())) );
                    ListView<String> lv = new ListView<>();
                    lv.setPrefHeight(60);
                    item.getBeanList().forEach(data ->
                            lv.getItems().add(data.getAudio_name())
                    );
                    Platform.runLater(() -> vBox.getChildren().add(lv));
                    Platform.runLater(() -> vBox.getChildren().add(new Separator(Orientation.HORIZONTAL)));
                });
            }
        });
    }

    public void setSearchDataAndUpdateUI(List<SearchData> searchDataList) {
        if (searchDataList == null)
            throw new IllegalArgumentException("SearchViewNode---setSearchDataAndUpdateUI---seachData=null");

        seachDataProperty.set(searchDataList);
    }
}
