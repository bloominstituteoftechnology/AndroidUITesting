package com.lambdaschool.android_ui_testing_calculator;

import android.view.View;
import android.widget.TextView;

import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;
import androidx.test.rule.ActivityTestRule;

import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static com.lambdaschool.android_ui_testing_calculator.MainActivity.calculator;
import static org.hamcrest.Matchers.allOf;


public class MainActivityTest {

    private static final int DELAY_TIME = 0;

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class, false, true);

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {

    }

    public static ViewAction setTextInTextView(final String value) {
        return new ViewAction() {
            @Override
            public Matcher<View> getConstraints() {
                return allOf(isDisplayed(), isAssignableFrom(TextView.class));
            }

            @Override
            public void perform(UiController uiController, View view) {
                ((TextView) view).setText(value);
            }

            @Override
            public String getDescription() {
                return "replace text";
            }
        };
    }

    @Test
    public void shouldAdd_1_ToUI() throws InterruptedException {
        calculator = new Calculator();
        onView(withId(R.id.button_reset)).perform(click());
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.button_1)).perform(click());
        Thread.sleep(DELAY_TIME);
        calculator.reset();
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.display_output)).check(matches(withText(calculator.addSymbol("1"))));
    }

    @Test
    public void shouldAdd_2_ToUI() throws InterruptedException {
        calculator = new Calculator();
        onView(withId(R.id.button_reset)).perform(click());
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.button_2)).perform(click());
        Thread.sleep(DELAY_TIME);
        calculator.reset();
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.display_output)).check(matches(withText(calculator.addSymbol("2"))));
    }

    @Test
    public void shouldAdd_3_ToUI() throws InterruptedException {
        calculator = new Calculator();
        onView(withId(R.id.button_reset)).perform(click());
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.button_3)).perform(click());
        Thread.sleep(DELAY_TIME);
        calculator.reset();
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.display_output)).check(matches(withText(calculator.addSymbol("3"))));
    }

    @Test
    public void shouldAdd_4_ToUI() throws InterruptedException {
        calculator = new Calculator();
        onView(withId(R.id.button_reset)).perform(click());
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.button_4)).perform(click());
        Thread.sleep(DELAY_TIME);
        calculator.reset();
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.display_output)).check(matches(withText(calculator.addSymbol("4"))));
    }

    @Test
    public void shouldAdd_5_ToUI() throws InterruptedException {
        calculator = new Calculator();
        onView(withId(R.id.button_reset)).perform(click());
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.button_5)).perform(click());
        Thread.sleep(DELAY_TIME);
        calculator.reset();
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.display_output)).check(matches(withText(calculator.addSymbol("5"))));
    }

    @Test
    public void shouldAdd_6_ToUI() throws InterruptedException {
        calculator = new Calculator();
        onView(withId(R.id.button_reset)).perform(click());
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.button_6)).perform(click());
        Thread.sleep(DELAY_TIME);
        calculator.reset();
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.display_output)).check(matches(withText(calculator.addSymbol("6"))));
    }

    @Test
    public void shouldAdd_7_ToUI() throws InterruptedException {
        calculator = new Calculator();
        onView(withId(R.id.button_reset)).perform(click());
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.button_7)).perform(click());
        Thread.sleep(DELAY_TIME);
        calculator.reset();
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.display_output)).check(matches(withText(calculator.addSymbol("7"))));
    }

    @Test
    public void shouldAdd_8_ToUI() throws InterruptedException {
        calculator = new Calculator();
        onView(withId(R.id.button_reset)).perform(click());
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.button_8)).perform(click());
        Thread.sleep(DELAY_TIME);
        calculator.reset();
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.display_output)).check(matches(withText(calculator.addSymbol("8"))));
    }

    @Test
    public void shouldAdd_9_ToUI() throws InterruptedException {
        calculator = new Calculator();
        onView(withId(R.id.button_reset)).perform(click());
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.button_9)).perform(click());
        Thread.sleep(DELAY_TIME);
        calculator.reset();
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.display_output)).check(matches(withText(calculator.addSymbol("9"))));
    }

    @Test
    public void shouldAdd_0_ToUI() throws InterruptedException {
        calculator = new Calculator();
        onView(withId(R.id.button_reset)).perform(click());
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.button_0)).perform(click());
        Thread.sleep(DELAY_TIME);
        calculator.reset();
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.display_output)).check(matches(withText(calculator.addSymbol("0"))));
    }

    @Test
    public void shouldAdd_Plus_ToUI() throws InterruptedException {
        calculator = new Calculator();
        onView(withId(R.id.button_reset)).perform(click());
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.button_plus)).perform(click());
        Thread.sleep(DELAY_TIME);
        calculator.reset();
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.display_output)).check(matches(withText(calculator.addSymbol("+"))));
    }

    @Test
    public void shouldAdd_Minus_ToUI() throws InterruptedException {
        calculator = new Calculator();
        onView(withId(R.id.button_reset)).perform(click());
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.button_minus)).perform(click());
        Thread.sleep(DELAY_TIME);
        calculator.reset();
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.display_output)).check(matches(withText(calculator.addSymbol("-"))));
    }

    @Test
    public void shouldAdd_Times_ToUI() throws InterruptedException {
        calculator = new Calculator();
        onView(withId(R.id.button_reset)).perform(click());
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.button_times)).perform(click());
        Thread.sleep(DELAY_TIME);
        calculator.reset();
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.display_output)).check(matches(withText(calculator.addSymbol("×"))));
    }

    @Test
    public void shouldAdd_DividedBy_ToUI() throws InterruptedException {
        calculator = new Calculator();
        onView(withId(R.id.button_reset)).perform(click());
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.button_divided_by)).perform(click());
        Thread.sleep(DELAY_TIME);
        calculator.reset();
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.display_output)).check(matches(withText(calculator.addSymbol("÷"))));
    }

    @Test
    public void shouldAdd_Squared_ToUI() throws InterruptedException {
        calculator = new Calculator();
        onView(withId(R.id.button_reset)).perform(click());
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.button_squared)).perform(click());
        Thread.sleep(DELAY_TIME);
        calculator.reset();
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.display_output)).check(matches(withText(calculator.addSymbol("²"))));
    }

    @Test
    public void shouldAdd_SquareRoot_ToUI() throws InterruptedException {
        calculator = new Calculator();
        onView(withId(R.id.button_reset)).perform(click());
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.button_square_root)).perform(click());
        Thread.sleep(DELAY_TIME);
        calculator.reset();
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.display_output)).check(matches(withText(calculator.addSymbol("√"))));
    }

    @Test
    public void shouldAdd_Pi_ToUI() throws InterruptedException {
        calculator = new Calculator();
        onView(withId(R.id.button_reset)).perform(click());
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.button_pi)).perform(click());
        Thread.sleep(DELAY_TIME);
        calculator.reset();
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.display_output)).check(matches(withText(calculator.addSymbol("π"))));
    }

    @Test
    public void shouldAdd_Decimal_ToUI() throws InterruptedException {
        calculator = new Calculator();
        onView(withId(R.id.button_reset)).perform(click());
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.button_decimal)).perform(click());
        Thread.sleep(DELAY_TIME);
        calculator.reset();
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.display_output)).check(matches(withText(calculator.addSymbol("."))));
    }

    @Test
    public void should_Calculate_UI() throws InterruptedException {
        calculator = new Calculator();
        onView(withId(R.id.button_reset)).perform(click());
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.button_calculate)).perform(click());
        Thread.sleep(DELAY_TIME);
        calculator.reset();
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.display_output)).check(matches(withText(calculator.calculate())));
    }

    @Test
    public void should_Backspace_Empty() throws InterruptedException {
        calculator = new Calculator();
        onView(withId(R.id.button_reset)).perform(click());
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.button_backspace)).perform(click());
        Thread.sleep(DELAY_TIME);
        calculator.reset();
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.display_output)).check(matches(withText(calculator.backspace())));
    }

    @Test
    public void should_Backspace_One() throws InterruptedException {
        calculator = new Calculator();
        onView(withId(R.id.button_5)).perform(click());
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.button_backspace)).perform(click());
        Thread.sleep(DELAY_TIME);
        calculator.addSymbol("5");
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.display_output)).check(matches(withText(calculator.backspace())));
    }

    @Test
    public void should_Backspace_Multiple() throws InterruptedException {
        calculator = new Calculator();
        calculator.setExpression("123.4+567");
        onView(withId(R.id.display_output)).perform(setTextInTextView(calculator.getExpression()));
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.button_backspace)).perform(click());
        Thread.sleep(DELAY_TIME);
        calculator.setExpression("123.4+567");
        onView(withId(R.id.display_output)).check(matches(withText(calculator.backspace())));
        Thread.sleep(DELAY_TIME);
    }

    @Test
    public void should_Clear_UI() throws InterruptedException {
        calculator = new Calculator();
        //onView(withId(R.id.display_output)).perform(setTextInTextView(""));
        onView(withId(R.id.button_reset)).perform(click());
        Thread.sleep(DELAY_TIME);
        onView(withId(R.id.display_output)).check(matches(withText(calculator.reset())));
    }

}