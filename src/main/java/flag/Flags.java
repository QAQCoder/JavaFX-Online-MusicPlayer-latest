package flag;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.Node;

public class Flags {

    //歌词界面是否显示
    public static final SimpleBooleanProperty IS_LYRIC_VISIBLE = new SimpleBooleanProperty(false);
    //
    public static double LYRIC_PANE_DIVISION = 0.8;

    //歌曲在播放吗
//    public static final SimpleBooleanProperty IS_MUSIC_PLSYING = new SimpleBooleanProperty(false);
    //是否player为空
//    public static final SimpleBooleanProperty IS_PLAYER_NULL = new SimpleBooleanProperty(true);

    //是否歌词面板不为空
    public static Node lyricPane = null;

    /*private static Map<String, Object> mapLyric = new HashMap<>();

    public static Map<String, Object> getMapLyric() {
        return mapLyric;
    }

    public static void setMapLyric(Map<String, Object> mapIndex, KuGouMusicPlay.DataBean bean) {
        if (!mapLyric.isEmpty()) mapLyric.clear();
        mapLyric.put("musicInfo", bean);
        mapLyric.put("musicLyric", mapIndex);
    }*/
}
