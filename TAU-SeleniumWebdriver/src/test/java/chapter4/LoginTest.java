package chapter4;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin()
    {
       var loginPage = homePage.clickFormAuthentication();
       loginPage.setUsername("tomsmith");
       loginPage.setPassword("SuperSecretPassword!");
       var secureAreaPage = loginPage.clickLoginButton();
       String actual = secureAreaPage.getAlertText();
       Assert.assertTrue(actual.contains("You logged into a secure area!"), "Alert text is incorrect");
    }


}
