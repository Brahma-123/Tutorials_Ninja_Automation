package stepDefinitionsClasses;

import AllPages.LandingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LandingPageStep {
    WebDriver driver = Hooks.getDriver();
    LandingPage landingPage;

    //Step definitions for Top panel in landing page
    @Given("User in Landing page")
    public void user_in_landing_page() {
        landingPage = new LandingPage(driver);
        System.out.println("Your in Landing page");
    }

    @When("Verify title of the Landing page")
    public void verify_title_of_the_landing_page() {
        landingPage.titleOfLandingPage();
    }

    @And("Verify Currency dropdown")
    public void verify_currency_dropdown() {
        landingPage.currencyDropDown();
    }

    @When("Verify Mobile Number")
    public void verify_mobile_number() {
        landingPage.mobileNumberOptionCheck();
    }

    @When("Verify My Account field")
    public void verify_my_account_field() {
        landingPage.myAccountDropdown();
    }

    @When("Verify Wishlist")
    public void verify_wishlist() {
        landingPage.wishList();
    }

    @When("Verify Shopping cart")
    public void verify_shopping_cart() {
        landingPage.shoppingCart();
    }

    @When("Verify Shipping")
    public void verify_shipping() {
        landingPage.checkout();
    }

}
