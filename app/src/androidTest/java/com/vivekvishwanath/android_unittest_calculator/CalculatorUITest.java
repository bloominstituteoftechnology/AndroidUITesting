package com.vivekvishwanath.android_unittest_calculator;

import android.widget.Button;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
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
        onView((withId(R.id.display_screen))).perform(clearText());
        onView(withId(R.id.one_button)).perform((click()));
        onView(withId(R.id.display_screen)).check(matches(withText(number)));
    }

    @Test
    public void calculatorUITest_shouldAdd2ToDisplay() {
        String number = ((Button)mainActivityActivityTestRule
                .getActivity().findViewById(R.id.two_button)).getText().toString();
        onView((withId(R.id.display_screen))).perform(clearText());
        onView(withId(R.id.two_button)).perform((click()));
        onView(withId(R.id.display_screen)).check(matches(withText(number)));
    }

    @Test
    public void calculatorUITest_shouldAdd3ToDisplay() {
        String number = ((Button)mainActivityActivityTestRule
                .getActivity().findViewById(R.id.three_button)).getText().toString();
        onView((withId(R.id.display_screen))).perform(clearText());
        onView(withId(R.id.three_button)).perform((click()));
        onView(withId(R.id.display_screen)).check(matches(withText(number)));
    }

    @Test
    public void calculatorUITest_shouldAdd4ToDisplay() {
        String number = ((Button)mainActivityActivityTestRule
                .getActivity().findViewById(R.id.four_button)).getText().toString();
        onView((withId(R.id.display_screen))).perform(clearText());
        onView(withId(R.id.four_button)).perform((click()));
        onView(withId(R.id.display_screen)).check(matches(withText(number)));
    }

    @Test
    public void calculatorUITest_shouldAdd5ToDisplay() {
        String number = ((Button)mainActivityActivityTestRule
                .getActivity().findViewById(R.id.five_button)).getText().toString();
        onView((withId(R.id.display_screen))).perform(clearText());
        onView(withId(R.id.five_button)).perform((click()));
        onView(withId(R.id.display_screen)).check(matches(withText(number)));
    }

    @Test
    public void calculatorUITest_shouldAdd6ToDisplay() {
        String number = ((Button)mainActivityActivityTestRule
                .getActivity().findViewById(R.id.six_button)).getText().toString();
        onView((withId(R.id.display_screen))).perform(clearText());
        onView(withId(R.id.six_button)).perform((click()));
        onView(withId(R.id.display_screen)).check(matches(withText(number)));
    }

    @Test
    public void calculatorUITest_shouldAdd7ToDisplay() {
        String number = ((Button)mainActivityActivityTestRule
                .getActivity().findViewById(R.id.seven_button)).getText().toString();
        onView((withId(R.id.display_screen))).perform(clearText());
        onView(withId(R.id.seven_button)).perform((click()));
        onView(withId(R.id.display_screen)).check(matches(withText(number)));
    }

    @Test
    public void calculatorUITest_shouldAdd8ToDisplay() {
        String number = ((Button)mainActivityActivityTestRule
                .getActivity().findViewById(R.id.eight_button)).getText().toString();
        onView((withId(R.id.display_screen))).perform(clearText());
        onView(withId(R.id.eight_button)).perform((click()));
        onView(withId(R.id.display_screen)).check(matches(withText(number)));
    }

    @Test
    public void calculatorUITest_shouldAdd9ToDisplay() {
        String number = ((Button)mainActivityActivityTestRule
                .getActivity().findViewById(R.id.nine_button)).getText().toString();
        onView((withId(R.id.display_screen))).perform(clearText());
        onView(withId(R.id.nine_button)).perform((click()));
        onView(withId(R.id.display_screen)).check(matches(withText(number)));
    }

    @Test
    public void calculatorUITest_shouldAddDecimalToDisplay() {
        String number = ((Button)mainActivityActivityTestRule
                .getActivity().findViewById(R.id.decimal_button)).getText().toString();
        onView((withId(R.id.display_screen))).perform(clearText());
        onView(withId(R.id.decimal_button)).perform((click()));
        onView(withId(R.id.display_screen)).check(matches(withText(number)));
    }

    @Test
    public void calculatorUITest_shouldAdd0ToDisplay() {
        String number = ((Button)mainActivityActivityTestRule
                .getActivity().findViewById(R.id.zero_button)).getText().toString();
        onView((withId(R.id.display_screen))).perform(clearText());
        onView(withId(R.id.zero_button)).perform((click()));
        onView(withId(R.id.display_screen)).check(matches(withText(number)));
    }

    @Test
    public void calculatorUITest_shouldAddMultipleNumbersToDisplay() {
        String number = ((Button)mainActivityActivityTestRule
                .getActivity().findViewById(R.id.three_button)).getText().toString()
                + ((Button)mainActivityActivityTestRule
                .getActivity().findViewById(R.id.nine_button)).getText().toString()
                + ((Button)mainActivityActivityTestRule
                .getActivity().findViewById(R.id.decimal_button)).getText().toString();
        onView((withId(R.id.display_screen))).perform(clearText());
        onView(withId(R.id.three_button)).perform((click()));
        onView(withId(R.id.nine_button)).perform((click()));
        onView(withId(R.id.decimal_button)).perform((click()));
        onView(withId(R.id.display_screen)).check(matches(withText(number)));
    }

    @Test
    public void calculatorUITest_addTwoNumbers() {
        
    }
}
