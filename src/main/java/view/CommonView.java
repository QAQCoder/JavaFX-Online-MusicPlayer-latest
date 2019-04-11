package view;

import base.BaseController;
import controller.LeftController;
import database.DbServiceImpl;
import database.IDbService;
import entity.CollectionAlbum;
import entity.KuGouMusicPlay;
import flag.CommonResources;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import node.AlbumMemberNode;
import utils.QuickUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CommonView {

    private IDbService iDbService = new DbServiceImpl();
    private ContextMenu contextMenu = new ContextMenu();
    //可以添加的收藏夹list
    List<String> albumList = new ArrayList<>();

    //静态资源
    private static SimpleObjectProperty<List<CollectionAlbum>> allAlbum = new SimpleObjectProperty<>();
    private static List<CheckMenuItem> selectCheckBsList = new ArrayList<>();

    private static CommonView instance = null;
    private CommonView() {}
    public static CommonView getInstance() {
        if (instance == null) {
            synchronized (CommonView.class) {
                if (instance == null) instance = new CommonView();
            }
        }
        return instance;
    }//

    {
        //在菜单展示的时候，去查询数据库当前歌曲所在的收藏夹
        contextMenu.setOnShowing(event -> {
            System.out.println("--------------菜单显示----------");

            ObservableList<MenuItem> items = contextMenu.getItems();
            items.forEach(item -> ((CheckMenuItem)item).setSelected(false));
            //当前选择的音乐，去查询该音乐在哪些收藏夹里面
            CompletableFuture.runAsync(() -> {
                albumList = iDbService.searchMusicInAlbums(CommonResources.currMusicBean);

                albumList.forEach(s -> System.out.print(s + "-------"));
            }).whenComplete((v, t) -> {
                if (albumList.size() < 1) return;
                items.forEach(item -> {
                    if (albumList.contains(item.getText())) {
                        System.out.println("\n"+CommonResources.currMusicBean.getSong_name() + " 存在收藏夹：" + item.getText());
                        ((CheckMenuItem)item).setSelected(true);
                    } else {
                        ((CheckMenuItem)item).setSelected(false);
                    }
                });
            });
        });
    }

    static {
        //监听allAlbum的改变，一旦改变，更新所有CheckBox
        allAlbum.addListener((observable, oldValue, newValue) -> {
            selectCheckBsList.clear();
            //新数据来了，更新复选框菜单
            newValue.forEach(item -> selectCheckBsList.add(new CheckMenuItem(item.getCollectionName())));
            //依次给复选框菜单设置点击事件
            new CommonView().cbListChange();
        });
    }

    /**
     * 提供给外界的方法，当收藏夹更新的时候
     */
    public static void notifyAlbumListUpdate() {
        System.out.println("notifyAlbumListUpdate--------------");
        if (allAlbum != null)
            allAlbum.get().clear();
        allAlbum.set(new DbServiceImpl().getAllAlbum(1));
    }

    private void cbListChange() {
        //给复选框设置选择事件
        selectCheckBsList.forEach(item -> item.setOnAction(me -> {
            CheckMenuItem checkMenuItem = (CheckMenuItem) me.getSource();
            String itemText = item.getText();   //获取复选框的文本
            System.out.println("点击了复选框" + itemText);    //测试是否被点击
            //选择了，那么要把当前的歌放到收藏夹中
            if (checkMenuItem.isSelected()) {
                //把歌曲放到收藏夹中
                CollectionAlbum album = iDbService.searchAlbum(itemText.trim());
                if (album == null) {
                    QuickUtils.showNotification("异常", "查询收藏夹：" + itemText + "==null", null);
                    return;
                }
                //添加歌曲
                boolean insertResult = iDbService.insertMusicToSpecialAlbum(album.getAlbumName(), CommonResources.currMusicBean);

                if (insertResult)   //添加成功，更新LeftController
                    BaseController.BC_CONTEXT.get(LeftController.class.getName()).updateUi(checkMenuItem.getText().trim(), 0);
                else  //添加不成功
                    QuickUtils.showNotification("添加失败", "添加音乐到收藏夹：" + itemText + "，失败", null);
            }
            //没选，要考虑，是否当前首歌已经存在收藏夹里面，当点击不选择，那么应该把歌从收藏夹删除
            else {
                //查找是否歌曲存在收藏夹，在的话就删除
                CollectionAlbum album = iDbService.searchAlbum(itemText.trim());
                if (album == null) {
                    QuickUtils.showNotification("异常", "查询收藏夹：" + itemText + "==null", null);
                    return;
                }
                boolean containSongs = iDbService.searchAlbumContainSongs(album.getAlbumName(), CommonResources.currMusicBean);
                //存在了，那就删除
                if (containSongs) {
                    boolean delResult = iDbService.removeMusicFromAlbum(album.getAlbumName(), CommonResources.currMusicBean.getHash());
                    if (delResult)  //删除成功，更新UI
                        BaseController.BC_CONTEXT.get(LeftController.class.getName()).updateUi(checkMenuItem.getText().trim(), 0);
                    else //更新LeftController
                        QuickUtils.showNotification("失败", "从收藏夹" + item.getText() + "移除音乐，失败", null);
                }
            }
        }));
    }//cbListChange

    public ListView<AlbumMemberNode> getAlbumListView() {
        ListView<AlbumMemberNode> listView = new ListView<>();
        listView.getStylesheets().add("css/leftPane_css.css");
        return listView;
    }

    public ContextMenu getAddAlbumContextMenu() {
        if (allAlbum.get() == null) {
            allAlbum.set(iDbService.getAllAlbum(1));
            contextMenu.getItems().addAll(selectCheckBsList);
        }
        else {    //如果allAlbum不为空，说明contextMenu已经添加过复选框
            //这里再判断contextMenu中的控件数量是否与allAlbum的一样，不一样就更新contextMenu的控件为最新
            if (allAlbum.get().size() != contextMenu.getItems().size()) {
                contextMenu.getItems().clear();
                contextMenu.getItems().addAll(selectCheckBsList);
            }
        }
        return contextMenu;
    }//
};
