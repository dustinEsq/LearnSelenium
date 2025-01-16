package Part3_4.com.demoqa.tests.part3.froms;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    @Test
    public void TestRadioButton()
    {
        var formsPage = homePage.goToForms().ClickPracticeForm();
        formsPage.ClickFemaleRadioButton();
        boolean isFemaleRadioButtonSelected = formsPage.VerifyFemaleRadioButtonSelected();
        Assert.assertTrue(isFemaleRadioButtonSelected, "\n Female Radio Button is Not Selected \n");
    }

}
