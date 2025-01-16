package Part3_4.com.demoqa.tests.part3.dropdowns;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropdownTest extends BaseTest {

    @Test
    public void TestMultiSelectDropdown()
    {
        var selectMenuPage = homePage.goToWidgets().ClickSelectMenuItem();
        selectMenuPage.SelectStandardMutli("Volvo");
        selectMenuPage.SelectStandardMutli(1);
        selectMenuPage.SelectStandardMutli("Audi");
        selectMenuPage.SelectStandardMutli(2);
        selectMenuPage.DeselectStandardMulti("saab");
        List<String> actualSelectedOptions = selectMenuPage.GetAllSelectedStandardMultiOptions();
        Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
        Assert.assertTrue(actualSelectedOptions.contains("Opel"));
        Assert.assertTrue(actualSelectedOptions.contains("Audi"));
        Assert.assertFalse(actualSelectedOptions.contains("Saab"), "\n Saab Is Selected As An Option \n");
    }


}
