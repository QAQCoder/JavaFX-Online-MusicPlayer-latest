package node;

import javafx.scene.image.ImageView;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public class MyImageView extends ImageView {

    public MyImageView(String url, double width, double height) {
        super(url);

        prefWidth(width);
        prefHeight(height);
    }

    public MyImageView(String url) {
        super(url);

        setFitWidth(24);
        setFitHeight(24);
    }
}
