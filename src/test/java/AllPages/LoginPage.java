package AllPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver;

    //Web-elements to navigate Login Page
    @FindBy(xpath = "//a[text()='Login']")
    WebElement loginOption;
    @FindBy(xpath = "//h2[text()='Returning Customer']")
    WebElement LoginBlock;

    //Web-Elements for Login Page
    @FindBy(xpath = "//input[@name='email']")
    WebElement emailIDTextBox;
    @FindBy(xpath = "//input[@name='email']")
    WebElement passwordTextBox;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement loginButton;


    public LoginPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    public void clickLoginOption(){
        if(loginOption.isDisplayed()){
            loginOption.click();
        }
        else{
            System.out.println("Login option is missing in My Account popup");
        }
    }
    public void verifyLoginPage(){
       String titleOfLoginPage = driver.getTitle();
        System.out.println("Title of the Login Page : "+titleOfLoginPage);
        Assert.assertEquals(titleOfLoginPage,"Account Login","Expected and Actual titles are not Matched");
       Assert.assertTrue(LoginBlock.isDisplayed(),"Login block is not displayed");
    }
    public void enterEmailID(String emailID){
        emailIDTextBox.sendKeys(emailID);
    }
    public void enterPassword(String password){
        passwordTextBox.sendKeys(password);
    }
    public void clickLogin(){
        loginButton.click();
    }
    public void titleAfterLogin(){
       String title =  driver.getTitle();
        System.out.println("Title Of the page after login : "+title);
    }

}

