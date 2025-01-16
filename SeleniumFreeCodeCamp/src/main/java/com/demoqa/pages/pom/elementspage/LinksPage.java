package com.demoqa.pages.pom.elementspage;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.ScrollToElementJS;

public class LinksPage extends ElementsPage{

    private By badRequestLink = By.id("bad-request");
    private By responseLink = By.id("linkResponse");

    public void ClickBadRequestLink()
    {
        ScrollToElementJS(badRequestLink);
        Click(badRequestLink);
    }

    public String GetBadRequestResponse()
    {
        Delay(2000);
        return FindWebElement(responseLink).getText();
    }

}
