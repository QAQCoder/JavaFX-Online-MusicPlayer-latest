package utils;

import entity.KuGouMusicPlay;
import javafx.scene.media.MediaPlayer;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public interface PlayerCallback {

    void initViewOfMusicInfo(KuGouMusicPlay.DataBean selectItem);
}
