package xyz.moechat.uixml;

/**
 * Created by timeloveboy on 16/2/7.
 */
public class IconText{
    public String getName() {
        return name;
    }

    String name;

    public int getImageId() {
        return imageId;
    }

    int imageId;

    public IconText(String name,int imageId) {
        this.name = name;
        this.imageId=imageId;
    }
}