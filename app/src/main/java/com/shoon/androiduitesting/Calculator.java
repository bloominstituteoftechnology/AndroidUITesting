package com.shoon.androiduitesting;

import android.widget.Switch;

import java.util.ArrayList;

public class Calculator {
    public Calculator(double dX, double dY, double dZ) {
        this.dX = dX;
        this.dY = dY;
        this.dZ = dZ;
    }

    private double dX,dY,dZ;
    private String strNumber,strResult;
    ArrayList<String> alstrCalc;
    ArrayList<String> alstrOld;

    public Calculator(){
        strNumber="";
        this.alstrCalc=new ArrayList<String>( 1 );
        this.alstrOld=new ArrayList<>( 1 );
        alstrOld.add( "No history found" );

    }
    public int size(){
        return this.alstrCalc.size();
    }
    public int lastIndex(){

        return (size()-1>0)?size()-1:0;
    }

    private boolean isAfterEqual=false;


    private void setOperator(char cOperator){

        strNumber="";
        switch (cOperator){
            case 'r':
                alstrCalc.add( "RAD(" );
                break;
            case 'k':
                alstrCalc.add( "cos(" );
                break;
            case 's':
                alstrCalc.add( "sin(" );
                break;
            case 't':
                alstrCalc.add( "tan(" );
                break;
            case 'h':
                alstrCalc.add( "θ(" );
                break;
            case 'l':
                alstrCalc.add( "arccos(" );
                break;
            case 'w':
                alstrCalc.add( "arcsin(" );
                break;
            case 'g':
                alstrCalc.add( "arctan(" );
                break;
            default:
                String strTemp=Character.toString(   cOperator);
                alstrCalc.add( strTemp);
                break;
        }
        isAfterEqual=false;
    }



    public void addSymbol(char chrX){
        String strNumberTemp="";
        switch (chrX){
///////operators////////////////////////////////////////////
            case '/':
            case '×': //x or *
            case '-':
            case '+':
            case '%':
            case '(':
            case ')':
            case '²': //^2
            case '√':
            case 'r':
            case 'k':
            case 's':
            case 't':
            case 'h':
            case 'l':
            case 'w':
            case 'g':
                setOperator( chrX );
                return;
////special///////////////////////////////////////////////////
            case 'U': //undo
                int iSize=alstrCalc.size();
                if(iSize==0){
                    alstrCalc= (ArrayList<String>) alstrOld.clone();
                }else{
                    alstrCalc.remove( lastIndex());
                }
                strNumber="";
                return;
///////Clear/////////////////////////////////////////////////////////////////////
            case 'Z':
                alstrOld= (ArrayList<String>) alstrCalc.clone();
                alstrCalc.clear();
                strNumber="";
                isAfterEqual=false;
                return;
 //////Equal/////////////////////////////////////////////////////////////////////
            case '=':
               if(alstrCalc.size()==0){
                    strResult="0";
               }else{
                    if(isOperatorExcludesRightBracket( alstrCalc.get(lastIndex()))){
                        strResult="no operator at end";
                        return;
                    }
                    strResult=calculate( alstrCalc);
               }

               isAfterEqual=true;
               return;
  /////numbers/////////////////////////////////////////////////////////////////////
            case 'π':
                alstrCalc.add( "π");
                return;
            case '.':
                if(strNumber.contains( "." ))break;
            case 'a':
                strNumberTemp="a";
                break;
            case 'b':
                strNumberTemp= "b" ;
                break;
            case 'c':
                strNumberTemp="c";
                break;
            case 'd':
                strNumberTemp= "d";
                break;
            case 'e':
                strNumberTemp= "e";
                break;
            case 'f':
                strNumberTemp= "f";
                break;
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
                strNumberTemp+=chrX;
                break;
            default:
        }
        strNumber+=strNumberTemp;
        if(size()==0){
            alstrCalc.add( strNumber );
        }else{
            if(isOperatorOrBracket( alstrCalc.get( lastIndex() ))) {
          //  if(!isAfterEqual&&isOperatorOrBracket( alstrCalc.get( lastIndex() ))) {
                alstrCalc.add( strNumber );
            }else{
                alstrCalc.set( lastIndex(),strNumber );
            }
        }
    }

    ///////////validation

    private boolean isOperatorExcludesRightBracket(String str){//excludes powered by 2 too
        if (str.equals( "+" )||
            str.equals( "-" )||
            str.equals( "×" )||
            str.equals( "/" )||
            str.equals( "㎏" )||
            str.equals( "#" )||
            str.equals( "G" )||
            str.equals( "O" )||
            str.equals( "C" )||
            str.equals( "M" )||
            str.equals( "I" )||
            str.equals( "Y" )||
            str.equals( "F" )||
            str.equals( "√" )||
            str.equals( "r" )||
            str.equals( "k" )||
            str.equals( "K" )||
            str.equals( "s" )||
            str.equals( "t" )||
            str.equals( "l" )||
            str.equals( "w" )||
            str.equals( "g" )||
            str.contains("From")||
            str.contains("To")||
            str.equals( "(" )){
            return true;
        }else{
            return false;
        }
    }

    private boolean isOperatorOrBracket(String str){
        if (str.equals( "+" )||
            str.equals( "-" )||
            str.equals( "×" )||
            str.equals( "/" )||
            str.equals( "㎏" )||
            str.equals( "#" )||
            str.equals( "G" )||
            str.equals( "O" )||
            str.equals( "C" )||
            str.equals( "M" )||
            str.equals( "I" )||
            str.equals( "Y" )||
            str.equals( "F" )||
            str.equals( "²" )||
            str.equals( "√" )||
            str.equals( "r" )||
            str.equals( "k" )||
            str.equals( "K" )||
            str.equals( "s" )||
            str.equals( "t" )||
            str.equals( "l" )||
            str.equals( "w" )||
            str.equals( "g" )||
            str.contains("From")||
            str.contains("To")||
            str.equals( "(" )||
            str.equals( ")")){
            return true;
        }else{
            return false;
        }
    }

    private boolean hasNumbersNextEachOther(ArrayList<String> x){
        if(x.size()==1)return false;
        boolean bCurrent=true,bPreveous=true;
        for(int i=0;i<x.size();i++){
            bCurrent=isOperatorOrBracket(  x.get( i ));
            if(!bCurrent&&!bPreveous)return true;
            bPreveous=isOperatorOrBracket(  x.get( i ));
        }
        return false;
    }


//Calculation  Interface

    public String calculate(ArrayList<String> x){

        ArrayList<String> temp= (ArrayList<String>) x.clone();
        temp=eliminateConversion(temp );
        temp=eliminatePI( temp );

        do{
            temp= eliminateBracket(temp);
            if(temp.get(0).contains( "Missing" ) )return temp.get( 0 );

        } while (temp.contains( "(") );
        if(temp.contains( ")" ))return "Missing left bracket" ;


        return calcInBracket( temp );
    }

    private ArrayList<String> eliminatePI(ArrayList<String> x) {
        if(x.contains( "π" )){
            for(int i=0;i<x.size();i++){
                if(x.get(i).equals( "π" )){
                    x.set(i,Double.toString( Math.PI ));
                }
            }
        }
        return x;
    }

    private ArrayList<String> eliminateBracket(ArrayList<String> x){
        ArrayList<String> temp= new ArrayList<String>();
        int left=0,right=x.size()-1;
        String leftOfBracket="1";
        for(int i=0;i<=right;i++){
            if(x.get( i ).equals( "(" )){
                if(!x.contains( ")" )){
                    x.set( 0,"Missing )" );
                    return x;
                }
                temp.clear();
                left=i;
                if(i>0){
                    leftOfBracket=x.get( left-1 );
                }

            }else if(x.get( i ).equals( ")" )){
                right=i;
                break;
            }else{
                temp.add( x.get( i ));
            }

        }
        if(isOperatorOrBracket(  leftOfBracket)) {

            x.set(left,calcInBracket( temp));
            right=(x.size()<right)?x.size()-1:right;
            for(int i=right;i>left;i--){
                x.remove( i );
            }
        }else {
            if(left!=0){
                x.set(left,"×");
                x.set(left+1,calcInBracket(temp));
                right=(x.size()<=right)?x.size()-1:right;
                for(int i=right;i>left+1;i--){
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


///calculation
    private String calcInBracket(ArrayList<String> x){
        int size=x.size();
        for(int i=0;i<size;i++) {
            if (x.get(i).equals( "/" )){
                x = eliminateDivision( x );
                size=x.size();
                i=(i>=size)?size-1:i;
            }
            if (x.get(i).equals( "√" )){
                x = eliminateSquareRoot(  x );
                size=x.size();
                i=(i>=size)?size-1:i;
            }
            if (x.get(i).equals( "²" )) {
                x = eliminatePoweredBy2( x );
                size=x.size();
                i=(i>=size)?size-1:i;
            }

            if (x.get(i).equals( "×" )||hasNumbersNextEachOther( x )) {
                x = eliminateMultiplication( x );
                size=x.size();
                i=(i>=size)?size-1:i;
            }
            if (x.get(i).equals( "%" )){
                x = eliminateModulo( x );
                size=x.size();
                i=(i>size)?size:i;
            }

            if (x.get(i).equals( "-" )) {
                x = eliminateSubtraction( x );
                size=x.size();
                i=(i>=size)?size-1:i;
            }
            if (x.get(i).equals( "+" )){
                x = eliminateAddition( x );
                size=x.size();
                i=(i>=size)?size-1:i;
            }
        }
        return x.get( 0 );
    }


    private ArrayList<String> eliminateSquareRoot(ArrayList<String> x){
        for(int i=0;i<x.size();i++){
            if(x.get(i).equals( "√")){
                x.set( i,Double.toString( Math.sqrt( Double.parseDouble( x.get( i+1 ) ) )));
                x.remove( i+1 );
            }
        }
        return x;
    }


    private ArrayList<String> eliminatePoweredBy2(ArrayList<String> x){


        String strPrevious="",strCurrent="";
        for(int i=0;i<x.size();i++){
            strCurrent=x.get(i);
            if(strCurrent.equals( "²")){
                x.set( i,strPrevious );
            }
            strPrevious=strCurrent;
        }
        return x;
    }

    private ArrayList<String> eliminateAddition(ArrayList<String> x){
        for(int i=0;i<x.size();i++){
            if(x.get(i).equals( "+")){
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
            if(x.get(i).equals( "-")){

                if(i==0){
                    x.set( i,Double.toString( -Double.parseDouble( x.get( i+1 ))));
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

    private ArrayList<String> eliminateModulo(ArrayList<String> x){
        for(int i=0;i<x.size();i++){
            if(x.get(i).equals( "%")){
                x.set( i,"%" );
                x.set( i-1,basicCalcString( x.get( i-1 ),"%",x.get( i+1 ) ));
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

    private ArrayList<String> eliminateMultiplication(ArrayList<String> x){
        String strCurrent="", strPrevious="";
        boolean bCurrent=true, bPrevious=true;

        for(int i=0;i<x.size();i++){
            strCurrent=x.get(i);
            bCurrent=isOperatorOrBracket( strCurrent);
            if(bCurrent){
                if(strCurrent.equals( "×")){
                    x.set( i-1,basicCalcString( x.get( i-1 ),"×",x.get( i+1 ) ));
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
            }else if(!bCurrent&&!bPrevious){
                x.set( i-1,basicCalcString( x.get( i-1 ),"×",x.get( i ) ));
                try {
                    x.remove( i );
                } catch (Exception e) {
                    e.getMessage();
                }
                i=0;

            }
            bPrevious=bCurrent;
            strPrevious=strPrevious;
        }
        return x;
    }

    private ArrayList<String> eliminateDivision(ArrayList<String> x){
        for(int i=0;i<x.size();i++){
            if(x.get(i).equals( "/")){
                x.set( i,"×" );
                x.set( i+1,Double.toString( 1/Double.parseDouble(x.get( i+1 ) )) );
            }

        }
        return x;
    }
    private String basicCalcString(String strA,String strOperation,String strB){
        double a=Double.parseDouble(  strA ),
                b=Double.parseDouble(  strB ),
        dResult = 0;
        switch (strOperation){
            case "+":
               dResult=addition( a,b );
               break;
            case "-":
                dResult=subtraction( a,b );
                break;
            case "×":
                dResult=multiplication( a,b );
                break;
            case "/":
                dResult=division( a,b );
                break;
            case "%":
                dResult=modulo(  a,b );
                break;
        }


        return Double.toString(dResult);
    }

    private double addition(double a,double b){
        return a+b;
    }

    private double subtraction(double a,double b){
        return a-b;
    }
    private double multiplication(double a,double b){
        return a*b;
    }
    private double division(double a,double b){
        return a/b;
    }
    private double modulo(double a,double b){
        return a%b;
    }

    public String add(String strX,String strY){
        dX=Double.parseDouble( strX);
        dY=Double.parseDouble( strY);
        dZ=dX+dY;
        strResult=Double.toString( dZ );
        return strResult;
    }

    public String showCalc(){
        String strCalc="",strTemp="";

        for(int i=0;i<size();i++){
            strTemp=alstrCalc.get( i );
            if(i<2){
                if(strTemp.contains( "From" )||strTemp.contains( "To" )){

                }else{
                    strCalc+=strTemp;
                }
            }else{
                strCalc+=strTemp;
            }


        }

        return strCalc;
    }
    public String showResult(){
        return this.strResult;
    }

//Set Conversion condition
    public void setConvertingUnit(String strUnit){

        if(size()==0){
            if(strUnit==""){
            }else{
                alstrCalc.add("From"+strUnit );
            }

        }else{
            if(alstrCalc.get( 0).contains( "From" )){
                if(strUnit==""){
                    alstrCalc.remove( 0 );
                }else{
                    alstrCalc.set(0, "From"+strUnit );
                }

            }else{
                if(strUnit==""){

                }else{
                    alstrCalc.add(0, "From"+strUnit );
                }

            }
        }

    }

    public void setConvertedUnit(String strUnit){
        if(size()==0){
            if(strUnit==""){
            }else{
                alstrCalc.add( "To"+strUnit );
            }

        }else if(size()==1) {

            if(alstrCalc.get( 0 ).contains( "To" )){
                if(strUnit==""){
                    alstrCalc.remove( 0 );
                }else{
                    alstrCalc.set(0, "To"+strUnit );
                }

            }else{
                if(strUnit==""){
                }else{
                    alstrCalc.add( "To"+strUnit );
                }

            }
        }else{

            if(alstrCalc.get( 0 ).contains( "To" )){
                if(strUnit==""){
                }else{

                }
                alstrCalc.set(0, "To"+strUnit );
            }else if(alstrCalc.get(1).contains( "To" )){
                if(strUnit==""){
                    alstrCalc.remove( 1 );
                }else{
                    alstrCalc.set(1, "To"+strUnit );
                }

            }else{
                if(strUnit==""){
                }else{
                    alstrCalc.add(1, "To"+strUnit );
                }

            }
        }
    }

//Conversion
    private ArrayList<String> eliminateConversion(ArrayList<String> x) {
        if(x.get( 0 ).contains( "From")&&x.get( 1 ).contains( "To" )){

            switch (x.get(0)) {
                //l
                case "Frommm":
                    switch (x.get( 1 )){
                        case "Tomm":
                            x.set(0, "1" );
                            x.set( 1,"×" );
                            break;
                        case "Tocm":
                            x.set(0, "100" );
                            x.set( 1,"×" );
                            break;
                        case "Toinch":
                            x.set(0, "0.03937" );
                            x.set( 1,"×" );
                            break;
                        case "Tofeet":
                            x.set(0, "0.003281" );
                            x.set( 1,"×" );
                            break;
                        case "Toyard":
                            x.set(0, "0.001094" );
                            x.set( 1,"×" );
                            break;
                        case "Tom":
                            x.set(0, "0.001" );
                            x.set( 1,"×" );
                            break;
                        case "Tokm":
                            x.set(0, "0.000001" );
                            x.set( 1,"×" );
                            break;
                        case "Tomile":
                            x.set(0, "0.0000006214" );
                            x.set( 1,"×" );
                            break;
                        default:
                            x.set(0, "Invalid Conversion" );
                    }


                case "Frocmm":
                    switch (x.get( 1 )){
                        case "Tomm":
                            x.set(0, "10" );
                            x.set( 1,"×" );
                            break;
                        case "Tocm":
                            x.set(0, "1" );
                            x.set( 1,"×" );
                            break;
                        case "Toinch":
                            x.set(0, "0.3937" );
                            x.set( 1,"×" );
                            break;
                        case "Tofeet":
                            x.set(0, "0.03281" );
                            x.set( 1,"×" );
                            break;
                        case "Toyard":
                            x.set(0, "0.01094" );
                            x.set( 1,"×" );
                            break;
                        case "Tom":
                            x.set(0, "0.01" );
                            x.set( 1,"×" );
                            break;
                        case "Tokm":
                            x.set(0, "0.00001" );
                            x.set( 1,"×" );
                            break;
                        case "Tomile":
                            x.set(0, "0.000006214" );
                            x.set( 1,"×" );
                            break;
                        default:
                            x.set(0, "Invalid Conversion" );
                    }
                case "Toinch":
                    switch (x.get( 1 )){
                        case "Tomm":
                            x.set(0, "25.4000508" );
                            x.set( 1,"×" );
                            break;
                        case "Tocm":
                            x.set(0, "2.54000508" );
                            x.set( 1,"×" );
                            break;
                        case "Toinch":
                            x.set(0, "1" );
                            x.set( 1,"×" );
                            break;
                        case "Tofeet":
                            x.set(0, "0.083337567" );
                            x.set( 1,"×" );
                            break;
                        case "Toyard":
                            x.set(0, "0.027787656" );
                            x.set( 1,"×" );
                            break;
                        case "Tom":
                            x.set(0, "0.025400051" );
                            x.set( 1,"×" );
                            break;
                        case "Tokm":
                            x.set(0, "0.0000254" );
                            x.set( 1,"×" );
                            break;
                        case "Tomile":
                            x.set(0, "0.000015784" );
                            x.set( 1,"×" );
                            break;
                        default:
                            x.set(0, "Invalid Conversion" );
                    }

                case "Tofeet":
                    switch (x.get( 1 )){
                        case "Tomm":
                            x.set(0, "304.785126486" );
                            x.set( 1,"×" );
                            break;
                        case "Tocm":
                            x.set(0, "30.478512649" );
                            x.set( 1,"×" );
                            break;
                        case "Toinch":
                            x.set(0, "11.99939043" );
                            x.set( 1,"×" );
                            break;
                        case "Tofeet":
                            x.set(0, "1" );
                            x.set( 1,"×" );
                            break;
                        case "Toyard":
                            x.set(0, "0.333434928" );
                            x.set( 1,"×" );
                            break;
                        case "Tom":
                            x.set(0, "0.304785126" );
                            x.set( 1,"×" );
                            break;
                        case "Tokm":
                            x.set(0, "0.000304785" );
                            x.set( 1,"×" );
                            break;
                        case "Tomile":
                            x.set(0, "0.000189393" );
                            x.set( 1,"×" );
                            break;
                        default:
                            x.set(0, "Invalid Conversion" );
                    }
                case "Toyard":
                    switch (x.get( 1 )){
                        case "Tomm":
                            x.set(0, "914.07678245" );
                            x.set( 1,"×" );
                            break;
                        case "Tocm":
                            x.set(0, "91.407678245" );
                            x.set( 1,"×" );
                            break;
                        case "Toinch":
                            x.set(0, "35.98720292" );
                            x.set( 1,"×" );
                            break;
                        case "Tofeet":
                            x.set(0, "2.999085923" );
                            x.set( 1,"×" );
                            break;
                        case "Toyard":
                            x.set(0, "1" );
                            x.set( 1,"×" );
                            break;
                        case "Tom":
                            x.set(0, "0.914076782" );
                            x.set( 1,"×" );
                            break;
                        case "Tokm":
                            x.set(0, "0.000914077" );
                            x.set( 1,"×" );
                            break;
                        case "Tomile":
                            x.set(0, "0.000568007" );
                            x.set( 1,"×" );
                            break;
                        default:
                            x.set(0, "Invalid Conversion" );
                    }
                case "Fromm":
                    switch (x.get( 1 )){
                        case "Tom":
                            x.set(0, "1" );
                            x.set( 1,"×" );
                            break;
                        case "Tocm":
                            x.set(0, "100" );
                            x.set( 1,"×" );
                            break;
                        case "Tomm":
                            x.set(0, "1000" );
                            x.set( 1,"×" );
                            break;
                        case "Tokm":
                            x.set(0, ".001" );
                            x.set( 1,"×" );
                            break;
                        case "Toinch":
                            x.set(0, "39.37" );
                            x.set( 1,"×" );
                            break;
                        case "Tofeet":
                            x.set(0, "3.281" );
                            x.set( 1,"×" );
                            break;
                        case "Tomile":
                            x.set(0, "0.0006214" );
                            x.set( 1,"×" );
                            break;
                        case "Toyard":
                            x.set(0, "1.094" );
                            x.set( 1,"×" );
                            break;
                        default:
                            x.set(0, "Invalid Conversion" );
                    }

                case "Fromkm":
                    switch (x.get( 1 )){
                        case "Tomm":
                            x.set(0, "1000000" );
                            x.set( 1,"×" );
                            break;
                        case "Tocm":
                            x.set(0, "100000" );
                            x.set( 1,"×" );
                            break;
                        case "Toinch":
                            x.set(0, "39370" );
                            x.set( 1,"×" );
                            break;
                        case "Tofeet":
                            x.set(0, "3281" );
                            x.set( 1,"×" );
                            break;
                        case "Toyard":
                            x.set(0, "1094" );
                            x.set( 1,"×" );
                            break;
                        case "Tom":
                            x.set(0, "1000" );
                            x.set( 1,"×" );
                            break;
                        case "Tokm":
                            x.set(0, "1" );
                            x.set( 1,"×" );
                            break;
                        case "Tomile":
                            x.set(0, "0.6214" );
                            x.set( 1,"×" );
                            break;
                        default:
                            x.set(0, "Invalid Conversion" );
                    }

                case "Tomile":
                    switch (x.get( 1 )){
                        case "Tomm":
                            x.set(0, "1609269.391" );
                            x.set( 1,"×" );
                            break;
                        case "Tocm":
                            x.set(0, "160926.939169617" );
                            x.set( 1,"×" );
                            break;
                        case "Toinch":
                            x.set(0, "63356.93595" );
                            x.set( 1,"×" );
                            break;
                        case "Tofeet":
                            x.set(0, "5280.012874155" );
                            x.set( 1,"×" );
                            break;
                        case "Toyard":
                            x.set(0, "1760.540714516" );
                            x.set( 1,"×" );
                            break;
                        case "Tom":
                            x.set(0, "1609.269391696" );
                            x.set( 1,"×" );
                            break;
                        case "Tokm":
                            x.set(0, "1.609269392" );
                            x.set( 1,"×" );
                            break;
                        case "Tomile":
                            x.set(0, "1" );
                            x.set( 1,"×" );
                            break;
                        default:
                            x.set(0, "Invalid Conversion" );
                    }

                default:
                    x.set(0, "Invalid Conversion" );
            }
        }
        return x;
    }

}
