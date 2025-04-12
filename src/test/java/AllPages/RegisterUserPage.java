package AllPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Random;

public class RegisterUserPage {
    WebDriver driver;

    //Elements for redirecting to Register page
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']/child::li")
    WebElement registerOption;
    @FindBy(xpath = "//h1[text()='Register Account']")
    WebElement registerAccountHeadLine;

    //Elements in Register page
    @FindBy(xpath = "//input[@id='input-firstname']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='input-lastname']")
    WebElement lastName;
    @FindBy(xpath = "//input[@id='input-email']")
    WebElement emailId;
    @FindBy(xpath = "//input[@id='input-telephone']")
    WebElement phoneNumber;
    @FindBy(xpath = "//input[@id='input-password']")
    WebElement password;
    @FindBy(xpath = "//input[@id='input-confirm']")
    WebElement confirmPassword;
    @FindBy(xpath = "//label[text()='Yes']/child::input")
    WebElement subscribeYes;
    @FindBy(xpath = "//label[text()='No']/child::input")
    WebElement subscribeNo;
    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement privacyPolicy;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement continueButton;
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement accountCreatedText;

    public RegisterUserPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Methods for redirect to Register page
    public void clickRegister() {
        Assert.assertTrue(registerOption.isDisplayed(), "Register option not visible in My Account dropdown");
        Actions actions = new Actions(driver);
        actions.moveToElement(registerOption).click().perform();
    }

    public void verifyRegisterPage() {
        String titleOfRegisterPage = driver.getTitle();
        System.out.println("Title of The register page : " + titleOfRegisterPage);
        String registerAccountText = registerAccountHeadLine.getText();
        Assert.assertEquals(registerAccountText, "Register Account");
    }

    // Methods to Create new user

    public void enteringFullName(String fName, String lName) {
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
    }

    public void enteringEmailIdrAndPhoneNumber(String mailId, String telephoneNumber) {
        emailId.sendKeys(mailId);
        phoneNumber.sendKeys(telephoneNumber);
    }

    public void enterPassword(String newPassword, String conPassword) {
        password.sendKeys(newPassword);
        confirmPassword.sendKeys(conPassword);
    }

    public void selectSubscribeAndPrivacyAndPolicies() {
        if (!subscribeYes.isSelected()) {
            subscribeYes.click();
        } else {
            System.out.println("Subscribe yes radio button is already selected");
        }
        if (!privacyPolicy.isSelected()) {
            privacyPolicy.click();
        } else {
            System.out.println("Privacy and Policy checkbox is already selected");
        }
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public void verifyUserCreated() {
        String userCreatedText = accountCreatedText.getText();
        System.out.println("Text for After creating the user : " + userCreatedText);
        Assert.assertTrue(accountCreatedText.isDisplayed());
    }


}
