package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver webdriver;

    public BasePage(WebDriver driver){
        this.webdriver=driver;
        PageFactory.initElements(webdriver, this);
    }
}
