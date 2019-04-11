package entity;

/**
 * 收藏夹实体类
 */
public class CollectionAlbum {

    private int id;
    private String collectionName;
    private String createDate;
    private String albumName;

    public CollectionAlbum() {
    }

    public CollectionAlbum(int id, String collectionName, String createDate, String albumName) {
        this.id = id;
        this.collectionName = collectionName;
        this.createDate = createDate;
        this.albumName = albumName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    @Override
    public String toString() {
        return "CollectionAlbum{" +
                "id=" + id +
                ", collectionName='" + collectionName + '\'' +
                ", createDate='" + createDate + '\'' +
                ", albumName='" + albumName + '\'' +
                '}';
    }
}
