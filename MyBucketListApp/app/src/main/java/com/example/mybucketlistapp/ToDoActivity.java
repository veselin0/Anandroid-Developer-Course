package com.example.mybucketlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);

        RecyclerView list = findViewById(R.id.recycler_view_items);

        BucketItem[] items = {
                new BucketItem("Learn Kotlin", "Search and learn from as much Kotlin courses as possible", R.drawable.kotlin_icon),
                new BucketItem("Learn Android Studio", "Mastering the skills of creating useful Android apps", R.drawable.android_studio_icon),
                new BucketItem("Find Job", "Find an Android developer position payed enough to make possible the trips I plan", R.drawable.dev_at_work)

        };

        BucketItemsAdapter adapter = new BucketItemsAdapter(items);

        list.setAdapter(adapter);

    }
}