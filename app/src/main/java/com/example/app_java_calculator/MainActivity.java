package com.example.app_java_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

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

        double i1 = 0;
        double i2 = 0;
        try {
            i1 = Double.parseDouble(String.valueOf(ci1.getText()));
            i2 = Double.parseDouble(String.valueOf(ci2.getText()));
        } catch (NumberFormatException e) {
            ci1.setText("0");
            ci2.setText("0");
        }
        double hasil;
        switch (String.valueOf(rb.getText())) {
            case "*":
                hasil = i1 * i2;
                co.setText(""+hasil);
                break;
            case "-":
                hasil = i1 - i2;
                co.setText(""+hasil);
                break;
            case "/":
                hasil = i1 / i2;
                co.setText(""+hasil);
                break;
            case "+":
                hasil = i1 + i2;
                co.setText(""+hasil);
                break;
        }

    }

}