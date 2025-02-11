package chapter6;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyPressesTest extends BaseTest {

    @Test
    public void keyTestBackspace()
    {
        var keyPressesPage = homePage.clickKeyPress();
        keyPressesPage.enterText("A" + Keys.BACK_SPACE);
        String result = keyPressesPage.getResult();
        Assert.assertEquals(result, "You entered: BACK_SPACE",
                "Did not match the key press.");
    }

    @Test (priority = 1)
    public void keyTestPi()
    {
        var keyPressesPage = homePage.clickKeyPress();
        keyPressesPage.enterPi();
    }



}
