package com.example.inchtometercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText inchesEditText;
    Button calculateButton;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        btnOnClick();
    }

    private void btnOnClick() {
        calculateButton.setOnClickListener(view -> {
            String inchesString = inchesEditText.getText().toString();
            if (inchesString.isEmpty()) {
                Toast.makeText(this, "Please, enter a value", Toast.LENGTH_LONG).show();
            } else {
                double result = convertToMeters(inchesString);
                displayResult(result);
                inchesEditText.setText("");
            }
        });
    }

    private void findViews() {
        inchesEditText = findViewById(R.id.et_inch);
        calculateButton = findViewById(R.id.btn_calc);
        resultTextView = findViewById(R.id.tv_res);
    }

    private double convertToMeters(String inchesString) {
        double inches = Double.parseDouble(inchesString);
        return inches * 0.0254;
    }

    private void displayResult(double result) {
        DecimalFormat myFormatter = new DecimalFormat("0.00");
        String resultString = myFormatter.format(result);
        resultTextView.setText(resultString + " meters");

    }
}


