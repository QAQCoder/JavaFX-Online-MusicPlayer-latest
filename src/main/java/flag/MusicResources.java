package flag;

import base.BaseController;
import controller.LeftController;
import entity.KuGouMusicPlay;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.control.ListView;
import javafx.scene.control.TitledPane;
import node.AlbumMemberNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 * 保存当前的播放列表
 */
public class MusicResources {
    /* 单例 */
    private static MusicResources instance = null;
    private MusicResources() {
        //初始化监听
        initListener();
    }
    //单例模式
    public static MusicResources getInstance() {
        if (instance == null) {
            synchronized (MusicResources.class) {
                if (instance == null) instance = new MusicResources();
            }
        }
        return instance;
    }//getInstance

    private final int PREV_SONG = -1;
    private final int CURR_SONG = 0;
    private final int NEXT_SONG = 1;

    public final int NORMAL_MODE = 0;
    public final int SINGLE_MODE = 1;
    public final int RANDOM_MODE = 2;

    //随机音乐列表，从这里面得到，放一首就少一首
    private List<Integer> randomSongHadNoPlayed = new ArrayList<>();

    //当前的播放模式，0-正常模式，1-单曲循环，2-随机播放，默认（正常模式）
    private SimpleIntegerProperty currPlayModeProperty = new SimpleIntegerProperty(NORMAL_MODE);
    public SimpleIntegerProperty currPlayModeProperty() {
        return currPlayModeProperty;
    }
    public int getCurrPlayMode() {
        return currPlayModeProperty.get();
    }
    public void setCurrPlayMode(int playMode) {
        System.out.println("注入新的播放mode：" + playMode);
        this.currPlayModeProperty.set(playMode);
        //这里需要考虑：如果正在播放，正常模式：那么直接不管，单曲模式：那么就循环当前歌曲，随机模式：那么重新开始播放
    }

    //当前所（播放）的歌曲的索引
    private SimpleIntegerProperty currSelectIndexProperty = new SimpleIntegerProperty(0);
    public SimpleIntegerProperty currSelectIndexProperty() {
        return currSelectIndexProperty;
    }
    public int getCurrSelectIndex() {
        return currSelectIndexProperty.get();
    }
    private void setCurrSelectIndex(int c) {
        System.out.println("MusicResources---setCurrSelectIndex-->c=" + c + ", CurrSelectIndex=" + getCurrSelectIndex() + ", CurrMusicListSize=" + getCurrMusicList().size());
        if (getCurrSelectIndex() == 0 && c <= 0)    //开头
            this.currSelectIndexProperty.set(0);
        else if (getCurrSelectIndex() == getCurrMusicList().size()-1 && c > getCurrSelectIndex())   //结尾
            this.currSelectIndexProperty.set(getCurrMusicList().size()-1);
        else
            this.currSelectIndexProperty.set(c);    //正常
    }//

    //普通模式-获取下一次要播放的歌曲
    private KuGouMusicPlay.DataBean normalMode(int flag) {
        //获取当前（音乐列表）的数量
        int musicSize = getCurrMusicList().size();
        int index = getCurrSelectIndex();
        switch (flag) {
            case PREV_SONG:
                if (index <= 0) {
                    setCurrSelectIndex(0);
                } else if (index >= musicSize-1) {
                    setCurrSelectIndex(musicSize-2);
                } else {
                    setCurrSelectIndex(index-1);
                }
                break;
            case CURR_SONG:
                if (index <= 0) setCurrSelectIndex(0);
                else if (index >= musicSize-1) setCurrSelectIndex(musicSize-1);
                break;
            case NEXT_SONG:
                if (index <= 0) {
                    setCurrSelectIndex(1);
                } else if (index >= musicSize-1) {
                    setCurrSelectIndex(musicSize-1);
                } else{
                    setCurrSelectIndex(index+1);
                }
                break;
        }
        return getCurrMusicList().get(getCurrSelectIndex());
    }
    //单曲模式-获取下一次要播放的歌曲
    private KuGouMusicPlay.DataBean singleMode(int flag) {
        //每次都选择同一首歌
        return getCurrMusicList().get(getCurrSelectIndex());
    }
    //随机模式-获取下一次要播放的歌曲
    private KuGouMusicPlay.DataBean randomMode(int flag) {
        Integer nextInt;
        int leftOverSize = randomSongHadNoPlayed.size();
        //先判断随机音乐列表的数量是否大于0，是否有音乐
        if (leftOverSize <= 0) {
            //没有的话，一直循环来
            initHadPlayedList();
        }
        //获取刚刚播放完【或者正在播放】的音乐的索引，然后移除它
        randomSongHadNoPlayed.remove((Integer) getCurrSelectIndex());
        //重新计算（没有播放歌曲）的数量，从中生成一个随机索引
        int i = new Random().nextInt(randomSongHadNoPlayed.size());
        //根据（随机索引）从（没有播放歌曲）List中获取实际上对应CurrMusicList的索引
        nextInt = randomSongHadNoPlayed.get(i);

        setCurrSelectIndex(nextInt);
        return getCurrMusicList().get(getCurrSelectIndex());
    }//

    //保存当前的播放列表
    private ObjectProperty<List<KuGouMusicPlay.DataBean>> currMusicListProperty = new SimpleObjectProperty<>();
    public ObjectProperty<List<KuGouMusicPlay.DataBean>> currMusicListProperty() {
        return currMusicListProperty;
    }
    public List<KuGouMusicPlay.DataBean> getCurrMusicList() {
        return currMusicListProperty.get();
    }
    public void setCurrMusicList(List<KuGouMusicPlay.DataBean> dataBeanList) {
        System.out.println("--注入新的播放列表--");
        //这里需要注意的：虽然新歌曲来了，但是不用重设（播放模式），沿用之前的播放模式
        if (getCurrPlayMode() == RANDOM_MODE) {
            for (int i = 0; i < dataBeanList.size(); i++) randomSongHadNoPlayed.add(i);
        }
        //如果列表为null，直接set进去
        if (getCurrMusicList() == null) {
            currMusicListProperty().set(dataBeanList);
            return;
        }

        int s1 = getCurrMusicList().size();
        int s2 = dataBeanList.size();
        if (s1 == s2) {
            boolean b1 = Objects.equals(getCurrMusicList().get(0), dataBeanList.get(0));
            boolean b2 = Objects.equals(getCurrMusicList().get(s1/2), dataBeanList.get(s2/2));
            if(b1 && b2) System.out.println("----播放列表相同，不能重复添加----");
        }
        else currMusicListProperty().set(dataBeanList);
    }//

    public void setCurrMusicList(KuGouMusicPlay.DataBean dataBean) {
        List<KuGouMusicPlay.DataBean> temp = new ArrayList<>();
        temp.add(dataBean);
        setCurrMusicList(temp);
    }

    /**
     * 新列表来了，更新[播放列表]收藏夹
     */
    /*private void initVisualPlayList() {
        TitledPane pane =
                ((LeftController) BaseController.BC_CONTEXT.get(LeftController.class.getName())).getTitledPane("播放列表");

        ListView<AlbumMemberNode> listView = (ListView<AlbumMemberNode>) pane.getContent();
    }//*/

    private void initListener() {
        //监听播放模式的改变
        currPlayModeProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("listener-注入新的播放mode");
            if (newValue == null) return;
            if (null == getCurrMusicList() || 0 == getCurrMusicList().size()) return;

            //判断新的模式是什么
            switch (getCurrPlayMode()) {
                case NORMAL_MODE:   //正常模式
                    setCurrSelectIndex(0);
                    play(CURR_SONG);
                    break;
                case SINGLE_MODE:   //当前歌曲--单曲播放
                    play(CURR_SONG);
                    break;
                case RANDOM_MODE:   //只要是点了随机播放，统统清除以前的标志，相当于一个全新的歌曲List
                    setCurrSelectIndex(0);
                    initHadPlayedList();
                    play(CURR_SONG);
                    break;
            }
        });
        //监听播放列表数据的改变
        currMusicListProperty.addListener((observable, oldValue, newValue) -> {
            System.out.println("listener-注入新的播放列表");
            setCurrSelectIndex(0);
            if (newValue != null) play(CURR_SONG);
        });
        //监听选择
        currSelectIndexProperty.addListener((observable, oldValue, newValue) -> {
            System.out.println("currSelectIndex-选择音乐改变--" + newValue.intValue());
            if (currentSelectIndexCallback != null) {
                currentSelectIndexCallback.selectWhat(newValue.intValue());
            }
        });
    }

    private void initHadPlayedList() {
        randomSongHadNoPlayed.clear();
        for (int i = 0; i < getCurrMusicList().size(); i++) randomSongHadNoPlayed.add(i);
    }//

    /**
     * 1，当设置了新的播放模式，调用这个方法, 播放模式，0-正常模式，1-单曲循环，2-随机播放
     * 2，当有新歌曲列表到达，调用这个方法
     * @param flag 播放下一首，还是当前首，还是上一首
     */
    private void play(int flag) {
        if (getCurrMusicList().size() == 1 && getCurrPlayMode() != SINGLE_MODE) return;

        switch (getCurrPlayMode()) {
            case NORMAL_MODE: //正常模式
                System.out.println("正常模式");
                callback.playIt(normalMode(flag), true);
                break;
            case SINGLE_MODE: //单曲循环
                System.out.println("单曲循环");
                callback.playIt(singleMode(flag), true);
                break;
            case RANDOM_MODE: //随机播放
                System.out.println("随机播放");
                callback.playIt(randomMode(flag), true);
                break;
        }
    }//

    //播放歌曲回调
    private PlayNextCallback callback = null;
    public interface PlayNextCallback {
        void playIt(KuGouMusicPlay.DataBean musicBean, boolean playOrPause);
    }
    public void setCallback(PlayNextCallback callback) {
        this.callback = callback;
    }

    private static CurrentSelectIndexCallback currentSelectIndexCallback = null;
    public interface CurrentSelectIndexCallback {
        void selectWhat(int index);
    }
    public void setSelectIndexCallback(CurrentSelectIndexCallback selectIndexCallback) {
        currentSelectIndexCallback = selectIndexCallback;
    }

    //返回当前播放的歌曲
    public KuGouMusicPlay.DataBean getCurrPlayingSong() {
        return getCurrMusicList().get(getCurrSelectIndex());
    }

    /**
     * 播放下一首歌，由MyPlayerChangeListener调用，
     */
    public void nextSong() { //参数1，表示下一首
        play(NEXT_SONG);
    }//
    /**
     * 播放上一首歌
     */
    public void prevSong() {//参数-1，表示上一首
        play(PREV_SONG);
    }//
    /**
     * 播放当前歌
     */
    public void currSong() {//参数0，当前首
        play(CURR_SONG);
    }//
};
