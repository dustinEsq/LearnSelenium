package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;


public class DropdownUtility extends Utility{

    public static Select findDropdown(By locator)
    {
        return new Select(driver.findElement(locator));
    }

    public static void selectByVisibleText(By locator, String text)
    {
        Select select = findDropdown(locator);
        select.selectByVisibleText(text);
    }

    public static void selectByIndex(By locator, int index)
    {
        Select select = findDropdown(locator);
        select.selectByIndex(index);
    }

    public static void selectByValue(By locator, String value)
    {
        Select select = findDropdown(locator);
        select.selectByValue(value);
    }

    public static List<String> GetAllSelectedOptions(By locator)
    {
        Select select = findDropdown(locator);
        List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
        return allSelectedOptions.stream().map(e->e.getText()).collect(Collectors.toList());
    }

}
