package entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public class SongClassifyContains extends SongListEntityParent {
    /**
     * status : 1
     * error :
     * data : {"timestamp":1552719534,"info":[{"recommendfirst":0,"specialname":"怀旧金曲·重拾粤语记忆碎片","intro":"时光犹如条奔涌不息的洪流，一去不复返，甚至咱们还来不及阅读和回顾，它已滚滚而去，留给咱们的只有不尽的怀想和一声叹息。","songs":[{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":4153546,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":-1},"price":0,"inlist":1,"old_cpy":1,"fail_process_sq":0,"pay_type":0,"topic_url":"","fail_process_320":0,"pkg_price":0,"feetype":0,"filename":"钟镇涛 - 大海","price_320":0,"extname":"mp3","hash":"C7D13BCE3F2C1CA894255AA72BEE6A9F","mvhash":"B64E6A8A63224AEF3B2B0039741A3E51","privilege":0,"album_id":"570958","pkg_price_sq":0,"topic_url_320":"","brief":"","album_audio_id":28312266,"320filesize":10382233,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","rp_type":"audio","remark":"全部为你","sqfilesize":28551802,"fail_process":0,"duration":259,"sqhash":"03E541F0C27747F637DEF0AC93369146","320privilege":0,"pay_type_sq":0,"audio_id":33635,"sqprivilege":0,"pkg_price_320":0,"320hash":"FF59DD1708A89BC91DADA6872DE33A10"}],"ugc_talent_review":1,"is_selected":0,"selected_reason":"","slid":0,"trans_param":{"special_tag":0},"playcount":1243093,"singername":"","verified":0,"user_type":1,"songcount":4,"user_avatar":"http://imge.kugou.com/kugouicon/165/20170107/20170107225214631568.jpg","imgurl":"http://imge.kugou.com/soft/collection/{size}/20190312/20190312200304985669.jpg","suid":42199481,"specialid":618497,"username":"丰水云山","collectcount":669,"publishtime":"2019-03-09 00:00:00"}],"total":778}
     * errcode : 0
     */

    private int status;
    private String error;
    private DataBean data;
    private int errcode;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public static class DataBean {
        /**
         * timestamp : 1552719534
         * info : [{"recommendfirst":0,"specialname":"怀旧金曲·重拾粤语记忆碎片","intro":"时光犹如条奔涌不息的洪流，一去不复返，甚至咱们还来不及阅读和回顾，它已滚滚而去，留给咱们的只有不尽的怀想和一声叹息。","songs":[{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":4153546,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":-1},"price":0,"inlist":1,"old_cpy":1,"fail_process_sq":0,"pay_type":0,"topic_url":"","fail_process_320":0,"pkg_price":0,"feetype":0,"filename":"钟镇涛 - 大海","price_320":0,"extname":"mp3","hash":"C7D13BCE3F2C1CA894255AA72BEE6A9F","mvhash":"B64E6A8A63224AEF3B2B0039741A3E51","privilege":0,"album_id":"570958","pkg_price_sq":0,"topic_url_320":"","brief":"","album_audio_id":28312266,"320filesize":10382233,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","rp_type":"audio","remark":"全部为你","sqfilesize":28551802,"fail_process":0,"duration":259,"sqhash":"03E541F0C27747F637DEF0AC93369146","320privilege":0,"pay_type_sq":0,"audio_id":33635,"sqprivilege":0,"pkg_price_320":0,"320hash":"FF59DD1708A89BC91DADA6872DE33A10"}],"ugc_talent_review":1,"is_selected":0,"selected_reason":"","slid":0,"trans_param":{"special_tag":0},"playcount":1243093,"singername":"","verified":0,"user_type":1,"songcount":4,"user_avatar":"http://imge.kugou.com/kugouicon/165/20170107/20170107225214631568.jpg","imgurl":"http://imge.kugou.com/soft/collection/{size}/20190312/20190312200304985669.jpg","suid":42199481,"specialid":618497,"username":"丰水云山","collectcount":669,"publishtime":"2019-03-09 00:00:00"}]
         * total : 778
         */

        private int timestamp;
        private int total;
        private List<InfoBean> info;

        public int getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(int timestamp) {
            this.timestamp = timestamp;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<InfoBean> getInfo() {
            return info;
        }

        public void setInfo(List<InfoBean> info) {
            this.info = info;
        }

        public static class InfoBean {

            @Override
            public String toString() {
                return "InfoBean{" +
                        "recommendfirst=" + recommendfirst +
                        ", specialname='" + specialname + '\'' +
                        ", intro='" + intro + '\'' +
                        ", ugc_talent_review=" + ugc_talent_review +
                        ", is_selected=" + is_selected +
                        ", selected_reason='" + selected_reason + '\'' +
                        ", slid=" + slid +
                        ", trans_param=" + trans_param +
                        ", playcount=" + playcount +
                        ", singername='" + singername + '\'' +
                        ", verified=" + verified +
                        ", user_type=" + user_type +
                        ", songcount=" + songcount +
                        ", user_avatar='" + user_avatar + '\'' +
                        ", imgurl='" + imgurl + '\'' +
                        ", suid=" + suid +
                        ", specialid=" + specialid +
                        ", username='" + username + '\'' +
                        ", collectcount=" + collectcount +
                        ", publishtime='" + publishtime + '\'' +
                        ", songs=" + songs +
                        '}';
            }

            /**
             * recommendfirst : 0
             * specialname : 怀旧金曲·重拾粤语记忆碎片
             * intro : 时光犹如条奔涌不息的洪流，一去不复返，甚至咱们还来不及阅读和回顾，它已滚滚而去，留给咱们的只有不尽的怀想和一声叹息。
             * songs : [{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":4153546,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":-1},"price":0,"inlist":1,"old_cpy":1,"fail_process_sq":0,"pay_type":0,"topic_url":"","fail_process_320":0,"pkg_price":0,"feetype":0,"filename":"钟镇涛 - 大海","price_320":0,"extname":"mp3","hash":"C7D13BCE3F2C1CA894255AA72BEE6A9F","mvhash":"B64E6A8A63224AEF3B2B0039741A3E51","privilege":0,"album_id":"570958","pkg_price_sq":0,"topic_url_320":"","brief":"","album_audio_id":28312266,"320filesize":10382233,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","rp_type":"audio","remark":"全部为你","sqfilesize":28551802,"fail_process":0,"duration":259,"sqhash":"03E541F0C27747F637DEF0AC93369146","320privilege":0,"pay_type_sq":0,"audio_id":33635,"sqprivilege":0,"pkg_price_320":0,"320hash":"FF59DD1708A89BC91DADA6872DE33A10"}]
             * ugc_talent_review : 1
             * is_selected : 0
             * selected_reason :
             * slid : 0
             * trans_param : {"special_tag":0}
             * playcount : 1243093
             * singername :
             * verified : 0
             * user_type : 1
             * songcount : 4
             * user_avatar : http://imge.kugou.com/kugouicon/165/20170107/20170107225214631568.jpg
             * imgurl : http://imge.kugou.com/soft/collection/{size}/20190312/20190312200304985669.jpg
             * suid : 42199481
             * specialid : 618497
             * username : 丰水云山
             * collectcount : 669
             * publishtime : 2019-03-09 00:00:00
             */

            private int recommendfirst;
            private String specialname;
            private String intro;
            private int ugc_talent_review;
            private int is_selected;
            private String selected_reason;
            private int slid;
            private TransParamBean trans_param;
            private int playcount;
            private String singername;
            private int verified;
            private int user_type;
            private int songcount;
            private String user_avatar;
            private String imgurl;
            private int suid;
            private int specialid;
            private String username;
            private int collectcount;
            private String publishtime;
            private List<SongsBean> songs;

            public int getRecommendfirst() {
                return recommendfirst;
            }

            public void setRecommendfirst(int recommendfirst) {
                this.recommendfirst = recommendfirst;
            }

            public String getSpecialname() {
                return specialname;
            }

            public void setSpecialname(String specialname) {
                this.specialname = specialname;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public int getUgc_talent_review() {
                return ugc_talent_review;
            }

            public void setUgc_talent_review(int ugc_talent_review) {
                this.ugc_talent_review = ugc_talent_review;
            }

            public int getIs_selected() {
                return is_selected;
            }

            public void setIs_selected(int is_selected) {
                this.is_selected = is_selected;
            }

            public String getSelected_reason() {
                return selected_reason;
            }

            public void setSelected_reason(String selected_reason) {
                this.selected_reason = selected_reason;
            }

            public int getSlid() {
                return slid;
            }

            public void setSlid(int slid) {
                this.slid = slid;
            }

            public TransParamBean getTrans_param() {
                return trans_param;
            }

            public void setTrans_param(TransParamBean trans_param) {
                this.trans_param = trans_param;
            }

            public int getPlaycount() {
                return playcount;
            }

            public void setPlaycount(int playcount) {
                this.playcount = playcount;
            }

            public String getSingername() {
                return singername;
            }

            public void setSingername(String singername) {
                this.singername = singername;
            }

            public int getVerified() {
                return verified;
            }

            public void setVerified(int verified) {
                this.verified = verified;
            }

            public int getUser_type() {
                return user_type;
            }

            public void setUser_type(int user_type) {
                this.user_type = user_type;
            }

            public int getSongcount() {
                return songcount;
            }

            public void setSongcount(int songcount) {
                this.songcount = songcount;
            }

            public String getUser_avatar() {
                return user_avatar;
            }

            public void setUser_avatar(String user_avatar) {
                this.user_avatar = user_avatar;
            }

            public String getImgurl() {
                return imgurl;
            }

            public void setImgurl(String imgurl) {
                this.imgurl = imgurl;
            }

            public int getSuid() {
                return suid;
            }

            public void setSuid(int suid) {
                this.suid = suid;
            }

            public int getSpecialid() {
                return specialid;
            }

            public void setSpecialid(int specialid) {
                this.specialid = specialid;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public int getCollectcount() {
                return collectcount;
            }

            public void setCollectcount(int collectcount) {
                this.collectcount = collectcount;
            }

            public String getPublishtime() {
                return publishtime;
            }

            public void setPublishtime(String publishtime) {
                this.publishtime = publishtime;
            }

            public List<SongsBean> getSongs() {
                return songs;
            }

            public void setSongs(List<SongsBean> songs) {
                this.songs = songs;
            }

            public static class TransParamBean {
                /**
                 * special_tag : 0
                 */

                private int special_tag;

                public int getSpecial_tag() {
                    return special_tag;
                }

                public void setSpecial_tag(int special_tag) {
                    this.special_tag = special_tag;
                }
            }

            public static class SongsBean {
                /**
                 * pay_type_320 : 0
                 * m4afilesize : 0
                 * price_sq : 0
                 * filesize : 4153546
                 * bitrate : 128
                 * trans_param : {"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":-1}
                 * price : 0
                 * inlist : 1
                 * old_cpy : 1
                 * fail_process_sq : 0
                 * pay_type : 0
                 * topic_url :
                 * fail_process_320 : 0
                 * pkg_price : 0
                 * feetype : 0
                 * filename : 钟镇涛 - 大海
                 * price_320 : 0
                 * extname : mp3
                 * hash : C7D13BCE3F2C1CA894255AA72BEE6A9F
                 * mvhash : B64E6A8A63224AEF3B2B0039741A3E51
                 * privilege : 0
                 * album_id : 570958
                 * pkg_price_sq : 0
                 * topic_url_320 :
                 * brief :
                 * album_audio_id : 28312266
                 * 320filesize : 10382233
                 * rp_publish : 1
                 * has_accompany : 1
                 * topic_url_sq :
                 * rp_type : audio
                 * remark : 全部为你
                 * sqfilesize : 28551802
                 * fail_process : 0
                 * duration : 259
                 * sqhash : 03E541F0C27747F637DEF0AC93369146
                 * 320privilege : 0
                 * pay_type_sq : 0
                 * audio_id : 33635
                 * sqprivilege : 0
                 * pkg_price_320 : 0
                 * 320hash : FF59DD1708A89BC91DADA6872DE33A10
                 */

                private int pay_type_320;
                private int m4afilesize;
                private int price_sq;
                private int filesize;
                private int bitrate;
                private TransParamBeanX trans_param;
                private int price;
                private int inlist;
                private int old_cpy;
                private int fail_process_sq;
                private int pay_type;
                private String topic_url;
                private int fail_process_320;
                private int pkg_price;
                private int feetype;
                private String filename;
                private int price_320;
                private String extname;
                private String hash;
                private String mvhash;
                private int privilege;
                private String album_id;
                private int pkg_price_sq;
                private String topic_url_320;
                private String brief;
                private int album_audio_id;
                @SerializedName("320filesize")
                private int _$320filesize;
                private int rp_publish;
                private int has_accompany;
                private String topic_url_sq;
                private String rp_type;
                private String remark;
                private int sqfilesize;
                private int fail_process;
                private int duration;
                private String sqhash;
                @SerializedName("320privilege")
                private int _$320privilege;
                private int pay_type_sq;
                private int audio_id;
                private int sqprivilege;
                private int pkg_price_320;
                @SerializedName("320hash")
                private String _$320hash;

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

                public TransParamBeanX getTrans_param() {
                    return trans_param;
                }

                public void setTrans_param(TransParamBeanX trans_param) {
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

                public int getFail_process_sq() {
                    return fail_process_sq;
                }

                public void setFail_process_sq(int fail_process_sq) {
                    this.fail_process_sq = fail_process_sq;
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

                public int getFail_process_320() {
                    return fail_process_320;
                }

                public void setFail_process_320(int fail_process_320) {
                    this.fail_process_320 = fail_process_320;
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

                public String getMvhash() {
                    return mvhash;
                }

                public void setMvhash(String mvhash) {
                    this.mvhash = mvhash;
                }

                public int getPrivilege() {
                    return privilege;
                }

                public void setPrivilege(int privilege) {
                    this.privilege = privilege;
                }

                public String getAlbum_id() {
                    return album_id;
                }

                public void setAlbum_id(String album_id) {
                    this.album_id = album_id;
                }

                public int getPkg_price_sq() {
                    return pkg_price_sq;
                }

                public void setPkg_price_sq(int pkg_price_sq) {
                    this.pkg_price_sq = pkg_price_sq;
                }

                public String getTopic_url_320() {
                    return topic_url_320;
                }

                public void setTopic_url_320(String topic_url_320) {
                    this.topic_url_320 = topic_url_320;
                }

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public int getAlbum_audio_id() {
                    return album_audio_id;
                }

                public void setAlbum_audio_id(int album_audio_id) {
                    this.album_audio_id = album_audio_id;
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

                public String getRp_type() {
                    return rp_type;
                }

                public void setRp_type(String rp_type) {
                    this.rp_type = rp_type;
                }

                public String getRemark() {
                    return remark;
                }

                public void setRemark(String remark) {
                    this.remark = remark;
                }

                public int getSqfilesize() {
                    return sqfilesize;
                }

                public void setSqfilesize(int sqfilesize) {
                    this.sqfilesize = sqfilesize;
                }

                public int getFail_process() {
                    return fail_process;
                }

                public void setFail_process(int fail_process) {
                    this.fail_process = fail_process;
                }

                public int getDuration() {
                    return duration;
                }

                public void setDuration(int duration) {
                    this.duration = duration;
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

                public int getPay_type_sq() {
                    return pay_type_sq;
                }

                public void setPay_type_sq(int pay_type_sq) {
                    this.pay_type_sq = pay_type_sq;
                }

                public int getAudio_id() {
                    return audio_id;
                }

                public void setAudio_id(int audio_id) {
                    this.audio_id = audio_id;
                }

                public int getSqprivilege() {
                    return sqprivilege;
                }

                public void setSqprivilege(int sqprivilege) {
                    this.sqprivilege = sqprivilege;
                }

                public int getPkg_price_320() {
                    return pkg_price_320;
                }

                public void setPkg_price_320(int pkg_price_320) {
                    this.pkg_price_320 = pkg_price_320;
                }

                public String get_$320hash() {
                    return _$320hash;
                }

                public void set_$320hash(String _$320hash) {
                    this._$320hash = _$320hash;
                }

                public static class TransParamBeanX {
                    /**
                     * roaming_astrict : 0
                     * pay_block_tpl : 1
                     * musicpack_advance : 0
                     * display_rate : 0
                     * display : 0
                     * cid : -1
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
}
