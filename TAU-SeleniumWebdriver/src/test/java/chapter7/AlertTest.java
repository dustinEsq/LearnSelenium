package chapter7;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {

    @Test
    public void testAcceptAlert()
    {
        var alertsPage = homePage.clickJSLink();
        alertsPage.clickTriggerAlert();
        alertsPage.alert_clickToAccept();
        String result = alertsPage.getAlertResult();
        Assert.assertEquals(result, "You successfully clicked an alert", "Message did not match.");
    }

    @Test
    public void testGetTextFromAlert()
    {
        var alertsPage = homePage.clickJSLink();
        alertsPage.clickTriggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        Assert.assertEquals(text, "I am a JS Confirm", "Text did not match.");
    }

    @Test
    public void testGetTextFromPrompt()
    {
        var alertsPage = homePage.clickJSLink();
        alertsPage.clickPrompt();
        String text = "TAU Rocks!!";
        alertsPage.alert_sendKeys(text);
        alertsPage.alert_clickToAccept();
        String result = alertsPage.getAlertResult();
        Assert.assertEquals(result, "You entered: " + text, "Results text is incorrect.");
    }




}
