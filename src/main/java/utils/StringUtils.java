package utils;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

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

    public static String readProperties() {
        Properties prop = new Properties();
        InputStreamReader reader = null;
        try {
//            System.out.println(System.getProperty("user.dir"));
            reader = new InputStreamReader(StringUtils.class.getResourceAsStream("/file/setting.properties"), StandardCharsets.UTF_8);
            prop.load(reader);
            return prop.get("scanPath").toString();
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

    public static void writeProperties(String path) {
        Properties prop = new Properties();
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(StringUtils.class.getResourceAsStream("/file/setting.properties"), StandardCharsets.UTF_8);
            prop.load(reader);
            prop.setProperty("scanPath", path);
            System.out.println("音乐扫描路径更新完毕");
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
