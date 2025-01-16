package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.stream.Collectors;

public class DropdownUtility extends Utility{

    private static Select FindDropdown(By locator)
    {
        return new Select(driver.findElement(locator));
    }

    public static void SelectByVisibleText(By locator, String text)
    {
        Select select = FindDropdown(locator);
        select.selectByVisibleText(text);
    }

    public static void SelectByIndex(By locator, int index)
    {
        Select select = FindDropdown(locator);
        select.selectByIndex(index);
    }

    public static void SelectByValue(By locator, String value)
    {
        Select select = FindDropdown(locator);
        select.selectByValue(value);
    }

    public static void DeselectByValue(By locator, String value)
    {
        Select select = FindDropdown(locator);
        select.deselectByValue(value);
    }

    public static List<String> GetAllSelectedOptions(By locator)
    {
        Select select = FindDropdown(locator);
        List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
        return allSelectedOptions.stream().map(WebElement::getText).collect(Collectors.toList());
    }


}
