package utils;

import controller.LyricController;
import entity.KuGouMusicPlay;
import javafx.scene.control.Button;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：播放音乐的接口
 */
public interface IMusic {

    void play();
    void pause();
    void stop();
    void seek(Duration duration);
//    void setMediaPlayerView(MediaView mediaView);
    boolean isPlayerNull();

    boolean isPlaying();
    boolean isPausing();

    MediaPlayer.Status getCurrStatus();

    void setVolume(double volume);

    //player的回调
    void setListener(PlayerListenerCallback callback, LyricController.SyncLyricCallback syncLyricCallback);
    void startListener();
    void removeListener();

    void initMusicInfo(KuGouMusicPlay.DataBean selectItem, PlayerCallback callback);

    void listenPlayerStatus(Button btn);

//    void initSyncLyric(LyricController.SyncLyricCallback callback);
}
