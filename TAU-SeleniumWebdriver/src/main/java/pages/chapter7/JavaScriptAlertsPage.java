package pages.chapter7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {

    private WebDriver driver;
    private By triggerAlert = By.xpath("//button[text()='Click for JS Alert']");
    private By triggerConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By triggerPrompt = By.xpath("//button[text()='Click for JS Prompt']");
    private By alertResult = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickTriggerAlert()
    {
        driver.findElement(triggerAlert).click();
    }

    public void alert_clickToAccept()
    {
        // switchTo()
        // -> switches from the current context of the DOM
        // to something else
        driver.switchTo().alert().accept();
    }

    public String getAlertResult()
    {
        return driver.findElement(alertResult).getText();
    }

    public void clickTriggerConfirm()
    {
        driver.findElement(triggerConfirmButton).click();
    }

    public void alert_clickToDismiss()
    {
        driver.switchTo().alert().dismiss();
    }

    public String alert_getText()
    {
        return driver.switchTo().alert().getText();
    }

    public void clickPrompt()
    {
        driver.findElement(triggerPrompt).click();
    }

    public void alert_sendKeys(String text)
    {
        driver.switchTo().alert().sendKeys(text);
    }

}
