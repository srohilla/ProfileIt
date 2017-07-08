package com.example.seemarohilla.resume277;

/**
 * Created by seemarohilla on 3/9/17.
 */

public class Skill {

    private final String name;
    private final String level;
    private final int imageResource;


    public Skill(String name, String level, int imageResource) {
        this.name = name;
         this.level=level;
        this.imageResource = imageResource;

    }

    public String getName() {
        return name;
    }


    public int getImageResource() {
        return imageResource;
    }

    public String getLevel() {
        return level;
    }
}
