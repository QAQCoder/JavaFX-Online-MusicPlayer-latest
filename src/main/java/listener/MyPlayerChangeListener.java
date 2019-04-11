package listener;

import base.BaseController;
import controller.BottomController;
import controller.LyricController;
import database.DbServiceImpl;
import database.IDbService;
import entity.KuGouMusicPlay;
import flag.CommonResources;
import flag.MusicResources;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;
import utils.PlayerListenerCallback;

import java.util.concurrent.CompletableFuture;

public class MyPlayerChangeListener implements ChangeListener {

    private PlayerListenerCallback callback;
    private LyricController.SyncLyricCallback syncLyricCallback;
    private MediaPlayer mediaPlayer;

    public MyPlayerChangeListener() {
    }

    @Override
    public void changed(ObservableValue observable, Object oldValue, Object newValue) {
        callback.doWhat(mediaPlayer, syncLyricCallback);
        //监控音乐播放完毕
        mediaPlayer.setOnEndOfMedia(() -> {
            ((BottomController)BaseController.BC_CONTEXT.get(BottomController.class.getName())).btnPlay.setGraphic(CommonResources.IMAGE_PAUSE);
            MusicResources mr = MusicResources.getInstance();
            //把刚刚播放完的歌曲放到recent_play数据库表
            KuGouMusicPlay.DataBean currPlayingSong = mr.getCurrPlayingSong();
            IDbService dbService = DbServiceImpl.getInstance();
            CompletableFuture.supplyAsync(() -> {
                return dbService.insertIntoRecentPlay(currPlayingSong);
            }).whenComplete((u, throwable) -> {
                if (null != throwable) {
                    System.out.println("[异常]-->MyPlayerChangeListener-->supplyAsync");
                    throwable.printStackTrace();
                }
                if (!u) System.out.println("添加音乐到[最近播放]出错");
            });

            if (mr.getCurrPlayMode() == mr.SINGLE_MODE) {
                System.out.println("单曲模式，不用下一曲");
                mediaPlayer.seek(Duration.ZERO);
                mediaPlayer.play();
                ((BottomController)BaseController.BC_CONTEXT.get(BottomController.class.getName())).btnPlay.setGraphic(CommonResources.IMAGE_PLAYING);
            } else {
                //播放完毕，应该去跟MusicResources要歌曲
                mediaPlayer.stop();
                mediaPlayer.seek(Duration.ZERO);
                System.out.println("---播放完毕，下一首歌---");
                MusicResources.getInstance().nextSong();
            }
        });
    }//

    public void setCallback(PlayerListenerCallback callback) {
        this.callback = callback;
    }

    public void setMediaPlayer(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public void setSyncLyricCallback(LyricController.SyncLyricCallback syncLyricCallback) {
        this.syncLyricCallback = syncLyricCallback;
    }//
}
