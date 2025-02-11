package pages.chapter10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static utilities.DropdownUtility.GetAllSelectedOptions;
import static utilities.DropdownUtility.selectByValue;
import static utilities.JavaScriptUtility.setAttributeElementJS;

public class DropdownPageJS {

    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropdownPageJS(WebDriver driver)
    {
        this.driver = driver;
    }

    public void changeDropdownAttribute()
    {
        setAttributeElementJS(dropdown);
    }

    public void selectFromDropdownList(String value)
    {
        selectByValue(dropdown, value);
    }

    public List<String> getSelectedOptions()
    {
        List<String> options = GetAllSelectedOptions(dropdown);
        return options;
    }

}
