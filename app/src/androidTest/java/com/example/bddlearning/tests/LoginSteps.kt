package com.example.bddlearning.tests

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.bddlearning.R
import com.example.bddlearning.tests.ui.login.LoginActivity
import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.hamcrest.Matchers.not
import org.hamcrest.core.AllOf.allOf
import org.junit.Rule
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class LoginSteps{

    @Rule
    var activityScenarioRule: ActivityScenarioRule<LoginActivity> = ActivityScenarioRule(LoginActivity::class.java)

    @Given("The app started")
    fun the_app_started() {
        ActivityScenario.launch(LoginActivity::class.java)
    }

    @When("I input email (\\S+)")
    fun i_input_email(email: String) {
        onView(withId(R.id.etEmail)).perform(typeText(email))
    }

    @And("I input password (\\S+)")
    fun i_input_password(password: String) {
        onView(withId(R.id.etPassword)).perform(typeText(password))
    }

    @Then("I should see error on the (\\S+)")
    fun i_should_see_error_on_the_screen(viewName: String) {
        val viewId = when (viewName){
            "email" -> R.id.layoutEmail
            else -> R.id.layoutPassword
        }

        val messageId = when (viewName){
            "email" -> R.string.invalid_email.toString()
            else -> R.string.invalid_password.toString()
        }

        onView(allOf(withId(viewId), withText(messageId)))
    }

    @Then("I should (\\S+) error on the view")
    fun i_should_see_error_on_the_view(viewName: String) {
        onView(allOf(withId(R.id.layoutEmail), not(withText(R.string.invalid_email.toString()))))
        onView(allOf(withId(R.id.layoutPassword), not(withText(R.string.invalid_password.toString()))))
    }
}