package node;

import base.BaseController;
import com.jfoenix.controls.JFXButton;
import controller.BottomController;
import controller.LeftController;
import database.DbServiceImpl;
import entity.CollectionAlbum;
import entity.KuGouMusicPlay;
import flag.MusicResources;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.text.Font;
import org.controlsfx.control.Notifications;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public class AlbumMemberNode extends HBox {

    private KuGouMusicPlay.DataBean bean;
    private Label labSongName = new Label("林俊杰 - 江南");
    private JFXButton btnAddToPlayQueue = new JFXButton("+");
    private JFXButton btnPlay = new JFXButton("播放");
    private JFXButton btnRemove = new JFXButton("清除");
    private final Tooltip tooltip = new Tooltip();
//    private final Tooltip TOOLTIP_ADD_TO_QUEUE = new Tooltip("添加到播放队列");

    public AlbumMemberNode() {
        setPrefWidth(260);
        setSpacing(5);
        setAlignment(Pos.CENTER_LEFT);

        btnPlay.setPrefWidth(45);
        btnRemove.setPrefWidth(45);

        labSongName.setPrefWidth(145);
        Region region = new Region();
        HBox.setHgrow(region, Priority.ALWAYS);
        getChildren().addAll(btnAddToPlayQueue, labSongName, region, btnPlay, btnRemove);

        this.getStylesheets().add("css/my_btn_css.css");

        initEvent();
    }

    public AlbumMemberNode(KuGouMusicPlay.DataBean bean) {
        this();
        this.bean = bean;
        initView();
    }

    private void initView() {
        labSongName.setText(bean.getAudio_name());
    }

    private void initEvent() {
        btnPlay.setOnAction(ae -> {
            if (bean == null) return;
            MusicResources.getInstance().setCurrMusicList(bean);
            ((BottomController)BaseController.BC_CONTEXT.get(BottomController.class.getName())).playMusic(bean, true);
        });

        btnRemove.setOnAction(ae -> {
            System.out.println("----------移除歌曲.setOnAction--------");
            if (bean == null) return;
            String text = ((LeftController) BaseController.BC_CONTEXT.get(LeftController.class.getName())).getExpandedPane().getText();
            System.out.println("当前展开的列表：" + text);

            DbServiceImpl dbService = DbServiceImpl.getInstance();

            CollectionAlbum album = dbService.searchAlbum(text);
            System.out.println("当前移除的音乐hash:" + bean.getHash() + "-->收藏夹信息: " + album);
            boolean b = dbService.removeMusicFromAlbum(album.getAlbumName(), bean.getHash());
            if (b) {
                Notifications.create().title("提示").text("移除歌曲成功").showInformation();
                //更新收藏夹
                BaseController.BC_CONTEXT.get(LeftController.class.getName()).updateUi(text, 0);
            }
        });

        labSongName.setOnMouseEntered(me -> {
            tooltip.setText(labSongName.getText());
            tooltip.setFont(Font.font(13));
            tooltip.show(labSongName.getScene().getWindow());
            tooltip.setX(me.getScreenX());
            tooltip.setY(me.getScreenY());
        });
        labSongName.setOnMouseExited(me -> tooltip.hide());

        /*btnAddToPlayQueue.setOnMouseEntered(me -> {
            TOOLTIP_ADD_TO_QUEUE.setFont(Font.font(12));
            TOOLTIP_ADD_TO_QUEUE.show(btnAddToPlayQueue.getScene().getWindow(), me.getScreenX()+5, me.getScreenY());
        });
        btnAddToPlayQueue.setOnMouseExited(me -> TOOLTIP_ADD_TO_QUEUE.hide());*/
        btnAddToPlayQueue.setOnMouseClicked(me -> MusicResources.getInstance().addToPlayQueue(bean));

    }

    public KuGouMusicPlay.DataBean getBean() {
        return bean;
    }

    public AlbumMemberNode(double spacing, Node... children) {
        super(spacing, children);
    }
}
