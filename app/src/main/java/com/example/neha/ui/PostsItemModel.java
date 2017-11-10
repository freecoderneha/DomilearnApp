package com.example.neha.ui;


public class PostsItemModel {
    private String date;
    private String description;
    private int image;
private String title;
    private String aimed;
    public PostsItemModel() {
    }

    public PostsItemModel(int image, String date, String description,String title,String aimed) {
        this.image = image;
        this.date = date;
        this.description = description;
    this.title=title;
        this.aimed=aimed;
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
    public String getAimed(){return aimed;}
    public void setAimed(String aimed){this.aimed=aimed;}
}
