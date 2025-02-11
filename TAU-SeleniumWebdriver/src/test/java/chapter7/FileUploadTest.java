package chapter7;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile
                ("D:\\TAU-SeleniumWebdriver\\TAU-SeleniumWebdriver\\resources\\chromedriver.exe");
        Assert.assertEquals(uploadPage.getUploadedFiles(), "chromedriver.exe",
                "Upload did not match");
    }
}
