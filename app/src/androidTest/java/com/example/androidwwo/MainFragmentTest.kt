package com.example.androidwwo

import android.content.res.Resources
import android.widget.AutoCompleteTextView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import com.example.androidwwo.di.weatherModule
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin


@RunWith(AndroidJUnit4::class)
@LargeTest
class MainFragmentTest {

    @get:Rule
    var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)


    @Before
    open fun setUp() {
        this.configureDi()
    }

    @After
    fun stop(){
        stopKoin()
    }

    @Test
    fun onViewTest() {
        onView(withText("Enter a location to search on WWO")).check(matches(isDisplayed()))
        Resources.getSystem().getIdentifier("search_src_text",
            "id", "android")
//        onView(withText("Search Location")).check(matches(isDisplayed()))
    }

    @Test
    fun onSearchViewTest(){
//        onView(withId(R.id.searchLocation)).perform(click())
//        onView(withId(R.id.searchLocation)).perform(typeText("something"));
//        onView(isAssignableFrom(AutoCompleteTextView::class.java))
//            .perform(typeText("something"))
    }

    private fun configureDi() {
        stop()
        startKoin {
            androidContext(activityRule.activity)
            modules(
                listOf(
                    weatherModule
                )
            )
        }
    }
}