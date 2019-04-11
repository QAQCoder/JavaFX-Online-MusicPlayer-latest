package utils;

import entity.Lyric;
import javafx.util.Duration;

import java.util.*;
import java.util.stream.Stream;

public class IOUtils {

    /*public  String[] getInitLyricArray(String lyric) {
//        String[] split = lyric.split("\\[");
        return lyric.split("\\[");
    }//*/

    /**
     * 根据歌词解析，返回歌词对象
     * @param lyric 歌词
     * @return
     */
    public static Map<String, Object> getInitLyricList(String lyric) {
        List<Lyric> lyricList = new ArrayList<>();
        TreeMap<Long, Integer> map = new TreeMap<>();

        String[] array = lyric.split("\\[");
        //因为array[0]为空，所以从array[1]开始
        for (int i = 1; i < array.length; i++) {
            int index = array[i].indexOf("]");
            Duration duration = stringToDuration(array[i].substring(0, index));
            lyricList.add(new Lyric(duration, array[i].substring(index + 1)));
            map.put(Long.parseLong(String.format("%.0f", duration.toSeconds())), i-1);
        }
        Map<String, Object> data = new HashMap<>();
        data.put("map_index", map);
        data.put("lyric_list", lyricList);

        return data;
    }//

    /**
     * 根据歌词解析，返回歌词对象
     * @param lyric 歌词
     * @return
     */
    /*public static Map<Double, Lyric> getInitLyricList(String lyric) {
        Map<Double, Lyric> map = new HashMap<>();
        String[] array = lyric.split("\\[");
        //因为array[0]为空，所以从array[1]开始
        for (int i = 1; i < array.length; i++) {
            int index = array[i].indexOf("]");
            Duration duration = stringToDuration(array[i].substring(0, index));
            map.put(duration.toMillis(), new Lyric(duration, array[i].substring(index + 1)));
        }
        *//*Stream.iterate(0, i -> i+1).limit(array.length).forEach(i -> {
            int index = array[i].indexOf("]");
            lyricList.add(new Lyric(stringToDuration(array[i].substring(0, index)), array[i].substring(index + 1)));
        });*//*
        return map;
    }//*/

    /**
     * 把字符串比如 "00:00.03" 转成毫秒
     * @param s
     * @return
     */
    public static Duration stringToDuration(String s) {
        //先替换掉 .
        String replace = s.replace(".", ":");
        //根据 : 分成三段
        String[] split = replace.split(":");
        //再拼成毫秒
        int millis = Integer.parseInt(split[0]) * 60 * 1000 + Integer.parseInt(split[1]) * 1000 + Integer.parseInt(split[2]);
        return Duration.millis(millis);
    }

    /*@Test
    public void fun2() {
        String s = "12:12:00]我在马路边捡到一分钱";
//        System.out.println(s.indexOf("]"));
    }*/

    /*@Test
    public void fun3() {
        String s = "[00:00.03]林俊杰 - 曹操\n" +
                "[00:00.26]作词：林秋离\n" +
                "[00:00.46]作曲：林俊杰\n" +
                "[00:00.71]编曲：Kenn C\n" +
                "[00:26.84]不是英雄不读三国\n" +
                "[00:33.68]若是英雄\n" +
                "[00:36.22]怎么能不懂寂寞\n" +
                "[00:39.92]独自走下长坂坡";
//        getInitLyricList(s).forEach(lyric -> System.out.println(lyric.getTime()));
    }*/
}
