package node;

import base.BaseController;
import controller.LeftController;
import database.DbServiceImpl;
import database.IDbService;
import entity.CollectionAlbum;
import entity.KuGouMusicPlay;
import flag.MusicResources;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.*;
import org.controlsfx.control.Notifications;
import view.CommonView;

import java.util.ArrayList;
import java.util.List;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public class MyTitlePane extends TitledPane {

    private MenuItem playAll = new MenuItem("播放全部");
    private MenuItem removeAll = new MenuItem("清空收藏夹");
    private MenuItem deleteAlbum = new MenuItem("删除收藏夹");
    private MenuItem cancel = new MenuItem("取消");
    private ContextMenu menu = new ContextMenu(playAll,
            new SeparatorMenuItem(), removeAll,
            new SeparatorMenuItem(), deleteAlbum,
            new SeparatorMenuItem(), cancel
    );

    public MyTitlePane(String title, Node content) {
        super(title, content);

        this.getStylesheets().add("css/leftPane_css.css");

        setOnMouseClicked(me -> {
            switch (me.getButton()) {
                case SECONDARY:
                    setFocused(true);
                    menu.show(this, me.getScreenX(), me.getScreenY());
                    break;
            }
        });

        menuItemEvent();
    }//

    private void menuItemEvent() {
        playAll.setOnAction(ae -> playAllEvent());

        removeAll.setOnAction(ae -> {
            System.out.println("移除收藏夹[" + this.getText() +"]的所有音乐");
            IDbService dbService = DbServiceImpl.getInstance();
            CollectionAlbum album = dbService.searchAlbum(this.getText().trim());
            if (null == album) {
                System.out.println("移除收藏夹[" + this.getText() +"]的所有音乐，异常。该收藏夹不存在");
            } else {
                boolean removeRes = dbService.removeAllMusicFromAlbum(album.getAlbumName());
                if (removeRes) {
                    Notifications.create().title("提示").text("移除收藏夹[" + this.getText() +"]的所有音乐，成功").position(Pos.TOP_RIGHT).showInformation();
                    //移除完成后更新UI
                    BaseController.BC_CONTEXT.get(LeftController.class.getName()).updateUi(getText(), 0);
                }
                else System.out.println("移除收藏夹[" + this.getText() +"]的所有音乐，失败");
            }
        });

        deleteAlbum.setOnAction(ae -> {
            System.out.println("----------删除收藏夹.setOnAction--------");
            //到数据库中查询
            IDbService dbService = DbServiceImpl.getInstance();
            CollectionAlbum album = dbService.searchAlbum(this.getText().trim());
            if (album != null && (album.getCreateDate().length() > 1)) {
                boolean b = dbService.removeAlbum(album);
                if (b) {
                    Notifications.create().title("提示").text("删除收藏夹（" + album.getCollectionName() + "）成功").showInformation();
                    //这里不一样了，是要移除整个TitlePane，再修改一下
                    BaseController.BC_CONTEXT.get(LeftController.class.getName()).updateUi(this, 3);
                    //bug-2019/04/29-这里删除收藏夹之后，没有通知CommonView，需要通知哦
                    CommonView.notifyAlbumListUpdate();
                }
            } else {
                assert album != null;
                Notifications.create().title("提示").text("该收藏夹【" + album.getCollectionName() + "】不能删除").position(Pos.TOP_RIGHT).showWarning();
            }

        });
    }

    private void playAllEvent() {
        //默认是ListView
        ListView<AlbumMemberNode> listView = (ListView) getContent();
        MusicResources musicResources = MusicResources.getInstance();

        List<KuGouMusicPlay.DataBean> beanList = new ArrayList<>();
        listView.getItems().forEach(item -> beanList.add(item.getBean()));
        musicResources.setCurrMusicList(beanList);

        MusicResources.CurrentSelectIndexCallback currentSelectIndexCallback = index -> {
            listView.getSelectionModel().select(index);
            listView.scrollTo(index > 3 ? index-2 : 0);
        };
        musicResources.addCallback(currentSelectIndexCallback);
    }
}
