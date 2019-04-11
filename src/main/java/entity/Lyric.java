package entity;

import javafx.util.Duration;

import java.io.Serializable;

/**
 * 歌词pojo，保存了时间与歌词
 * 每句歌词对应的时间
 */
public class Lyric extends BaseLyric implements Serializable {

    private Duration time;
    private String text;

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
