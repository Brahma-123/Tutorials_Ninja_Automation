package stepDefinitionsClasses;

import AllPages.RegisterUserPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class RegisterNewUserStep {
    WebDriver driver = Hooks.getDriver();
    RegisterUserPage registerUserPage;

    //Step-definition methods to redirect to Register page
    @When("Select Register option")
    public void select_register_option() {
        registerUserPage = new RegisterUserPage(driver);
        registerUserPage.clickRegister();
    }

    @Then("User land on Register page")
    public void user_land_on_register_page() {
        registerUserPage.verifyRegisterPage();
    }

    //Step-Definitions for Creating the user

    @When("Enter the Firstname {string} and Lastname {string}")
    public void enter_the_firstname_and_lastname(String firstName, String lastName) {
        registerUserPage.enteringFullName(firstName, lastName);
    }

    @When("Enter the Email id {string} and Phonenumber {string}")
    public void enter_the_email_id_and_phonenumber(String emailId, String mobileNumber) {
        registerUserPage.enteringEmailIdrAndPhoneNumber(emailId, mobileNumber);
    }

    @When("Enter password {string} and Confirm password {string}")
    public void enter_password_and_confirm_password(String enterPassword, String confirmPassword) {
        registerUserPage.enterPassword(enterPassword, confirmPassword);
    }

    @When("Select yes Subscribe and Checkbox")
    public void select_yes_subscribe_and_checkbox() {
        registerUserPage.selectSubscribeAndPrivacyAndPolicies();

    }

    @When("Click Continue button")
    public void click_continue_button() {
        registerUserPage.clickContinueButton();
    }

    @Then("Account created text should display")
    public void account_created_text_should_display() {
        registerUserPage.verifyUserCreated();
    }

}
