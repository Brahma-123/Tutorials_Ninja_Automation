package stepDefinitionsClasses;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class HooksClass {
    private  static WebDriver driver;
    String browser = "Chrome";


    @Before
    public void initializeTheBrowser(){
        if(driver==null){
            if(browser.equals("Chrome")){
                driver= new ChromeDriver();
            } else if (browser.equals("Edge")) {
                driver = new EdgeDriver();
            }
            else{
                driver = new FirefoxDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.get("https://tutorialsninja.com/demo");
        }
    }
    @After
    public void closeBrowser(){
        if(driver!=null){
            driver.close();
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
