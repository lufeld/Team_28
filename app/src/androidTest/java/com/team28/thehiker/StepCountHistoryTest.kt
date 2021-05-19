package com.team28.thehiker

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.times
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class StepCountHistoryTest {

    @get:Rule
    var activityRule = ActivityScenarioRule(AltitudeActivity::class.java)

    @Before
    fun setUp() {
        Intents.init()
    }

    @Test
    fun checkOldStepHistory() {
        //check the history of the last 20 days(?)

        onView(withId(R.id.btn_altitude))
            .check(matches(isClickable()))

        onView(withId(R.id.btn_altitude))
            .check(matches(withText("Altitude")))
    }

    @Test
    fun checkHistoryDisplayed(){
        // make sure the history is displayed correctly
    }

    @Test
    fun checkHistorySaved(){
        // check if step count history is saved when closing the app
    }


    @After
    fun cleanUp() {
        Intents.release()
    }
}