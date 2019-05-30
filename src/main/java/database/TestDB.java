package database;

import entity.KuGouMusicPlay;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public class TestDB {

    public static void main(String[] args) {
        DbServiceImpl dbService = new DbServiceImpl();

        System.out.println(dbService.createDB());

        System.out.println(dbService.createTable(null));
    }

    @Test
    public void getData() {
        IDbService dbService = DbServiceImpl.getInstance();

        List<KuGouMusicPlay.DataBean> myLove = dbService.getAlbumContainSongs("my_love");
        myLove.forEach(System.out::println);
    }
}
