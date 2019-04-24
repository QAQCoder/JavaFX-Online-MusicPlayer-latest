package controller;

import base.BaseController;
import com.jfoenix.controls.JFXButton;
import database.DbServiceImpl;
import database.IDbService;
import entity.KuGouMusicPlay;
import flag.CommonResources;
import flag.Flags;
import flag.MusicResources;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;
import org.controlsfx.control.PopOver;
import service.IMusicService;
import service.MusicServiceImple;
import utils.*;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.concurrent.CompletableFuture;

public class BottomController extends BaseController implements Initializable {

    @FXML public JFXButton btnPrev;
    @FXML public JFXButton btnPlay;
    @FXML public JFXButton btnNext;
    @FXML public Text textCurrMusicInfo;
    @FXML public Text textCurrTime;
    @FXML public Text textEndTIme;
    @FXML public JFXButton btnLike;
    @FXML public JFXButton btnDownload;
    @FXML public JFXButton btnPlayMode;
    @FXML public JFXButton btnVolume;
    @FXML public JFXButton btnLyric;
    @FXML public Slider sliderCurrTime;
    public ImageView imgV_Playing;
    public Text textBuffering;
    public Text textBufferingNetworkSlow;

    private Slider sliderVolume = new Slider(0.0, 1.0, 0.5);
    private PopOver volumePopOver = null;

    private IMusic iMusic = MusicUtils.getInstance();
    private KuGouMusicPlay.DataBean selectItem;
    //
    private IMusicService musicService = new MusicServiceImple();
    //
    private IDbService dbService = new DbServiceImpl();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initView();
        initEvent();
        initCallback();
    }// initialize over

    private void initView() {
        StackPane pane = new StackPane(sliderVolume);
        StackPane.setAlignment(sliderVolume, Pos.CENTER);
        pane.setBackground(new Background(new BackgroundFill(Color.DARKGREY, null, null)));
        pane.setPrefSize(10, 100);
        volumePopOver = new PopOver(pane);
    }

    private void initEvent() {

        btnLyric.setOnMouseClicked(me -> {
            System.out.println("btnLyric.setOnMouseClicked");
            if (Flags.lyricPane == null) {
                Flags.lyricPane = LoadUtil.loadFXML("fxml/items/lyric_view.fxml");
            }
            ((LyricController)BaseController.BC_CONTEXT.get(LyricController.class.getName())).showLyric();
        });

        btnPlayMode.setOnAction(ae -> {
            switch (MusicResources.getInstance().getCurrPlayMode()) {
                case 0:
                    MusicResources.getInstance().setCurrPlayMode(1);
                    btnPlayMode.setGraphic(CommonResources.IMAGE_SINGLE_MODE);
                    break;
                case 1:
                    MusicResources.getInstance().setCurrPlayMode(2);
                    btnPlayMode.setGraphic(CommonResources.IMAGE_RANDOM_MODE);
                    break;
                case 2:
                    MusicResources.getInstance().setCurrPlayMode(0);
                    btnPlayMode.setGraphic(CommonResources.IMAGE_NORMAL_MODE);
                    break;
            }
        });

        btnPlay.setOnAction(me -> iMusic.play());

        btnLike.setOnAction(ae -> {
            //先查询该歌曲是否存在数据库了
            KuGouMusicPlay.DataBean bean = MusicResources.getInstance().getCurrPlayingSong();
            if (bean == null) return;
            boolean inLove = dbService.searchSongInLoveAlbum(bean);
            if (inLove) {
                boolean removeRes = dbService.removeSongFromMyLove(bean);
                if (removeRes) {
                    Notifications.create().title("提示").text("移除歌曲（" + bean.getAudio_name() + "）从[我的喜爱]成功").showInformation();
                    btnLike.setGraphic(CommonResources.IMAGE_LIKE_WHITE);
                }
            } else {
                boolean b = dbService.addSongToMyLove(bean);
                if (b) {
                    QuickUtils.showNotification("提示", "歌曲添加到（我的喜爱）成功", null);
                    btnLike.setGraphic(CommonResources.IMAGE_LIKE_RED);
                } else {
                    QuickUtils.showNotification("提示", "歌曲添加到（我的喜爱）失败", null);
                    btnLike.setGraphic(CommonResources.IMAGE_LIKE_WHITE);
                }
            }
        });

        btnPrev.setOnAction(ae -> MusicResources.getInstance().prevSong());
        btnNext.setOnAction(ae -> MusicResources.getInstance().nextSong());

        btnDownload.setOnMouseClicked(me -> {
            QuickUtils.showJFXDialog((StackPane) btnDownload.getScene().getRoot(),  "下载信息", selectItem.getAudio_name(), selectItem.getPlay_url());
        });

        //如果slider的value改变，在拖动的时候，那么就要给用户显示拖动到哪里了
        sliderCurrTime.valueProperty().addListener(observable -> {
            if (sliderCurrTime.isValueChanging() && !iMusic.isPlayerNull()) {
                textCurrTime.setText(TimeUtils.millisToMinutes((int) sliderCurrTime.getValue()));
            }
        });
        //鼠标按下，移除player的监听回调
        sliderCurrTime.setOnMousePressed(pressed -> {
            System.out.println("sliderCurrTime press");
//            iMusic.pause();
            iMusic.removeListener();
        });
        //鼠标释放，给player添加监听回调
        sliderCurrTime.setOnMouseReleased(released -> {
            System.out.println("sliderCurrTime released");
            //在释放拖动时再seek
            CompletableFuture.runAsync(() -> {
                System.out.println("sliderCurrTime released ---> CompletableFuture.runAsync");
                iMusic.seek(Duration.millis(sliderCurrTime.getValue()));
            }).handle((aVoid, throwable) -> {
                iMusic.setListener(playerListenerCallback, ((LyricController) BaseController.BC_CONTEXT.get(LyricController.class.getName())).callback);
                return null;
            }).whenComplete((aVoid, throwable) -> {
                System.out.println("sliderCurrTime released ---> CompletableFuture.whenComplete");
                iMusic.startListener();
            });
        });

        //音量调节框弹出
        btnVolume.setOnMouseClicked(meClick -> {
            sliderVolume.setOrientation(Orientation.VERTICAL);
            volumePopOver.setArrowLocation(PopOver.ArrowLocation.BOTTOM_CENTER);
            volumePopOver.setArrowSize(0);
            volumePopOver.setPrefWidth(20);
            volumePopOver.show(btnVolume, meClick.getScreenX()-5.0, meClick.getScreenY()-20.0);
        });
        btnVolume.setOnMouseReleased(release -> volumePopOver.hide());
        //音量调节监听
        sliderVolume.valueProperty().addListener((observable, oldValue, newValue) -> iMusic.setVolume(sliderVolume.getValue()));
    }// initEvent over

    /* 回调：更新进度条以及当前时间Label，还有歌词的显示 */

    private PlayerListenerCallback playerListenerCallback = new PlayerListenerCallback() {
        @Override
        public void doWhat(MediaPlayer mediaPlayer, LyricController.SyncLyricCallback syncLyricCallback) {
            double millis = mediaPlayer.getCurrentTime().toMillis();
            sliderCurrTime.setValue(millis);
            textCurrTime.setText(TimeUtils.millisToMinutes((int) millis));
            syncLyricCallback.syncLyric(mediaPlayer.getCurrentTime());
        }
    };//
    /*每次播放新歌曲，都应该执行这个回调，更新界面数据*/

    private final PlayerCallback playerCallback = new PlayerCallback() {
        @Override
        public void initViewOfMusicInfo(KuGouMusicPlay.DataBean selectItem) {
            double millis = selectItem.getTimelength();
            System.out.println("当前歌曲时长：" + millis);
            sliderCurrTime.setMax(millis);
            textEndTIme.setText(TimeUtils.millisToMinutes((int) millis));
            textCurrMusicInfo.setText(selectItem.getAudio_name());
        }
    };
    /***
     * 下一首歌的播放回调，musicBean由MusicResources穿送过来
     */
    private final MusicResources.PlayNextCallback playNextCallback = (musicBean, playOrPause) -> {
        if (musicBean == null)
            iMusic.stop();

        MusicResources mr = MusicResources.getInstance();
        if (mr.getCurrPlayMode() != mr.SINGLE_MODE) {
            playMusic(musicBean, playOrPause);
        } else {
            if (iMusic.getCurrStatus().equals(MediaPlayer.Status.PAUSED))
                playMusic(musicBean, true);
            else
                playMusic(musicBean, false);
        }
    };
    //给MusicResources注入回调
    private void initCallback() {
        MusicResources.getInstance().setCallback(playNextCallback);
    }

    /**
     * 播放音乐的方法，对外开放
     * @param bean
     */
    public void playMusic(KuGouMusicPlay.DataBean bean, boolean playOrPause) {
        System.out.println("播放音乐-输出MusicBean：" + bean.getSong_name() + " - " + bean.getPlay_url());
        selectItem = bean;

        /*猜测：加载网络图片较慢，阻塞了UI线程*/
        imgV_Playing.setImage(new Image(selectItem.getImg()));
        //先检测（播放链接是否过期）
        if (selectItem.getPlay_url().contains("http")) {
            CompletableFuture.supplyAsync(() -> {
                System.out.println("playMusic() ---> CompletableFuture.supplyAsync");
                return musicService.checkPlayUrl(selectItem.getPlay_url(), selectItem.getHash());
            }).whenComplete((bean1, throwable) -> {
                System.out.println("playMusic() ---> CompletableFuture.whenComplete");
                if (throwable != null) {
                    System.out.println("playMusic() --> throwable != null");
                    throwable.printStackTrace();
                }
                if (null != bean1) {
                    selectItem = bean1;
                    System.out.println("新的播放链接：" + bean1.getPlay_url());
                }
                playSecondStep();
            });
        } else {
            System.out.println("本地音乐：" + selectItem.getPlay_url());
            playSecondStep();
        }
    }

    private void playSecondStep() {
        //这个音乐是否存在我的喜爱收藏夹
        boolean my_love = dbService.searchSongInLoveAlbum(selectItem);
        if (my_love) {
            Platform.runLater(() -> btnLike.setGraphic(CommonResources.IMAGE_LIKE_RED));
        } else {
            Platform.runLater(() -> btnLike.setGraphic(CommonResources.IMAGE_LIKE_WHITE));
        }

        if (selectItem.getLyrics() == null) selectItem.setLyrics("[00:00.00]没歌词啵~");

        System.out.println("注入歌词----[" + selectItem.getAudio_name() + "]，开始");
        Map<String, Object> mapIndex = IOUtils.getInitLyricList(selectItem.getLyrics());

        Map<String, Object> mapLyric = new HashMap<>();
        mapLyric.put("musicInfo", selectItem);
        mapLyric.put("musicLyric", mapIndex);
        if (Flags.lyricPane == null) {
            Flags.lyricPane = LoadUtil.loadFXML("fxml/items/lyric_view.fxml");
        }
        BaseController.BC_CONTEXT.get(LyricController.class.getName()).initData(mapLyric);
        System.out.println("注入歌词----[" + selectItem.getAudio_name() + "]，结束");

        iMusic.listenPlayerStatus(btnPlay);
        iMusic.setListener(playerListenerCallback, ((LyricController) BaseController.BC_CONTEXT.get(LyricController.class.getName())).callback);
        MusicUtils.getInstance().playNewSong(selectItem.getPlay_url());
//        iMusic.initMusicInfo(selectItem, playerCallback);
        playerCallback.initViewOfMusicInfo(selectItem);
//        if (playOrPause) iMusic.play();
    }//

    public void showBufferingText(boolean visible, String text) {
        textBuffering.setVisible(visible);
        if (Objects.nonNull(text))
            textBuffering.setText(text);
    }
    public void showBufferingNetworkSlowText(boolean visible) {
        textBufferingNetworkSlow.setVisible(visible);
    }
};
