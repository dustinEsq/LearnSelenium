package com.demoqa.pages.pom.widgetspage;

import com.demoqa.pages.pom.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.ClickJS;
import static utilities.JavaScriptUtility.ScrollToElementJS;

public class WidgetsPage extends HomePage {

    By selectMenuItem = By.xpath("//li[@id='item-8']//span[text()='Select Menu']");
    By datesPickerMenuItem = By.xpath("//li[@id='item-2']//span[text()='Date Picker']");

    public SelectMenu ClickSelectMenuItem()
    {
        ScrollToElementJS(selectMenuItem);
        ClickJS(selectMenuItem);
        return new SelectMenu();
    }

    public DatesPage ClickDatePickerMenuItem()
    {
        ScrollToElementJS(datesPickerMenuItem);
        ClickJS(datesPickerMenuItem);
        return new DatesPage();
    }


}
