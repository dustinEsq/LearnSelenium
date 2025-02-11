package pages.chapter4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static utilities.DropdownUtility.*;

public class DropdownPage {

    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void selectFromDropdown(String option)
    {
        selectByVisibleText(dropdown, option);
    }

    public List<String> getSelectedOptions()
    {
        return GetAllSelectedOptions(dropdown);
    }



}
