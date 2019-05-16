package com.shoon.androiduitesting;

import java.util.ArrayList;

public class Calculator {
    public Calculator(float fX, float fY, float fZ) {
        this.fX = fX;
        this.fY = fY;
        this.fZ = fZ;
    }

    private float fX,fY,fZ;
    private String strLog,strNumber,strResult;
    ArrayList<String> alstrCalc;
    ArrayList<String> alstrOld;


    public Calculator(){
        strLog="";
        strNumber="";
        this.alstrCalc=new ArrayList<String>( 1 );

    }

    private boolean isAfterEqaual=false;


    private void setOperator(char cOperator){
        if(isAfterEqaual){
            alstrCalc.set(alstrCalc.size()-1,  strNumber );
        }else{
            if(strNumber==""){

            }else{
                alstrCalc.add( strNumber );
            }
        }
        strNumber="";
        alstrCalc.add(Character.toString(   cOperator) );
        strLog+=cOperator;
        isAfterEqaual=false;
    }

    public void addSymbol(char chrX){

        switch (chrX){
            case '/':
                setOperator( chrX );
                break;
            case '*':
                setOperator( chrX );
                break;

            case '-':
                setOperator( chrX );
                break;
            case '+':
                setOperator( chrX );
                break;
            case '%':
                setOperator( chrX );
                break;
            case 'U': //undo
                int iSize=alstrCalc.size();
                if(iSize==0){
                    alstrCalc= (ArrayList<String>) alstrOld.clone();

                }else{
                    alstrCalc.remove( alstrCalc.size()-1);
                }
                strLog+=chrX;
                break;
            case '(':
                setOperator( chrX );
                break;
            case ')':
                setOperator( chrX );
                break;
            case 'J':
                setOperator( chrX );
                break;
            case 'R':
                setOperator( chrX );
                break;
            case 'P':
                alstrCalc.add( "PIE" );
                strLog+=chrX;
                break;
            case 'r':
                alstrCalc.add( "RAD" );
                strLog+=chrX;
                break;
            case 'k':
                setOperator( chrX );
//                alstrCalc.add( "Cos(" );
                break;
            case 's':
                setOperator( chrX );
//                alstrCalc.add( "Sin(" );
                break;
            case 't':
                setOperator( chrX );
//                alstrCalc.add( "Tan(" );
                break;
            case 'h':
                setOperator( chrX );
                break;
            case 'l':
                setOperator( chrX );
//                alstrCalc.add( "ArcCos(" );
                break;
            case 'w':
//                alstrCalc.add( "ArcSin(" );
                setOperator( chrX );
                break;
            case 'g':
                setOperator( chrX );
//                alstrCalc.add( "ArcTan(" );
                break;
            case 'M':
                alstrCalc.add( "Matrix" );
                strLog+=chrX;
                break;

            case 'Z':
                alstrOld= (ArrayList<String>) alstrCalc.clone();
                alstrCalc.clear();
                strLog="";
                strNumber="";
                isAfterEqaual=false;

                break;
            case '=':
                if(isOperatorExcludesRightBracket( alstrCalc.get(alstrCalc.size()-1))){
                    strResult="cannot end with operator";
                    break;
                }
                if(isAfterEqaual){
                    alstrCalc.set(alstrCalc.size()-1, strNumber );
                }else{
                    if(strNumber==""){

                    }else{
                        alstrCalc.add( strNumber );
                    }

                }


                if(alstrCalc.get( alstrCalc.size()-1 )=="+"){
                    strResult="cannot end with operator";

                    break;
                }
                calculate( );
                isAfterEqaual=true;
                break;

            case 'A':
            case 'a':
                alstrCalc.add( "0xa" );
                strLog+=chrX;
                break;
            case 'B':
            case 'b':
                alstrCalc.add( "0xb" );
                strLog+=chrX;
                break;
            case 'C':
            case 'c':
                alstrCalc.add( "0xc" );
                strLog+=chrX;
                break;
            case 'D':
            case 'd':
                alstrCalc.add( "0xd" );
                strLog+=chrX;
                break;
            case 'E':
            case 'e':
                alstrCalc.add( "0xe" );
                strLog+=chrX;
                break;
            case 'F':
            case 'f':
                alstrCalc.add( "0xf" );
                strLog+=chrX;
                break;

            case '.':
                if(strNumber.contains( "." ))break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':

                strNumber+=chrX;
                strLog+=chrX;
                break;
            default:

        }



    }

    public void addSymbol(String strX){
        switch (strX){
            case "C":
                strLog="";
                break;
            case "=":
                calculate( );
                break;


            default:
                strLog+=strX;
        }


    }

    private void calculate(){

        ArrayList<String> temp= (ArrayList<String>) alstrCalc.clone();

        do{
            temp= eliminateBracket(temp);

        } while (temp.contains( "(") );
        strResult=calcInBracket( temp );



    }

    private ArrayList<String> eliminateBracket(ArrayList<String> x){
        ArrayList<String> temp= new ArrayList<String>();
        int left=0,right=x.size()-1;
        String leftOfBracket="1";
        for(int i=0;i<=right;i++){
            if(x.get( i ).contains( "(" )){
                temp.clear();
                left=i;
                if(i>0){
                    leftOfBracket=x.get( left-1 );
                }

            }else if(alstrCalc.get( i ).contains( ")" )){
                right=i;
                break;
            }else{
                temp.add( x.get( i ));
            }

        }
        if(isOperatorAndBracket( leftOfBracket)) {
            x.set(left,calcInBracket( temp ));
            right=(x.size()<right)?x.size()-1:right;
            for(int i=right;i>left;i--){
                x.remove( i );
            }
        }else {
            if(left!=0){
                x.set(left,"*");
                x.set(left+1,calcInBracket(temp ));
                right=(x.size()<right)?x.size()-1:right;
                for(int i=right+1;i>left+1;i--){
                    x.remove( i );
                }
            }else{
                x.set(left,calcInBracket(temp ));
                right=(x.size()<right)?x.size()-1:right;
                for(int i=right;i>left;i--){
                    x.remove( i );
                }
            }
        }


        return x;
    }

    private boolean isOperatorExcludesRightBracket(String str){
        if(str.contains( "+" )||str.contains( "-" )||str.contains( "*" )||str.contains( "/" )||str.contains( "(" )){
            return true;
        }else{
            return false;
        }
    }
    private boolean isOperatorAndBracket(String str){
        if(str.contains( "+" )||str.contains( "-" )||str.contains( "*" )||str.contains( "/" )||str.contains( "(" )||str.contains( ")" )){
            return true;
        }else{
            return false;
        }
    }

    private String calcInBracket(ArrayList<String> x){
        if(x.contains( "/" ))x=eliminateDivision( x );
        if(x.contains( "*" ))x=eliminateMultiplication(x);
        if(x.contains( "-" ))x=eliminateSubtraction( x );
        if(x.contains( "+" ))x=eliminateAddition( x );


        return x.get( 0);
    }

    private ArrayList<String> eliminateAddition(ArrayList<String> x){
        for(int i=0;i<x.size();i++){
            if(x.get(i).contains( "+")){
                x.set( i-1,basicCalcString( x.get( i-1 ),"+",x.get( i+1 ) ));

                try {
                    x.remove( i );
                } catch (Exception e) {
                    e.getMessage();
                }
                try {
                    x.remove( i );
                } catch (Exception e){
                    e.getMessage();
                }
                i=0;
            }
        }
        return x;
    }

    private ArrayList<String> eliminateSubtraction(ArrayList<String> x){
        for(int i=0;i<x.size();i++){
            if(x.get(i).contains( "-")){

                if(i==0){
                    x.set( i,Float.toString( -Float.parseFloat( x.get( i+1 ))));
                    for(i=i;i<x.size();i++) {
                        x.set( i, x.get( i + 1 ) );
                        if (i == x.size() - 2) i = 0;
                    }

                }else{
                    x.set( i-1,basicCalcString( x.get( i-1 ),"-",x.get( i+1 ) ));
                    try {
                        x.remove( i );
                    } catch (Exception e) {
                        e.getMessage();
                    }
                    try {
                        x.remove( i );
                    } catch (Exception e){
                        e.getMessage();
                    }
                    i=0;
                }


            }

        }
        return x;
    }

    private ArrayList<String> eliminateMultiplication(ArrayList<String> x){
        for(int i=0;i<x.size();i++){
            if(x.get(i).contains( "*")){
                x.set( i,"*" );
                x.set( i-1,basicCalcString( x.get( i-1 ),"*",x.get( i+1 ) ));
                try {
                    x.remove( i );
                } catch (Exception e) {
                    e.getMessage();
                }
                try {
                    x.remove( i );
                } catch (Exception e){
                    e.getMessage();
                }
                i=0;
            }

        }
        return x;
    }

    private ArrayList<String> eliminateDivision(ArrayList<String> x){
        for(int i=0;i<x.size();i++){
            if(x.get(i).contains( "/")){
                x.set( i,"*" );
                x.set( i+1,Float.toString( 1/Float.parseFloat(x.get( i+1 ) )) );
            }

        }
        return x;
    }
    private String basicCalcString(String strA,String strOperation,String strB){
        float a=Float.parseFloat( strA ),
                b=Float.parseFloat( strB ),
        fResult = 0;
        switch (strOperation){
            case "+":
               fResult=addition( a,b );
               break;
            case "-":
                fResult=subtraction( a,b );
                break;
            case "*":
                fResult=multiplication( a,b );
                break;
            case "/":
                fResult=division( a,b );
                break;
        }


        return Float.toString(fResult);
    }

    private float addition(float a,float b){
        return a+b;
    }

    private float subtraction(float a,float b){
        return a-b;
    }
    private float multiplication(float a,float b){
        return a*b;
    }
    private float division(float a,float b){
        return a/b;
    }

    public String add(String strX,String strY){
        fX=Float.parseFloat( strX);
        fY=Float.parseFloat( strY);
        fZ=fX+fY;
        strResult=Float.toString( fZ );
        return strResult;
    }

    public String showLog(){
        return this.strLog;
    }
    public String showResult(){
        return this.strResult;
    }

}
