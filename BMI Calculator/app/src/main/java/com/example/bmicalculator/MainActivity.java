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

    private RadioButton maleRBtn;
    private RadioButton femRBtn;

    private EditText ageEdiTxt;
    private EditText heightEdiTxt;
    private EditText weightEdiTxt;

    private Button calcBtn;

    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setupButtonOnClickListener();

    }

    private void findViews() {
        maleRBtn = findViewById(R.id.radio_btn_male);
        femRBtn = findViewById(R.id.radio_btn_female);

        ageEdiTxt = findViewById(R.id.edit_text_age);
        heightEdiTxt = findViewById(R.id.edit_text_height);
        weightEdiTxt = findViewById(R.id.edit_text_weight);

        calcBtn = findViewById(R.id.button_calculate);

        resultText = findViewById(R.id.text_view_result);
    }

    private void setupButtonOnClickListener() {
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateBMI();
            }
        });
    }

    private void calculateBMI() {
        String ageText = ageEdiTxt.getText().toString();
        String heightText = heightEdiTxt.getText().toString();
        String weightText = weightEdiTxt.getText().toString();

        // Converting number Strings into integers.
        int age = Integer.parseInt(ageText);
        double height = Double.parseDouble(heightText);
        double weight = Double.parseDouble(weightText);

        // BMI formula: weight divided by height squared.
        double bmi = weight / (height * height);
        String bmiText = String.valueOf(bmi);

        resultText.setText(bmiText);
    }
}


