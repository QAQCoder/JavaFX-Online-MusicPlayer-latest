package service;

import entity.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public interface IMusicService {

    List<KuGouMusicPlay.DataBean> getSearchMusicList(String keyword, int page, int eachPageSize);

    SongListClassify getSongListClassify(); //歌单分类

    SongClassifyContains getSongClassifyContains(String categoryId);

    SongList.PlistBean.ListBean getSongList();

    SongListContains getSongListContains(int specialId, int page);

    Map<String, Object> getSearchMusicHash(String keyword, int page, int eachPageSize); //获取hash值

    List<KuGouMusicPlay> handleHashs(List<String> hashList);    //处理hash值

    KuGouMusicPlay handleHash(String hash);    //处理hash值

    KuGouMusicPlay.DataBean checkPlayUrl(String url, String hash);   //先检测（播放链接是否过期）

    SingerClassify getAllSingerClassify();  //获取所有歌手分类

    SingerList getSingerList(int classId);  //获取歌手类别下的歌手list

    SingerListContains getSingerListContains(int singerid, int page); //获取歌手信息

    RankList getRankList(); //获取榜单数据

    RankListContains getRankListContains(int rankId);   //获取榜单包含的歌曲

    NewMusicList getNewestMusicList();   //获取新歌
}
