package part2.com.saucedemo.tests.products;

import com.saucedemo.pages.pom.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class ProductsTest extends BaseTest {

    @Test
    public void TestProductsHeaderIsDisplayed()
    {
        ProductsPage productsPage = loginPage.LogIntoApplication("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isProductsHeaderDisplayed(), "\n Products Header Is Not Displayed \n");
    }
}
