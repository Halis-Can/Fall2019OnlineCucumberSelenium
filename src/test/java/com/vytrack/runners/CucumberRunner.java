package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/vytrack/step_definitions",
        features = "src/test/resources",//===>to specify where are the features
        // feture contains scenarios. Every scnario is like a test.
        //where is the implementations for features
        dryRun = false, //==> to generate step definitions automatically you can see them in the console output
        strict = false,
        tags = "@sales_manager",
        plugin = {
                "html:target/default-report",
                "json:target/cucumber1.json",
                "rerun:target/rerun.txt"
        }

)
public class CucumberRunner {


}