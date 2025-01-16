package Part3_4.com.demoqa.tests.part3.froms;

import Part3_4.com.demoqa.base.BaseTest;
import com.demoqa.pages.pom.forms.PracticeFormPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest extends BaseTest {

    @Test
    public void TestCheckBox()
    {
        var formsPage = homePage.goToForms().ClickPracticeForm();
        formsPage.ClickSportsCheckBox();
        formsPage.ClickReadingCheckBox();
        formsPage.ClickMusicCheckBox();
        formsPage.UnclickReadingCheckBox();
        boolean isReadingCheckBoxSelected = formsPage.VerifyReadingCheckBoxSelected();
        Assert.assertFalse(isReadingCheckBoxSelected, "Reading is still selected!");
    }

}
