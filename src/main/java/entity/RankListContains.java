package entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：排行榜包含的歌曲
 */
public class RankListContains implements Serializable {
    /**
     * JS_CSS_DATE : 20130320
     * kg_domain : http://m.kugou.com
     * src : http://downmobile.kugou.com/promote/package/download/channel=6
     * fr : null
     * ver : v3
     * info : {"rankid":8888,"id":2,"update_frequency":"每天","intro":"数据来源：酷狗 排序方式：按每日歌曲播放总量排序","jump_url":"","jump_title":"","imgurl":"http://imge.kugou.com/mcommon/{size}/20181019/20181019122513972113.jpg","banner7url":"http://imge.kugou.com/mcommon/{size}/20181019/20181019122516438289.jpg","isvol":1,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20181019/20181019122517263545.jpg","custom_type":0,"rankname":"酷狗TOP500","ranktype":2}
     * songs : {"total":23,"page":1,"pagesize":30,"timestamp":1551835757,"list":[{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"first":0,"filesize":3713839,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":32,"cid":42749437},"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","rp_type":"audio","pkg_price":0,"recommend_reason":"","filename":"火箭少女101 - 卡路里","price_320":0,"extname":"mp3","hash":"BEDD046FB30A0C443CD6F854574B065E","audio_id":40457955,"privilege":0,"topic_url_320":"","addtime":"2019-03-05 09:30:09","pkg_price_320":0,"sqfilesize":33346823,"fail_process_320":0,"duration":232,"feetype":0,"320filesize":9284335,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","remark":"《西虹市首富》电影插曲","isfirst":0,"sqhash":"0874821E1FFDC05BBA00570F976E9B4A","320privilege":0,"320hash":"B129D9B4565CB1644C365A07E0F3B342","fail_process":0,"album_id":"9175221","pay_type_sq":0,"mvhash":"08499F69776EBA4CABB28BCFE841766F","sqprivilege":0,"album_audio_id":112832798,"fail_process_sq":0},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"first":0,"filesize":3440747,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":8,"cid":51383447},"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","rp_type":"audio","pkg_price":0,"recommend_reason":"","filename":"任素汐 - 胡广生","price_320":0,"extname":"mp3","hash":"FF7BEEAD2BEFFFA7CB907B9A941ED61C","audio_id":46673313,"privilege":0,"topic_url_320":"","addtime":"2019-03-05 09:30:16","pkg_price_320":0,"sqfilesize":19453281,"fail_process_320":0,"duration":215,"feetype":0,"320filesize":8601707,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","remark":"《无名之辈》电影宣传曲","isfirst":0,"sqhash":"0996DBC095F9B9962E60EA4888087F6B","320privilege":0,"320hash":"72376DE95CE8EEA60602540C963154B0","fail_process":0,"album_id":"12506106","pay_type_sq":0,"mvhash":"8A4E623213090E8E7830389AD84D2FDE","sqprivilege":0,"album_audio_id":121795450,"fail_process_sq":0}]}
     * pagesize : 30
     * __Tpl : rank/info.html
     */

    private int JS_CSS_DATE;
    private String kg_domain;
    private String src;
    private Object fr;
    private String ver;
    private InfoBean info;
    private SongsBean songs;
    private int pagesize;
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

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public SongsBean getSongs() {
        return songs;
    }

    public void setSongs(SongsBean songs) {
        this.songs = songs;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public String get__Tpl() {
        return __Tpl;
    }

    public void set__Tpl(String __Tpl) {
        this.__Tpl = __Tpl;
    }

    public static class InfoBean {
        /**
         * rankid : 8888
         * id : 2
         * update_frequency : 每天
         * intro : 数据来源：酷狗 排序方式：按每日歌曲播放总量排序
         * jump_url :
         * jump_title :
         * imgurl : http://imge.kugou.com/mcommon/{size}/20181019/20181019122513972113.jpg
         * banner7url : http://imge.kugou.com/mcommon/{size}/20181019/20181019122516438289.jpg
         * isvol : 1
         * bannerurl : http://imge.kugou.com/mcommonbanner/{size}/20181019/20181019122517263545.jpg
         * custom_type : 0
         * rankname : 酷狗TOP500
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

    public static class SongsBean {
        /**
         * total : 23
         * page : 1
         * pagesize : 30
         * timestamp : 1551835757
         * list : [{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"first":0,"filesize":3713839,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":32,"cid":42749437},"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","rp_type":"audio","pkg_price":0,"recommend_reason":"","filename":"火箭少女101 - 卡路里","price_320":0,"extname":"mp3","hash":"BEDD046FB30A0C443CD6F854574B065E","audio_id":40457955,"privilege":0,"topic_url_320":"","addtime":"2019-03-05 09:30:09","pkg_price_320":0,"sqfilesize":33346823,"fail_process_320":0,"duration":232,"feetype":0,"320filesize":9284335,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","remark":"《西虹市首富》电影插曲","isfirst":0,"sqhash":"0874821E1FFDC05BBA00570F976E9B4A","320privilege":0,"320hash":"B129D9B4565CB1644C365A07E0F3B342","fail_process":0,"album_id":"9175221","pay_type_sq":0,"mvhash":"08499F69776EBA4CABB28BCFE841766F","sqprivilege":0,"album_audio_id":112832798,"fail_process_sq":0},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"first":0,"filesize":3440747,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":8,"cid":51383447},"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","rp_type":"audio","pkg_price":0,"recommend_reason":"","filename":"任素汐 - 胡广生","price_320":0,"extname":"mp3","hash":"FF7BEEAD2BEFFFA7CB907B9A941ED61C","audio_id":46673313,"privilege":0,"topic_url_320":"","addtime":"2019-03-05 09:30:16","pkg_price_320":0,"sqfilesize":19453281,"fail_process_320":0,"duration":215,"feetype":0,"320filesize":8601707,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","remark":"《无名之辈》电影宣传曲","isfirst":0,"sqhash":"0996DBC095F9B9962E60EA4888087F6B","320privilege":0,"320hash":"72376DE95CE8EEA60602540C963154B0","fail_process":0,"album_id":"12506106","pay_type_sq":0,"mvhash":"8A4E623213090E8E7830389AD84D2FDE","sqprivilege":0,"album_audio_id":121795450,"fail_process_sq":0}]
         */

        private int total;
        private int page;
        private int pagesize;
        private int timestamp;
        private List<ListBean> list;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getPagesize() {
            return pagesize;
        }

        public void setPagesize(int pagesize) {
            this.pagesize = pagesize;
        }

        public int getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(int timestamp) {
            this.timestamp = timestamp;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * pay_type_320 : 0
             * m4afilesize : 0
             * price_sq : 0
             * first : 0
             * filesize : 3713839
             * bitrate : 128
             * trans_param : {"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":32,"cid":42749437}
             * price : 0
             * inlist : 1
             * old_cpy : 1
             * pkg_price_sq : 0
             * pay_type : 0
             * topic_url :
             * rp_type : audio
             * pkg_price : 0
             * recommend_reason :
             * filename : 火箭少女101 - 卡路里
             * price_320 : 0
             * extname : mp3
             * hash : BEDD046FB30A0C443CD6F854574B065E
             * audio_id : 40457955
             * privilege : 0
             * topic_url_320 :
             * addtime : 2019-03-05 09:30:09
             * pkg_price_320 : 0
             * sqfilesize : 33346823
             * fail_process_320 : 0
             * duration : 232
             * feetype : 0
             * 320filesize : 9284335
             * rp_publish : 1
             * has_accompany : 1
             * topic_url_sq :
             * remark : 《西虹市首富》电影插曲
             * isfirst : 0
             * sqhash : 0874821E1FFDC05BBA00570F976E9B4A
             * 320privilege : 0
             * 320hash : B129D9B4565CB1644C365A07E0F3B342
             * fail_process : 0
             * album_id : 9175221
             * pay_type_sq : 0
             * mvhash : 08499F69776EBA4CABB28BCFE841766F
             * sqprivilege : 0
             * album_audio_id : 112832798
             * fail_process_sq : 0
             */

            private int pay_type_320;
            private int m4afilesize;
            private int price_sq;
            private int first;
            private int filesize;
            private int bitrate;
            private TransParamBean trans_param;
            private int price;
            private int inlist;
            private int old_cpy;
            private int pkg_price_sq;
            private int pay_type;
            private String topic_url;
            private String rp_type;
            private int pkg_price;
            private String recommend_reason;
            private String filename;
            private int price_320;
            private String extname;
            private String hash;
            private int audio_id;
            private int privilege;
            private String topic_url_320;
            private String addtime;
            private int pkg_price_320;
            private int sqfilesize;
            private int fail_process_320;
            private int duration;
            private int feetype;
            @SerializedName("320filesize")
            private int _$320filesize;
            private int rp_publish;
            private int has_accompany;
            private String topic_url_sq;
            private String remark;
            private int isfirst;
            private String sqhash;
            @SerializedName("320privilege")
            private int _$320privilege;
            @SerializedName("320hash")
            private String _$320hash;
            private int fail_process;
            private String album_id;
            private int pay_type_sq;
            private String mvhash;
            private int sqprivilege;
            private int album_audio_id;
            private int fail_process_sq;

            public int getPay_type_320() {
                return pay_type_320;
            }

            public void setPay_type_320(int pay_type_320) {
                this.pay_type_320 = pay_type_320;
            }

            public int getM4afilesize() {
                return m4afilesize;
            }

            public void setM4afilesize(int m4afilesize) {
                this.m4afilesize = m4afilesize;
            }

            public int getPrice_sq() {
                return price_sq;
            }

            public void setPrice_sq(int price_sq) {
                this.price_sq = price_sq;
            }

            public int getFirst() {
                return first;
            }

            public void setFirst(int first) {
                this.first = first;
            }

            public int getFilesize() {
                return filesize;
            }

            public void setFilesize(int filesize) {
                this.filesize = filesize;
            }

            public int getBitrate() {
                return bitrate;
            }

            public void setBitrate(int bitrate) {
                this.bitrate = bitrate;
            }

            public TransParamBean getTrans_param() {
                return trans_param;
            }

            public void setTrans_param(TransParamBean trans_param) {
                this.trans_param = trans_param;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public int getInlist() {
                return inlist;
            }

            public void setInlist(int inlist) {
                this.inlist = inlist;
            }

            public int getOld_cpy() {
                return old_cpy;
            }

            public void setOld_cpy(int old_cpy) {
                this.old_cpy = old_cpy;
            }

            public int getPkg_price_sq() {
                return pkg_price_sq;
            }

            public void setPkg_price_sq(int pkg_price_sq) {
                this.pkg_price_sq = pkg_price_sq;
            }

            public int getPay_type() {
                return pay_type;
            }

            public void setPay_type(int pay_type) {
                this.pay_type = pay_type;
            }

            public String getTopic_url() {
                return topic_url;
            }

            public void setTopic_url(String topic_url) {
                this.topic_url = topic_url;
            }

            public String getRp_type() {
                return rp_type;
            }

            public void setRp_type(String rp_type) {
                this.rp_type = rp_type;
            }

            public int getPkg_price() {
                return pkg_price;
            }

            public void setPkg_price(int pkg_price) {
                this.pkg_price = pkg_price;
            }

            public String getRecommend_reason() {
                return recommend_reason;
            }

            public void setRecommend_reason(String recommend_reason) {
                this.recommend_reason = recommend_reason;
            }

            public String getFilename() {
                return filename;
            }

            public void setFilename(String filename) {
                this.filename = filename;
            }

            public int getPrice_320() {
                return price_320;
            }

            public void setPrice_320(int price_320) {
                this.price_320 = price_320;
            }

            public String getExtname() {
                return extname;
            }

            public void setExtname(String extname) {
                this.extname = extname;
            }

            public String getHash() {
                return hash;
            }

            public void setHash(String hash) {
                this.hash = hash;
            }

            public int getAudio_id() {
                return audio_id;
            }

            public void setAudio_id(int audio_id) {
                this.audio_id = audio_id;
            }

            public int getPrivilege() {
                return privilege;
            }

            public void setPrivilege(int privilege) {
                this.privilege = privilege;
            }

            public String getTopic_url_320() {
                return topic_url_320;
            }

            public void setTopic_url_320(String topic_url_320) {
                this.topic_url_320 = topic_url_320;
            }

            public String getAddtime() {
                return addtime;
            }

            public void setAddtime(String addtime) {
                this.addtime = addtime;
            }

            public int getPkg_price_320() {
                return pkg_price_320;
            }

            public void setPkg_price_320(int pkg_price_320) {
                this.pkg_price_320 = pkg_price_320;
            }

            public int getSqfilesize() {
                return sqfilesize;
            }

            public void setSqfilesize(int sqfilesize) {
                this.sqfilesize = sqfilesize;
            }

            public int getFail_process_320() {
                return fail_process_320;
            }

            public void setFail_process_320(int fail_process_320) {
                this.fail_process_320 = fail_process_320;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public int getFeetype() {
                return feetype;
            }

            public void setFeetype(int feetype) {
                this.feetype = feetype;
            }

            public int get_$320filesize() {
                return _$320filesize;
            }

            public void set_$320filesize(int _$320filesize) {
                this._$320filesize = _$320filesize;
            }

            public int getRp_publish() {
                return rp_publish;
            }

            public void setRp_publish(int rp_publish) {
                this.rp_publish = rp_publish;
            }

            public int getHas_accompany() {
                return has_accompany;
            }

            public void setHas_accompany(int has_accompany) {
                this.has_accompany = has_accompany;
            }

            public String getTopic_url_sq() {
                return topic_url_sq;
            }

            public void setTopic_url_sq(String topic_url_sq) {
                this.topic_url_sq = topic_url_sq;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public int getIsfirst() {
                return isfirst;
            }

            public void setIsfirst(int isfirst) {
                this.isfirst = isfirst;
            }

            public String getSqhash() {
                return sqhash;
            }

            public void setSqhash(String sqhash) {
                this.sqhash = sqhash;
            }

            public int get_$320privilege() {
                return _$320privilege;
            }

            public void set_$320privilege(int _$320privilege) {
                this._$320privilege = _$320privilege;
            }

            public String get_$320hash() {
                return _$320hash;
            }

            public void set_$320hash(String _$320hash) {
                this._$320hash = _$320hash;
            }

            public int getFail_process() {
                return fail_process;
            }

            public void setFail_process(int fail_process) {
                this.fail_process = fail_process;
            }

            public String getAlbum_id() {
                return album_id;
            }

            public void setAlbum_id(String album_id) {
                this.album_id = album_id;
            }

            public int getPay_type_sq() {
                return pay_type_sq;
            }

            public void setPay_type_sq(int pay_type_sq) {
                this.pay_type_sq = pay_type_sq;
            }

            public String getMvhash() {
                return mvhash;
            }

            public void setMvhash(String mvhash) {
                this.mvhash = mvhash;
            }

            public int getSqprivilege() {
                return sqprivilege;
            }

            public void setSqprivilege(int sqprivilege) {
                this.sqprivilege = sqprivilege;
            }

            public int getAlbum_audio_id() {
                return album_audio_id;
            }

            public void setAlbum_audio_id(int album_audio_id) {
                this.album_audio_id = album_audio_id;
            }

            public int getFail_process_sq() {
                return fail_process_sq;
            }

            public void setFail_process_sq(int fail_process_sq) {
                this.fail_process_sq = fail_process_sq;
            }

            public static class TransParamBean {
                /**
                 * roaming_astrict : 0
                 * pay_block_tpl : 1
                 * musicpack_advance : 0
                 * display_rate : 0
                 * display : 32
                 * cid : 42749437
                 */

                private int roaming_astrict;
                private int pay_block_tpl;
                private int musicpack_advance;
                private int display_rate;
                private int display;
                private int cid;

                public int getRoaming_astrict() {
                    return roaming_astrict;
                }

                public void setRoaming_astrict(int roaming_astrict) {
                    this.roaming_astrict = roaming_astrict;
                }

                public int getPay_block_tpl() {
                    return pay_block_tpl;
                }

                public void setPay_block_tpl(int pay_block_tpl) {
                    this.pay_block_tpl = pay_block_tpl;
                }

                public int getMusicpack_advance() {
                    return musicpack_advance;
                }

                public void setMusicpack_advance(int musicpack_advance) {
                    this.musicpack_advance = musicpack_advance;
                }

                public int getDisplay_rate() {
                    return display_rate;
                }

                public void setDisplay_rate(int display_rate) {
                    this.display_rate = display_rate;
                }

                public int getDisplay() {
                    return display;
                }

                public void setDisplay(int display) {
                    this.display = display;
                }

                public int getCid() {
                    return cid;
                }

                public void setCid(int cid) {
                    this.cid = cid;
                }
            }
        }
    }
}
