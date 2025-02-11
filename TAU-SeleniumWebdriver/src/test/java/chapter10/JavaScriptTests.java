package chapter10;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class JavaScriptTests extends BaseTest {

    String option1 = "Option 1";
    String option2 = "Option 2";
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testScrollToTable()
    {
        var largeDeepDomPage = homePage.clickDeepDomPage();
        largeDeepDomPage.scrollToTable();
    }

    @Test
    public void scrollToFifthParagraph()
    {
        var infiniteScrollPage = homePage.clickInfiniteScroll();
        infiniteScrollPage.scrollToParagraph(5);
    }

    @Test
    public void testJsDropdownAttribute()
    {
        var dropDownPage = homePage.clickDropdownJS();
        dropDownPage.changeDropdownAttribute();
        dropDownPage.selectFromDropdownList("1");
        dropDownPage.selectFromDropdownList("2");
        var selectedOptions = dropDownPage.getSelectedOptions();
        softAssert.assertEquals(selectedOptions.size(), 2, "The number of selected " +
                "options are not correct.");
        softAssert.assertTrue(selectedOptions.contains(option1), "It does not contain Option 1");
        softAssert.assertTrue(selectedOptions.contains(option2), "It does not contain Option 2");
        softAssert.assertAll();
    }




}
