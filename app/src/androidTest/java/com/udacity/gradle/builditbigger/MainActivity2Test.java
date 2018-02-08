//package com.udacity.gradle.builditbigger;
//
//import android.support.test.espresso.Espresso;
//import android.support.test.espresso.IdlingResource;
//import android.support.test.rule.ActivityTestRule;
//import android.support.test.runner.AndroidJUnit4;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//import static android.support.test.espresso.action.ViewActions.click;
//import static android.support.test.espresso.assertion.ViewAssertions.matches;
//import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
//import static android.support.test.espresso.matcher.ViewMatchers.withId;
//import static android.support.test.espresso.Espresso.onView;
//import static android.support.test.espresso.matcher.ViewMatchers.withText;
//
///**
// * Created by ADMIN on 1/29/2018.
// */
//not working yet!!
//@RunWith(AndroidJUnit4.class)
//public class MainActivity2Test {
//    @Rule
//    public ActivityTestRule<MainActivity> mainActivityTest = new ActivityTestRule<>(MainActivity.class) ;
//    private IdlingResource idlingResource ;
//
//    @Before
//    public void registerIdlingResource() {
//        idlingResource = mainActivityTest.getActivity().getIdlingResource();
//        Espresso.registerIdlingResources(idlingResource);
//    }
//    @Test
//    public void testClickOnButton(){
//        onView(withId(R.id.tell_joke)).check(matches(withText("Tell Joke")));
//        onView((withId(R.id.tell_joke))).perform(click());
//        onView(withId(R.id.joke_textview)).check(matches(withText("A wizard joke")));
//
//    }
//
//
//
//    @After
//    public void unregisterIdlingResource() {
//        if(idlingResource != null )
//            Espresso.unregisterIdlingResources(idlingResource);
//    }
//}
