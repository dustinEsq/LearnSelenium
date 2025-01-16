package com.demoqa.pages.pom.elementspage;

import com.demoqa.pages.pom.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.ClickJS;
import static utilities.JavaScriptUtility.ScrollToElementJS;

public class ElementsPage extends HomePage {

    private By webTableMenuItem = By.xpath("//div[@id='app']//li[@id='item-3']//span[text()='Web Tables']");
    private By linksMenuItem = By.xpath("//div[@id='app']//li[@id='item-5']//span[text()='Links']");

    public WebTablesPage ClickTableMenuItem()
    {
        ScrollToElementJS(webTableMenuItem);
        ClickJS(webTableMenuItem);
        return new WebTablesPage();
    }

    public LinksPage ClickLinksMenuItem()
    {
        ScrollToElementJS(linksMenuItem);
        ClickJS(linksMenuItem);
        return new LinksPage();
    }

}
