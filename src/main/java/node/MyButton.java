package node;

import com.jfoenix.controls.JFXButton;
import javafx.scene.Node;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/4/2
 * Class description：自定义按钮，新增attribute字段，用来储存额外信息
 */
public class MyButton extends JFXButton {

    private String attribute;
    private String[] attributes;

    public String[] getAttributes() {
        return attributes;
    }

    public void setAttributes(String[] attributes) {
        this.attributes = attributes;
    }

    public void setAttributesss(String...attributes) {
        this.attributes = attributes;
    }

    public MyButton(String text) {
        super(text);
    }

    public MyButton() {
        super();
    }

    public void setHoverStyle() {
        getStylesheets().add("css/my_btn_css.css");
    }

    public MyButton(String text, Node graphic) {
        super(text, graphic);
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
}
