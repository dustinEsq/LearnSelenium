package Part3_4.com.demoqa.tests.part3.dates;

import Part3_4.com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DatePickerTest extends BaseTest {

    @Test
    public void TestDateSelection()
    {
        String month = "December";
        String monthNumber = "12";
        String day = "31";
        String year = "2034";
        var datePickerPage = homePage.goToWidgets().ClickDatePickerMenuItem();
        datePickerPage.ClickDateField();
        datePickerPage.SelectMonth(month);
        datePickerPage.SelectYear(year);
        datePickerPage.ClickDay(day);

        String actualDate = datePickerPage.GetDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;

        Assert.assertEquals(actualDate, expectedDate, "\n Actual & Expected Dates Do Not Match\n" +
                "\n Actual Date: " + actualDate + "\n" + "\n Expected Date: " + expectedDate + "\n");
    }


}
