package utils;

import entity.KuGouMusicPlay;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.AudioHeader;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：扫描本地歌曲
 */
public class ScanLocalSong {

    private static ScanLocalSong instance = null;
    private ScanLocalSong() {}
    public static ScanLocalSong getInstance() {
        if (instance == null) {
            synchronized (ScanLocalSong.class) {
                if (instance == null) instance = new ScanLocalSong();
            }
        }
        return instance;
    }

    public List<File> getSongs(String path) {
        File file = new File(path);
        if (!file.exists())
            throw new IllegalArgumentException("路径不存在");

        if (file.isDirectory()) {
            LinkedList<File> linkedList = new LinkedList<>();
            List<File> allFiles = new ArrayList<>();
            File[] files = file.listFiles();
            Arrays.stream(files).forEach(item -> {
                if (item.isDirectory()) {
                    linkedList.add(item);
                } else if (isSupportedFileType(item.getName())){
                    allFiles.add(item);
                }
            });

            while (!linkedList.isEmpty()) {
                File temp = linkedList.removeFirst();
                File[] listFiles = temp.listFiles();
                Arrays.stream(listFiles).forEach(item -> {
                    if (item.isDirectory())
                        linkedList.add(item);
                    else if (isSupportedFileType(item.getName()))
                        allFiles.add(item);
                });
            }

            return allFiles;
        }

        return null;
    }

    @Test
    public void fun() {
        getSongs("D:/A_我的文件/音乐").forEach(System.out::println);
    }

    /**
     * 代码来自：https://github.com/Mpmart08/MusicPlayer
     * @param fileName
     * @return
     */
    public boolean isSupportedFileType(String fileName) {

        String extension = "";
        int i = fileName.lastIndexOf('.');
        if (i > 0) {
            extension = fileName.substring(i+1).toLowerCase();
        }
        switch (extension) {
            case "mp3":
//            case "mp4":
            case "m4a":
//            case "m4v":
            case "wav":
                return true;
            default:
                return false;
        }
    }//

    /**
     * 把List<File>转成List<KuGouMusicPlay.DataBean>
     * @param fileList 目标List<File>
     * @return
     */
    public List<KuGouMusicPlay.DataBean> convertFilesToDataBean(List<File> fileList) {
        if (null == fileList || fileList.isEmpty())
            throw new IllegalArgumentException("ScanLocalSong---convertFilesToDataBean--fileList为空");

        List<KuGouMusicPlay.DataBean> beanList = new ArrayList<>();
        fileList.forEach(file -> {
            //解析音乐，得到相应数据
            beanList.add(readSongFileInfo(file));
        });
        return beanList;
    }

    /*@Test
    public void fun2() {
//        File file = new File("D:\\A_我的文件\\音乐\\Angela Ammons - Always Getting Over You.mp3");
//        File file = new File("D:\\A_我的文件\\音乐\\A-Lin - 幸福了 然后呢.mp3");

        List<File> fileList = getSongs("D:/A_我的文件/音乐");
        fileList.stream().forEach(file1 -> {
            KuGouMusicPlay.DataBean bean = readSongFileInfo(file1);
            if (null == bean) return;
            *//*System.out.println(bean.getSong_name());
            System.out.println(bean.getPlay_url());
            System.out.println(bean.getAuthor_name());
            System.out.println(bean.getTimelength());
            System.out.println(bean.getAudio_name());
            System.out.println("\n");*//*
        });
    }*/

    static {
        //Disable loggers
        Logger[] loggers = {Logger.getLogger("org.jaudiotagger")};
        for (Logger l : loggers)
            l.setLevel(Level.OFF);
    }

    private KuGouMusicPlay.DataBean readSongFileInfo(File file) {
        try {
            AudioFile audioFile = AudioFileIO.read(file);
            Tag tag = audioFile.getTag();
//            System.out.println("tag: " + tag);
            if (null == tag) {
                return null;
            }
            AudioHeader audioHeader = audioFile.getAudioHeader();
            KuGouMusicPlay.DataBean bean = new KuGouMusicPlay.DataBean();

            String title = tag.getFirst(FieldKey.TITLE);
            bean.setAudio_name(file.getName().substring(0, file.getName().indexOf(".")));
            if (null == title || "".equals(title)) {
                bean.setSong_name(bean.getAudio_name().substring(bean.getAudio_name().indexOf("-")+1));
            } else {
                bean.setSong_name(title);
            }
            String artistTitle = tag.getFirst(FieldKey.ALBUM_ARTIST);
            if (artistTitle == null || artistTitle.equals("") || artistTitle.equals("null")) {
                bean.setAuthor_name("未知");
            } else {
                bean.setAuthor_name(artistTitle);
            }
            bean.setAlbum_name(tag.getFirst(FieldKey.ALBUM));
            bean.setTimelength(audioHeader.getTrackLength()*1000);

            //使用UUID生成hash
            bean.setHash(UUID.randomUUID().toString());
            bean.setPlay_url(file.toURI().toString());
            bean.setImg("icon/音乐-1.png");

            return bean;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }//
}
