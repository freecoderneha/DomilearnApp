package com.example.neha.ui;


public class SingleItemModel {


    private String date;
    private String description;
    private String created;
    private int image;

    public SingleItemModel() {
    }

    public SingleItemModel(int image, String date, String description, String created) {
        this.image = image;
        this.date = date;
        this.description = description;
        this.created = created;
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


    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

}