package com.lambdaschool.android_ui_testing_calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Calculator calculator=new Calculator();

        final TextView displayOutput=findViewById(R.id.display_output);

        ((Button)findViewById(R.id.button_1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOutput.setText(calculator.addSymbol("1"));
            }
        });
        ((Button)findViewById(R.id.button_reset)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOutput.setText(calculator.reset());
            }
        });
    }
}
