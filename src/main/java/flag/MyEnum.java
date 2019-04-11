package flag;

public enum  MyEnum {
    SEARCH_MUSIC_URL(0), SINGER_INFO_URL(1) , SONG_LIST_URL(2);

    private int id;
    MyEnum(int id) {
        this.id = id;
    }
}
