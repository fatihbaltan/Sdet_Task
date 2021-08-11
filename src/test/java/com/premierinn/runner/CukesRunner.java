package com.premierinn.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/premierinn/step_definitions",
        dryRun = false,
        tags = "@wip"
)

public class CukesRunner {
}
