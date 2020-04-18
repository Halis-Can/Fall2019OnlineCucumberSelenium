package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/vytrack/step_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        strict = false,
       // tags="@sales_manager and @driver"==>we dont have both scenario for use and tag
        tags="@login_with_params",
        plugin="html:target/cucumber-html-report"
)
// new fixed new one
public class CucumberRunner {


}
