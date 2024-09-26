package testRunnerForCucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src/test/resources/featuresFiles/loginTest.feature","src/test/resources/featuresFiles/products.feature"},
	glue = {"stepDefinitionsCucumber"},
	plugin = {"html:target/cucumber-report.html"},
	dryRun = false
		
		)


public class TestRunner {

}
