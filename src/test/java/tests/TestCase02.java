package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class TestCase02 extends BaseTest {


    @Test
    public void testLoginPage(){
       // openUrl();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.completeLogin();
    }
}
