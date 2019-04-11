package entity;

import javafx.util.Duration;

import java.util.Map;
import java.util.TreeMap;

public abstract class BaseLyric {

    public static Map<Double, BaseLyric> BL_LYRIC = new TreeMap<>();

    public BaseLyric(Double duration) {
        BL_LYRIC.put(duration, this);
    }
}
