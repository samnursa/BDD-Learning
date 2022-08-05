package com.example.bddlearning.tests

import io.cucumber.android.runner.CucumberAndroidJUnitRunner
import io.cucumber.junit.CucumberOptions

@CucumberOptions(
    // feature for instructs Cucumber where it should look for the feature files
    features = ["features"],
    // glue enables us to specify a package such as test step definitions
    glue = ["com.example.bddlearning.tests"],
    // tags for state work in progress (optional)
    tags = ["~@wip"],
)

// inherit AndroidJUnitRunner with Cucumber
class ExampleAppAndroidTestRunner : CucumberAndroidJUnitRunner()