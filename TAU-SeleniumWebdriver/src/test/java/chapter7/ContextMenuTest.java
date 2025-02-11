package chapter7;

import base.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ContextMenuTest extends BaseTest {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void rightClickHotSpot()
    {
        var contextMenu = homePage.clickContextmenu();
        contextMenu.rightClickOnHotspot();
        String alertText = contextMenu.alert_getAlertText();
        contextMenu.alert_acceptAlert();
        softAssert.assertEquals(alertText, "You selected a context menu", "alert did not match");
        softAssert.assertAll();
    }


}
