package com.PersonalPractice.pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePagePractice {

    public static WebDriver driver;

    public void SetDriver(WebDriver driver)
    {
        BasePagePractice.driver = driver;
    }

    protected WebElement FindWebElement(By locator)
    {
        return driver.findElement(locator);
    }

    protected void SetElement(By locator, String text)
    {
        FindWebElement(locator).clear();
        FindWebElement(locator).sendKeys(text);
    }

    protected void SeleniumClick(By locator)
    {
        FindWebElement(locator).click();
    }

}
