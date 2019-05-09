package com.example.calcuitesting;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest {
	
	@Rule
	public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>
			(MainActivity.class);
	
	
	@Before
	public void setUp() {
	}
	
	@Test
	public void mainActivity_InputMatchesData_ResultTrue() {
		onView(withId(R.id.btn_1)).perform(click());
		onView(withId(R.id.btn_plus)).perform(click());
		onView(withId(R.id.btn_3)).perform(click());
		onView(withId(R.id.btn_equal)).perform(click());
		onView(withId(R.id.tv_input)).check(matches(withText(MainActivity.calculator.getDisplayText())));
	}
	
	@Test
	public void mainActivity_ResultMatchesData_ResultTrue() {
		onView(withId(R.id.btn_1)).perform(click());
		onView(withId(R.id.btn_plus)).perform(click());
		onView(withId(R.id.btn_3)).perform(click());
		onView(withId(R.id.btn_equal)).perform(click());
		onView(withId(R.id.tv_result)).check(matches(withText(MainActivity.calculator.getResult())));
	}
	
	@Test
	public void mainActivity_InputMatchesBtn1_ResultTrue() {
		onView(withId(R.id.btn_1)).perform(click());
		onView(withId(R.id.tv_input)).check(matches(withText("1      ")));
	}
	
	@Test
	public void mainActivity_InputMatchesBtn2_ResultTrue() {
		onView(withId(R.id.btn_2)).perform(click());
		onView(withId(R.id.tv_input)).check(matches(withText("2      ")));
	}
	
	@Test
	public void mainActivity_InputMatchesBtn3_ResultTrue() {
		onView(withId(R.id.btn_3)).perform(click());
		onView(withId(R.id.tv_input)).check(matches(withText("3      ")));
	}
	
	@Test
	public void mainActivity_InputMatchesBtn4_ResultTrue() {
		onView(withId(R.id.btn_4)).perform(click());
		onView(withId(R.id.tv_input)).check(matches(withText("4      ")));
	}
	
	@Test
	public void mainActivity_InputMatchesBtn5_ResultTrue() {
		onView(withId(R.id.btn_5)).perform(click());
		onView(withId(R.id.tv_input)).check(matches(withText("5      ")));
	}
	
	@Test
	public void mainActivity_InputMatchesBtn6_ResultTrue() {
		onView(withId(R.id.btn_6)).perform(click());
		onView(withId(R.id.tv_input)).check(matches(withText("6      ")));
	}
	
	@Test
	public void mainActivity_InputMatchesBtn7_ResultTrue() {
		onView(withId(R.id.btn_7)).perform(click());
		onView(withId(R.id.tv_input)).check(matches(withText("7      ")));
	}
	
	@Test
	public void mainActivity_InputMatchesBtn8_ResultTrue() {
		onView(withId(R.id.btn_8)).perform(click());
		onView(withId(R.id.tv_input)).check(matches(withText("8      ")));
	}
	
	@Test
	public void mainActivity_InputMatchesBtn9_ResultTrue() {
		onView(withId(R.id.btn_9)).perform(click());
		onView(withId(R.id.tv_input)).check(matches(withText("9      ")));
	}
	
	@Test
	public void mainActivity_InputMatchesBtn0_ResultTrue() {
		onView(withId(R.id.btn_0)).perform(click());
		onView(withId(R.id.tv_input)).check(matches(withText("0      ")));
	}
	
	
	@Test
	public void mainActivity_InputMatchesBtnTimes_ResultTrue() {
		onView(withId(R.id.btn_6)).perform(click());
		onView(withId(R.id.btn_times)).perform(click());
		onView(withId(R.id.tv_input)).check(matches(withText("6   *   ")));
	}
	
	
	@Test
	public void mainActivity_InputMatchesBtnMinus_ResultTrue() {
		onView(withId(R.id.btn_6)).perform(click());
		onView(withId(R.id.btn_minus)).perform(click());
		onView(withId(R.id.tv_input)).check(matches(withText("6   -   ")));
	}
	
	
	@Test
	public void mainActivity_InputMatchesBtnPlus_ResultTrue() {
		onView(withId(R.id.btn_6)).perform(click());
		onView(withId(R.id.btn_plus)).perform(click());
		onView(withId(R.id.tv_input)).check(matches(withText("6   +   ")));
	}
	
	
	@Test
	public void mainActivity_InputMatchesBtnSqrt_ResultTrue() {
		onView(withId(R.id.btn_6)).perform(click());
		onView(withId(R.id.btn_sqrt)).perform(click());
		onView(withId(R.id.tv_input)).check(matches(withText("6   √   ")));
	}
	
	
	@Test
	public void mainActivity_InputMatchesBtnPower_ResultTrue() {
		onView(withId(R.id.btn_6)).perform(click());
		onView(withId(R.id.btn_power)).perform(click());
		onView(withId(R.id.tv_input)).check(matches(withText("6   ^   ")));
	}
	
	
	@Test
	public void mainActivity_InputMatchesBtnDivide_ResultTrue() {
		onView(withId(R.id.btn_6)).perform(click());
		onView(withId(R.id.btn_divide)).perform(click());
		onView(withId(R.id.tv_input)).check(matches(withText("6   /    ")));
	}
	
	
	@Test
	public void mainActivity_InputMatchesBtnDot_ResultTrue() {
		onView(withId(R.id.btn_6)).perform(click());
		onView(withId(R.id.btn_dot)).perform(click());
		onView(withId(R.id.tv_input)).check(matches(withText("6.      ")));
	}
	
	
	@Test
	public void mainActivity_MultiplicationFunction_ResultTrue() {
		onView(withId(R.id.btn_6)).perform(click());
		onView(withId(R.id.btn_times)).perform(click());
		onView(withId(R.id.btn_6)).perform(click());
		onView(withId(R.id.btn_equal)).perform(click());
		onView(withId(R.id.tv_result)).check(matches(withText("36.0")));
	}
	
	@Test
	public void mainActivity_InputMatchesBtnDel_ResultTrue() {
		onView(withId(R.id.btn_6)).perform(click());
		onView(withId(R.id.btn_times)).perform(click());
		onView(withId(R.id.btn_6)).perform(click());
		onView(withId(R.id.btn_equal)).perform(click());
		onView(withId(R.id.tv_result)).check(matches(withText("36.0")));
	}
	
	@Test
	public void mainActivity_SubtractionFunction_ResultTrue() {
		onView(withId(R.id.btn_6)).perform(click());
		onView(withId(R.id.btn_minus)).perform(click());
		onView(withId(R.id.btn_3)).perform(click());
		onView(withId(R.id.btn_equal)).perform(click());
		onView(withId(R.id.tv_result)).check(matches(withText("3.0")));
	}
	
	@Test
	public void mainActivity_AdditionFunction_ResultTrue() {
		onView(withId(R.id.btn_6)).perform(click());
		onView(withId(R.id.btn_plus)).perform(click());
		onView(withId(R.id.btn_6)).perform(click());
		onView(withId(R.id.btn_equal)).perform(click());
		onView(withId(R.id.tv_result)).check(matches(withText("12.0")));
	}
	
	@Test
	public void mainActivity_DivideFunction_ResultTrue() {
		onView(withId(R.id.btn_6)).perform(click());
		onView(withId(R.id.btn_divide)).perform(click());
		onView(withId(R.id.btn_2)).perform(click());
		onView(withId(R.id.btn_equal)).perform(click());
		onView(withId(R.id.tv_result)).check(matches(withText("3.0")));
	}
	
	@Test
	public void mainActivity_SqrtFunction_ResultTrue() {
		onView(withId(R.id.btn_3)).perform(click());
		onView(withId(R.id.btn_6)).perform(click());
		onView(withId(R.id.btn_sqrt)).perform(click());
		onView(withId(R.id.btn_equal)).perform(click());
		onView(withId(R.id.tv_result)).check(matches(withText("6.0")));
	}
	
	@Test
	public void mainActivity_PowerFunction_ResultTrue() {
		onView(withId(R.id.btn_2)).perform(click());
		onView(withId(R.id.btn_power)).perform(click());
		onView(withId(R.id.btn_6)).perform(click());
		onView(withId(R.id.btn_equal)).perform(click());
		onView(withId(R.id.tv_result)).check(matches(withText("64.0")));
	}
}
