package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

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
                double bmiResult = calculateBMI();

                String ageText = ageEdiTxt.getText().toString();
                int age = Integer.parseInt(ageText);

                if (age >= 18) {
                    displayResult(bmiResult);
                } else {
                    displayGuidance(bmiResult);
                }


            }
        });
    }



    private double calculateBMI() {
        String heightText = heightEdiTxt.getText().toString();
        String weightText = weightEdiTxt.getText().toString();

        // Converting number Strings into integers.
        double height = Double.parseDouble(heightText);
        double weight = Double.parseDouble(weightText);

        // BMI formula: weight divided by height squared.
        return weight / (height * height);
    }

    private void displayResult(double bmi) {
        DecimalFormat myDecimalFormatter = new DecimalFormat("0.00");
        String bmiText = myDecimalFormatter.format(bmi);

        String fullResultString;

        if (bmi < 18.5) {
            // Display underweight
            fullResultString = bmiText + " - You are underweight";
        } else if (bmi > 25) {
            // Display overweight
            fullResultString = bmiText + " - You are overweight";
        } else {
            // Display healthy
            fullResultString = bmiText + " - You are a healthy weight";
        }
        resultText.setText(fullResultString);

    }

    private void displayGuidance(double bmi) {
        DecimalFormat myDecimalFormatter = new DecimalFormat("0.00");
        String bmiText = myDecimalFormatter.format(bmi);

        String fullResultString;
        if (maleRBtn.isChecked()) {
            // Display boy guidance
            fullResultString = bmiText + " As you are under 18, please consult " +
                    "your doctor for the healthy range for boys.";
        } else if (femRBtn.isChecked()) {
            // Display girl guidance
            fullResultString = bmiText + " As you are under 18, please consult " +
                    "your doctor for the healthy range for girls.";
        } else {
            // Display general guidance
            fullResultString = bmiText + " As you are under 18, please consult " +
                    "your doctor for the healthy range.";
        }
        resultText.setText(fullResultString);
    }

}


