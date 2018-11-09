package com.example.rakshitha.farmersfriend;

public class Farmers {
    String name,desc;
    double price;
    int id;
    int image;

    public Farmers(String name, String desc, double price, int id, int image) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.id = id;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public int getImage() {
        return image;
    }
}
