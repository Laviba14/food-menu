package com.example.foodmenu;

public class FoodItem {
    private String name;
    private String price;
    private int imageResource;

    // Constructor
    public FoodItem(String name, String price, int imageResource) {
        this.name = name;
        this.price = price;
        this.imageResource = imageResource;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public int getImageResource() {
        return imageResource;
    }
}

