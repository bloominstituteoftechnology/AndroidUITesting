package com.shoon.androiduitesting;

import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityTestRule = new ActivityTestRule<>( MainActivity.class, false, true );

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void onCreate() {
        // Espresso.onView( (Matchers.allOf( ViewMatchers.withId( R.id.button0 ),ViewMatchers.isDisplayed() ))).perform( ViewActions.click() );
        Intents.init();
    }

    @Test
    public void testInput0(){
        onView( withId( R.id.button0 ) )
                .perform( click() );
        onView( withId( R.id.buttonEqual ) )
                .perform( click() );
        onView( withId( R.id.textResult ) ).check( matches( ViewMatchers.withText( "1" ) ) );
        Intents.release();
    }

    @Test
    public void testInput1(){
        onView( withId( R.id.button1 ) )
                .perform( click() );
        onView( withId( R.id.buttonEqual ) )
                .perform( click() );


        onView( withId( R.id.textResult ) ).check( matches( ViewMatchers.withText( "1" ) ) );
        Intents.release();
    }
}