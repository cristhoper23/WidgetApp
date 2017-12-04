package com.cristhoper.listviewactivity.models;

/**
 * Created by Cris on 4/12/2017.
 */

public class ListItem {
    private String heading;
    private String content;
    private int image;

    public ListItem(String heading, String content, int image) {
        this.heading = heading;
        this.content = content;
        this.image = image;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ListItem{" +
                "heading='" + heading + '\'' +
                ", content='" + content + '\'' +
                ", image=" + image +
                '}';
    }
}
