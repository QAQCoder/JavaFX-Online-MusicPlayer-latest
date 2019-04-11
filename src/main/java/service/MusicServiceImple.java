package service;

import entity.*;
import flag.CommonResources;
import net.SurfTheNet;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 抽出来专门访问网络音乐数据的服务类，不然每次都要使用SurfTheNet类
 */
public class MusicServiceImple implements IMusicService {

    private static MusicServiceImple serviceImple = null;
    public static MusicServiceImple getInstance() {
        if (serviceImple == null) {
            synchronized (MusicServiceImple.class) {
                if (serviceImple == null)
                    serviceImple = new MusicServiceImple();
            }
        }
        return serviceImple;
    }

    @Override
    public List<KuGouMusicPlay.DataBean> getSearchMusicList(String keyword, int page, int eachPageSize) {
        Map<String, Object> map = getSearchMusicHash(keyword.trim(), page, CommonResources.pageSize);
        List<String> hashs = (List<String>) map.get("list");
        int total = (int) map.get("total");

        List<KuGouMusicPlay> playList = SurfTheNet.handleHashs(hashs);
        List<KuGouMusicPlay.DataBean> beanList = new ArrayList<>();
        playList.forEach(playItem -> beanList.add(playItem.getData()));
        return beanList;
    }

    /**
     * 获取歌单分类json
     * @return
     */
    @Override
    public SongListClassify getSongListClassify() {
        return SurfTheNet.visitTheNetword(SurfTheNet.SONG_LIST_CLASSIFY, SongListClassify.class);
    }

    @Override
    public SongClassifyContains getSongClassifyContains(String categoryId) {
        return SurfTheNet.visitTheNetword(SurfTheNet.getSongListClassifyContains(categoryId), SongClassifyContains.class);
    }

    @Override
    public SongList.PlistBean.ListBean getSongList() {
        //获取所有歌单
        SongList songList = SurfTheNet.visitTheNetword(SurfTheNet.SONG_LIST, SongList.class);
        //解析歌单数据
        int pagesize = songList.getPagesize();
        SongList.PlistBean plist = songList.getPlist();
        int plistPagesize = plist.getPagesize();
        SongList.PlistBean.ListBean listBean = plist.getList();
        return listBean;
    }

    @Override
    public SongListContains getSongListContains(int specialId, int page) {
        SongListContains songListContains = SurfTheNet.visitTheNetword(SurfTheNet.getSongListContains(specialId, page), SongListContains.class);
        return songListContains;
    }

    @Override
    public Map<String, Object> getSearchMusicHash(String keyword, int page, int eachPageSize) {
        return SurfTheNet.getSearchMusicHash(keyword, page, eachPageSize);
    }

    @Override
    public List<KuGouMusicPlay> handleHashs(List<String> hashList) {
        return SurfTheNet.handleHashs(hashList);
    }

    @Override
    public KuGouMusicPlay handleHash(String hash) {
        return SurfTheNet.visitTheNetword(SurfTheNet.getCurrUrl(1) + hash, KuGouMusicPlay.class);
    }

    @Test
    public void testCheckUrl() {
        KuGouMusicPlay.DataBean bean = checkPlayUrl("http://fs.w.kugou.com/201903141549/32c09851d77c41ee33bf91301236afe8/G013/M06/18/09/rYYBAFUBVceAQsKQADn6ct4sfQo314.mp3",
                "BE8CBC6B7F328B76091522FC729301BB");
        System.out.println(bean.getPlay_url());
    }

    @Override
    public KuGouMusicPlay.DataBean checkPlayUrl(String url, String hash) {
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse httpResponse = null;
        HttpGet get = new HttpGet(url);
        try {
            int statusCode = HttpClients.createDefault().execute(get).getStatusLine().getStatusCode();
            System.out.println("状态码： " + statusCode);
            if (statusCode == 403) {
                System.out.println("403了，返回新databean");
                return handleHash(hash).getData();
            }

            if (httpResponse != null) httpResponse.close();
            if (httpClient != null) httpClient.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public SingerClassify getAllSingerClassify() {
        return SurfTheNet.visitTheNetword(SurfTheNet.SINGER_ALL_URL, SingerClassify.class);
    }

    @Override
    public SingerList getSingerList(int classId) {
        return SurfTheNet.visitTheNetword(SurfTheNet.getSingerListUrl(classId), SingerList.class);
    }

    @Override
    public SingerListContains getSingerListContains(int singerId, int page) {
        return SurfTheNet.visitTheNetWithHeader(SurfTheNet.getSingerInfoUrl(singerId, page), null, SingerListContains.class);
    }

    @Override
    public RankList getRankList() {
        return SurfTheNet.visitTheNetword(SurfTheNet.RANK_SONG_LIST, RankList.class);
    }

    @Override
    public RankListContains getRankListContains(int rankId) {
        return SurfTheNet.visitTheNetword(SurfTheNet.getRankSongListContains(rankId), RankListContains.class);
    }
}
