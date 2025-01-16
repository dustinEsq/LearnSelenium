package com.demoqa.pages.pom.widgetspage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

import static utilities.DropdownUtility.*;
import static utilities.JavaScriptUtility.ScrollToElementJS;

public class SelectMenu extends WidgetsPage{

    private By standardMultiSelect = By.id("cars");

    // this is all we need to select an option from a dropdown
    public void SelectStandardMutli(String text)
    {
        ScrollToElementJS(standardMultiSelect);

        // selenium has its own class when there's a select tag on the element
        // after we referenced it, we need to pass the dropdown
        //Select select = new Select(FindWebElement(standardMultiSelect));
        //select.selectByVisibleText(text);

        SelectByVisibleText(standardMultiSelect, text);
    }

    public void SelectStandardMutli(int index)
    {
        ScrollToElementJS(standardMultiSelect);
        SelectByIndex(standardMultiSelect, index);
    }

    public void DeselectStandardMulti(String value)
    {
        ScrollToElementJS(standardMultiSelect);
        DeselectByValue(standardMultiSelect, value);
    }

    public List<String> GetAllSelectedStandardMultiOptions()
    {
        return GetAllSelectedOptions(standardMultiSelect);
    }
}
