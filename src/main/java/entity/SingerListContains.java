package entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * 每个歌手的歌手信息
 * 特殊之处：接口地址: http://m.kugou.com/singer/info/3060&json=true 该接口目前有些问题 需要追加request headers 设置成手机浏览器
 */
public class SingerListContains implements Serializable {
    @Override
    public String toString() {
        return "SingerListContains{" +
                "JS_CSS_DATE=" + JS_CSS_DATE +
                ", kg_domain='" + kg_domain + '\'' +
                ", src='" + src + '\'' +
                ", fr=" + fr +
                ", ver='" + ver + '\'' +
                ", info=" + info +
                ", songs=" + songs +
                ", __Tpl='" + __Tpl + '\'' +
                '}';
    }

    /**
     * JS_CSS_DATE : 20130320
     * kg_domain : http://m.kugou.com
     * src : http://sdn.kugou.com/link.aspx?id=16632&dl=1
     * fr : null
     * ver : v3
     * info : {"identity":7,"mvcount":197,"has_long_intro":1,"intro":"薛之谦（Joker Xue），1983年7月17日出生于上海，华语流行乐男歌手、影视演员、音乐制作人，毕业于格里昂酒店管理学院。 2005年，因参加选秀节目《我型我秀》而正式出道。2006年，发行首张同名专辑《薛之谦》，随后凭借歌曲《认真的雪》获得广泛关注。2007年，凭借专辑《你过得好吗》获得MusicRadio中国TOP排行榜内地年度最受欢迎男歌手奖。","songcount":228,"imgurl":"http://singerimg.kugou.com/uploadpic/softhead/{size}/20190103/20190103191232626.jpg","profile":"薛之谦（Joker Xue），1983年7月17日出生于上海，华语流行乐男歌手、影视演员、音乐制作人，毕业于格里昂酒店管理学院。 2005年，因参加选秀节目《我型我秀》而正式出道。2006年，发行首张同名专辑《薛之谦》，随后凭借歌曲《认真的雪》获得广泛关注。2007年，凭借专辑《你过得好吗》获得MusicRadio中国TOP排行榜内地年度最受欢迎男歌手奖。","singerid":3060,"singername":"薛之谦","albumcount":28}
     * songs : {"total":228,"pagesize":30,"list":[{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":4179360,"bitrate":128,"identity":1,"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"薛之谦 - 演员","price_320":0,"extname":"mp3","hash":"A774A794184AF17469B27963E120B565","audio_id":15327235,"sqfilesize":25495240,"privilege":0,"topic_url_320":"","trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":22506344},"album_audio_id":39679372,"320hash":"C94B2DCB83CECE392DBD0F5366E8EC9C","fail_process_320":0,"has_accompany":1,"fail_process_sq":0,"320filesize":10448979,"rp_publish":1,"duration":261,"topic_url_sq":"","sqhash":"403048691D6A5BBDD5D1D056C5BA5C8F","remark":"《逆袭之星途璀璨》电视剧插曲","320privilege":0,"fail_process":0,"lyrics_info":[],"pkg_price_320":0,"mvhash":"4F5DAE4814BFAF9C556ABCD91EBF7FC5","pay_type_sq":0,"publish_date":"2015-06-05","sqprivilege":0,"album_id":"1747549","composer_info":[]},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":4657153,"bitrate":128,"identity":1,"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"薛之谦 - 绅士","price_320":0,"extname":"mp3","hash":"5F4D1E64E3BF890658A60CA8DC34096B","audio_id":14238284,"sqfilesize":31815508,"privilege":0,"topic_url_320":"","trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":22506345},"album_audio_id":39679373,"320hash":"E2D75AA1712BF4170716D0413AB9CA1B","fail_process_320":0,"has_accompany":1,"fail_process_sq":0,"320filesize":11638073,"rp_publish":1,"duration":291,"topic_url_sq":"","sqhash":"A8AC77F45B05ECC860E524B8118296E1","remark":"《职场是个技术活》电视剧片尾曲","320privilege":0,"fail_process":0,"lyrics_info":[],"pkg_price_320":0,"mvhash":"5BE4A35B0F75E3DEB280B30E6E7510D1","pay_type_sq":0,"publish_date":"2015-06-05","sqprivilege":0,"album_id":"1747549","composer_info":[]},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":4055054,"bitrate":128,"identity":1,"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"薛之谦 - 丑八怪","price_320":0,"extname":"mp3","hash":"2688ADB1CA449448388270987BDCE6E8","audio_id":942085,"sqfilesize":24834211,"privilege":0,"topic_url_320":"","trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":22470293},"album_audio_id":32042273,"320hash":"C19F7CDECD22FD3568D2FA4736C3419C","fail_process_320":0,"has_accompany":1,"fail_process_sq":0,"320filesize":9948301,"rp_publish":1,"duration":253,"topic_url_sq":"","sqhash":"B257B88748C8127EA9B5AB8724FDEEC0","remark":"《如果我爱你》电视剧插曲","320privilege":0,"fail_process":0,"lyrics_info":[],"pkg_price_320":0,"mvhash":"BD36158680DA6D3C1E8E1E8E8AB220E2","pay_type_sq":0,"publish_date":"2013-10-08","sqprivilege":0,"album_id":"960327","composer_info":[]},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":4965504,"bitrate":128,"identity":1,"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"薛之谦 - 你还要我怎样","price_320":0,"extname":"mp3","hash":"2AC1E883997597E65F3F4A38183B5700","audio_id":977116,"sqfilesize":32024807,"privilege":0,"topic_url_320":"","trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":22470294},"album_audio_id":32042275,"320hash":"618CAD05F97FFEE5CE5F7A883595003B","fail_process_320":0,"has_accompany":1,"fail_process_sq":0,"320filesize":12440745,"rp_publish":1,"duration":310,"topic_url_sq":"","sqhash":"CC315E7C42D6E318F467B35A0E9438D5","remark":"《妈妈像花儿一样》电视剧片尾曲","320privilege":0,"fail_process":0,"lyrics_info":[],"pkg_price_320":0,"mvhash":"FCC114727D06D43BA7BA6CFC2472BE81","pay_type_sq":0,"publish_date":"2013-11-11","sqprivilege":0,"album_id":"960327","composer_info":[]}]}
     * __Tpl : singer/info.html
     */

    private int JS_CSS_DATE;
    private String kg_domain;
    private String src;
    private Object fr;
    private String ver;
    private InfoBean info;
    private SongsBean songs;
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

    public String get__Tpl() {
        return __Tpl;
    }

    public void set__Tpl(String __Tpl) {
        this.__Tpl = __Tpl;
    }

    public static class InfoBean {
        /**
         * identity : 7
         * mvcount : 197
         * has_long_intro : 1
         * intro : 薛之谦（Joker Xue），1983年7月17日出生于上海，华语流行乐男歌手、影视演员、音乐制作人，毕业于格里昂酒店管理学院。 2005年，因参加选秀节目《我型我秀》而正式出道。2006年，发行首张同名专辑《薛之谦》，随后凭借歌曲《认真的雪》获得广泛关注。2007年，凭借专辑《你过得好吗》获得MusicRadio中国TOP排行榜内地年度最受欢迎男歌手奖。
         * songcount : 228
         * imgurl : http://singerimg.kugou.com/uploadpic/softhead/{size}/20190103/20190103191232626.jpg
         * profile : 薛之谦（Joker Xue），1983年7月17日出生于上海，华语流行乐男歌手、影视演员、音乐制作人，毕业于格里昂酒店管理学院。 2005年，因参加选秀节目《我型我秀》而正式出道。2006年，发行首张同名专辑《薛之谦》，随后凭借歌曲《认真的雪》获得广泛关注。2007年，凭借专辑《你过得好吗》获得MusicRadio中国TOP排行榜内地年度最受欢迎男歌手奖。
         * singerid : 3060
         * singername : 薛之谦
         * albumcount : 28
         */

        private int identity;
        private int mvcount;
        private int has_long_intro;
        private String intro;
        private int songcount;
        private String imgurl;
        private String profile;
        private int singerid;
        private String singername;
        private int albumcount;

        public int getIdentity() {
            return identity;
        }

        public void setIdentity(int identity) {
            this.identity = identity;
        }

        public int getMvcount() {
            return mvcount;
        }

        public void setMvcount(int mvcount) {
            this.mvcount = mvcount;
        }

        public int getHas_long_intro() {
            return has_long_intro;
        }

        public void setHas_long_intro(int has_long_intro) {
            this.has_long_intro = has_long_intro;
        }

        public String getIntro() {
            return intro;
        }

        public void setIntro(String intro) {
            this.intro = intro;
        }

        public int getSongcount() {
            return songcount;
        }

        public void setSongcount(int songcount) {
            this.songcount = songcount;
        }

        public String getImgurl() {
            return imgurl;
        }

        public void setImgurl(String imgurl) {
            this.imgurl = imgurl;
        }

        public String getProfile() {
            return profile;
        }

        public void setProfile(String profile) {
            this.profile = profile;
        }

        public int getSingerid() {
            return singerid;
        }

        public void setSingerid(int singerid) {
            this.singerid = singerid;
        }

        public String getSingername() {
            return singername;
        }

        public void setSingername(String singername) {
            this.singername = singername;
        }

        public int getAlbumcount() {
            return albumcount;
        }

        public void setAlbumcount(int albumcount) {
            this.albumcount = albumcount;
        }
    }

    public static class SongsBean {
        /**
         * total : 228
         * pagesize : 30
         * list : [{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":4179360,"bitrate":128,"identity":1,"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"薛之谦 - 演员","price_320":0,"extname":"mp3","hash":"A774A794184AF17469B27963E120B565","audio_id":15327235,"sqfilesize":25495240,"privilege":0,"topic_url_320":"","trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":22506344},"album_audio_id":39679372,"320hash":"C94B2DCB83CECE392DBD0F5366E8EC9C","fail_process_320":0,"has_accompany":1,"fail_process_sq":0,"320filesize":10448979,"rp_publish":1,"duration":261,"topic_url_sq":"","sqhash":"403048691D6A5BBDD5D1D056C5BA5C8F","remark":"《逆袭之星途璀璨》电视剧插曲","320privilege":0,"fail_process":0,"lyrics_info":[],"pkg_price_320":0,"mvhash":"4F5DAE4814BFAF9C556ABCD91EBF7FC5","pay_type_sq":0,"publish_date":"2015-06-05","sqprivilege":0,"album_id":"1747549","composer_info":[]},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":4657153,"bitrate":128,"identity":1,"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"薛之谦 - 绅士","price_320":0,"extname":"mp3","hash":"5F4D1E64E3BF890658A60CA8DC34096B","audio_id":14238284,"sqfilesize":31815508,"privilege":0,"topic_url_320":"","trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":22506345},"album_audio_id":39679373,"320hash":"E2D75AA1712BF4170716D0413AB9CA1B","fail_process_320":0,"has_accompany":1,"fail_process_sq":0,"320filesize":11638073,"rp_publish":1,"duration":291,"topic_url_sq":"","sqhash":"A8AC77F45B05ECC860E524B8118296E1","remark":"《职场是个技术活》电视剧片尾曲","320privilege":0,"fail_process":0,"lyrics_info":[],"pkg_price_320":0,"mvhash":"5BE4A35B0F75E3DEB280B30E6E7510D1","pay_type_sq":0,"publish_date":"2015-06-05","sqprivilege":0,"album_id":"1747549","composer_info":[]},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":4055054,"bitrate":128,"identity":1,"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"薛之谦 - 丑八怪","price_320":0,"extname":"mp3","hash":"2688ADB1CA449448388270987BDCE6E8","audio_id":942085,"sqfilesize":24834211,"privilege":0,"topic_url_320":"","trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":22470293},"album_audio_id":32042273,"320hash":"C19F7CDECD22FD3568D2FA4736C3419C","fail_process_320":0,"has_accompany":1,"fail_process_sq":0,"320filesize":9948301,"rp_publish":1,"duration":253,"topic_url_sq":"","sqhash":"B257B88748C8127EA9B5AB8724FDEEC0","remark":"《如果我爱你》电视剧插曲","320privilege":0,"fail_process":0,"lyrics_info":[],"pkg_price_320":0,"mvhash":"BD36158680DA6D3C1E8E1E8E8AB220E2","pay_type_sq":0,"publish_date":"2013-10-08","sqprivilege":0,"album_id":"960327","composer_info":[]},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":4965504,"bitrate":128,"identity":1,"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","rp_type":"audio","pkg_price":0,"feetype":0,"filename":"薛之谦 - 你还要我怎样","price_320":0,"extname":"mp3","hash":"2AC1E883997597E65F3F4A38183B5700","audio_id":977116,"sqfilesize":32024807,"privilege":0,"topic_url_320":"","trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":22470294},"album_audio_id":32042275,"320hash":"618CAD05F97FFEE5CE5F7A883595003B","fail_process_320":0,"has_accompany":1,"fail_process_sq":0,"320filesize":12440745,"rp_publish":1,"duration":310,"topic_url_sq":"","sqhash":"CC315E7C42D6E318F467B35A0E9438D5","remark":"《妈妈像花儿一样》电视剧片尾曲","320privilege":0,"fail_process":0,"lyrics_info":[],"pkg_price_320":0,"mvhash":"FCC114727D06D43BA7BA6CFC2472BE81","pay_type_sq":0,"publish_date":"2013-11-11","sqprivilege":0,"album_id":"960327","composer_info":[]}]
         */

        private int total;
        private int pagesize;
        private List<ListBean> list;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getPagesize() {
            return pagesize;
        }

        public void setPagesize(int pagesize) {
            this.pagesize = pagesize;
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
             * filesize : 4179360
             * bitrate : 128
             * identity : 1
             * price : 0
             * inlist : 1
             * old_cpy : 1
             * pkg_price_sq : 0
             * pay_type : 0
             * topic_url :
             * rp_type : audio
             * pkg_price : 0
             * feetype : 0
             * filename : 薛之谦 - 演员
             * price_320 : 0
             * extname : mp3
             * hash : A774A794184AF17469B27963E120B565
             * audio_id : 15327235
             * sqfilesize : 25495240
             * privilege : 0
             * topic_url_320 :
             * trans_param : {"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":22506344}
             * album_audio_id : 39679372
             * 320hash : C94B2DCB83CECE392DBD0F5366E8EC9C
             * fail_process_320 : 0
             * has_accompany : 1
             * fail_process_sq : 0
             * 320filesize : 10448979
             * rp_publish : 1
             * duration : 261
             * topic_url_sq :
             * sqhash : 403048691D6A5BBDD5D1D056C5BA5C8F
             * remark : 《逆袭之星途璀璨》电视剧插曲
             * 320privilege : 0
             * fail_process : 0
             * lyrics_info : []
             * pkg_price_320 : 0
             * mvhash : 4F5DAE4814BFAF9C556ABCD91EBF7FC5
             * pay_type_sq : 0
             * publish_date : 2015-06-05
             * sqprivilege : 0
             * album_id : 1747549
             * composer_info : []
             */

            private int pay_type_320;
            private int m4afilesize;
            private int price_sq;
            private int filesize;
            private int bitrate;
            private int identity;
            private int price;
            private int inlist;
            private int old_cpy;
            private int pkg_price_sq;
            private int pay_type;
            private String topic_url;
            private String rp_type;
            private int pkg_price;
            private int feetype;
            private String filename;
            private int price_320;
            private String extname;
            private String hash;
            private int audio_id;
            private int sqfilesize;
            private int privilege;
            private String topic_url_320;
            private TransParamBean trans_param;
            private int album_audio_id;
            @SerializedName("320hash")
            private String _$320hash;
            private int fail_process_320;
            private int has_accompany;
            private int fail_process_sq;
            @SerializedName("320filesize")
            private int _$320filesize;
            private int rp_publish;
            private int duration;
            private String topic_url_sq;
            private String sqhash;
            private String remark;
            @SerializedName("320privilege")
            private int _$320privilege;
            private int fail_process;
            private int pkg_price_320;
            private String mvhash;
            private int pay_type_sq;
            private String publish_date;
            private int sqprivilege;
            private String album_id;
            private List<?> lyrics_info;
            private List<?> composer_info;

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

            public int getIdentity() {
                return identity;
            }

            public void setIdentity(int identity) {
                this.identity = identity;
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

            public int getFeetype() {
                return feetype;
            }

            public void setFeetype(int feetype) {
                this.feetype = feetype;
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

            public int getSqfilesize() {
                return sqfilesize;
            }

            public void setSqfilesize(int sqfilesize) {
                this.sqfilesize = sqfilesize;
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

            public TransParamBean getTrans_param() {
                return trans_param;
            }

            public void setTrans_param(TransParamBean trans_param) {
                this.trans_param = trans_param;
            }

            public int getAlbum_audio_id() {
                return album_audio_id;
            }

            public void setAlbum_audio_id(int album_audio_id) {
                this.album_audio_id = album_audio_id;
            }

            public String get_$320hash() {
                return _$320hash;
            }

            public void set_$320hash(String _$320hash) {
                this._$320hash = _$320hash;
            }

            public int getFail_process_320() {
                return fail_process_320;
            }

            public void setFail_process_320(int fail_process_320) {
                this.fail_process_320 = fail_process_320;
            }

            public int getHas_accompany() {
                return has_accompany;
            }

            public void setHas_accompany(int has_accompany) {
                this.has_accompany = has_accompany;
            }

            public int getFail_process_sq() {
                return fail_process_sq;
            }

            public void setFail_process_sq(int fail_process_sq) {
                this.fail_process_sq = fail_process_sq;
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

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public String getTopic_url_sq() {
                return topic_url_sq;
            }

            public void setTopic_url_sq(String topic_url_sq) {
                this.topic_url_sq = topic_url_sq;
            }

            public String getSqhash() {
                return sqhash;
            }

            public void setSqhash(String sqhash) {
                this.sqhash = sqhash;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public int get_$320privilege() {
                return _$320privilege;
            }

            public void set_$320privilege(int _$320privilege) {
                this._$320privilege = _$320privilege;
            }

            public int getFail_process() {
                return fail_process;
            }

            public void setFail_process(int fail_process) {
                this.fail_process = fail_process;
            }

            public int getPkg_price_320() {
                return pkg_price_320;
            }

            public void setPkg_price_320(int pkg_price_320) {
                this.pkg_price_320 = pkg_price_320;
            }

            public String getMvhash() {
                return mvhash;
            }

            public void setMvhash(String mvhash) {
                this.mvhash = mvhash;
            }

            public int getPay_type_sq() {
                return pay_type_sq;
            }

            public void setPay_type_sq(int pay_type_sq) {
                this.pay_type_sq = pay_type_sq;
            }

            public String getPublish_date() {
                return publish_date;
            }

            public void setPublish_date(String publish_date) {
                this.publish_date = publish_date;
            }

            public int getSqprivilege() {
                return sqprivilege;
            }

            public void setSqprivilege(int sqprivilege) {
                this.sqprivilege = sqprivilege;
            }

            public String getAlbum_id() {
                return album_id;
            }

            public void setAlbum_id(String album_id) {
                this.album_id = album_id;
            }

            public List<?> getLyrics_info() {
                return lyrics_info;
            }

            public void setLyrics_info(List<?> lyrics_info) {
                this.lyrics_info = lyrics_info;
            }

            public List<?> getComposer_info() {
                return composer_info;
            }

            public void setComposer_info(List<?> composer_info) {
                this.composer_info = composer_info;
            }

            public static class TransParamBean {
                /**
                 * roaming_astrict : 0
                 * pay_block_tpl : 1
                 * musicpack_advance : 0
                 * display_rate : 0
                 * display : 0
                 * cid : 22506344
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
