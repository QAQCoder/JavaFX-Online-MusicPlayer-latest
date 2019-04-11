package view;

import base.BaseController;
import com.jfoenix.controls.JFXButton;
import controller.BottomController;
import controller.RankMusicViewController;
import entity.KuGouMusicPlay;
import flag.CommonResources;
import flag.MusicResources;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import utils.TimeUtils;

import static flag.CommonResources.BACKGROUND_A;
import static flag.CommonResources.BACKGROUND_B;

public class NewSongCell extends HBox {

    private Label labIndex = new Label("50");
    private Label labSongName = new Label("林俊杰 - 江南");
    private Label labSongTime = new Label("4:50");
    private JFXButton btnPlay = new JFXButton("播放");
    private JFXButton btnAdd = new JFXButton("+");
    private Tooltip tooltip = new Tooltip();

    private String attribute = null;
    public String getAttribute() {
        return attribute;
    }
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    private int index;
    private KuGouMusicPlay.DataBean dataBean = null;
    private byte whoIsMyLv = 0;

    public NewSongCell(double spacing) {

        setPrefHeight(30d);
        setPrefWidth(370d);
        setSpacing(spacing);
        setAlignment(Pos.CENTER);
        setPadding(new Insets(0, 0, 0, 8));
        setHgrow(labSongName, Priority.ALWAYS);
        labIndex.setPrefWidth(20);
        labSongName.setPrefWidth(170);
        labSongTime.setPrefWidth(30);
        btnPlay.setPrefWidth(50);
        setHgrow(btnPlay, Priority.ALWAYS);
        btnAdd.setPrefWidth(20);
        getChildren().addAll(labIndex, labSongName, labSongTime, btnPlay, btnAdd);

        labSongName.setOnMouseEntered(me -> {
            tooltip.setText(labSongName.getText());
            tooltip.setFont(Font.font(13));
            tooltip.show(labSongName.getScene().getWindow(), me.getScreenX()+5, me.getScreenY()+5);
        });
        labSongName.setOnMouseExited(me -> tooltip.hide());

        this.setOnMouseClicked(me -> {
            if (me.getClickCount() == 2) {
                MusicResources.getInstance().getCurrMusicList().add(dataBean);
                MusicResources.getInstance().nextSong();
            }
        });

        btnPlay.setOnAction(ae -> {
            if (dataBean == null) return;
            MusicResources.getInstance().setCurrMusicList(dataBean);
            ((BottomController) BaseController.BC_CONTEXT.get(BottomController.class.getName())).playMusic(dataBean, true);
        });

        addBtnEventBatchInit(btnAdd);
    }

    private void addBtnEventBatchInit(Node btn) {
        //点击添加按钮后，显示一个ContextMenu，选择添加到哪个收藏夹
        btn.setOnMouseClicked(me -> {
            System.out.println("添加点击事件触发------------");
            //更新当前选择的音乐
            CommonResources.currMusicBean = dataBean;
            ListView<NewSongCell> lv =
                    ((RankMusicViewController) RankMusicViewController.BC_CONTEXT.get(RankMusicViewController.class.getName())).getLvWithFlag(whoIsMyLv);
            lv.getSelectionModel().select(this);

            ContextMenu cm = CommonView.getInstance().getAddAlbumContextMenu();
            cm.show(btn.getScene().getWindow(), me.getScreenX()-50, me.getScreenY()+20);
            cm.setHideOnEscape(false);
        });
    }

    public NewSongCell(int index, KuGouMusicPlay.DataBean dataBean, byte flag) {
        this(10);
        this.whoIsMyLv = flag;
        this.dataBean = dataBean;
        this.index = index;
        initView();
    }

    public NewSongCell(int index, KuGouMusicPlay.DataBean dataBean, byte flag, boolean rankWidth) {
        this(10);
        this.whoIsMyLv = flag;
        this.dataBean = dataBean;
        this.index = index;
        initView();
        if (rankWidth) {
            this.setSpacing(10);
            this.setPrefWidth(450);
            labSongName.setPrefWidth(230);
        }
    }

    private void initView() {
        labIndex.setText(String.valueOf(index));
        if ((index % 2) == 0)
            setBackground(BACKGROUND_A);
        else
            setBackground(BACKGROUND_B);
        labSongName.setText(dataBean.getAuthor_name() + " - " + dataBean.getSong_name());
        labSongTime.setText(TimeUtils.handleSecond(dataBean.getTimelength()));
    }

    public KuGouMusicPlay.DataBean getDataBean() {
        return dataBean;
    }

    public void setDataBean(KuGouMusicPlay.DataBean dataBean) {
        this.dataBean = dataBean;
    }
}
