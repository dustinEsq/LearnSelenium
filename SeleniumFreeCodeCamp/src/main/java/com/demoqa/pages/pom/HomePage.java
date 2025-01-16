package com.demoqa.pages.pom;

import com.demoqa.pages.pom.elementspage.ElementsPage;
import com.demoqa.pages.pom.forms.FormsPage;
import com.demoqa.pages.pom.widgetspage.WidgetsPage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.ClickJS;
import static utilities.JavaScriptUtility.ScrollToElementJS;

public class HomePage extends  BasePage{

    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
    private By widgetsCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");

    public FormsPage goToForms()
    {
        ScrollToElementJS(formsCard);
        Click(formsCard);
        return new FormsPage();
    }

    public ElementsPage goToElements()
    {
        ScrollToElementJS(elementsCard);
        ClickJS(elementsCard);
        return new ElementsPage();
    }

    public WidgetsPage goToWidgets()
    {
        ScrollToElementJS(widgetsCard);
        ClickJS(widgetsCard);
        return new WidgetsPage();
    }


}
