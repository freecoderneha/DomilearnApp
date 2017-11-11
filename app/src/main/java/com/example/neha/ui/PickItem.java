package com.example.neha.ui;

public class PickItem {
    String name;//title
    int thumbnail;//image
    int view;//view scrim
    int color;
    int id;

    public PickItem(String name, int thumbnail, int view,int color) {
        this.name = name;
        this.thumbnail = thumbnail;
        this.view = view;
        this.color=color;
    }
    public PickItem(String name, int thumbnail, int view) {
        this.name = name;
        this.thumbnail = thumbnail;
        this.view = view;
    }
    public PickItem() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}