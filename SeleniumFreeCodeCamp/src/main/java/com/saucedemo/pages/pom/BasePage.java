package com.saucedemo.pages.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/* Notes
Application Under Testing: https://www.saucedemo.com/v1/
1. this class only has one role:
    to be the base/parent/super class for all page object classes
2. should contain class members that is necessary for all child class
3. abstrtaction?: abstract is not required... however this is to prevent child classes
    from trying to create an instance of this class
*/

public class BasePage {

    public static WebDriver driver;

    public void SetDriver(WebDriver driver)
    {
        BasePage.driver = driver;
    }

    protected WebElement Find(By locator)
    {
        return driver.findElement(locator);
    }

    protected void Set(By locator, String text)
    {
        // if there's data clear it
        Find(locator).clear();
        Find(locator).sendKeys(text);
    }

    protected void Click(By locator)
    {
        Find(locator).click();
    }
}
