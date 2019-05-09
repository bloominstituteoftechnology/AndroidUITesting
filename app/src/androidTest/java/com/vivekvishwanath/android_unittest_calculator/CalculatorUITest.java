package com.vivekvishwanath.android_unittest_calculator;

import android.widget.Button;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class CalculatorUITest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(
            MainActivity.class, false, true);

    @Test
    public void calculatorUITest_shouldAdd1ToDisplay() {
        String number = ((Button)mainActivityActivityTestRule
                .getActivity().findViewById(R.id.one_button)).getText().toString();
        onView(withId(R.id.one_button)).perform((click()));
        onView(withId(R.id.display_screen)).check(matches(withText(number)));
    }
}
