package entity;

import javafx.util.Duration;

import java.util.Map;
import java.util.TreeMap;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public abstract class BaseLyric {

    public static Map<Double, BaseLyric> BL_LYRIC = new TreeMap<>();

    public BaseLyric(Double duration) {
        BL_LYRIC.put(duration, this);
    }
}
