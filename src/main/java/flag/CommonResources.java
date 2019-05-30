package flag;

import entity.KuGouMusicPlay;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import node.MyImageView;
import node.SongListMember;
import view.PlayListsView;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：公共资源
 */
public class CommonResources {

    public static final ImageView IMAGE_PAUSE = new ImageView("img/player_icon/1_pause2.png");
    public static final ImageView IMAGE_PLAYING = new ImageView("img/player_icon/5_playing.png");
    public static final String KUGOU_ICON = "icon/search_music_icon_2.png";

    //三个播放模式
    public static final ImageView IMAGE_NORMAL_MODE = new MyImageView("icon/music_control/循环-1.png");
    public static final ImageView IMAGE_SINGLE_MODE = new MyImageView("icon/music_control/少儿-音频单曲循环.png");
    public static final ImageView IMAGE_RANDOM_MODE = new MyImageView("icon/music_control/随机-1.png");

    public static final ImageView IMAGE_LIKE_WHITE = new MyImageView("icon/music_control/收藏-white.png");
    public static final ImageView IMAGE_LIKE_RED = new MyImageView("icon/music_control/收藏-red.png");

    public static final Integer pageSize = 10; //每页的歌曲显示数目

    public static boolean isPaginationInit = false; //是否pagination应该setFactory

    //当前应该选择的url
    public static int currSelUrl = 0;
    //当前的classId，即歌单的ID
    public static int specialid = -1;
    //当前的singerId，即歌手的ID
    public static int singerId  = -1;

    //记录搜索事件是否已经完成，不能在第一次搜索没结束时开始第二波搜索
    public static boolean isSearchDone = true;  //第一次为true，允许搜索
    //记录分页控件的数据请求是否完成，不能在第一次请求没结束就开始第二波请求
    public static boolean isPaginationDone = true;  //第一次为true，允许搜索
    //是否歌手信息请求完成
    public static boolean isSingerRefreshDone = true;  //第一次为true，允许搜索

    //leftPane的动画时间，默认350毫秒
    public static double animationDuration = 0.35;

    //
    public static final Background BACKGROUND_A = new Background(new BackgroundFill(Color.rgb(212, 212, 212), null, null));
    public static final Background BACKGROUND_B = new Background(new BackgroundFill(Color.rgb(185, 185, 185), null, null));
    //
    public static final Background BACKGROUND_HOVER = new Background(new BackgroundFill(Color.valueOf("#919191"),null, null));
    public static final Background BACKGROUND_NORMAL = new Background(new BackgroundFill(Color.LIGHTGRAY, null, null));
//    public static final Background BACKGROUND_TRANSPARENT = new Background(new BackgroundFill(Color.TRANSPARENT, null, null));

//    public static final MaterialIconView FONTAWESOME_PLAY_ICON = new MaterialIconView(MaterialIcon.PAUSE_CIRCLE_OUTLINE);
//    public static final MaterialIconView FONTAWESOME_PAUSE_ICON = new MaterialIconView(MaterialIcon.PLAY_CIRCLE_OUTLINE);
//    public static final MaterialIconView FONTAWESOME_DELETE_ICON = new MaterialIconView(MaterialIcon.DELETE);

    //当前选择的音乐bean
    public static KuGouMusicPlay.DataBean currMusicBean = null;

    //
    public static double currVolume = 0.5;

    private static final ImageView image = new ImageView();
    public static ImageView getNode() {
        image.setFitHeight(0);
        image.setFitWidth(0);
        return image;
    }//

    public static class QuickPlayListsView {
        private static PlayListsView playListsView = null;
        public static PlayListsView getPlayListsView() {
            if (playListsView == null) playListsView = new PlayListsView();
            if (playListsView.isItemsEmpty()) playListsView.setNodeList(handleNode());
            return playListsView;
        }//

        public static void notifyDataUpdate() {
            if (playListsView == null) playListsView = new PlayListsView();
            playListsView.setNodeList(handleNode());
            playListsView.refreshView();
        }

        private static List<SongListMember> handleNode() {
            List<SongListMember> listMembers = new ArrayList<>();
            List<KuGouMusicPlay.DataBean> currMusicList = MusicResources.getInstance().getCurrMusicList();
            if (currMusicList != null && currMusicList.size() > 0) {
                Stream.iterate(0, i -> i+1).limit(MusicResources.getInstance().getCurrMusicList().size()).forEach(i -> {
                    listMembers.add(new SongListMember(i+1, currMusicList.get(i)));
                });
            }
            System.out.println("歌曲总数：" + listMembers.size());
            return listMembers;
        }//

        public static MusicResources.CurrentSelectIndexCallback callback = index -> {
            playListsView.setSelectOfListView(index);
        };
    }//

    public static boolean isNetworkOK(Exception e) {
        boolean flag = false;
        if (e instanceof UnknownHostException) {
            flag = true;
        }
        return flag;
    };
}
