package entity;

import java.io.Serializable;
import java.util.List;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：排行榜信息
 */
public class RankList implements Serializable {
    /**
     * JS_CSS_DATE : 20130320
     * kg_domain : http://m.kugou.com
     * src : http://downmobile.kugou.com/promote/package/download/channel=6
     * fr : null
     * ver : v3
     * rank : {"total":22,"list":[{"rankid":6666,"id":1,"update_frequency":"每天","intro":"数据来源：酷狗 排序方式：按歌曲搜索播放量的涨幅排序 更新周期：每天","jump_url":"","jump_title":"","imgurl":"http://imge.kugou.com/mcommon/{size}/20190214/20190214100330763258.jpg","banner7url":"http://imge.kugou.com/mcommon/{size}/20190214/20190214100332980767.jpg","isvol":1,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20190214/20190214100333414437.jpg","custom_type":0,"rankname":"酷狗飙升榜","ranktype":2}]}
     * __Tpl : rank/list.html
     */

    private int JS_CSS_DATE;
    private String kg_domain;
    private String src;
    private Object fr;
    private String ver;
    private RankBean rank;
    private String __Tpl;

    public int getJS_CSS_DATE() {
        return JS_CSS_DATE;
    }

    public void setJS_CSS_DATE(int JS_CSS_DATE) {
        this.JS_CSS_DATE = JS_CSS_DATE;
    }

    public String getKg_domain() {
        return kg_domain;
    }

    public void setKg_domain(String kg_domain) {
        this.kg_domain = kg_domain;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public Object getFr() {
        return fr;
    }

    public void setFr(Object fr) {
        this.fr = fr;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public RankBean getRank() {
        return rank;
    }

    public void setRank(RankBean rank) {
        this.rank = rank;
    }

    public String get__Tpl() {
        return __Tpl;
    }

    public void set__Tpl(String __Tpl) {
        this.__Tpl = __Tpl;
    }

    public static class RankBean {
        /**
         * total : 22
         * list : [{"rankid":6666,"id":1,"update_frequency":"每天","intro":"数据来源：酷狗 排序方式：按歌曲搜索播放量的涨幅排序 更新周期：每天","jump_url":"","jump_title":"","imgurl":"http://imge.kugou.com/mcommon/{size}/20190214/20190214100330763258.jpg","banner7url":"http://imge.kugou.com/mcommon/{size}/20190214/20190214100332980767.jpg","isvol":1,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20190214/20190214100333414437.jpg","custom_type":0,"rankname":"酷狗飙升榜","ranktype":2}]
         */

        private int total;
        private List<ListBean> list;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * rankid : 6666
             * id : 1
             * update_frequency : 每天
             * intro : 数据来源：酷狗 排序方式：按歌曲搜索播放量的涨幅排序 更新周期：每天
             * jump_url :
             * jump_title :
             * imgurl : http://imge.kugou.com/mcommon/{size}/20190214/20190214100330763258.jpg
             * banner7url : http://imge.kugou.com/mcommon/{size}/20190214/20190214100332980767.jpg
             * isvol : 1
             * bannerurl : http://imge.kugou.com/mcommonbanner/{size}/20190214/20190214100333414437.jpg
             * custom_type : 0
             * rankname : 酷狗飙升榜
             * ranktype : 2
             */

            private int rankid;
            private int id;
            private String update_frequency;
            private String intro;
            private String jump_url;
            private String jump_title;
            private String imgurl;
            private String banner7url;
            private int isvol;
            private String bannerurl;
            private int custom_type;
            private String rankname;
            private int ranktype;

            public int getRankid() {
                return rankid;
            }

            public void setRankid(int rankid) {
                this.rankid = rankid;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getUpdate_frequency() {
                return update_frequency;
            }

            public void setUpdate_frequency(String update_frequency) {
                this.update_frequency = update_frequency;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getJump_url() {
                return jump_url;
            }

            public void setJump_url(String jump_url) {
                this.jump_url = jump_url;
            }

            public String getJump_title() {
                return jump_title;
            }

            public void setJump_title(String jump_title) {
                this.jump_title = jump_title;
            }

            public String getImgurl() {
                return imgurl;
            }

            public void setImgurl(String imgurl) {
                this.imgurl = imgurl;
            }

            public String getBanner7url() {
                return banner7url;
            }

            public void setBanner7url(String banner7url) {
                this.banner7url = banner7url;
            }

            public int getIsvol() {
                return isvol;
            }

            public void setIsvol(int isvol) {
                this.isvol = isvol;
            }

            public String getBannerurl() {
                return bannerurl;
            }

            public void setBannerurl(String bannerurl) {
                this.bannerurl = bannerurl;
            }

            public int getCustom_type() {
                return custom_type;
            }

            public void setCustom_type(int custom_type) {
                this.custom_type = custom_type;
            }

            public String getRankname() {
                return rankname;
            }

            public void setRankname(String rankname) {
                this.rankname = rankname;
            }

            public int getRanktype() {
                return ranktype;
            }

            public void setRanktype(int ranktype) {
                this.ranktype = ranktype;
            }
        }
    }
}
