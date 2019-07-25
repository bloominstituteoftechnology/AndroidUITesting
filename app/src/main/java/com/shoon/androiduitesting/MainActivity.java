package com.shoon.androiduitesting;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView    inputText,
                textResult;
    private Button  btUnit,
                    btUnitConverted,
                    btConversion;
    private Calculator calculator;
    private LinearLayout    llconv,
                    llHexDecimal,
                    llDecimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        calculator=new Calculator(  );
        inputText=findViewById( R.id.inputText );
        textResult=findViewById( R.id.textResult );
////answer////////////////////////////////////////////////////////////////
        findViewById( R.id.buttonEqual ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( '=' );
                inputText.setText( calculator.showCalc() );
                textResult.setText( calculator.showResult() );
            }
        } );
//Basic numbers////////////////////////////////////////////////////////
        setBasicNumber();
///Hexdecimal/////////////////////////////
        setLlHexDecimal();
//operators//////////////
        setOperator();
//////conversion/////////////////////////////////////////////////////////////////////
        setConversionGroup(  );
    }

//Basic numbers////////////////////////////////////////////////////////
    private void setBasicNumber(){


        findViewById( R.id.button0 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( '0' );
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

    }

    private void setLlHexDecimal(){
        llHexDecimal=findViewById( R.id.llHexDecimal );
        llHexDecimal.setVisibility( View.GONE );


        llDecimal=findViewById( R.id.llToHexDecimal );

        Button btToHexDec=findViewById( R.id.buttonModeDecimalToHex );
        btToHexDec.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llHexDecimal.setVisibility( View.VISIBLE );
                clearUnit();
                llDecimal.setVisibility( View.GONE );
            }
        } );
        Button btToDec=findViewById( R.id.buttonModeHexToDecimal );
        btToDec.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llHexDecimal.setVisibility( View.GONE );
                llDecimal.setVisibility( View.VISIBLE );
            }
        } );


        findViewById( R.id.buttonA ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( 'a' );
                inputText.setText( calculator.showCalc() );
            }
        } );

        findViewById( R.id.buttonB ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( 'b' );
                inputText.setText( calculator.showCalc() );
            }
        } );

        findViewById( R.id.buttonC ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( 'c' );
                inputText.setText( calculator.showCalc() );
            }
        } );

        findViewById( R.id.buttonD ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( 'd' );
                inputText.setText( calculator.showCalc() );
            }
        } );

        findViewById( R.id.buttonE ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( 'e' );
                inputText.setText( calculator.showCalc() );
            }
        } );

        findViewById( R.id.buttonF ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( 'f' );
                inputText.setText( calculator.showCalc() );
            }
        } );

    }
//operators//////////////
    private void setOperator(){


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
                calculator.addSymbol( '\u00D7' );
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
                textResult.setText( "" );

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
                calculator.addSymbol( '²' );
                inputText.setText( calculator.showCalc() );

            }
        } );
        findViewById( R.id.buttonSquareRoot ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( '√' );
                inputText.setText( calculator.showCalc() );
            }
        } );
        findViewById( R.id.buttonPi ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.addSymbol( 'π' );
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
    }
    private void clearUnit(){
        llconv.setVisibility( View.GONE );
        btUnit.setVisibility( View.GONE );
        btUnitConverted.setVisibility( View.GONE );
        btConversion.setText( "Conversion" );
        setConversion( "clearboth" );
    }
    private void showUnit(){
        llconv.setVisibility( View.VISIBLE );
        btUnit.setVisibility( View.VISIBLE );
        btUnitConverted.setVisibility( View.VISIBLE );
    }
    //////conversion/////////////////////////////////////////////////////////////////////
    private void setConversionGroup(){




        llconv=findViewById( R.id.llConverter );
        llconv.setVisibility( View.GONE );
        btUnit=findViewById( R.id.buttonUnitToConvert );
        btUnitConverted=findViewById( R.id.buttonUnitConverted );
        btUnit.setVisibility( View.GONE );
        btUnitConverted.setVisibility( View.GONE );
        btUnit.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btUnit.setSelected( true );
                btUnitConverted.setSelected( false );
                btUnit.setTextColor( Color.RED);
                btUnitConverted.setTextColor( Color.BLACK );
            }

        } );


        btUnitConverted.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btUnit.setSelected( false );
                btUnitConverted.setSelected( true );
                btUnit.setTextColor( Color.BLACK);
                btUnitConverted.setTextColor( Color.RED );
            }
        } );



        btConversion=findViewById( R.id.buttonConversion );
        btConversion.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btConversion.getText().equals( "Conversion" )){
                    btConversion.setText( "No unit" );

                    llconv.setVisibility( View.VISIBLE );
                    llHexDecimal.setVisibility( View.GONE );
                    btUnit.setVisibility( View.VISIBLE );
                    btUnitConverted.setVisibility( View.VISIBLE);

                    btUnit.setSelected( true );
                    btUnit.setTextColor( Color.RED );
                    btUnitConverted.setSelected( false );
                    btUnitConverted.setTextColor( Color.BLACK );


                }else{
                    btConversion.setText( "Conversion" );
                    llconv.setVisibility( View.GONE );
                    btUnit.setVisibility( View.GONE );
                    btUnitConverted.setVisibility( View.GONE );
                    setConversion( "clearboth" );
                }

            }
        } );

        findViewById( R.id.buttonPound ).setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                setConversion("lb" );
            }
        } );
        findViewById( R.id.buttonKg).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setConversion( "kg" );
            }
        } );
        findViewById( R.id.buttonGram).setOnClickListener(  new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setConversion( "g" );
            }
        } );

        findViewById( R.id.buttonOunces ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setConversion( "oz" );

            }
        } );
        findViewById( R.id.buttonMM ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setConversion( "mm" );
            }
        } );
        findViewById( R.id.buttonCM ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setConversion( "cm" );
            }
        } );
        findViewById( R.id.buttonM ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setConversion( "m" );
            }
        } );

        findViewById( R.id.buttonKM ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setConversion( "km" );
            }
        } );

        findViewById( R.id.buttonInch ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setConversion("inch" );
            }
        } );
        findViewById( R.id.buttonFeet ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setConversion("feet" );
            }
        } );
        findViewById( R.id.buttonYard ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setConversion("yard" );
            }
        } );
        findViewById( R.id.buttonMile ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setConversion("mile" );
            }
        } );
 /*       findViewById( R.id.buttonSquareMile ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setConversion("mile²" );
            }
        } );*/
        //area////////
        findViewById( R.id.buttonSquareFeet).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setConversion("ft²" );
            }
        } );
        findViewById( R.id.buttonSquareMeter).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setConversion("m²" );
            }
        } );
        findViewById( R.id.buttonAcre).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setConversion("acre" );
            }
        } );

        findViewById( R.id.buttonTsubo).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setConversion("坪" );
            }
        } );
        findViewById( R.id.buttonJou).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setConversion("畳" );
            }
        } );
//temperatrure
        findViewById( R.id.buttonFarenheit ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setConversion( "°F" );
            }
        } );


        findViewById( R.id.buttonCentigrade ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setConversion("°C" );
            }
        } );
    }
    private void setConversion(String strMode){
        if(strMode=="clearboth"){
            calculator.setConvertingUnit("");   //need to be revised
            calculator.setConvertedUnit("");    //need to be revised
        }
        if(btUnit.isSelected()){
            btUnit.setText(strMode );
            calculator.setConvertingUnit( strMode);
            btUnitConverted.setSelected( true );
            btUnitConverted.setTextColor( Color.RED );
            btUnit.setTextColor( Color.BLACK );
            btUnit.setSelected( false );
        }
        if(btUnitConverted.isSelected()){
            btUnitConverted.setText( strMode);
            calculator.setConvertedUnit( strMode);
        }
    }

    private void setMatrix(String strMode){


    }

}
