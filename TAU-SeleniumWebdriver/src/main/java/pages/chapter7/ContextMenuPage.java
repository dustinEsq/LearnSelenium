package pages.chapter7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By hotspot = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void rightClickOnHotspot()
    {
        WebElement element = driver.findElement(hotspot);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).contextClick().build().perform();
    }

    public String alert_getAlertText()
    {
        return driver.switchTo().alert().getText();
    }

    public void alert_acceptAlert()
    {
        driver.switchTo().alert().accept();
    }

}
