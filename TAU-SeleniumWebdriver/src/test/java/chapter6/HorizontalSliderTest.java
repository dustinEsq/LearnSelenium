package chapter6;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSliderTest extends BaseTest {

    @Test
    public void testSliderRangeTo4BySendKeys()
    {
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.sendRightArrowKeys(4);
        String result = horizontalSliderPage.getRange();
        Assert.assertEquals(result, "4", "Did not match the result");
    }


}
