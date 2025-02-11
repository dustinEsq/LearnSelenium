package pages.chapter8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {

    private WebDriver driver;
    private By nestedFramesLink = By.cssSelector("[href='/nested_frames']");

    public FramesPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public NestedFramesPage clickNestedFramesPage()
    {
        driver.findElement(nestedFramesLink).click();
        return new NestedFramesPage(driver);
    }



}
