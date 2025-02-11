package chapter5;

import base.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HoverTest extends BaseTest {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testHoverUser1()
    {
        var hoversPage = homePage.clickHovers();
        var caption =  hoversPage.hoverOverFigure(1);
        softAssert.assertTrue(caption.isCaptionDisplayed(), "Caption is not displayed.");
        softAssert.assertEquals(caption.getTitle(), "name: user1",
                    "Caption title is not correct.");
        softAssert.assertEquals(caption.getLinkText(), "View profile",
                "Caption link text is not correct");
        softAssert.assertTrue(caption.getLink().endsWith("/users/1"), "Link is incorrect.");
        softAssert.assertAll();

    }


}
