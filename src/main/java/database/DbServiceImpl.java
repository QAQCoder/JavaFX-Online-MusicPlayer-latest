package database;

import com.google.gson.Gson;
import entity.CollectionAlbum;
import entity.KuGouMusicPlay;
import net.SurfTheNet;
import org.junit.jupiter.api.Test;
import service.MusicServiceImple;
import utils.StringUtils;
import utils.TimeUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DbServiceImpl implements IDbService {

    private final Gson gson = new Gson();

    private static DbServiceImpl instance = null;
    public static DbServiceImpl getInstance() {
        if (instance == null) {
            synchronized (MusicServiceImple.class) {
                if (instance == null)
                    instance = new DbServiceImpl();
            }
        }
        return instance;
    }

    /*@Test
    public void test1() {
//        createTable(recentPlayTable);
//        createAlbumContainTable("testAlbum");
        //测试创建新的收藏夹
//        System.out.println(insertNewAlbum("嗯哼蹦擦擦"));
        //查询收藏夹
//        System.out.println(searchAlbum("嗯哼蹦擦擦"));
        //获取所有收藏夹
//        System.out.println(getAllAlbum(1).size());
        //获取指定收藏夹
//        System.out.println(getAlbumContainSongs("album_2019_03_10_20_19_00").size());
        //
        System.out.println(searchAlbumContainSongs("album_2019_03_10_20_19_00", getTestBean()));
    }*/

    private List<String> hashList = new ArrayList<>();
    private KuGouMusicPlay.DataBean getTestBean() {
        hashList.add("0c8d0524e09448009312b73b3adf86d3".toUpperCase());
        List<KuGouMusicPlay> kuGouMusicPlays = SurfTheNet.handleHashs(hashList);

        return kuGouMusicPlays.get(0).getData();
    }

    @Override
    public boolean createDB() {
        return MyDbUtils.getConn() != null;
    }//

    @Override
    public boolean createTable(String sql) {
        Statement stmt = null;
        try {
             stmt = MyDbUtils.getConn().createStatement();
             return stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(stmt);
//            MyDbUtils.closeConn();
        }
        return false;
    }//

    @Override
    public boolean createAlbumContainTable(String tbName) {
        if (tbName == null || "".equals(tbName))
            throw new IllegalArgumentException("tbName 为空");
        String sql = "CREATE TABLE " + tbName + " (id INTEGER PRIMARY KEY AUTOINCREMENT, object TEXT, hash TEXT);";
        return createTable(sql);
    }

    @Override
    public void closeStatement(Statement stmt) {
        if (stmt == null) return;
        try {
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//

    @Override
    public void closeStatement(Statement stmt, ResultSet res) {
        if (res != null) {
            try {
                res.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        closeStatement(stmt);
//        MyDbUtils.closeConn();
    }

    @Override
    public String insertNewAlbum(String albumName) {
        if (StringUtils.isEmpty(albumName))
            throw new IllegalArgumentException("空的albumName");

        String sql = "INSERT INTO collection_album (collection_name, create_time, album_name) VALUES(?, ?, ?);";
        boolean flag = false;
        PreparedStatement ptmt = null;
        try {
            ptmt = MyDbUtils.getConn().prepareStatement(sql);
            String currDate = TimeUtils.getCurrDate();
            ptmt.setString(1, albumName.trim());
            ptmt.setString(2, currDate);
            ptmt.setString(3, "album_" + currDate);
            flag = ptmt.execute();
//            System.out.println(flag);
            return "album_" + currDate;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(ptmt);
//            MyDbUtils.closeConn();
        }
        return null;
    }

    @Override
    public CollectionAlbum searchAlbum(String albumName) {
        if (StringUtils.isEmpty(albumName))
            throw new IllegalArgumentException("albumName为空");

        String sql = "SELECT * FROM collection_album WHERE collection_name = ?";
        PreparedStatement ptmt = null;
        ResultSet res = null;
        CollectionAlbum album = null;
        try {
            ptmt = MyDbUtils.getConn().prepareStatement(sql);
            ptmt.setString(1, albumName);

            res = ptmt.executeQuery();
            while (res.next()) {
                album = new CollectionAlbum(
                                res.getInt("id"),
                                res.getString("collection_name"),
                                res.getString("create_time"),
                                res.getString("album_name")
                        );
            }
            return album;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(ptmt, res);
//            MyDbUtils.closeConn();
        }
        return null;
    }

    /**
     * @param mode 0-不可以添加，1-可以添加，2-表示获取用户自己创建的收藏夹, 其它数字表示选择所有
     * @return
     */
    @Override
    public List<CollectionAlbum> getAllAlbum(int mode) {
        StringBuilder sql = new StringBuilder("SELECT * FROM collection_album ");
        switch (mode) {
            case 0: // 0 表示选择不可以直接添加音乐的收藏夹，如本地音乐，最近播放
                sql.append("WHERE create_time = 0");
                break;
            case 1: // 1 表示可以添加音乐的收藏夹
                sql.append("WHERE create_time != 0");
                break;
            case 2: // 2 表示获取用户自己创建的收藏夹
                sql.append("WHERE create_time != 0 AND create_time != 1");
                break;
            default: // default 表示选择所有收藏夹
                break;
        }
        ResultSet res = null;
        PreparedStatement ptmt = null;
        List<CollectionAlbum> list = new ArrayList<>();
        try {
            ptmt = MyDbUtils.getConn().prepareStatement(sql.toString());
            res = ptmt.executeQuery();

            while (res.next()) {
                int id = res.getInt("id");
                String name = res.getString("collection_name");
                String create_time = res.getString("create_time");
                String album_name = res.getString("album_name");
                list.add(new CollectionAlbum(id, name, create_time, album_name));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(ptmt, res);
//            MyDbUtils.closeConn();
        }
        return list;
    }

    @Override
    public boolean removeAlbum(CollectionAlbum album) {
        String albumName = album.getAlbumName();
        System.out.println("待删除albumName: " + albumName);

        StringBuilder sql = new StringBuilder("DROP TABLE");
        StringBuilder sql2 = new StringBuilder("DELETE FROM collection_album WHERE album_name = ?");
        PreparedStatement ptmt = null;
        boolean flag1 = false;
        boolean flag2 = false;
            try {
                Connection conn = MyDbUtils.getConn();
                conn.setAutoCommit(false);

                ptmt = conn.prepareStatement(sql2.toString());
                ptmt.setString(1, albumName);
                int i2 = ptmt.executeUpdate();
                if (i2 > 0) flag2 = true;
                System.out.println("删除1->" + flag2);

                sql.append(" ").append(albumName);
                ptmt = conn.prepareStatement(sql.toString());
                int i1 = ptmt.executeUpdate();
                if (i1 > 0) flag1 = true;
                System.out.println("删除2->" + flag1);

                if (!flag1 || !flag2) {
                    System.out.println("删除错误，回滚中");
                    conn.rollback();
                    return false;
                } else {
                    System.out.println("删除过程无异常，正在提交");
                    conn.commit();
                    return true;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                closeStatement(ptmt);
            }
        return false;
    }

    @Override
    public boolean insertMusicToSpecialAlbum(String albumName, KuGouMusicPlay.DataBean bean) {
        if (StringUtils.isEmpty(albumName))
            throw new IllegalArgumentException("songsAlbumName为空");
        if (bean == null) {
            System.out.println("insertMusicToSpecialAlbum-----bean=null");
            return false;
        }

        StringBuilder sql = new StringBuilder("INSERT INTO ");
        sql.append(albumName);
        sql.append("(object, hash) VALUES(?, ?)");

//        System.out.println("插入语句：" + sql);

        boolean flag = false;
        PreparedStatement ptmt = null;
        try {
            ptmt = MyDbUtils.getConn().prepareStatement(sql.toString());
            ptmt.setString(1, gson.toJson(bean));
            ptmt.setString(2, bean.getHash().toUpperCase());

            int i = ptmt.executeUpdate();
            if (i > 0) flag = true;
            return flag;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(ptmt);
        }
        return flag;
    }

    @Override
    public boolean insertMusicListToSpecialAlbum(String albumName, List<KuGouMusicPlay.DataBean> beanList) {
        StringBuilder sql = new StringBuilder("INSERT INTO ");
        sql.append(albumName).append("(object, hash) VALUES(?, ?)");
//        System.out.println("插入语句：" + sql);

        boolean flag = false;
        PreparedStatement ptmt = null;
        try {
            ptmt = MyDbUtils.getConn().prepareStatement(sql.toString());
            for (KuGouMusicPlay.DataBean bean : beanList) {
                ptmt.setString(1, gson.toJson(bean));
                ptmt.setString(2, bean.getHash().toUpperCase());
                ptmt.addBatch();
            }

            int[] i = ptmt.executeBatch();
            if (i.length == beanList.size()) flag = true;
            else System.out.println("实际：" + i.length + ", 总共：" + beanList.size());
            return flag;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(ptmt);
        }
        return flag;
    }

    @Override
    public boolean searchAlbumContainSongs(String songsAlbumName, KuGouMusicPlay.DataBean bean) {
        if (StringUtils.isEmpty(songsAlbumName))
            throw new IllegalArgumentException("songsAlbumName为空");

        StringBuilder sql = new StringBuilder("SELECT * FROM ");
        sql.append(songsAlbumName + " WHERE hash = " + "'" + bean.getHash().toUpperCase() + "'");

//        System.out.println("当前SQL： " + sql);
        ResultSet res = null;
        PreparedStatement ptmt = null;
        try {
            ptmt = MyDbUtils.getConn().prepareStatement(sql.toString());
            res = ptmt.executeQuery();
            //如果对应收藏夹下存在指定的音乐，return true
            if (res.next())
                return true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(ptmt, res);
//            MyDbUtils.closeConn();
        }
        return false;
    }//

    @Override
    public List<KuGouMusicPlay.DataBean> searchAlbumContainSongs(String songsAlbumName, String keyword) {
        if (StringUtils.isEmpty(songsAlbumName))
            throw new IllegalArgumentException("songsAlbumName为空");

        StringBuilder sql = new StringBuilder("SELECT * FROM ");
        sql.append(songsAlbumName).append(" WHERE object LIKE ")
                .append("'%audio_name\":\"%").append(keyword.trim()).append("%' OR ")
                .append("'%author_name\":\"%").append(keyword.trim()).append("%' OR ")
                .append("'%song_name\":\"%").append(keyword.trim()).append("%'");

//        System.out.println("当前SQL： " + sql);
        ResultSet res = null;
        Statement stmt = null;
        List<KuGouMusicPlay.DataBean> beanList = new ArrayList<>();
        try {
            stmt = MyDbUtils.getConn().createStatement();
            res = stmt.executeQuery(sql.toString());
            //如果对应收藏夹下存在指定的音乐，return true
            while (res.next()) {
                byte[] bytes = res.getBytes("object");
                KuGouMusicPlay.DataBean dataBean = gson.fromJson(new String(bytes), KuGouMusicPlay.DataBean.class);
                beanList.add(dataBean);
            }
            return beanList;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(stmt, res);
        }
        return null;
    }//

    @Override
    public List<KuGouMusicPlay.DataBean> getAlbumContainSongs(String songsAlbumName) {
//        String sql = "SELECT * FROM ? ";
        String sql = "SELECT * FROM  " + songsAlbumName;
        PreparedStatement ptmt = null;
        ResultSet res = null;

        List<KuGouMusicPlay.DataBean> beanList = new ArrayList<>();
        try {
            ptmt = MyDbUtils.getConn().prepareStatement(sql);
//            ptmt.setString(1, songsAlbumName);
            res = ptmt.executeQuery();
            while (res.next()) {
                byte[] bytes = res.getBytes("object");
                KuGouMusicPlay.DataBean dataBean = gson.fromJson(new String(bytes), KuGouMusicPlay.DataBean.class);
                beanList.add(dataBean);
            }
            return beanList;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(ptmt, res);
//            MyDbUtils.closeConn();
        }
        return beanList;
    }

    @Override
    public int removeMusicFromAlbum(String albumName, List<String> hashs) {
        StringBuilder sql = new StringBuilder("DELETE * FORM");
        sql.append(albumName).append(" WHERE hash = ?");

        int count = 0;
        PreparedStatement ptmt = null;
        try {
            ptmt = MyDbUtils.getConn().prepareStatement(sql.toString());
            for (String hash : hashs) {
                ptmt.setString(1, hash);
                ptmt.addBatch();
            }
            int[] ints = ptmt.executeBatch();
            count = ints.length;
            return count;
        } catch (SQLException e) { e.printStackTrace();
        } finally {
            closeStatement(ptmt);
//            MyDbUtils.closeConn();
        }
        return count;
    }

    @Override
    public boolean removeAllMusicFromAlbum(String albumName) {
        StringBuilder sql = new StringBuilder("DELETE FROM ");
        sql.append(albumName);

        PreparedStatement ptmt = null;
        boolean flag = false;
        try {
            ptmt = MyDbUtils.getConn().prepareStatement(sql.toString());
            int i = ptmt.executeUpdate();
            if (i > 0) flag = true;
            return flag;
        } catch (SQLException e) { e.printStackTrace();
        } finally {
            closeStatement(ptmt);
        }
        return flag;
    }

    /*@Test
    public void fun() {
        boolean b = removeMusicFromAlbum("curr_playing", "0C8D0524E09448009312B73B3ADF86D3");
        System.out.println(b);
    }*/

    @Override
    public boolean removeMusicFromAlbum(String albumName, String hash) {
        StringBuilder sql = new StringBuilder("DELETE FROM ");
        sql.append(albumName).append(" WHERE hash = ?");

        boolean flag = false;
        PreparedStatement ptmt = null;
        try {
            ptmt = MyDbUtils.getConn().prepareStatement(sql.toString());
            ptmt.setString(1, hash.toUpperCase());
            int i = ptmt.executeUpdate();
            if (i > 0)
                flag = true;
            return flag;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(ptmt);
//            MyDbUtils.closeConn();
        }
        return flag;
    }//

    @Override
    public List<String> searchMusicInAlbums(KuGouMusicPlay.DataBean bean) {
        if (bean == null) throw new IllegalArgumentException("bean == null");

        //先得到所有收藏夹
        List<CollectionAlbum> allAlbum = getAllAlbum(1);
        //
        List<String> list = new ArrayList<>();

        allAlbum.forEach( item -> {
            //依次查询每个表中是否存在该歌曲
            boolean b = searchAlbumContainSongs(item.getAlbumName(), bean);
            //如果存在，就把收藏夹名称添加
            if (b) list.add(item.getCollectionName());
        });
        return list;
    }

    /*@Test
    public void fun2() {
        Map<String, List<KuGouMusicPlay.DataBean>> map = searchMusicInAlbums("杰");
        System.out.println(map.size());
    }*/

    /**
     * 在所有收藏夹中搜索【关键字】对应的歌曲
     * @param keyword
     * @return 返回一个map，key是收藏夹，List对应歌曲
     */
    @Override
    public Map<String, List<KuGouMusicPlay.DataBean>> searchMusicInAlbums(String keyword) {
        if (StringUtils.isEmpty(keyword))
            throw new IllegalArgumentException("DbServiceImpl---searchMusicInAlbums---keyword=null");

        //袋子装东西
        Map<String, List<KuGouMusicPlay.DataBean>> map = new HashMap<>();
        //先得到所有收藏夹
        List<CollectionAlbum> allAlbum = getAllAlbum(8);
        //遍历然后分别查找
        allAlbum.forEach(item -> {
            List<KuGouMusicPlay.DataBean> beanList = searchAlbumContainSongs(item.getAlbumName(), keyword);
            if (null != beanList)
                map.put(searchAlbumNameRealName(item.getAlbumName()), beanList);
        });
        return map;
    }//

    @Override
    public boolean addSongToMyLove(KuGouMusicPlay.DataBean bean) {
        return insertMusicToSpecialAlbum("my_love", bean);
    }

    @Override
    public boolean removeSongFromMyLove(KuGouMusicPlay.DataBean bean) {
        return removeMusicFromAlbum("my_love", bean.getHash());
    }

    @Override
    public boolean searchSongInLoveAlbum(KuGouMusicPlay.DataBean bean) {
        return searchAlbumContainSongs("my_love", bean);
    }

    @Override
    public String searchAlbumNameRealName(String albumName) {
        if (StringUtils.isEmpty(albumName))
            throw new IllegalArgumentException("DbServiceImpl---searchAlbumNameRealName---albumName=null");

        StringBuilder sql = new StringBuilder("SELECT collection_name FROM collection_album");
        sql.append(" WHERE album_name = ?");

        PreparedStatement ptmt = null;
        ResultSet res = null;
        try {
            ptmt = MyDbUtils.getConn().prepareStatement(sql.toString());
            ptmt.setString(1, albumName);
            res = ptmt.executeQuery();
            while (res.next()) {
                return res.getString("collection_name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(ptmt, res);
        }
        return null;
    }

    @Override
    public boolean insertIntoRecentPlay(KuGouMusicPlay.DataBean bean) {
        if (null == bean)
            throw new IllegalArgumentException("DbServiceImpl---insertIntoRecentPlay---bean=null");

        if (searchAlbumContainSongs("recent_play", bean)) {
            if (!removeMusicFromAlbum("recent_play", bean.getHash())) {
                System.out.println("在[最近播放]中发现该歌曲存在，移除出错，即将return");
                return false;
            }
        }
        return insertMusicToSpecialAlbum("recent_play", bean);
    }

    @Override
    public boolean removeLocalMusic() {
        StringBuilder sql = new StringBuilder("DELETE FROM local_music");

        boolean flag = false;
        PreparedStatement ptmt = null;
        try {
            ptmt = MyDbUtils.getConn().prepareStatement(sql.toString());
            int i = ptmt.executeUpdate();
            System.out.println("removeLocalMusic-i:" + i);
            if (i > 0) flag = true;
            return flag;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(ptmt);
        }
        return flag;
    }

    @Override
    public int insertAlbum(String sql, String albumName) {
        return 0;
    }

    @Override
    public int delete(String sql) {
        return 0;
    }

    @Override
    public int update(String sql) {
        return 0;
    }

    @Override
    public ResultSet find(String sql) {
        PreparedStatement ptmt = null;
        ResultSet res = null;
        try {
            ptmt = MyDbUtils.getConn().prepareStatement(sql);
            res = ptmt.executeQuery();
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(ptmt, res);
//            MyDbUtils.closeConn();
        }
        return res;
    }
}
