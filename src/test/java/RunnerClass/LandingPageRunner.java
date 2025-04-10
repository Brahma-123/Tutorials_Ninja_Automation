package RunnerClass;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/featureFiles",
        glue = "stepDefinitionsClasses",
        plugin = {"pretty","html:target/htmlReports/LandingPage.html","json:target/jsonReports/LandingPage.json"}
)
public class LandingPageRunner extends AbstractTestNGCucumberTests {
}
