package entity;

import java.io.Serializable;

/**
 * 对应TableView上面部分的view
 */
public class TableViewPlayInfoBean  implements Serializable {

    private String imgUrl;
    private String title;
    private String otherInfo;   //比如歌曲总量

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    private String introduction;

    public TableViewPlayInfoBean() {
    }

    public TableViewPlayInfoBean(String imgUrl, String title, String otherInfo, String introduction) {
        this.imgUrl = imgUrl;
        this.title = title;
        this.otherInfo = otherInfo;
        this.introduction = introduction;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
