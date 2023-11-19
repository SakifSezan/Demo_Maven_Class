package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resource/Demo_Feature"},
plugin = {"json:target/cucumber.json"},
glue = "StepDefinition",tags = {"@tag6"})

public class TestRunner extends AbstractTestNGCucumberTests {

}
