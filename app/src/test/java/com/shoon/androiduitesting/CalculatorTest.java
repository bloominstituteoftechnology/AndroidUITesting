package com.shoon.androiduitesting;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    ArrayList<String> als;
    Calculator calc;
    @Before
    public void setUp() throws Exception {
        calc=new Calculator(  );

        als=new ArrayList<>(  );
    }


    @Test
    public void testOne() {
        als.add("1");
        assertEquals( "1",calc.calculate(als  ));
    }
    @Test
    public void testPlusOne() {
        als.add("1");
        als.add("+");
        als.add("1");
        assertEquals( "2.0",calc.calculate(als  ));
    }
    @Test
    public void testOnePairBracket() {
        als.add("(");
        als.add("1");
        als.add("+");
        als.add("1");
        als.add(")");
        assertEquals( "2.0",calc.calculate(als  ));
    }

    @Test
    public void testTwePairsBracket() {
        als.add("(");
        als.add("1");
        als.add("+");
        als.add("1");
        als.add(")");
        als.add("+");
        als.add("(");
        als.add("1");
        als.add("+");
        als.add("1");
        als.add(")");
        assertEquals( "4.0",calc.calculate(als  ));
    }

    public void testTwePairsBracket2() {
        als.add("2");
        als.add("(");
        als.add("1");
        als.add("+");
        als.add("1");
        als.add(")");
        als.add("+");
        als.add("2");
        als.add("(");
        als.add("1");
        als.add("+");
        als.add("1");
        als.add(")");
        assertEquals( "8.0",calc.calculate(als  ));
    }


    public void testTwePairsBracketx2() {
        als.add("2");
        als.add("*");
        als.add("(");
        als.add("1");
        als.add("+");
        als.add("1");
        als.add(")");
        als.add("+");
        als.add("2");
        als.add("*");
        als.add("(");
        als.add("1");
        als.add("+");
        als.add("1");
        als.add(")");
        assertEquals( "8.0",calc.calculate(als  ));
    }
    @Test
    public void testDivision() {
        als.add("10");
        als.add("/");
        als.add("3");
        assertEquals( "3.3333335",calc.calculate(als  ));
    }

    @Test
    public void test2kakeBracket() {
        als.add("2");
        als.add("(");
        als.add("3");
        als.add("+");
        als.add("4");
        als.add(")");

        assertEquals( "14.0",calc.calculate(als  ));
    }


}