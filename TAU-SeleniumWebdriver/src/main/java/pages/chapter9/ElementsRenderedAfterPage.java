package pages.chapter9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementsRenderedAfterPage {

    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadedText = By.id("finish");

    public ElementsRenderedAfterPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickStart()
    {
        driver.findElement(startButton).click();
    }

    public String waitForTextToAppear(int seconds)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(loadedText));
        return driver.findElement(loadedText).getText();
    }

    public boolean verifyStartButton()
    {
        return driver.findElement(startButton).isDisplayed();
    }



}
