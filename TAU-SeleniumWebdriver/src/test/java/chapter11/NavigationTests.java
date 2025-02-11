package chapter11;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

import static utilities.WindowManager.*;

public class NavigationTests extends BaseTest {

    @Test
    public void testNavigator()
    {
        var dynamicPage = homePage.clickLoadingPage().clickElementsHidden();
        windowGoBack();
        windowRefresh();
        widowGoForward();
        windowGoTo("https://google.com");
    }

    @Test
    public void testSwitchTab()
    {
        homePage.clickMultipleWindows().clickHere();
        switchToTab("New Window");
    }

    @Test
    public void testDynamicLoadingPageSwitchTab() throws AWTException
    {
        var dynamicLoadingPage = homePage.clickLoadingPage().clickElementsRenderedNewTab();
        switchToNewTab();
        boolean results = dynamicLoadingPage.verifyStartButton();
        Assert.assertTrue(results, "Start button is not displayed.");
    }

}
