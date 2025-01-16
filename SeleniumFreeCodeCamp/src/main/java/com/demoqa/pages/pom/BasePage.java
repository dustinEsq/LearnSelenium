package com.demoqa.pages.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    public static WebDriver driver;

    public void SetDriver(WebDriver driver)
    {
        BasePage.driver = driver;
    }

    protected WebElement FindWebElement(By locator)
    {
        return driver.findElement(locator);
    }

    protected  void Set(By locator, String text)
    {
        FindWebElement(locator).clear();
        FindWebElement(locator).sendKeys(text);
    }

    protected  void Click(By locator)
    {
        FindWebElement(locator).click();
    }

    public static void Delay(int milliseconds)
    {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }
    }

}
