package com.example.calcuitesting;

import android.content.Intent;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import android.content.Intent;

import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
	
	public class MainActivityTest {
		
		public Calculator calculator;
		
		@Rule
		public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>
				(MainActivity.class);
		
		
		@Before
		public void setUp() {
			calculator = new Calculator();
		}
		
		@Test
		public void detailsActivity_DisplayUserName_ReturnsTrue() {
			onView(withId(R.id.tv_result)).check(matches(withText(calculator.getDisplayText())));
		}
	}
