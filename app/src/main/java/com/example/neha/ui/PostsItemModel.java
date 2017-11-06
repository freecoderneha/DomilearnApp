package com.example.neha.ui;


public class PostsItemModel {
    private String date;
    private String description;
    private int image;
private String title;
    public PostsItemModel() {
    }

    public PostsItemModel(int image, String date, String description,String title) {
        this.image = image;
        this.date = date;
        this.description = description;
    this.title=title;
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

    public String getTitle(){return title;}
    public void setTitle(String title){this.title=title;}
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
