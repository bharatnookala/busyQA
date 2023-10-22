package class5_test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)//the file needs to use cucumber to run the test case

@CucumberOptions(
		features = "src/class5_features/class5_3.feature",
		glue = {"class5_stepdefinitions"},
		dryRun = false,
		plugin = {"pretty","html:test-output","json:json_output","junit:junit_xml_output/cucumber.xml","rerun:target/rerun.txt"}
		)


public class Runner {
	

}
