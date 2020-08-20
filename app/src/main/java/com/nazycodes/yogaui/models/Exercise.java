package com.nazycodes.yogaui.models;

import android.graphics.drawable.Drawable;

public class Exercise {
    final private String title;
    final private String description;
    final private Drawable imageDrawable;

    public Exercise(String title, String description, Drawable imageDrawable){
        this.title = title;
        this.description = description;
        this.imageDrawable = imageDrawable;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Drawable getImageDrawable() {
        return imageDrawable;
    }
}
