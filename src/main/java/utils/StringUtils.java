package utils;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Properties;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public class StringUtils {
    /**
     * 替换花括号的内容为150
     * http://imge.kugou.com/soft/collection/{size}/20190218/20190218181731312849.jpg
     *
     * @param imgUrl
     * @return
     */
    public static String getImgUrl(String imgUrl) {
        int a = imgUrl.indexOf("{");
        int b = imgUrl.indexOf("}");
        if (a == -1 || b == -1)
            return imgUrl;
        else {
            String substring = imgUrl.substring(a, b + 1);
//            System.out.println("待替换文字：" + substring);

            String replace = imgUrl.replace(substring, "150");
//            System.out.println("替换之后：" + replace);
            return replace;
        }
    }

    public static boolean isEmpty(String str) {
        return str == null || "".equals(str);
    }

    public static String[] readProperties() {
        Properties prop = new Properties();
        InputStreamReader reader = null;
        try {
//            System.out.println(System.getProperty("user.dir"));
            reader = new InputStreamReader(StringUtils.class.getResourceAsStream("/file/setting.properties"), StandardCharsets.UTF_8);
            prop.load(reader);
            String scanPath = prop.get("scanPath").toString();
            String alwaysOnTop = prop.get("alwaysOnTop").toString();
            return new String[]{scanPath, alwaysOnTop};
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void writeProperties(String key, String content) {
        Properties prop = new Properties();
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(StringUtils.class.getResourceAsStream("/file/setting.properties"), StandardCharsets.UTF_8);
            prop.load(reader);
            prop.setProperty(key, content);
            System.out.println("设置项更新完毕");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void fun() {
//        getImgUrl("http://imge.kugou.com/soft/collection/{size}/20190218/20190218181731312849.jpg");

        System.out.println(readProperties());
    }
}
