package utils;

import entity.KuGouMusicPlay;
import javafx.scene.media.MediaPlayer;

public interface PlayerCallback {

    void initViewOfMusicInfo(KuGouMusicPlay.DataBean selectItem);
}
