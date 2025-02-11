package pages.chapter9;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class DynamicLoadingPage {

    private WebDriver driver;
    private By elementsHiddenLink = By.cssSelector("[href='/dynamic_loading/1']");
    private By elementsRenderedLink = By.cssSelector("[href='/dynamic_loading/2']");

    public DynamicLoadingPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public ElementsHiddenPage clickElementsHidden()
    {
        driver.findElement(elementsHiddenLink).click();
        return new ElementsHiddenPage(driver);
    }

    public ElementsRenderedAfterPage clickElementsRendered()
    {
        driver.findElement(elementsRenderedLink).click();
        return new ElementsRenderedAfterPage(driver);
    }

    // used in chapter 11 of the course (webdriver navigation)
    public ElementsRenderedAfterPage clickElementsRenderedNewTab() throws AWTException
    {
        WebElement link =  driver.findElement(elementsRenderedLink);

        Actions actions = new Actions(driver);
        actions.contextClick(link).build().perform();

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);

        return new ElementsRenderedAfterPage(driver);
    }


}
