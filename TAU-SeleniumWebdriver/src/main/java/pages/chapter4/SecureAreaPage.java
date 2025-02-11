package pages.chapter4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private WebDriver driver;
    private By statusAlret = By.id("flash");

    public SecureAreaPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public String getAlertText()
    {
        return driver.findElement(statusAlret).getText();
    }



}
