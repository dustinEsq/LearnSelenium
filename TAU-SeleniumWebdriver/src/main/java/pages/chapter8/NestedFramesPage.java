package pages.chapter8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramesPage {

    private WebDriver driver;
    private String topFrameName = "frame-top";
    private String leftFrameName = "frame-left";
    private String bottomFrameName = "frame-bottom";
    private By bodyTag = By.tagName("body");

    public NestedFramesPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public String getLeftFrameText()
    {
        switchToIframe(topFrameName);
        switchToIframe(leftFrameName);
        String text = driver.findElement(bodyTag).getText();
        switchToParent();
        switchToParent();
        return text;
    }

    public String getBottomFrameText()
    {
        switchToIframe(bottomFrameName);
        String text = driver.findElement(bodyTag).getText();
        switchToParent();
        return text;
    }

    private void switchToIframe(String name)
    {
        driver.switchTo().frame(name);
    }

    private void switchToParent()
    {
        driver.switchTo().parentFrame();
    }

}
