package pages.chapter11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {

    private WebDriver driver;
    private By clickHereLink = By.cssSelector("[href='/windows/new']");

    public MultipleWindowsPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickHere()
    {
        driver.findElement(clickHereLink).click();
    }

}
