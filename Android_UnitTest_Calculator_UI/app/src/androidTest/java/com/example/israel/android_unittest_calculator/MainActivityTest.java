package com.example.israel.android_unittest_calculator;

import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setup() {

    }

    @Test
    public void shouldSetTextTo9() {
        // setup
        final ViewInteraction outputView = onView(withId(R.id.text_calculator_symbols));

        final ViewInteraction button = onView(withId(R.id.button_9));
        button.perform(ViewActions.click());

        outputView.check(ViewAssertions.matches(withText("9")));

    }

    @Test
    public void shouldSetTextTo20() {
        // setup
        final ViewInteraction outputView = onView(withId(R.id.text_calculator_symbols));

        final ViewInteraction button1 = onView(withId(R.id.button_1));
        button1.perform(ViewActions.click());

        final ViewInteraction button4 = onView(withId(R.id.button_4));
        button4.perform(ViewActions.click());

        final ViewInteraction buttonAdd = onView(withId(R.id.button_add));
        buttonAdd.perform(ViewActions.click());

        final ViewInteraction button6 = onView(withId(R.id.button_6));
        button6.perform(ViewActions.click());

        final ViewInteraction buttonEquals = onView(withId(R.id.button_equals));
        buttonEquals.perform(ViewActions.click());

        outputView.check(ViewAssertions.matches(withText("20")));
    }

}