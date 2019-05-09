package com.example.israel.android_unittest_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Calculator calculator = new Calculator();
    private TextView calculatorSymbolsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculatorSymbolsTextView = findViewById(R.id.text_calculator_symbols);
        calculator.setOnSymbolsChangedListener(new Calculator.OnSymbolsChangedListener() {
            @Override
            public void onSymbolsChanged(String symbol) {
                calculatorSymbolsTextView.setText(symbol);
            }
        });

        findViewById(R.id.button_0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol("0");
            }
        });

        findViewById(R.id.button_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol("1");
            }
        });

        findViewById(R.id.button_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol("2");
            }
        });

        findViewById(R.id.button_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol("3");
            }
        });

        findViewById(R.id.button_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol("4");
            }
        });

        findViewById(R.id.button_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol("5");
            }
        });

        findViewById(R.id.button_6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol("6");
            }
        });

        findViewById(R.id.button_7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol("7");
            }
        });

        findViewById(R.id.button_8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol("8");
            }
        });

        findViewById(R.id.button_9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol("9");
            }
        });

        findViewById(R.id.button_decimal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol(".");
            }
        });

        findViewById(R.id.button_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol("+");
            }
        });

        findViewById(R.id.button_sub).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol("-");
            }
        });

        findViewById(R.id.button_mul).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol("*");
            }
        });

        findViewById(R.id.button_div).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol("/");
            }
        });

        findViewById(R.id.button_c).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clear();
            }
        });

        findViewById(R.id.button_equals).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.calculate();
            }
        });

    }
}
