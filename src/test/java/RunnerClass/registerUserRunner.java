package RunnerClass;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        glue = "stepDefinitionsClasses",
        features = "src/test/resources/featureFiles/RegisterNewUser.feature",
        plugin = {"pretty","html:target/htmlReports/RegisterNewUser.html","json:target/jsonReports/RegisterNewUser.json"}
)
public class registerUserRunner extends AbstractTestNGCucumberTests {

}
