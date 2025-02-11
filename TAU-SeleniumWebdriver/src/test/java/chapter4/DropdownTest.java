package chapter4;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DropdownTest extends BaseTest {

    SoftAssert softAssert = new SoftAssert();
    String option = "Option 1";

    @Test
    public void testSelectOption()
    {
        var dropDownPage = homePage.clickDropdown();
        dropDownPage.selectFromDropdown(option);
        var selectedOptions = dropDownPage.getSelectedOptions();
        softAssert.assertEquals(selectedOptions.size(), 1, "Incorrect number of selections...");
        softAssert.assertAll();
        Assert.assertTrue(selectedOptions.contains(option), "Option is not selected");
    }


}
