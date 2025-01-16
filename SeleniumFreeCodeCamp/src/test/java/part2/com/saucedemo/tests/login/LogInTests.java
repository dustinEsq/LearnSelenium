package part2.com.saucedemo.tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class LogInTests extends BaseTest {

    @Test
    public void TestLogInErrorMessage()
    {
        loginPage.SetUsername("standard_user");
        loginPage.SetPassword("xyz3400");
        loginPage.ClickLogInButton();
        String actualMessage = loginPage.GetErrorMessage();
        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }
}
