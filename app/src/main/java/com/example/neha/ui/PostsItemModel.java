package com.example.neha.ui;


public class PostsItemModel {
    private String date;
    private String description;
    private int image;

    public PostsItemModel() {
    }

    public PostsItemModel(int image, String date, String description) {
        this.image = image;
        this.date = date;
        this.description = description;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
