package kg.varis.tests

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class ActivityTest {

    @Rule
    @JvmField
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleDivide() {
        Espresso.onView(withId(R.id.count)).perform(ViewActions.typeText("100"))
        Espresso.onView(withId(R.id.count)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.second_count)).perform(ViewActions.typeText("0"))
        Espresso.onView(withId(R.id.second_count)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.btn_result)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.result))
            .check(ViewAssertions.matches(ViewMatchers.withText("Нельзя делить на ноль (0)")))
    }
}