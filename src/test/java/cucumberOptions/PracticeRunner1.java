package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/java/featureFiles" }, glue = {
		"stepDefinitions" }, monochrome = true, tags = "@SmokeTest or @RegressionTest", plugin = { "pretty",
				"html:target/cucumber.html", "json:target/cucumber.json" })
public class PracticeRunner1 extends AbstractTestNGCucumberTests {

}
