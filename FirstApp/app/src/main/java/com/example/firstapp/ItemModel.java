package com.example.firstapp;

public class ItemModel {

    String Name;
    String Type;
    int Image;

    //class untuk inisiasi item yang digunakan pada spinner

    public ItemModel(String name, String type, int image) {
        Name = name;
        Type = type;
        Image = image;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
