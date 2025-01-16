package Part3_4.com.demoqa.tests.part3.elements;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TableTest extends BaseTest {

    @Test
    public void TestWebTable()
    {
        String email = "kierra@example.com";
        var webTablePage = homePage.goToElements().ClickTableMenuItem();
        webTablePage.ClickOnEdit(email);
        webTablePage.SetAge("14");
        webTablePage.ClickSubmit();

        // verification
        String actualAge = webTablePage.GetTableAge(email);
        String expectedAge = "14";
        Assert.assertEquals(actualAge, expectedAge, "\n Actual and Expected Ages Do Not Match \n");
    }

}
