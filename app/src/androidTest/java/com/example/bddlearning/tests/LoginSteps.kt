package com.example.bddlearning.tests

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.bddlearning.R
import com.example.bddlearning.tests.ui.login.LoginActivity
import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.hamcrest.Matchers.not
import org.hamcrest.core.AllOf.allOf
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class LoginSteps{
    @Given("The app started")
    fun the_app_started() {
    }

    @When("I input email (\\S+)")
    fun i_input_email(email: String) {
    }

    @And("I input password (\\S+)")
    fun i_input_password(password: String) {
    }

    @Then("I should see error on the (\\S+)")
    fun i_should_see_error_on_the_screen(viewName: String) {
    }

    @Then("I should not see error on the view")
    fun i_should_not_see_error_on_the_view() {
    }
}