package com.example.restaurantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.lights.LightState;
import android.os.Bundle;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);

        String[] starterDishes = {
                "Nori and black pepper soup",
                "Tofu and coconut soup",
                "Tuna and truffle soup",
                "Jalapeno and apple gyoza",
                "Garam masala and ricotta parcels",
                "Kiwi fruit and chilli dip",
                "Vermicelli and celeriac soup",
                "Trout and spinach wontons",
                "Nectarine and cardamom dumplings",
                "Mustard seed and pepper soup",
                "Pigeon and spinach soup",
                "Lamb and samphire soup",
                "Tofu and ricotta gyoza",
                "Parsley and trout dumplings",
                "Cabbage and garam masala gyoza",
                "Kohlrabi and orange soup",
                "Saffron and sprout soup",
                "Tofu and pepper uramaki",
                "Shrimp and lemon soup",
                "Parsley and sweetcorn gyoza"
        };
    }
}