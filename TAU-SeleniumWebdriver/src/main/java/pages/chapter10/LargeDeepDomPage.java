package pages.chapter10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utilities.JavaScriptUtility.scrollToElement;

public class LargeDeepDomPage {

    private WebDriver driver;
    private By table = By.id("large-table");

    public LargeDeepDomPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void scrollToTable()
    {
        scrollToElement(table);
    }



}
