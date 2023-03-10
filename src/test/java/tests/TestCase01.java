package tests;

import Library.WebdriverLibrary;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TestCase01 extends BaseTest{

    @Test
    public void testLoginPage(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.completeLogin();
    }
}
