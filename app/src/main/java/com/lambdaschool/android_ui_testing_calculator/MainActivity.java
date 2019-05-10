package com.lambdaschool.android_ui_testing_calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator = new Calculator();

        final TextView displayOutput = findViewById(R.id.display_output);

        ((Button) findViewById(R.id.button_1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOutput.setText(calculator.addSymbol("1"));
            }
        });
        ((Button) findViewById(R.id.button_2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOutput.setText(calculator.addSymbol("2"));
            }
        });
        ((Button) findViewById(R.id.button_3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOutput.setText(calculator.addSymbol("3"));
            }
        });
        ((Button) findViewById(R.id.button_4)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOutput.setText(calculator.addSymbol("4"));
            }
        });
        ((Button) findViewById(R.id.button_5)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOutput.setText(calculator.addSymbol("5"));
            }
        });
        ((Button) findViewById(R.id.button_6)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOutput.setText(calculator.addSymbol("6"));
            }
        });
        ((Button) findViewById(R.id.button_7)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOutput.setText(calculator.addSymbol("7"));
            }
        });
        ((Button) findViewById(R.id.button_8)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOutput.setText(calculator.addSymbol("8"));
            }
        });
        ((Button) findViewById(R.id.button_9)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOutput.setText(calculator.addSymbol("9"));
            }
        });
        ((Button) findViewById(R.id.button_0)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOutput.setText(calculator.addSymbol("0"));
            }
        });
        ((Button) findViewById(R.id.button_plus)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOutput.setText(calculator.addSymbol("+"));
            }
        });
        ((Button) findViewById(R.id.button_minus)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOutput.setText(calculator.addSymbol("-"));
            }
        });
        ((Button) findViewById(R.id.button_times)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOutput.setText(calculator.addSymbol("×"));
            }
        });
        ((Button) findViewById(R.id.button_divided_by)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOutput.setText(calculator.addSymbol("÷"));
            }
        });
        ((Button) findViewById(R.id.button_squared)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOutput.setText(calculator.addSymbol("²"));
            }
        });
        ((Button) findViewById(R.id.button_square_root)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOutput.setText(calculator.addSymbol("√"));
            }
        });
        ((Button) findViewById(R.id.button_pi)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOutput.setText(calculator.addSymbol("π"));
            }
        });
        ((Button) findViewById(R.id.button_decimal)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOutput.setText(calculator.addSymbol("."));
            }
        });
        ((Button) findViewById(R.id.button_calculate)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOutput.setText(calculator.calculate());
            }
        });
        ((Button) findViewById(R.id.button_backspace)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOutput.setText(calculator.backspace());
            }
        });
        ((Button) findViewById(R.id.button_reset)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOutput.setText(calculator.reset());
            }
        });
    }
}
