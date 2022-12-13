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
    }
}