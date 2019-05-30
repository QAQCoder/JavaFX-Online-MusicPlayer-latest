package utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public class LoadUtil {
    /*@Test
    public void testLoadFXML () {
        System.out.println(loadFXML("fxml/main_view.fxml"));
    }*/

    public static Parent loadFXML (String fxml) {
        try {
            return FXMLLoader.load(ClassLoader.getSystemResource(fxml));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
