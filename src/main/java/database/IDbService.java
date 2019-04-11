package database;

import entity.CollectionAlbum;
import entity.KuGouMusicPlay;
import entity.SearchData;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

public interface IDbService {

    boolean createDB();

    boolean createTable(String sql);

    boolean createAlbumContainTable(String tbName);

    void closeStatement(Statement stmt);
    void closeStatement(Statement stmt, ResultSet res);

    String insertNewAlbum(String albumName);   //创建新的收藏夹
    CollectionAlbum searchAlbum(String albumName);   //查找收藏夹
    List<CollectionAlbum> getAllAlbum(int mode); //得到所有收藏夹
    boolean removeAlbum(CollectionAlbum album); //移除指定收藏夹，并且删除包含的歌曲歌曲

    boolean insertMusicToSpecialAlbum(String albumName, KuGouMusicPlay.DataBean bean); //把音乐添加到指定的收藏夹
    boolean insertMusicListToSpecialAlbum(String albumName, List<KuGouMusicPlay.DataBean> beanList); //把音乐集合添加到指定的收藏夹
    boolean searchAlbumContainSongs(String songsAlbumName, KuGouMusicPlay.DataBean bean) ;   //搜索对应收藏夹下的音乐
    List<KuGouMusicPlay.DataBean> searchAlbumContainSongs(String songsAlbumName, String keyword) ;   //搜索对应收藏夹下的音乐
    List<KuGouMusicPlay.DataBean> getAlbumContainSongs(String songsAlbumName);   //得到对应收藏夹下的所有音乐
    int removeMusicFromAlbum(String albumName, List<String> hashs);  //删除收藏夹下面的歌曲
    boolean removeAllMusicFromAlbum(String albumName);  //删除某收藏夹下的所有歌曲
    boolean removeMusicFromAlbum(String albumName, String hash);  //删除收藏夹下面的歌曲
    List<String> searchMusicInAlbums(KuGouMusicPlay.DataBean bean);  //查询歌曲在哪些收藏夹里面
    Map<String, List<KuGouMusicPlay.DataBean>> searchMusicInAlbums(String keyword);  //查询歌曲在哪些收藏夹里面

    boolean addSongToMyLove(KuGouMusicPlay.DataBean bean);  //把音乐添加到我的喜爱
    boolean removeSongFromMyLove(KuGouMusicPlay.DataBean bean);  //把音乐添加到我的喜爱
    boolean searchSongInLoveAlbum(KuGouMusicPlay.DataBean bean);    //查询歌曲是否存在我的喜爱收藏夹

    String searchAlbumNameRealName(String albumName);   //查询albumName对应的中文名

    boolean insertIntoRecentPlay(KuGouMusicPlay.DataBean bean);    //把歌曲放到最近播放列表

    boolean removeLocalMusic(); //移除本地音乐

    int insertAlbum(String sql, String albumName);
    int delete(String sql);
    int update(String sql);
    ResultSet find(String sql);
}
