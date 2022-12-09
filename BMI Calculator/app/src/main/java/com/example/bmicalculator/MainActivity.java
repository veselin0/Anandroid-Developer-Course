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
    private EditText mtrEdiTxt;
    private EditText cmEdiTxt;
    private EditText kgEdiTxt;

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
        mtrEdiTxt = findViewById(R.id.edit_text_meter);
        cmEdiTxt = findViewById(R.id.edit_text_centimeter);
        kgEdiTxt = findViewById(R.id.edit_text_weight);

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
        String mtrText = mtrEdiTxt.getText().toString();
        String cmText = cmEdiTxt.getText().toString();
        String kgText = kgEdiTxt.getText().toString();

        resultText.setText("Age: " + ageText + ", Meters: " + mtrText + ", Centimeters: " + cmText + ", Kilograms: " + kgText);
    }
}


