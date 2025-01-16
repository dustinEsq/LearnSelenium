package com.demoqa.pages.pom.widgetspage;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.ClickJS;
import static utilities.JavaScriptUtility.ScrollToElementJS;
import static utilities.DropdownUtility.*;

public class DatesPage extends WidgetsPage{

    By selectDateField = By.id("datePickerMonthYearInput");
    By monthDropdown = By.cssSelector(".react-datepicker__month-select");
    By yearDropdown = By.cssSelector(".react-datepicker__year-select");

    private By DayValue(String day)
    {
        return By.xpath("//div[contains(@class, 'react-datepicker__day react-datepicker__day--')][text()='"+ day +"']");
    }

    public void ClickDay(String day)
    {
        ClickJS(DayValue(day));
    }

    // to check whether the day is present in that month
    public boolean IsDayInMonth(String day)
    {
        return FindWebElement(DayValue(day)).isDisplayed();
    }

    public void ClickDateField()
    {
        ScrollToElementJS(selectDateField);
        ClickJS(selectDateField);
    }

    public String GetDate()
    {
        // note: selenium's getText() method can only be used when
        // there is a start and end tag such as <...>text</...>
        // so we use the getAttribute to return any attribute from the AUT (application under test)
        return FindWebElement(selectDateField).getAttribute("value");
    }

    public void SelectMonth(String month)
    {
        SelectByVisibleText(monthDropdown, month);
    }

    public void SelectYear(String year)
    {
        SelectByVisibleText(yearDropdown, year);
    }

}
