package com.jakeesveld.android_ui_testing;

import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.widget.TextViewCompat;
import android.view.View;

import androidx.test.espresso.action.ViewActions;
import androidx.test.rule.ActivityTestRule;

import com.jakeesveld.android_ui_testing.Objects.Calculator;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class MainActivityTest {

    Calculator calculator;
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class, false, true);

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void mainActivity_PressToAddSymbol_ReturnsButtonPressed(){
        onView(withId(R.id.button_1)).perform(ViewActions.click());

        onView(withId(R.id.text_output)).check(matches(withText("1")));
    }

    @Test
    public void mainActivity_AddSymbolThenChangeOperand_OperandHighlighted(){
        onView(withId(R.id.button_1)).perform(ViewActions.click());

        onView(withId(R.id.text_output)).check(matches(withText("1")));

        onView(withId(R.id.button_add)).perform(ViewActions.click());

        onView(withId(R.id.button_add)).check(matches(withText("*+*")));
    }

    @Test
    public void mainActivity_PerformAddCalculation_ReturnsResult(){
        onView(withId(R.id.button_1)).perform(ViewActions.click());

        onView(withId(R.id.text_output)).check(matches(withText("1")));

        onView(withId(R.id.button_add)).perform(ViewActions.click());

        onView(withId(R.id.button_add)).check(matches(withText("*+*")));

        onView(withId(R.id.button_2)).perform(ViewActions.click());

        onView(withId(R.id.text_output)).check(matches(withText("2")));

        onView(withId(R.id.button_equals)).perform(ViewActions.click());

        onView(withId(R.id.text_output)).check(matches(withText("3")));

    }

    @Test
    public void mainActivity_PerformSubtractCalculation_ReturnsResult(){
        onView(withId(R.id.button_1)).perform(ViewActions.click());

        onView(withId(R.id.text_output)).check(matches(withText("1")));

        onView(withId(R.id.button_subtract)).perform(ViewActions.click());

        onView(withId(R.id.button_subtract)).check(matches(withText("*-*")));

        onView(withId(R.id.button_2)).perform(ViewActions.click());

        onView(withId(R.id.text_output)).check(matches(withText("2")));

        onView(withId(R.id.button_equals)).perform(ViewActions.click());

        onView(withId(R.id.text_output)).check(matches(withText("-1")));

    }

    @Test
    public void mainActivity_PerformMultiplication_ReturnsResult(){
        onView(withId(R.id.button_2)).perform(ViewActions.click());
        onView(withId(R.id.text_output)).check(matches(withText("2")));
        onView(withId(R.id.button_multiply)).perform(ViewActions.click());
        onView(withId(R.id.button_multiply)).check(matches(withText("*x*")));
        onView(withId(R.id.button_5)).perform(ViewActions.click());
        onView(withId(R.id.text_output)).check(matches(withText("5")));
        onView(withId(R.id.button_equals)).perform(ViewActions.click());
        onView(withId(R.id.text_output)).check(matches(withText("10")));
    }

    @Test
    public void mainActivity_PerformDivision_ReturnsResult(){
        onView(withId(R.id.button_5)).perform(ViewActions.click());
        onView(withId(R.id.button_0)).perform(ViewActions.click());
        onView(withId(R.id.text_output)).check(matches(withText("50")));
        onView(withId(R.id.button_divide)).perform(ViewActions.click());
        onView(withId(R.id.button_divide)).check(matches(withText("*/*")));
        onView(withId(R.id.button_5)).perform(ViewActions.click());
        onView(withId(R.id.text_output)).check(matches(withText("5")));
        onView(withId(R.id.button_equals)).perform(ViewActions.click());
        onView(withId(R.id.text_output)).check(matches(withText("10")));
    }

    @Test
    public void mainActivity_PerformSquare_ReturnsResult(){
        onView(withId(R.id.button_3)).perform(ViewActions.click());
        onView(withId(R.id.button_square)).perform(ViewActions.click());
        onView(withId(R.id.text_output)).check(matches(withText("9")));
    }

    @Test
    public void mainActivity_PerformSquareRoot_ReturnsResult(){
        onView(withId(R.id.button_9)).perform(ViewActions.click());
        onView(withId(R.id.button_sqrt)).perform(ViewActions.click());
        onView(withId(R.id.text_output)).check(matches(withText("3")));
    }

    @Test
    public void mainActivity_AddDecimalNumbers_ReturnsResult(){
        onView(withId(R.id.button_1)).perform(ViewActions.click());
        onView(withId(R.id.button_dot)).perform(ViewActions.click());
        onView(withId(R.id.button_5)).perform(ViewActions.click());
        onView(withId(R.id.text_output)).check(matches(withText("1.5")));
        onView(withId(R.id.button_add)).perform(ViewActions.click());
        onView(withId(R.id.button_2)).perform(ViewActions.click());
        onView(withId(R.id.button_dot)).perform(ViewActions.click());
        onView(withId(R.id.button_2)).perform(ViewActions.click());
        onView(withId(R.id.button_5)).perform(ViewActions.click());
        onView(withId(R.id.text_output)).check(matches(withText("2.25")));
        onView(withId(R.id.button_equals)).perform(ViewActions.click());
        onView(withId(R.id.text_output)).check(matches(withText("3.75")));
    }

    @Test
    public void mainActivity_RemoveLastNumber_ReturnsResult(){
        onView(withId(R.id.button_1)).perform(ViewActions.click());
        onView(withId(R.id.button_5)).perform(ViewActions.click());
        onView(withId(R.id.button_back)).perform(ViewActions.click());
        onView(withId(R.id.text_output)).check(matches(withText("1")));
    }

    @Test
    public void mainActivity_ClearCalculator_ResetsUI(){
        onView(withId(R.id.button_1)).perform(ViewActions.click());
        onView(withId(R.id.button_add)).perform(ViewActions.click());
        onView(withId(R.id.button_4)).perform(ViewActions.click());
        onView(withId(R.id.text_output)).check(matches(withText("4")));
        onView(withId(R.id.button_clear)).perform(ViewActions.click());
        onView(withId(R.id.text_output)).check(matches(withText("Output")));
    }

    @Test
    public void mainACtivity_ContinousCalculations_ReturnsResults(){
        onView(withId(R.id.button_5)).perform(ViewActions.click());
        onView(withId(R.id.button_add)).perform(ViewActions.click());
        onView(withId(R.id.button_5)).perform(ViewActions.click());
        onView(withId(R.id.button_equals)).perform(ViewActions.click());
        onView(withId(R.id.text_output)).check(matches(withText("10")));
        onView(withId(R.id.button_equals)).perform(ViewActions.click());
        onView(withId(R.id.text_output)).check(matches(withText("15")));
        onView(withId(R.id.button_equals)).perform(ViewActions.click());
        onView(withId(R.id.text_output)).check(matches(withText("20")));
    }

    @Test
    public void mainActivity_ContinousCalculationsChangeOperand_ReturnsResult(){
        onView(withId(R.id.button_5)).perform(ViewActions.click());
        onView(withId(R.id.button_add)).perform(ViewActions.click());
        onView(withId(R.id.button_5)).perform(ViewActions.click());
        onView(withId(R.id.button_equals)).perform(ViewActions.click());
        onView(withId(R.id.text_output)).check(matches(withText("10")));
        onView(withId(R.id.button_equals)).perform(ViewActions.click());
        onView(withId(R.id.text_output)).check(matches(withText("15")));
        onView(withId(R.id.button_subtract)).perform(ViewActions.click());
        onView(withId(R.id.button_3)).perform(ViewActions.click());
        onView(withId(R.id.button_equals)).perform(ViewActions.click());
        onView(withId(R.id.text_output)).check(matches(withText("12")));
    }

}