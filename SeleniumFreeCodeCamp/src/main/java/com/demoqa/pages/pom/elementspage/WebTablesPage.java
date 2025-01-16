package com.demoqa.pages.pom.elementspage;

import org.openqa.selenium.By;

public class WebTablesPage extends ElementsPage{

    private By registrrationAgeField = By.id("age");
    private By submitButton = By.id("submit");

    public void ClickOnEdit(String email)
    {
        By edit = By.xpath("//div[text()='" + email +"']//following::span[@title='Edit']");
        Click(edit);
    }

    public void SetAge(String age)
    {
        Set(registrrationAgeField, age);
    }

    public void ClickSubmit()
    {
        Click(submitButton);
    }

    public String GetTableAge(String email)
    {
        // finding an element by using an index is not advisable
        // since it might change overtime like adding a new element in the table
        // however, for this tutorial, this is implemented
        By tableAge = By.xpath("//div[text()='"+ email +"']//preceding::div[1]");
        return FindWebElement(tableAge).getText();
    }


}
