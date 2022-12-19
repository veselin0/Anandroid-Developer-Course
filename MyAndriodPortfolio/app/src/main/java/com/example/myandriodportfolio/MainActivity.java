package com.example.myandriodportfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_projects);

        Project[] projects = {
                new Project("Getting Started App", "First app on android studio", R.drawable.getting_started),
                new Project("Wise Quote App", "A personal motivational quote", R.drawable.quote),
                new Project("BMI Calculator", "A working BMI calculator", R.drawable.tape),
                new Project("Inch to Meter Calculator", "A basic convertor for inch to meter", R.drawable.calculator),
                new Project("Restaurant App", "A menu for a fictional restaurant", R.drawable.hungry_hog)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);

        list.setAdapter(adapter);

    }
}
