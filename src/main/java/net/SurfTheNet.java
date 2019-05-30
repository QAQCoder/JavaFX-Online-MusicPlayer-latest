package net;

import com.google.gson.Gson;
import entity.KuGouMusic;
import entity.KuGouMusicPlay;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public class SurfTheNet {

    //搜索音乐链接 0
    private static final String KUGOU_MUSIC_LINK = "http://mobilecdn.kugou.com/api/v3/search/song?";    //涉及分页 keyword, page, pagesize
    //根据hash值返回歌曲信息 1
    private static final String PLAY_LINK_HASH = "http://www.kugou.com/yy/index.php?r=play/getdata&hash=";
    //新歌榜 2
    public static final String NEWEST_MUSIC_LIST = "http://m.kugou.com/?json=true";
    //歌单 3
    public static final String SONG_LIST = "http://m.kugou.com/plist/index&json=true";
    //根据某一个歌单的specialID获取这个歌单包含的歌曲 4
    private static final String SONG_LIST_CONTAINS = "http://m.kugou.com/plist/list/XXX?json=true"; //涉及分页 page=
    //歌单分类
    public static final String SONG_LIST_CLASSIFY = "http://mobilecdngz.kugou.com/api/v3/category/allList?plat=0";
    //根据歌单分类的category获取这个分类下包含的所有歌单子项
    private static final String SONG_LIST_CLASSIFY_CONTAINS =
            "http://mobilecdngz.kugou.com/api/v3/category/special?ugc=1&withsong=1&plat=0&sort=3&pagesize=20&categoryid=XXX&page=1";
    //歌手分类
    public static final String SINGER_ALL_URL = "http://m.kugou.com/singer/class&json=true";
    //歌手分类下面的歌手列表 5
    private static final String SINGER_LIST_URL = "http://m.kugou.com/singer/list/XXX?json=true";
    //歌手信息 6
    private static final String SINGER_INFO_URL = "http://m.kugou.com/singer/info/XXX&json=true"; //涉及分页 page=
    //获取音乐排行榜
    public static final String RANK_SONG_LIST = "http://m.kugou.com/rank/list&json=true";
    //排行版分类歌曲列表
    private static final String RANK_SONG_LIST_CONTAINS = "http://m.kugou.com/rank/info/?rankid=XXX&page=1&json=true";
    //当前需要的url
    public static int currUrl = 0;
    //Gson
    private static Gson gson = new Gson();

    /**
     * 处理歌曲的Hash
     * @param hashs
     * @return
     */
    public static List<KuGouMusicPlay> handleHashs(List<String> hashs) {
        List<KuGouMusicPlay> kuGouMusicPlayList = new ArrayList<>();
        hashs.forEach(hash -> {
            KuGouMusicPlay play  = visitTheNetword(getCurrUrl(1) + hash, KuGouMusicPlay.class);
            kuGouMusicPlayList.add(play);
        });
        return kuGouMusicPlayList;
    }//

    /**
     * 搜索专用
     * @param keyword
     * @param page
     * @param size
     * @return
     */
    public static Map<String, Object> getSearchMusicHash(String keyword, int page, int size) {
        Map<String, Object> map = new HashMap<>();
        List<String> hashs = new ArrayList<>();
        if (page == 0) page = 1;
        if (size < 30) size = 30;
        KuGouMusic kuGouMusic1 = visitTheNetword(getCurrUrl(0) + "keyword=" + keyword + "&page=" + page +"&pagesize=" + size, KuGouMusic.class);
        List<KuGouMusic.DataBean.InfoBean> infoBeanList = kuGouMusic1.getData().getInfo();
        for (KuGouMusic.DataBean.InfoBean bean : infoBeanList)
            hashs.add(bean.getHash());
//        System.out.println("hashs: " + hashs.toString());

        map.put("list", hashs);
        map.put("total", kuGouMusic1.getData().getTotal());
        return map;
    }//getMusic

    /**
     * 通用访问网络返回json的JavaBean
     * @param urlLink
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> T visitTheNetword(String urlLink, Class<T> tClass) {
        StringBuilder json = new StringBuilder();
        InputStream is = null;
        BufferedReader reader = null;
        HttpURLConnection httpURLConnection = null;
        T obj = null;

        try {
            URL url = new URL(urlLink);
            httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Cookie", "kg_mid=1068981f3b494fcc89588921880d0e1");
            is = httpURLConnection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
            String temp = null;
            while ((temp = reader.readLine()) != null)
                json.append(temp);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (httpURLConnection != null)
                httpURLConnection.disconnect();
            try {
                if (reader != null) reader.close();
                if (is != null) is.close();
            } catch (IOException e) { e.printStackTrace(); }
        }
        if (json != null) {
//            System.out.println(json.toString());
            obj = gson.fromJson(json.toString(), tClass);
        }
        return obj;
    }//visitTheNetword

    /**
     * 加入请求头
     * @param url
     * @param header
     * @param fromJson
     * @param <T>
     * @return
     */
    public static <T> T visitTheNetWithHeader(String url, String header, Class<T> fromJson) {
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse httpResponse = null;
        String responseMsg = null;
        T obj = null;

        HttpGet get = new HttpGet(url);
        //追加request headers 设置成手机浏览器
        get.addHeader("User-Agent", "Mozilla/5.0 (iPhone; U; CPU iPhone OS 5_1_1 like Mac OS X; en) AppleWebKit/534.46.0 (KHTML, like Gecko) CriOS/19.0.1084.60 Mobile/9B206 Safari/7534.48.3");
        get.addHeader("Cookie", "kg_mid=1068981f3b494fcc89588921880d0e1");
        try {
            httpClient = HttpClients.createDefault();
            httpResponse = httpClient.execute(get);
            int statusCode = httpResponse.getStatusLine().getStatusCode();
//            System.out.println("状态码： " + statusCode);
            if (statusCode == 200) {
                 responseMsg = EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (httpClient != null) httpClient.close();
                if (httpResponse != null) httpResponse.close();
            } catch (IOException e) { e.printStackTrace(); }
        }
        if (responseMsg != null) {
//            System.out.println(responseMsg);
            obj = gson.fromJson(responseMsg, fromJson);
        }
        return obj;
    }

    /**
     * 选择当前需要的的url
     * @param which 那个url
     * @return
     */
    public static String getCurrUrl(int which) {
        currUrl = which;
        switch (which) {
            case 0: return KUGOU_MUSIC_LINK;
            case 1: return PLAY_LINK_HASH;
            case 2: return NEWEST_MUSIC_LIST;
            case 3: return SONG_LIST;
            case 4: return SONG_LIST_CONTAINS;
            case 5: return SINGER_LIST_URL;
            case 6: return SINGER_INFO_URL;
        }
        return null;
    }//

    public static String getSongListContains(int specialId, int page) {
        return SONG_LIST_CONTAINS.replace("XXX", String.valueOf(specialId)) + "&page=" + page;
    }//

    public static String getSingerListUrl(int classId) {
        return SINGER_LIST_URL.replace("XXX", String.valueOf(classId));
    }//

    public static String getSingerInfoUrl(int singerid, int page) {
        return SINGER_INFO_URL.replace("XXX", String.valueOf(singerid)) + "&page=" + page;
    }//

    public static String getRankSongListContains(int rankid) {
        return RANK_SONG_LIST_CONTAINS.replace("XXX", String.valueOf(rankid));
    }

    public static String getSongListClassifyContains(String categoryID) {
        return SONG_LIST_CLASSIFY_CONTAINS.replace("XXX", categoryID);
    }
}
