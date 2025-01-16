package Part3_4.com.demoqa.tests.part3.links;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinksTest extends BaseTest {

    @Test
    public void TestBadRequestLink()
    {
        var linksPage = homePage.goToElements().ClickLinksMenuItem();
        linksPage.ClickBadRequestLink();
        String actualResponse = linksPage.GetBadRequestResponse();
        Assert.assertTrue(actualResponse.contains("400") && actualResponse.contains("Bad Request")
            , "\n Actual Response (" + actualResponse + ") \n Does Not Contain '400' and 'Bad Request'");
    }
}
