package com.jakeesveld.android_ui_testing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jakeesveld.android_ui_testing.Objects.Calculator;

public class MainActivity extends AppCompatActivity {

    TextView textOutput;
    Button buttonAdd, buttonMultiply, buttonDivide, buttonSubtract, button1, button2, button3, button4, button5,
    button6, button7, button8, button9, button0, buttonSqRt, buttonSquare, buttonDot, buttonEquals, buttonBack, buttonClear;

    Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator = new Calculator();

        textOutput = findViewById(R.id.text_output);
        buttonAdd = findViewById(R.id.button_add);
        buttonMultiply = findViewById(R.id.button_multiply);
        buttonDivide = findViewById(R.id.button_divide);
        buttonSubtract = findViewById(R.id.button_subtract);
        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        button3 = findViewById(R.id.button_3);
        button4 = findViewById(R.id.button_4);
        button5 = findViewById(R.id.button_5);
        button6 = findViewById(R.id.button_6);
        button7 = findViewById(R.id.button_7);
        button8 = findViewById(R.id.button_8);
        button9 = findViewById(R.id.button_9);
        button0 = findViewById(R.id.button_0);
        buttonSqRt = findViewById(R.id.button_sqrt);
        buttonSquare = findViewById(R.id.button_square);
        buttonDot = findViewById(R.id.button_dot);
        buttonEquals = findViewById(R.id.button_equals);
        buttonClear = findViewById(R.id.button_clear);
        buttonBack = findViewById(R.id.button_back);

        button0.setOnClickListener(addSymbolOnClick);
        button1.setOnClickListener(addSymbolOnClick);
        button2.setOnClickListener(addSymbolOnClick);
        button3.setOnClickListener(addSymbolOnClick);
        button4.setOnClickListener(addSymbolOnClick);
        button5.setOnClickListener(addSymbolOnClick);
        button6.setOnClickListener(addSymbolOnClick);
        button7.setOnClickListener(addSymbolOnClick);
        button8.setOnClickListener(addSymbolOnClick);
        button9.setOnClickListener(addSymbolOnClick);
        buttonDot.setOnClickListener(addSymbolOnClick);
        buttonAdd.setOnClickListener(setOperandOnClick);
        buttonMultiply.setOnClickListener(setOperandOnClick);
        buttonDivide.setOnClickListener(setOperandOnClick);
        buttonSubtract.setOnClickListener(setOperandOnClick);
        buttonSqRt.setOnClickListener(setOperandOnClick);
        buttonSquare.setOnClickListener(setOperandOnClick);


        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textOutput.setText(calculator.calculate());
                resetOperand();
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.clear();
                textOutput.setText("Output");
                resetOperand();
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String back = calculator.removeLastSymbol();
                if(back.equals("")){
                    resetOperand();
                }else{
                    textOutput.setText(back);
                }
            }
        });
    }

    View.OnClickListener setOperandOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.button_add:
                    calculator.setOperand(Calculator.ADD);
                    buttonAdd.setText("*+*");
                    break;
                case R.id.button_subtract:
                    calculator.setOperand(Calculator.SUBTRACT);
                    buttonSubtract.setText("*-*");
                    break;
                case R.id.button_divide:
                    calculator.setOperand(Calculator.DIVIDE);
                    buttonDivide.setText("*/*");
                    break;
                case R.id.button_multiply:
                    calculator.setOperand(Calculator.MULTIPLY);
                    buttonMultiply.setText("*x*");
                    break;
                case R.id.button_sqrt:
                    textOutput.setText(calculator.setOperand(Calculator.SQUARE_ROOT));
                    resetOperand();
                    break;
                case R.id.button_square:
                    textOutput.setText(calculator.setOperand(Calculator.SQUARE));
                    resetOperand();
                    break;
            }
        }
    };

    View.OnClickListener addSymbolOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.button_0:
                    textOutput.setText(calculator.addSymbol("0"));
                    break;
                case R.id.button_1:
                    textOutput.setText(calculator.addSymbol("1"));
                    break;
                case R.id.button_2:
                    textOutput.setText(calculator.addSymbol("2"));
                    break;
                case R.id.button_3:
                    textOutput.setText(calculator.addSymbol("3"));
                    break;
                case R.id.button_4:
                    textOutput.setText(calculator.addSymbol("4"));
                    break;
                case R.id.button_5:
                    textOutput.setText(calculator.addSymbol("5"));
                    break;
                case R.id.button_6:
                    textOutput.setText(calculator.addSymbol("6"));
                    break;
                case R.id.button_7:
                    textOutput.setText(calculator.addSymbol("7"));
                    break;
                case R.id.button_8:
                    textOutput.setText(calculator.addSymbol("8"));
                    break;
                case R.id.button_9:
                    textOutput.setText(calculator.addSymbol("9"));
                    break;
                case R.id.button_dot:
                    textOutput.setText(calculator.addSymbol("."));
                    break;
            }
        }
    };


    public void resetOperand(){
        buttonAdd.setText("+");
        buttonSubtract.setText("-");
        buttonDivide.setText("/");
        buttonMultiply.setText("x");
    }
}
