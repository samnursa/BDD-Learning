package com.example.bddlearning.tests

import io.cucumber.android.runner.CucumberAndroidJUnitRunner
import io.cucumber.junit.CucumberOptions

// feature for instructs Cucumber where it should look for the feature files
// glue enables us to specify a package such as test step definitions, hooks and plugins (optional)
// tags for state work in progress (optional)
@CucumberOptions(
    features = ["features"],
    glue = ["com.example.bddlearning.tests"],
    tags = ["~@wip"],
)

// inherit AndroidJUnitRunner with Cucumber
class ExampleAppAndroidTestRunner : CucumberAndroidJUnitRunner()