package com.example.mybucketlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_go);

        RecyclerView list = findViewById(R.id.recycler_view_items);

        BucketItem[] items = {

                new BucketItem("A trip to Madagascar", "Make a one month trip to Madagascar", R.drawable.madagascar ),
                new BucketItem("Visit Toronto", "Visit Toronto, Canada (in summer) and sightseeing", R.drawable.toronto)
        };

        BucketItemsAdapter adapter = new BucketItemsAdapter(items);

        list.setAdapter(adapter);
    }
}