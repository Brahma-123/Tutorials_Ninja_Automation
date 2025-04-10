package AllPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class LandingPage {
    WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //WebElements of the Landing page
    @FindBy(xpath = "//span[text()='Currency']")
    WebElement currencyOption;
    By currencyDropdownOptions = By.xpath("//ul[@class='dropdown-menu']");
    @FindBy(xpath = "//span[text()='123456789']")
    WebElement mobileNumber;
    @FindBy(xpath = "//span[text()='My Account']")
    WebElement myAccount;
    By myAccountDropdown = By.xpath("//ul[contains(@class,'dropdown-menu dropdown-menu-right')]");
    @FindBy(xpath = "//span[contains(text(),'Wish List')]")
    WebElement wishList;
    @FindBy(xpath = "//span[contains(text(),'Shopping Cart')]")
    WebElement shoppingCart;
    @FindBy(xpath = "//span[contains(text(),'Checkout')]")
    WebElement checkOut;

    //Methods of Landing page
    public void titleOfLandingPage() {
        String titleOfLandingPage = driver.getTitle();
        System.out.println("Title of the Landing page : " + titleOfLandingPage);
        Assert.assertEquals(titleOfLandingPage, "Your Store");
    }

    public void currencyDropDown() {
        if (currencyOption.isDisplayed()) {
            currencyOption.click();
            List<WebElement> dropdownOptions = driver.findElements(currencyDropdownOptions);
            for (WebElement dropdownList : dropdownOptions) {
                String listOfDropDown = dropdownList.getText();
                System.out.println("Currency dropdown list : " + listOfDropDown);
            }
        } else {
            System.out.println("Currency option is missing in Top panel");
        }
    }

    public void mobileNumberOptionCheck() {
        Assert.assertTrue(mobileNumber.isDisplayed());
        String displayedMobileNumber = mobileNumber.getText();
        System.out.println("Displayed mobile number is : " + displayedMobileNumber);
    }

    public void myAccountDropdown() {
        if (myAccount.isDisplayed()) {
            myAccount.click();
            List<WebElement> myAccountLists = driver.findElements(myAccountDropdown);
            for (WebElement myAccountList : myAccountLists) {
                String myAccountOptions = myAccountList.getText();
                System.out.println("Options in My account dropdown : " + myAccountOptions);
            }
        } else {
            System.out.println("My Account dropdown is not displayed");
        }
    }

    public void wishList() {
        String wishListText = wishList.getText();
        System.out.println("Text of WishList : " + wishListText);
        Assert.assertEquals(wishListText, "Wish List (0)");
    }

    public void shoppingCart() {
        String shoppingCartText = shoppingCart.getText();
        System.out.println("Text of Shopping Cart : " + shoppingCartText);
        Assert.assertTrue(shoppingCart.isDisplayed());
    }

    public void checkout() {
        String checkoutText = checkOut.getText();
        System.out.println("Checkout text : " + checkoutText);
        Assert.assertTrue(checkOut.isDisplayed());
    }

}
