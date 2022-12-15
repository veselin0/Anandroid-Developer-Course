package com.example.restaurantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.lights.LightState;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);

        StarterDish[] starterDishes = {
                new StarterDish("Melon and lemon soup", "Fresh melon and lemon combined into creamy soup", 1199),
                new StarterDish("Coconut and chocolate mousse", "A creamy mousse made with fresh coconut and milk chocolate", 899),
                new StarterDish("Spinach and cabbage wontons", "Thin wonton cases stuffed with fresh spinach and chinese cabbage", 799),
                new StarterDish("Broccoli and cucumber soup", "Fresh broccoli and cucumber combined into creamy soup", 899),
                new StarterDish("Chilli and aubergine dip", "A dip made from scotch bonnet chilli and fresh aubergine", 999),
                new StarterDish("Chickpea and chilli gyoza", "Thin pastry cases stuffed with fresh chickpea and green chilli", 699),
                new StarterDish("Sprout and pineapple soup", "Fresh sprout and pineapple combined into creamy soup", 899),
                new StarterDish("Egusi and borscht soup", "Egusi and borscht combined into creamy soup", 1299)
        };




        ArrayAdapter<StarterDish> starterDishesAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, starterDishes);

        startersList.setAdapter(starterDishesAdapter);

    }
}