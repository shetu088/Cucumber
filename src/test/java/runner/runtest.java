package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "D:\\Eclipse\\cucumber\\src\\main\\java\\features\\setup.feature",
		glue = {"D:\\Eclipse\\cucumber\\src\\main\\java\\step_definition\\stepdefinition.java"},
		format = {"pretty","html:test-output"}
		
)

public class runtest {

}
