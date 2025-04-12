package stepDefinitionsClasses;

import AllPages.LandingPage;
import AllPages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginFlowStep {
    WebDriver driver = Hooks.getDriver();
    LoginPage loginPage;


    //Step_Definitions for Navigate to Login Page
    @When("Click Login option")
    public void click_login_option() {
        loginPage = new LoginPage(driver);
        loginPage.clickLoginOption();
    }
    @Then("User should land on Login page")
    public void user_should_land_on_login_page() {
        loginPage.verifyLoginPage();
    }
    //Step_Definitions for Login With Valid credentials

    @Given("User in Login Page")
    public void user_in_login_page() {
       loginPage.verifyLoginPage();
    }
    @When("Enter email id {string}")
    public void enter_email_id(String userEmailID) {
        loginPage.enterEmailID(userEmailID);
    }
    @And("Enter Password {string}")
    public void enter_password(String userPassword) {
       loginPage.enterPassword(userPassword);
    }
    @And("Click on Login Button")
    public void click_on_login_button() {
        loginPage.clickLogin();
    }
    @Then("User should be login and navigated to Dashboard")
    public void user_should_be_login_and_navigated_to_dashboard() {
         loginPage.titleAfterLogin();
    }

}
