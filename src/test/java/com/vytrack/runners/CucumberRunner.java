package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/vytrack/step_definitions",
        features = "src/test/resources/features",
        dryRun = true,
        strict = false,
       // tags="@sales_manager and @driver"==>we dont have both scenario for use and tag
        tags="@activities",
        plugin="html:target/cucumber-html-report"
)
// new fixed new one
public class CucumberRunner {


}
