package com.jenkins_practice;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json"},
		features = "Feature77"
		,glue={"step_definition99"}
,tags = {"@Login" }
		)
public class Testrunner {

	
}
