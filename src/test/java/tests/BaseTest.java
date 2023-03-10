package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public WebDriver driver;

    public BaseTest(){
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
    }

    @BeforeMethod
    public void openUrl() {
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }


    /*@BeforeClass
    protected void setup() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
    }*/

}

