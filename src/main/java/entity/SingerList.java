package entity;

import java.io.Serializable;
import java.util.List;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public class SingerList implements Serializable {
    /**
     * JS_CSS_DATE : 20130320
     * kg_domain : http://m.kugou.com
     * src : http://downmobile.kugou.com/promote/package/download/channel=6
     * fr : null
     * ver : v3
     * classid : 88
     * classname : 热门歌手
     * singers : {"total":50,"list":{"total":50,"info":[{"singerid":3520,"singername":"周杰伦","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180515/20180515002522714.jpg"},{"singerid":3060,"singername":"薛之谦","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20190103/20190103191232626.jpg"},{"singerid":1574,"singername":"林俊杰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161209/20161209164303152140.jpg"},{"singerid":3521,"singername":"张学友","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140527/20140527095042283066.jpg"},{"singerid":1573,"singername":"刘德华","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180507/20180507120242140.jpg"},{"singerid":722869,"singername":"毛不易","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180611/20180611160019456.jpg"},{"singerid":4490,"singername":"G.E.M.邓紫棋","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20181122/20181122091128804.jpg"},{"singerid":3539,"singername":"张杰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20181010/20181010161310788.jpg"},{"singerid":730,"singername":"刀郎","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20190115/20190115150401884.jpg"},{"singerid":761096,"singername":"花姐","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20171128/20171128003758522.jpg"},{"singerid":86268,"singername":"花粥","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20150313/20150313181756934986.jpg"},{"singerid":86281,"singername":"庄心妍","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20181214/20181214230032948.jpg"},{"singerid":420,"singername":"陈奕迅","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180622/20180622193316603.jpg"},{"singerid":552828,"singername":"半阳","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20181116/20181116190719480.jpg"},{"singerid":3538,"singername":"郑源","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160418/20160418100508296.jpg"},{"singerid":1383,"singername":"黄家驹","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140219/20140219104100727871.jpg"},{"singerid":5838,"singername":"孙露","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20190114/20190114184049260.jpg"},{"singerid":3047,"singername":"许嵩","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180906/20180906181115284.jpg"},{"singerid":7633,"singername":"凤凰传奇","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180530/20180530091046423.jpg"},{"singerid":93723,"singername":"TFBOYS","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180518/20180518110342985.jpg"},{"singerid":2725,"singername":"王杰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160910/20160910145826790.jpg"},{"singerid":1900,"singername":"冷漠","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160422/20160422165257968614.jpg"},{"singerid":3537,"singername":"张宇","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140409/20140409111100508089.jpg"},{"singerid":93475,"singername":"李荣浩","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180709/20180709171823942.jpg"},{"singerid":4484,"singername":"邓丽君","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140118/20140118112603422807.jpg"},{"singerid":90875,"singername":"华晨宇","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161107/20161107114457862.jpg"},{"singerid":642487,"singername":"虎二","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180521/20180521175618738.jpg"},{"singerid":3523,"singername":"张国荣","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160909/20160909203241500.jpg"},{"singerid":832532,"singername":"阿悠悠","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20190125/20190125153448270.jpg"},{"singerid":574839,"singername":"张云雷","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180914/20180914154758901.jpg"},{"singerid":86660,"singername":"吴青峰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180524/20180524095815311.jpg"},{"singerid":84746,"singername":"祁隆","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180315/20180315145642277.jpg"},{"singerid":157295,"singername":"王源","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180913/20180913135054726.jpg"},{"singerid":185839,"singername":"白小白","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180808/20180808180400236.jpg"},{"singerid":7249,"singername":"BEYOND","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160418/20160418100531196.jpg"},{"singerid":3525,"singername":"张信哲","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20181109/20181109143841244.jpg"},{"singerid":6808,"singername":"张靓颖","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170628/20170628110356447.jpg"},{"singerid":2627,"singername":"谭咏麟","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161206/20161206191326535303.jpg"},{"singerid":2724,"singername":"王力宏","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170602/20170602104911895.jpg"},{"singerid":5086,"singername":"刘若英","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180522/20180522140939882.jpg"},{"singerid":6076,"singername":"王菲","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180731/20180731105329370.jpg"},{"singerid":192980,"singername":"蔡徐坤","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180914/20180914090440481.jpg"},{"singerid":2404,"singername":"任贤齐","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161121/20161121143819177813.jpg"},{"singerid":2018,"singername":"李玉刚","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20181224/20181224183453372.jpg"},{"singerid":4260,"singername":"陈瑞","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180608/20180608112132930.jpg"},{"singerid":2726,"singername":"汪峰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170331/20170331235553531.jpg"},{"singerid":6811,"singername":"张韶涵","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180517/20180517110709452.jpg"},{"singerid":1576,"singername":"李宗盛","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20150128/20150128172400104783.jpg"},{"singerid":6535,"singername":"杨千嬅","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180514/20180514164650204.jpg"},{"singerid":3043,"singername":"许巍","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180718/20180718155808969.jpg"}]},"pagesize":50,"page":1}
     * pagesize : 30
     * __Tpl : singer/list.html
     */
    private int JS_CSS_DATE;
    private String kg_domain;
    private String src;
    private Object fr;
    private String ver;
    private int classid;
    private String classname;
    private SingersBean singers;
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

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public SingersBean getSingers() {
        return singers;
    }

    public void setSingers(SingersBean singers) {
        this.singers = singers;
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

    public static class SingersBean {
        /**
         * total : 50
         * list : {"total":50,"info":[{"singerid":3520,"singername":"周杰伦","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180515/20180515002522714.jpg"},{"singerid":3060,"singername":"薛之谦","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20190103/20190103191232626.jpg"},{"singerid":1574,"singername":"林俊杰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161209/20161209164303152140.jpg"},{"singerid":3521,"singername":"张学友","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140527/20140527095042283066.jpg"},{"singerid":1573,"singername":"刘德华","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180507/20180507120242140.jpg"},{"singerid":722869,"singername":"毛不易","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180611/20180611160019456.jpg"},{"singerid":4490,"singername":"G.E.M.邓紫棋","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20181122/20181122091128804.jpg"},{"singerid":3539,"singername":"张杰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20181010/20181010161310788.jpg"},{"singerid":730,"singername":"刀郎","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20190115/20190115150401884.jpg"},{"singerid":761096,"singername":"花姐","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20171128/20171128003758522.jpg"},{"singerid":86268,"singername":"花粥","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20150313/20150313181756934986.jpg"},{"singerid":86281,"singername":"庄心妍","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20181214/20181214230032948.jpg"},{"singerid":420,"singername":"陈奕迅","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180622/20180622193316603.jpg"},{"singerid":552828,"singername":"半阳","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20181116/20181116190719480.jpg"},{"singerid":3538,"singername":"郑源","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160418/20160418100508296.jpg"},{"singerid":1383,"singername":"黄家驹","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140219/20140219104100727871.jpg"},{"singerid":5838,"singername":"孙露","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20190114/20190114184049260.jpg"},{"singerid":3047,"singername":"许嵩","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180906/20180906181115284.jpg"},{"singerid":7633,"singername":"凤凰传奇","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180530/20180530091046423.jpg"},{"singerid":93723,"singername":"TFBOYS","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180518/20180518110342985.jpg"},{"singerid":2725,"singername":"王杰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160910/20160910145826790.jpg"},{"singerid":1900,"singername":"冷漠","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160422/20160422165257968614.jpg"},{"singerid":3537,"singername":"张宇","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140409/20140409111100508089.jpg"},{"singerid":93475,"singername":"李荣浩","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180709/20180709171823942.jpg"},{"singerid":4484,"singername":"邓丽君","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140118/20140118112603422807.jpg"},{"singerid":90875,"singername":"华晨宇","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161107/20161107114457862.jpg"},{"singerid":642487,"singername":"虎二","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180521/20180521175618738.jpg"},{"singerid":3523,"singername":"张国荣","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160909/20160909203241500.jpg"},{"singerid":832532,"singername":"阿悠悠","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20190125/20190125153448270.jpg"},{"singerid":574839,"singername":"张云雷","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180914/20180914154758901.jpg"},{"singerid":86660,"singername":"吴青峰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180524/20180524095815311.jpg"},{"singerid":84746,"singername":"祁隆","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180315/20180315145642277.jpg"},{"singerid":157295,"singername":"王源","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180913/20180913135054726.jpg"},{"singerid":185839,"singername":"白小白","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180808/20180808180400236.jpg"},{"singerid":7249,"singername":"BEYOND","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160418/20160418100531196.jpg"},{"singerid":3525,"singername":"张信哲","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20181109/20181109143841244.jpg"},{"singerid":6808,"singername":"张靓颖","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170628/20170628110356447.jpg"},{"singerid":2627,"singername":"谭咏麟","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161206/20161206191326535303.jpg"},{"singerid":2724,"singername":"王力宏","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170602/20170602104911895.jpg"},{"singerid":5086,"singername":"刘若英","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180522/20180522140939882.jpg"},{"singerid":6076,"singername":"王菲","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180731/20180731105329370.jpg"},{"singerid":192980,"singername":"蔡徐坤","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180914/20180914090440481.jpg"},{"singerid":2404,"singername":"任贤齐","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161121/20161121143819177813.jpg"},{"singerid":2018,"singername":"李玉刚","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20181224/20181224183453372.jpg"},{"singerid":4260,"singername":"陈瑞","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180608/20180608112132930.jpg"},{"singerid":2726,"singername":"汪峰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170331/20170331235553531.jpg"},{"singerid":6811,"singername":"张韶涵","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180517/20180517110709452.jpg"},{"singerid":1576,"singername":"李宗盛","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20150128/20150128172400104783.jpg"},{"singerid":6535,"singername":"杨千嬅","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180514/20180514164650204.jpg"},{"singerid":3043,"singername":"许巍","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180718/20180718155808969.jpg"}]}
         * pagesize : 50
         * page : 1
         */

        private int total;
        private ListBean list;
        private int pagesize;
        private int page;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public ListBean getList() {
            return list;
        }

        public void setList(ListBean list) {
            this.list = list;
        }

        public int getPagesize() {
            return pagesize;
        }

        public void setPagesize(int pagesize) {
            this.pagesize = pagesize;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public static class ListBean {
            /**
             * total : 50
             * info : [{"singerid":3520,"singername":"周杰伦","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180515/20180515002522714.jpg"},{"singerid":3060,"singername":"薛之谦","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20190103/20190103191232626.jpg"},{"singerid":1574,"singername":"林俊杰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161209/20161209164303152140.jpg"},{"singerid":3521,"singername":"张学友","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140527/20140527095042283066.jpg"},{"singerid":1573,"singername":"刘德华","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180507/20180507120242140.jpg"},{"singerid":722869,"singername":"毛不易","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180611/20180611160019456.jpg"},{"singerid":4490,"singername":"G.E.M.邓紫棋","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20181122/20181122091128804.jpg"},{"singerid":3539,"singername":"张杰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20181010/20181010161310788.jpg"},{"singerid":730,"singername":"刀郎","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20190115/20190115150401884.jpg"},{"singerid":761096,"singername":"花姐","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20171128/20171128003758522.jpg"},{"singerid":86268,"singername":"花粥","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20150313/20150313181756934986.jpg"},{"singerid":86281,"singername":"庄心妍","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20181214/20181214230032948.jpg"},{"singerid":420,"singername":"陈奕迅","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180622/20180622193316603.jpg"},{"singerid":552828,"singername":"半阳","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20181116/20181116190719480.jpg"},{"singerid":3538,"singername":"郑源","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160418/20160418100508296.jpg"},{"singerid":1383,"singername":"黄家驹","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140219/20140219104100727871.jpg"},{"singerid":5838,"singername":"孙露","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20190114/20190114184049260.jpg"},{"singerid":3047,"singername":"许嵩","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180906/20180906181115284.jpg"},{"singerid":7633,"singername":"凤凰传奇","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180530/20180530091046423.jpg"},{"singerid":93723,"singername":"TFBOYS","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180518/20180518110342985.jpg"},{"singerid":2725,"singername":"王杰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160910/20160910145826790.jpg"},{"singerid":1900,"singername":"冷漠","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160422/20160422165257968614.jpg"},{"singerid":3537,"singername":"张宇","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140409/20140409111100508089.jpg"},{"singerid":93475,"singername":"李荣浩","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180709/20180709171823942.jpg"},{"singerid":4484,"singername":"邓丽君","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20140118/20140118112603422807.jpg"},{"singerid":90875,"singername":"华晨宇","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161107/20161107114457862.jpg"},{"singerid":642487,"singername":"虎二","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180521/20180521175618738.jpg"},{"singerid":3523,"singername":"张国荣","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160909/20160909203241500.jpg"},{"singerid":832532,"singername":"阿悠悠","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20190125/20190125153448270.jpg"},{"singerid":574839,"singername":"张云雷","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180914/20180914154758901.jpg"},{"singerid":86660,"singername":"吴青峰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180524/20180524095815311.jpg"},{"singerid":84746,"singername":"祁隆","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180315/20180315145642277.jpg"},{"singerid":157295,"singername":"王源","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180913/20180913135054726.jpg"},{"singerid":185839,"singername":"白小白","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180808/20180808180400236.jpg"},{"singerid":7249,"singername":"BEYOND","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20160418/20160418100531196.jpg"},{"singerid":3525,"singername":"张信哲","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20181109/20181109143841244.jpg"},{"singerid":6808,"singername":"张靓颖","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170628/20170628110356447.jpg"},{"singerid":2627,"singername":"谭咏麟","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161206/20161206191326535303.jpg"},{"singerid":2724,"singername":"王力宏","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170602/20170602104911895.jpg"},{"singerid":5086,"singername":"刘若英","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180522/20180522140939882.jpg"},{"singerid":6076,"singername":"王菲","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180731/20180731105329370.jpg"},{"singerid":192980,"singername":"蔡徐坤","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180914/20180914090440481.jpg"},{"singerid":2404,"singername":"任贤齐","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20161121/20161121143819177813.jpg"},{"singerid":2018,"singername":"李玉刚","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20181224/20181224183453372.jpg"},{"singerid":4260,"singername":"陈瑞","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180608/20180608112132930.jpg"},{"singerid":2726,"singername":"汪峰","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20170331/20170331235553531.jpg"},{"singerid":6811,"singername":"张韶涵","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180517/20180517110709452.jpg"},{"singerid":1576,"singername":"李宗盛","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20150128/20150128172400104783.jpg"},{"singerid":6535,"singername":"杨千嬅","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180514/20180514164650204.jpg"},{"singerid":3043,"singername":"许巍","imgurl":"http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180718/20180718155808969.jpg"}]
             */

            private int total;
            private List<InfoBean> info;

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
                /**
                 * singerid : 3520
                 * singername : 周杰伦
                 * imgurl : http://singerimg.kugou.com/uploadpic/pass/softhead/{size}/20180515/20180515002522714.jpg
                 */

                private int singerid;
                private String singername;
                private String imgurl;

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

                public String getImgurl() {
                    return imgurl;
                }

                public void setImgurl(String imgurl) {
                    this.imgurl = imgurl;
                }
            }
        }
    }
}
