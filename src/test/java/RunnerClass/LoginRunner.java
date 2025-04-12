package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        glue = "stepDefinitionsClasses",
        features = "src/test/resources/featureFiles/login.feature",
        plugin = {"pretty","html:target/htmlReports/loginPage.html","json:target/jsonReports/loginPage.json"}
)
public class LoginRunner extends AbstractTestNGCucumberTests {
}
