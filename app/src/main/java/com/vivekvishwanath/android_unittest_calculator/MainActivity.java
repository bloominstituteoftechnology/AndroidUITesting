package com.vivekvishwanath.android_unittest_calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Calculator calculator;
    private EditText displayScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator = new Calculator();
        displayScreen = findViewById(R.id.display_screen);

        findViewById(R.id.one_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayScreen.setText(calculator.addSymbol(((Button)v).getText().toString()));
            }
        });

        findViewById(R.id.two_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayScreen.setText(calculator.addSymbol(((Button)v).getText().toString()));
            }
        });

        findViewById(R.id.three_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayScreen.setText(calculator.addSymbol(((Button)v).getText().toString()));
            }
        });

        findViewById(R.id.four_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayScreen.setText(calculator.addSymbol(((Button)v).getText().toString()));
            }
        });

        findViewById(R.id.five_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayScreen.setText(calculator.addSymbol(((Button)v).getText().toString()));
            }
        });

        findViewById(R.id.six_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayScreen.setText(calculator.addSymbol(((Button)v).getText().toString()));
            }
        });

        findViewById(R.id.seven_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayScreen.setText(calculator.addSymbol(((Button)v).getText().toString()));
            }
        });

        findViewById(R.id.nine_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayScreen.setText(calculator.addSymbol(((Button)v).getText().toString()));
            }
        });

        findViewById(R.id.eight_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayScreen.setText(calculator.addSymbol(((Button)v).getText().toString()));
            }
        });

        findViewById(R.id.zero_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayScreen.setText(calculator.addSymbol(((Button)v).getText().toString()));
            }
        });

        findViewById(R.id.decimal_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayScreen.setText(calculator.addSymbol(((Button)v).getText().toString()));
            }
        });

        findViewById(R.id.add_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayScreen.setText(calculator.addSymbol(((Button)v).getText().toString()));
            }
        });

        findViewById(R.id.subtract_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayScreen.setText(calculator.addSymbol(((Button)v).getText().toString()));
            }
        });

        findViewById(R.id.multiply_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayScreen.setText(calculator.addSymbol(((Button)v).getText().toString()));
            }
        });

        findViewById(R.id.divide_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayScreen.setText(calculator.addSymbol(((Button)v).getText().toString()));
            }
        });

        findViewById(R.id.equals_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayScreen.setText(calculator.performOperation());
            }
        });

    }
}
