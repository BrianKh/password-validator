package com.example.biswe.myapplication;

import android.content.Intent;
import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.Espresso.onView;


@RunWith(AndroidJUnit4.class)
public class EspressoTest {
    private String stringValid;
    private String stringPassed;
    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule(MainActivity.class);
    @Before
    public void initValidAndInvalidString(){
        stringValid = "!AllOfThemAreHere1";
    }
    //Tests if the correct text is viewable
    @Test
    public void checkPass() {
        activityRule.launchActivity(new Intent());
        onView(withId(R.id.editPass)).perform(typeText(stringValid));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.checkPassbt)).perform(click());
        onView(withId(R.id.viewPassed)).check(matches(withText("Strong!")));
    }
}
