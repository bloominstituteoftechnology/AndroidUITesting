package com.shoon.androiduitesting;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView inputText;
    TextView textResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        final Calculator calculator=new Calculator(  );
        inputText=findViewById( R.id.inputText );
        textResult=findViewById( R.id.textResult );
        findViewById( R.id.buttonEqual ).setOnClickListener(  new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( '=' );
                textResult.setText( calculator.showResult() );

            }
        } );

        findViewById( R.id.button0 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( "0" );
                inputText.setText( calculator.showCalc() );

            }
        } );
        findViewById( R.id.button1 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( '1' );
                inputText.setText( calculator.showCalc() );

            }
        } );
        findViewById( R.id.button2 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( '2' );
                inputText.setText( calculator.showCalc() );

            }
        } );
        findViewById( R.id.button3 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( '3' );
                inputText.setText( calculator.showCalc() );

            }
        } );
        findViewById( R.id.button4 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( '4' );
                inputText.setText( calculator.showCalc() );
            }
        } );
        findViewById( R.id.button5 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( '5' );
                inputText.setText( calculator.showCalc() );
            }
        } );
        findViewById( R.id.button6 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( '6' );
                inputText.setText( calculator.showCalc() );
            }
        } );
        findViewById( R.id.button7 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( '7' );
                inputText.setText( calculator.showCalc() );
            }
        } );
        findViewById( R.id.button8 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( '8' );
                inputText.setText( calculator.showCalc() );
            }
        } );
        findViewById( R.id.button9 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( '9' );
                inputText.setText( calculator.showCalc() );
            }
        } );
        findViewById( R.id.buttonDevide ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( '/' );
                inputText.setText( calculator.showCalc() );
            }
        } );
        findViewById( R.id.buttonMultiply ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( '*' );
                inputText.setText( calculator.showCalc() );
            }
        } );
        findViewById( R.id.buttonMinus ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( '-' );
                inputText.setText( calculator.showCalc() );
            }
        } );
        findViewById( R.id.buttonPlus ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( '+' );
                inputText.setText( calculator.showCalc() );
            }
        } );
        findViewById( R.id.buttonPeriod ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( '.' );
                inputText.setText( calculator.showCalc() );
            }
        } );
        findViewById( R.id.buttonPercent ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( '%' );
                inputText.setText( calculator.showCalc() );
            }
        } );


        findViewById( R.id.buttonClear ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( 'Z' );
                inputText.setText("");

            }
        } );

        findViewById( R.id.buttonUndo ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( 'U' );
                inputText.setText( calculator.showCalc() );
            }
        } );
        findViewById( R.id.buttonLeftBracket ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( '(' );
                inputText.setText( calculator.showCalc() );
            }
        } );
        findViewById( R.id.buttonRightBracket ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( ')' );
                inputText.setText( calculator.showCalc() );


            }
        } );
        findViewById( R.id.buttonPoweredBy2 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( 'J' );
                inputText.setText( calculator.showCalc() );

            }
        } );
        findViewById( R.id.buttonSquareRoot ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( 'R' );
                inputText.setText( calculator.showCalc() );
            }
        } );
        findViewById( R.id.buttonPie ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( 'P' );
                inputText.setText( calculator.showCalc() );
            }
        } );
        findViewById( R.id.buttonRadian ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( 'r' );
                inputText.setText( calculator.showCalc() );
            }
        } );
        findViewById( R.id.buttonCos ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( 'k' );
                inputText.setText( calculator.showCalc() );
            }
        } );
        findViewById( R.id.buttonSin ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( 's' );
                inputText.setText( calculator.showCalc() );
            }
        } );
        findViewById( R.id.buttonTan ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( 't' );
                inputText.setText( calculator.showCalc() );
            }
        } );
        findViewById( R.id.buttonTheta ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( 'h' );
                inputText.setText( calculator.showCalc() );
            }
        } );
        findViewById( R.id.buttonArcCos ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( 'l' );
                inputText.setText( calculator.showCalc() );
            }
        } );
        findViewById( R.id.buttonArcSin ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( 'w' );
                inputText.setText( calculator.showCalc() );
            }
        } );
        findViewById( R.id.buttonArcTan ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( 'g' );
                inputText.setText( calculator.showCalc() );
            }
        } );
        findViewById( R.id.buttonMatrix ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( 'M' );
                inputText.setText( calculator.showCalc() );
            }
        } );


        inputText.setText( calculator.showCalc() );

    }
}
