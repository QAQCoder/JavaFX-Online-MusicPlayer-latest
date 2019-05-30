package view;

import flag.MusicResources;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import node.SongListMember;
import org.controlsfx.control.PopOver;
import utils.MusicUtils;

import java.util.List;
import java.util.Objects;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：播放队列
 */
public class PlayListsView extends PopOver {

    private ListView<SongListMember> listView = new ListView<>();
    private VBox vBox = new VBox();
    private List<SongListMember> nodeList;

    public PlayListsView() {
//        this.setBackground(BACKGROUND_TRANSPARENT);
        this.setArrowLocation(ArrowLocation.BOTTOM_RIGHT);
        this.setCloseButtonEnabled(true);
        setHeaderAlwaysVisible(false);
        setAutoHide(true);
        setArrowSize(5.0);

        HBox hBoxTitle = new HBox(5.0);
        hBoxTitle.setAlignment(Pos.CENTER_LEFT);
        Text text = new Text("播放队列");
        hBoxTitle.getChildren().add(text);
        vBox.getChildren().addAll(hBoxTitle, listView);

        vBox.setPadding(new Insets(10.0));
        vBox.setAlignment(Pos.CENTER);
        listView.getStylesheets().add(getClass().getClassLoader().getResource("css/song_list_ListView_css.css").toExternalForm());
        this.setContentNode(vBox);

        initEvent();
    }

    public void refreshView() {
        if (listView == null) return;
        listView.refresh();
    }

    private void initEvent() {
        listView.setOnMouseClicked(me -> {
//            if (me.getClickCount() < 2) return;
            SongListMember selectedItem = listView.getSelectionModel().getSelectedItem();
            if (selectedItem == null) return;
            if (!MusicUtils.getInstance().isPlaying()) {
                if (selectedItem.getDataBean() != MusicResources.getInstance().getCurrPlayingSong()) {
                    MusicResources.getInstance().nextSong(listView.getSelectionModel().getSelectedIndex());
                } else {
                    MusicResources.getInstance().currSong();
                }
            } else {
                if (selectedItem.getDataBean() != MusicResources.getInstance().getCurrPlayingSong()) {
                    MusicResources.getInstance().nextSong(listView.getSelectionModel().getSelectedIndex());
                }
            }
        });

        listView.setOnKeyPressed(Event::consume);
        listView.setOnKeyReleased(Event::consume);
        listView.setOnKeyTyped(Event::consume);
    }

    public List<SongListMember> getNodeList() {
        return nodeList;
    }
    public void setNodeList(List<SongListMember> nodeList) {
        if (Objects.isNull(nodeList)) throw new IllegalArgumentException("nodeList == null");
        this.nodeList = nodeList;
        setListViewItems(nodeList);
    }

    public void setSelectOfListView(int selIndex) {
        if (!listView.getItems().isEmpty()) {
            listView.getSelectionModel().select(selIndex);
            //往回缩一点，嘿嘿嘿，我可真是个小机灵鬼~~~QWQ
            listView.scrollTo(selIndex > 5 ? selIndex-5 : 0);
        }
    }//

    public boolean isItemsEmpty() {
        return listView.getItems().isEmpty();
    }

    public void setListViewItems(List<SongListMember> listMembers) {
        if (!listView.getItems().isEmpty()) listView.getItems().clear();
        listView.getItems().addAll(listMembers);
    }
}
