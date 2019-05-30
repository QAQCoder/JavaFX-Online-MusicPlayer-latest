package database;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public class MyDbUtils {

    private static Connection conn = null;

    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void fun() {
        System.out.println(getConn());
        DbServiceImpl.getInstance().getAllAlbum(3).forEach(item -> {
            System.out.println(item.getCollectionName());
        });
    }

    public static Connection getConn() {
        if (conn == null) {
            synchronized (MyDbUtils.class) {
                if (conn  == null) {
                    try {
//                        conn = DriverManager.getConnection("jdbc:sqlite:src/main/resources/db/music.db");
                      conn = DriverManager.getConnection("jdbc:sqlite:db/music.db");
                    } catch (SQLException e) { e.printStackTrace(); }
                }
            }
        }
        return conn;
    }

    public static void closeConn() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//
}
