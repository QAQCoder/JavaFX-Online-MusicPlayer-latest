package entity;

import javafx.util.Duration;

import java.io.Serializable;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：歌词pojo，保存了时间与歌词
 */
public class Lyric extends BaseLyric implements Serializable {
    private Duration time;
    private String text;
    //get set

    public Lyric(Duration duration) {
        super(duration.toMillis());
    }

    public Lyric(Duration time, String text) {
        this(time);
        this.time = time;
        this.text = text;
    }

    public Duration getTime() {
        return time;
    }

    public void setTime(Duration time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Lyric{" + "time=" + time + ", text='" + text + '}';
    }
}
