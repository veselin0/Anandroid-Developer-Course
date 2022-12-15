package com.example.restaurantapp;

import androidx.annotation.NonNull;

public class StarterDish {

    String title;
    String description;
    int price;

    StarterDish(String title, String description, int price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    @NonNull
    @Override
    public String toString() {
        return title;
    }
}
