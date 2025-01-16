package com.saucedemo.pages.pom;

import org.openqa.selenium.By;

public class ProductsPage extends  BasePage{

    private By productsHeader = By.xpath("//div[@class = 'product_label']");

    public boolean isProductsHeaderDisplayed()
    {
        return Find(productsHeader).isDisplayed();
    }
}
