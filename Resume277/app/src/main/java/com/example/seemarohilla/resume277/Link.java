package com.example.seemarohilla.resume277;

/**
 * Created by seemarohilla on 3/10/17.
 */

public class Link {
    private final String name;
    private final String type;
    private final int imageResource;
    private final String url;



    public Link(String name, String type, int imageResource , String url) {
        this.name = name;
        this.type=type;
        this.imageResource = imageResource;
        this.url=url;

    }

    public String getName() {
        return name;
    }


    public int getImageResource() {
        return imageResource;
    }

    public String getLevel() {
        return type;
    }
    public String getUrl() {
        return url;
    }
}