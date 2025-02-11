package chapter8;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameTests extends BaseTest {

    @Test
    public void testWysiwyg()
    {
        var editorPage = homePage.clickEditorPage();
        editorPage.clearTextArea();
        String text1 = "hello";
        String text2 = " world";
        editorPage.setTextArea(text1);
        editorPage.decreaseIndentation();
        editorPage.setTextArea(text2);
        Assert.assertEquals(editorPage.getTextFromEditor(), text1 + text2, "Text did not match.");
    }


}
