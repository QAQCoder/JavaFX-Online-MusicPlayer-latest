package utils;

import controller.LyricController;
import javafx.scene.media.MediaPlayer;

public interface PlayerListenerCallback {

    void doWhat(MediaPlayer mediaPlayer, LyricController.SyncLyricCallback syncLyricCallback);
}
