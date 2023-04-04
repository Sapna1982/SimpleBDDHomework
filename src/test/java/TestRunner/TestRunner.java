package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "C:\\Users\\Sapna Sharma\\IdeaProjects\\SimpleBDDFramework\\src\\test\\resources\\Features\\Register.feature",
        glue = {"StepDefinition"},
        format = {"pretty", "html:htmlReport", "json:json/cucumber.json", "junit:junit/cucumber.xml"}
)

public class TestRunner {
}
