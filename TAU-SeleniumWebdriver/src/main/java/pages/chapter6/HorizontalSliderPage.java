package pages.chapter6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By slider = By.cssSelector("div[class='sliderContainer'] input");
    private By rangeResult = By.cssSelector("div[class='sliderContainer'] #range");

    public HorizontalSliderPage(WebDriver driver)
    {
        this.driver = driver;
    }

    /**
     * @param target is doubled since the increment is by 0.5
     */
    public void sendRightArrowKeys(int target)
    {
        int repeat = target * 2;
        WebElement horizontalSlider = driver.findElement(slider);
        for (int i = 0; i < repeat; i++)
        {
            horizontalSlider.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getRange()
    {
        return driver.findElement(rangeResult).getText();
    }


}
