package entity;

import java.util.List;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：查找数据
 */
public class SearchData {

    private String albumName;
    private List<KuGouMusicPlay.DataBean> beanList;

    public SearchData(String albumName, List<KuGouMusicPlay.DataBean> beanList) {
        this.albumName = albumName;
        this.beanList = beanList;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public List<KuGouMusicPlay.DataBean> getBeanList() {
        return beanList;
    }

    public void setBeanList(List<KuGouMusicPlay.DataBean> beanList) {
        this.beanList = beanList;
    }
}
