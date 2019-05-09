package com.jakeesveld.android_ui_testing;

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
    public void mainActivity_PerformCalculation_ReturnsResult(){
        onView(withId(R.id.button_1)).perform(ViewActions.click());

        onView(withId(R.id.text_output)).check(matches(withText("1")));

        onView(withId(R.id.button_add)).perform(ViewActions.click());

        onView(withId(R.id.button_add)).check(matches(withText("*+*")));

        onView(withId(R.id.button_2)).perform(ViewActions.click());

        onView(withId(R.id.text_output)).check(matches(withText("2")));

        onView(withId(R.id.button_equals)).perform(ViewActions.click());

        onView(withId(R.id.text_output)).check(matches(withText("3")));

    }

}