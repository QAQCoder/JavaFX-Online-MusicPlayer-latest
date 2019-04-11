package node;

import com.jfoenix.controls.JFXButton;
import javafx.scene.Node;

/**
 * 自定义按钮，新增attribute字段，用来储存额外信息
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
