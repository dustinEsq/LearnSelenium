package chapter3;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ShiftingContentTest extends BaseTest {

    private By shiftingContetLink = By.cssSelector("[href = '/shifting_content']");
    private By menuElementLink = By.cssSelector("[href = '/shifting_content/menu']");
    private By listOfItems = By.cssSelector("ul > li a");

    @Test
    public void Test()
    {
        WebElement link = driver.findElement(shiftingContetLink);
        link.click();

        WebElement link2 = driver.findElement(menuElementLink);
        link2.click();

        List<WebElement> links = driver.findElements(listOfItems);
        System.out.println(links.size());

    }



}
