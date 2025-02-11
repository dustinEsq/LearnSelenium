package chapter9;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitTests extends BaseTest {

    @Test
    public void testWaitUntilHidden()
    {
        var loadingPage = homePage.clickLoadingPage().clickElementsHidden();
        loadingPage.clickStart();
        Assert.assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded Text did not match");
    }

    @Test
    public void testWaitRenderedAfter()
    {
        var loadingPage = homePage.clickLoadingPage().clickElementsRendered();
        loadingPage.clickStart();
        String actual = loadingPage.waitForTextToAppear(10);
        Assert.assertEquals(actual, "Hello World!", "Loaded Text did not " +
                "match");
    }

}
