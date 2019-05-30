package entity;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public class KuGouMusicPlay extends RecursiveTreeObject<KuGouMusicPlay> implements Serializable {
    /**
     * status : 1
     * err_code : 0
     * data : {"hash":"0c8d0524e09448009312b73b3adf86d3","timelength":267860,"filesize":4304200,"audio_name":"林俊杰 - 江南","have_album":0,"album_name":"未知专辑","album_id":0,"img":"http://singerimg.kugou.com/uploadpic/softhead/400/20161209/20161209164303152140.jpg","have_mv":1,"video_id":"184","author_name":"林俊杰","song_name":"江南","lyrics":"[00:00.07]林俊杰 - 江南\r\n[00:00.17]作词：李瑞洵\r\n[00:00.37]作曲：林俊杰\r\n[00:00.78]编曲：蔡政勋、陈建玮\r\n[00:37.19]风到这里就是黏\r\n[00:40.73]黏住过客的思念\r\n[00:45.04]雨到了这里缠成线\r\n[00:48.66]缠着我们留恋人世间\r\n[00:53.17]你在身边就是缘\r\n[00:56.66]缘分写在三生石上面\r\n[01:01.16]爱有万分之一甜\r\n[01:04.69]宁愿我就葬在这一点\r\n[01:09.29]圈圈圆圆圈圈\r\n[01:11.04]天天年年天天的我\r\n[01:13.76]深深看你的脸\r\n[01:16.24]生气的温柔\r\n[01:18.15]埋怨的温柔的脸\r\n[01:24.25]不懂爱恨情愁煎熬的我们\r\n[01:27.93]都以为相爱就像风云的善变\r\n[01:32.16]相信爱一天抵过永远\r\n[01:36.41]在这一刹那冻结了时间\r\n[01:40.34]不懂怎么表现温柔的我们\r\n[01:43.98]还以为殉情只是古老的传言\r\n[01:47.83]离愁能有多痛痛有多浓\r\n[01:52.43]当梦被埋在江南烟雨中\r\n[01:55.67]心碎了才懂\r\n[02:21.28]圈圈圆圆圈圈\r\n[02:22.90]天天年年天天的我\r\n[02:25.73]深深看你的脸\r\n[02:28.19]生气的温柔\r\n[02:30.11]埋怨的温柔的脸\r\n[02:36.23]不懂爱恨情愁煎熬的我们\r\n[02:39.84]都以为相爱就像风云的善变\r\n[02:44.08]相信爱一天抵过永远\r\n[02:48.29]在这一刹那冻结了时间\r\n[02:52.13]不懂怎么表现温柔的我们\r\n[02:55.87]还以为殉情只是古老的传言\r\n[02:59.81]离愁能有多痛痛有多浓\r\n[03:04.36]当梦被埋在江南烟雨中\r\n[03:07.60]心碎了才懂\r\n[03:20.15]相信爱一天抵过永远\r\n[03:24.46]在这一刹那冻结了时间\r\n[03:28.18]不懂怎么表现温柔的我们\r\n[03:31.90]还以为殉情只是古老的传言\r\n[03:35.80]离愁能有多痛痛有多浓\r\n[03:40.45]当梦被埋在江南烟雨中\r\n[03:45.75]心碎了才懂\r\n[03:57.23]哦哦哦\u2026\u2026\r\n[04:04.80]耶耶耶\u2026\u2026\r\n","author_id":"1574","privilege":8,"privilege2":"1000","play_url":"http://fs.w.kugou.com/201812091705/1c1364961fc6c99aea07031983bf2033/G004/M08/16/03/pIYBAFS-a_aAcZRBAEGtSN5wixs886.mp3","authors":[{"is_publish":"1","author_id":"1574","avatar":"20161209164303152140.jpg","author_name":"林俊杰"}],"bitrate":128}
     */
    private int status;
    private int err_code;
    private DataBean data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getErr_code() {
        return err_code;
    }

    public void setErr_code(int err_code) {
        this.err_code = err_code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            DataBean dataBean = (DataBean) o;
            return timelength == dataBean.timelength &&
                    filesize == dataBean.filesize &&
                    Objects.equals(hash, dataBean.hash) &&
                    Objects.equals(audio_name, dataBean.audio_name) &&
                    Objects.equals(author_name, dataBean.author_name) &&
                    Objects.equals(song_name, dataBean.song_name) &&
                    Objects.equals(play_url, dataBean.play_url);
        }

        @Override
        public int hashCode() {
            return Objects.hash(hash, timelength, filesize, audio_name, have_album, album_name, album_id, img, have_mv, video_id, author_name, song_name, lyrics, author_id, privilege, privilege2, play_url, bitrate, authors);
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "hash='" + hash + '\'' +
                    ", timelength=" + timelength +
                    ", filesize=" + filesize +
                    ", audio_name='" + audio_name + '\'' +
                    ", have_album=" + have_album +
                    ", album_name='" + album_name + '\'' +
                    ", album_id=" + album_id +
                    ", img='" + img + '\'' +
                    ", have_mv=" + have_mv +
                    ", video_id='" + video_id + '\'' +
                    ", author_name='" + author_name + '\'' +
                    ", song_name='" + song_name + '\'' +
                    ", lyrics='" + lyrics + '\'' +
                    ", author_id='" + author_id + '\'' +
                    ", privilege=" + privilege +
                    ", privilege2='" + privilege2 + '\'' +
                    ", play_url='" + play_url + '\'' +
                    ", bitrate=" + bitrate +
                    ", authors=" + authors +
                    '}';
        }

        /**
         * hash : 0c8d0524e09448009312b73b3adf86d3
         * timelength : 267860
         * filesize : 4304200
         * audio_name : 林俊杰 - 江南
         * have_album : 0
         * album_name : 未知专辑
         * album_id : 0
         * img : http://singerimg.kugou.com/uploadpic/softhead/400/20161209/20161209164303152140.jpg
         * have_mv : 1
         * video_id : 184
         * author_name : 林俊杰
         * song_name : 江南
         * lyrics : [00:00.07]林俊杰 - 江南
         [00:00.17]作词：李瑞洵
         [00:00.37]作曲：林俊杰
         [00:00.78]编曲：蔡政勋、陈建玮
         [00:37.19]风到这里就是黏
         [00:40.73]黏住过客的思念
         [00:45.04]雨到了这里缠成线
         [00:48.66]缠着我们留恋人世间
         [00:53.17]你在身边就是缘
         [00:56.66]缘分写在三生石上面
         [01:01.16]爱有万分之一甜
         [01:04.69]宁愿我就葬在这一点
         [01:09.29]圈圈圆圆圈圈
         [01:11.04]天天年年天天的我
         [01:13.76]深深看你的脸
         [01:16.24]生气的温柔
         [01:18.15]埋怨的温柔的脸
         [01:24.25]不懂爱恨情愁煎熬的我们
         [01:27.93]都以为相爱就像风云的善变
         [01:32.16]相信爱一天抵过永远
         [01:36.41]在这一刹那冻结了时间
         [01:40.34]不懂怎么表现温柔的我们
         [01:43.98]还以为殉情只是古老的传言
         [01:47.83]离愁能有多痛痛有多浓
         [01:52.43]当梦被埋在江南烟雨中
         [01:55.67]心碎了才懂
         [02:21.28]圈圈圆圆圈圈
         [02:22.90]天天年年天天的我
         [02:25.73]深深看你的脸
         [02:28.19]生气的温柔
         [02:30.11]埋怨的温柔的脸
         [02:36.23]不懂爱恨情愁煎熬的我们
         [02:39.84]都以为相爱就像风云的善变
         [02:44.08]相信爱一天抵过永远
         [02:48.29]在这一刹那冻结了时间
         [02:52.13]不懂怎么表现温柔的我们
         [02:55.87]还以为殉情只是古老的传言
         [02:59.81]离愁能有多痛痛有多浓
         [03:04.36]当梦被埋在江南烟雨中
         [03:07.60]心碎了才懂
         [03:20.15]相信爱一天抵过永远
         [03:24.46]在这一刹那冻结了时间
         [03:28.18]不懂怎么表现温柔的我们
         [03:31.90]还以为殉情只是古老的传言
         [03:35.80]离愁能有多痛痛有多浓
         [03:40.45]当梦被埋在江南烟雨中
         [03:45.75]心碎了才懂
         [03:57.23]哦哦哦……
         [04:04.80]耶耶耶……
         * author_id : 1574
         * privilege : 8
         * privilege2 : 1000
         * play_url : http://fs.w.kugou.com/201812091705/1c1364961fc6c99aea07031983bf2033/G004/M08/16/03/pIYBAFS-a_aAcZRBAEGtSN5wixs886.mp3
         * authors : [{"is_publish":"1","author_id":"1574","avatar":"20161209164303152140.jpg","author_name":"林俊杰"}]
         * bitrate : 128
         */

        private String hash;
        private int timelength;
        private int filesize;
        private String audio_name;
        private int have_album;
        private String album_name;
        private int album_id;
        private String img;
        private int have_mv;
        private String video_id;
        private String author_name;
        private String song_name;
        private String lyrics;
        private String author_id;
        private int privilege;
        private String privilege2;
        private String play_url;      //播放链接
        private int bitrate;
        private List<AuthorsBean> authors;

        public String getHash() {
            return hash;
        }

        public void setHash(String hash) {
            this.hash = hash;
        }

        public int getTimelength() {
            return timelength;
        }

        public void setTimelength(int timelength) {
            this.timelength = timelength;
        }

        public int getFilesize() {
            return filesize;
        }

        public void setFilesize(int filesize) {
            this.filesize = filesize;
        }

        public String getAudio_name() {
            return audio_name;
        }

        public void setAudio_name(String audio_name) {
            this.audio_name = audio_name;
        }

        public int getHave_album() {
            return have_album;
        }

        public void setHave_album(int have_album) {
            this.have_album = have_album;
        }

        public String getAlbum_name() {
            return album_name;
        }

        public void setAlbum_name(String album_name) {
            this.album_name = album_name;
        }

        public int getAlbum_id() {
            return album_id;
        }

        public void setAlbum_id(int album_id) {
            this.album_id = album_id;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public int getHave_mv() {
            return have_mv;
        }

        public void setHave_mv(int have_mv) {
            this.have_mv = have_mv;
        }

        public String getVideo_id() {
            return video_id;
        }

        public void setVideo_id(String video_id) {
            this.video_id = video_id;
        }

        public String getAuthor_name() {
            return author_name;
        }

        public void setAuthor_name(String author_name) {
            this.author_name = author_name;
        }

        public String getSong_name() {
            return song_name;
        }

        public void setSong_name(String song_name) {
            this.song_name = song_name;
        }

        public String getLyrics() {
            return lyrics;
        }

        public void setLyrics(String lyrics) {
            this.lyrics = lyrics;
        }

        public String getAuthor_id() {
            return author_id;
        }

        public void setAuthor_id(String author_id) {
            this.author_id = author_id;
        }

        public int getPrivilege() {
            return privilege;
        }

        public void setPrivilege(int privilege) {
            this.privilege = privilege;
        }

        public String getPrivilege2() {
            return privilege2;
        }

        public void setPrivilege2(String privilege2) {
            this.privilege2 = privilege2;
        }

        public String getPlay_url() {
            return play_url;
        }

        public void setPlay_url(String play_url) {
            this.play_url = play_url;
        }

        public int getBitrate() {
            return bitrate;
        }

        public void setBitrate(int bitrate) {
            this.bitrate = bitrate;
        }

        public List<AuthorsBean> getAuthors() {
            return authors;
        }

        public void setAuthors(List<AuthorsBean> authors) {
            this.authors = authors;
        }

        public static class AuthorsBean {
            /**
             * is_publish : 1
             * author_id : 1574
             * avatar : 20161209164303152140.jpg
             * author_name : 林俊杰
             */

            private String is_publish;
            private String author_id;
            private String avatar;
            private String author_name;

            public String getIs_publish() {
                return is_publish;
            }

            public void setIs_publish(String is_publish) {
                this.is_publish = is_publish;
            }

            public String getAuthor_id() {
                return author_id;
            }

            public void setAuthor_id(String author_id) {
                this.author_id = author_id;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }
        }
    }
}
