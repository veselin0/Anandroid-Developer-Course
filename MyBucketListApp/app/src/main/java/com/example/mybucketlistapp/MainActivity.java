package com.example.mybucketlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    CardView toDosCard;
    CardView toGoesCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toDosCard = findViewById(R.id.card_view_to_do);
        toGoesCard = findViewById(R.id.card_view_to_go);

        toDosCard.setOnClickListener(view -> {
            Intent toDoActivityIntent = new Intent(MainActivity.this, ToDoActivity.class);

            startActivity(toDoActivityIntent);
        });

        toGoesCard.setOnClickListener(view -> {
            Intent toGoActivityIntent = new Intent(MainActivity.this, ToGoActivity.class);

            startActivity(toGoActivityIntent);
        });

    }
}