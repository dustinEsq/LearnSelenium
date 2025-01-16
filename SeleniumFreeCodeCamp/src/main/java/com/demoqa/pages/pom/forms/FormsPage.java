package com.demoqa.pages.pom.forms;

import com.demoqa.pages.pom.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.ScrollToElementJS;

public class FormsPage extends HomePage {

    private By pracitceFormMenuItem = By.xpath("//li[@id='item-0']//span[text()='Practice Form']");

    public PracticeFormPage ClickPracticeForm()
    {
        ScrollToElementJS(pracitceFormMenuItem);
        Click(pracitceFormMenuItem);
        return new PracticeFormPage();
    }


}
