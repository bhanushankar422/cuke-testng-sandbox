package com.test.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "classpath:/features/sample.feature",
        glue = {"com.test.stepdef", "com.test.config"},
        plugin = "json:target/cucumber-reports/CucumberTestReport.json"
)
public class RunCucumberTests extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
