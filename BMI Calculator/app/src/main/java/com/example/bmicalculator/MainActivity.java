package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton maleRBtn = findViewById(R.id.radio_btn_male);
        RadioButton femRBtn = findViewById(R.id.radio_btn_female);

        EditText ageEdiTxt = findViewById(R.id.edit_text_age);
        EditText mtrEdiTxt = findViewById(R.id.edit_text_meter);
        EditText cmEdiTxt = findViewById(R.id.edit_text_meter);
        EditText kgEdiTxt = findViewById(R.id.edit_text_weight);

        Button calcBtn = findViewById(R.id.button_calculate);

        TextView resultText = findViewById(R.id.text_view_result);

        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Wow, we can react to button click!",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}


