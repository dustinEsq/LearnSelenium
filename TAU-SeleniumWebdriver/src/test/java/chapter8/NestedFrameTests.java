package chapter8;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NestedFrameTests extends BaseTest {

    SoftAssert softAssert = new SoftAssert();
    @Test
    public void testTextFrames()
    {
        var nestedFramesPage = homePage.clickFramesPage().clickNestedFramesPage();
        String leftFrameText = nestedFramesPage.getLeftFrameText();
        System.out.println(leftFrameText);
        softAssert.assertEquals(leftFrameText, "LEFT", "Left Frame Text did not match.");
        String bottomFrameText = nestedFramesPage.getBottomFrameText();
        System.out.println(bottomFrameText);
        softAssert.assertAll();
        Assert.assertEquals(bottomFrameText, "BOTTOM", "Bottom Frame Text did not match.");
    }


}
