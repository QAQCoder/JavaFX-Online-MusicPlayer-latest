package entity;

import java.util.List;

/**
 * 歌单分类
 */
public class SongListClassify {
    /**
     * status : 1
     * error :
     * data : {"timestamp":1552637830,"info":[{"child":[{"categoryid":"12","categoryname":"经典"},{"categoryid":"35","categoryname":"网络"},{"categoryid":"17","categoryname":"DJ热碟"},{"categoryid":"68","categoryname":"情歌对唱"},{"categoryid":"74","categoryname":"游戏"},{"categoryid":"10","categoryname":"舞曲"},{"categoryid":"72","categoryname":"KTV"},{"categoryid":"34","categoryname":"轻音乐"},{"categoryid":"79","categoryname":"影视"},{"categoryid":"81","categoryname":"励志"},{"categoryid":"605","categoryname":"草原风"},{"categoryid":"628","categoryname":"广场舞"},{"categoryid":"630","categoryname":"胎教"},{"categoryid":"638","categoryname":"翻唱"},{"categoryid":"641","categoryname":"佛教"},{"categoryid":"36","categoryname":"儿歌"},{"categoryid":"77","categoryname":"ACG"},{"categoryid":"642","categoryname":"小清新"},{"categoryid":"643","categoryname":"减压"},{"categoryid":"680","categoryname":"现场"},{"categoryid":"682","categoryname":"器乐演奏"},{"categoryid":"684","categoryname":"失恋"},{"categoryid":"806","categoryname":"粤剧"}],"categoryname":"主题","categoryid":"1"}]}
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
         * timestamp : 1552637830
         * info : [{"child":[{"categoryid":"12","categoryname":"经典"},{"categoryid":"35","categoryname":"网络"},{"categoryid":"17","categoryname":"DJ热碟"},{"categoryid":"68","categoryname":"情歌对唱"},{"categoryid":"74","categoryname":"游戏"},{"categoryid":"10","categoryname":"舞曲"},{"categoryid":"72","categoryname":"KTV"},{"categoryid":"34","categoryname":"轻音乐"},{"categoryid":"79","categoryname":"影视"},{"categoryid":"81","categoryname":"励志"},{"categoryid":"605","categoryname":"草原风"},{"categoryid":"628","categoryname":"广场舞"},{"categoryid":"630","categoryname":"胎教"},{"categoryid":"638","categoryname":"翻唱"},{"categoryid":"641","categoryname":"佛教"},{"categoryid":"36","categoryname":"儿歌"},{"categoryid":"77","categoryname":"ACG"},{"categoryid":"642","categoryname":"小清新"},{"categoryid":"643","categoryname":"减压"},{"categoryid":"680","categoryname":"现场"},{"categoryid":"682","categoryname":"器乐演奏"},{"categoryid":"684","categoryname":"失恋"},{"categoryid":"806","categoryname":"粤剧"}],"categoryname":"主题","categoryid":"1"}]
         */

        private int timestamp;
        private List<InfoBean> info;

        public int getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(int timestamp) {
            this.timestamp = timestamp;
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
                        "categoryname='" + categoryname + '\'' +
                        ", categoryid='" + categoryid + '\'' +
                        ", child=" + child +
                        '}';
            }
            /**
             * child : [{"categoryid":"12","categoryname":"经典"},{"categoryid":"35","categoryname":"网络"},{"categoryid":"17","categoryname":"DJ热碟"},{"categoryid":"68","categoryname":"情歌对唱"},{"categoryid":"74","categoryname":"游戏"},{"categoryid":"10","categoryname":"舞曲"},{"categoryid":"72","categoryname":"KTV"},{"categoryid":"34","categoryname":"轻音乐"},{"categoryid":"79","categoryname":"影视"},{"categoryid":"81","categoryname":"励志"},{"categoryid":"605","categoryname":"草原风"},{"categoryid":"628","categoryname":"广场舞"},{"categoryid":"630","categoryname":"胎教"},{"categoryid":"638","categoryname":"翻唱"},{"categoryid":"641","categoryname":"佛教"},{"categoryid":"36","categoryname":"儿歌"},{"categoryid":"77","categoryname":"ACG"},{"categoryid":"642","categoryname":"小清新"},{"categoryid":"643","categoryname":"减压"},{"categoryid":"680","categoryname":"现场"},{"categoryid":"682","categoryname":"器乐演奏"},{"categoryid":"684","categoryname":"失恋"},{"categoryid":"806","categoryname":"粤剧"}]
             * categoryname : 主题
             * categoryid : 1
             */
            private String categoryname;
            private String categoryid;
            private List<ChildBean> child;

            public String getCategoryname() {
                return categoryname;
            }

            public void setCategoryname(String categoryname) {
                this.categoryname = categoryname;
            }

            public String getCategoryid() {
                return categoryid;
            }

            public void setCategoryid(String categoryid) {
                this.categoryid = categoryid;
            }

            public List<ChildBean> getChild() {
                return child;
            }

            public void setChild(List<ChildBean> child) {
                this.child = child;
            }

            public static class ChildBean {
                /**
                 * categoryid : 12
                 * categoryname : 经典
                 */

                private String categoryid;
                private String categoryname;

                public String getCategoryid() {
                    return categoryid;
                }

                public void setCategoryid(String categoryid) {
                    this.categoryid = categoryid;
                }

                public String getCategoryname() {
                    return categoryname;
                }

                public void setCategoryname(String categoryname) {
                    this.categoryname = categoryname;
                }
            }
        }
    }
}
