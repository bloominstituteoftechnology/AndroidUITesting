package com.shoon.androiduitesting;

import android.support.test.espresso.ViewAction;
import android.support.test.espresso.assertion.ViewAssertions;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewAssertion;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.regex.Matcher;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasData;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityTestRule = new ActivityTestRule<>(MainActivity.class, false, true);

    @Before
    public void setUp() throws Exception {
        Intents.init();
    }

    @Test
    public void onCreate() {
       // Espresso.onView( (Matchers.allOf( ViewMatchers.withId( R.id.button0 ),ViewMatchers.isDisplayed() ))).perform( ViewActions.click() );
        onView(withId(R.id.button1))
                .perform(click());
        onView(withId(R.id.buttonEqual))
                .perform(click());

        onView(withId(R.id.textResult)).check(matches(ViewMatchers.withText("1.0")));
        Intents.release();
    }


}