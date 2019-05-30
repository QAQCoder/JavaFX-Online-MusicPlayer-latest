package net;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public class ParseHTML {

    private static ParseHTML instance = null;
    private ParseHTML() {}
    public static ParseHTML getInstance() {
        if (instance == null) {
            synchronized (ParseHTML.class) {
                if (instance == null) instance = new ParseHTML();
            }
        }
        return instance;
    }//

    /**
     * 获取新歌的hash值
     * @return 返回华语欧美hash
     */
    public List<List<String>> getNewSongHashs() {
        try {
            Document document = Jsoup.connect("https://www.kugou.com/").get();
            Elements ele_DivSongtabContent = document.select("div#SongtabContent");
            //有四个UL，分别是华语，欧美。。。。，只要华语欧美即可
            Elements ele_UL = ele_DivSongtabContent.select("ul");
            //华语
            Element ele_Chinese = ele_UL.get(0);
            //欧美
            Element ele_AmericanEurope = ele_UL.get(1);
            Element ele_PaoCai = ele_UL.get(2);
            Element ele_Japen = ele_UL.get(3);
            //华语li
            Elements li_Chinese = ele_Chinese.select("li");
            //保存hash
            List<List<String>> lists = new ArrayList<>();
            List<String> list = new ArrayList<>();
            li_Chinese.forEach(li -> list.add(getHashFromLiData(li.attr("data"))));
            lists.add(list);
            //欧美li
            List<String> list2 = new ArrayList<>();
            Elements li_AmericanEurope = ele_AmericanEurope.select("li");
            li_AmericanEurope.forEach(li -> list2.add(getHashFromLiData(li.attr("data"))));
            lists.add(list2);

            List<String> list3 = new ArrayList<>();
            Elements li_PaoCai = ele_PaoCai.select("li");
            li_PaoCai.forEach(li -> list3.add(getHashFromLiData(li.attr("data"))));
            lists.add(list3);

            List<String> list4 = new ArrayList<>();
            Elements li_Japan = ele_Japen.select("li");
            li_Japan.forEach(li -> list4.add(getHashFromLiData(li.attr("data"))));
            lists.add(list4);

            return lists;
        } catch (IOException e) {
            e.printStackTrace();
            if (e instanceof UnknownHostException)
                System.out.println("ParseHTML--getNewSongHashs()--occur exception：" + e.getMessage());
        }
        return null;
    }

    /**
     * 解析字符串得到hash
     * @param data
     * @return
     */
    private String getHashFromLiData(String data) {
//        System.out.println(data);
        int begin = data.indexOf("\"Hash\":\"");
        int end = data.indexOf("\",\"time\"");
        String substring = data.substring(begin + 8, end);
//        System.out.println("ParseHTML---getHashFromLiData: " + substring);
        return substring;
    }

    /*@Test
    public void fun2() {
        String s = "{\"first\":1,\"Hash\":\"E99A401D98C4D039FD2E353CEE489EEE\",\"time\":\"04:02\",\"timeLen\":242544,\"FileName\":\"任素汐 - 最佳损友 (国语版)【绿皮书电影中国区推广曲】\",\"Filename\":\"任素汐 - 最佳损友 (国语版)【绿皮书电影中国区推广曲】\",\"albumId\":16089476,\"privilege\":4,\"size\":3881398,\"songLink\":\"u7iwz68\",\"mixsongid\":133448368}";
        int begin = s.indexOf("\"Hash\":\"");
        int end = s.indexOf("\",\"time\"");
        String substring = s.substring(begin+8, end);
        System.out.println(substring);
    }*/

    @Test
    public void fun3() {
        List<List<String>> newSongHashs = getNewSongHashs();
        System.out.println(newSongHashs.size());
        System.out.println(newSongHashs.get(0).get(1));
    }
}
