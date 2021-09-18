package com.example.app_java_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void proccess(View v) {
        RadioGroup rg = findViewById(R.id.operate);
        RadioButton rb = findViewById(rg.getCheckedRadioButtonId());
        EditText ci1 = findViewById(R.id.input1);
        EditText ci2 = findViewById(R.id.input2);
        EditText co = findViewById(R.id.output);

        double i1 = Double.parseDouble(String.valueOf(ci1.getText()));
        double i2 = Double.parseDouble(String.valueOf(ci2.getText()));

        switch (String.valueOf(rb.getText())) {
            case "*":
                double h1 = i1 * i2;
                co.setText(""+h1);
                break;
            case "-":
                double h2 = i1 - i2;
                co.setText(""+h2);
                break;
            case "/":
                double h3 = i1 / i2;
                co.setText(""+h3);
                break;
            case "+":
                double h4 = i1 + i2;
                co.setText(""+h4);
                break;
        }

    }

}