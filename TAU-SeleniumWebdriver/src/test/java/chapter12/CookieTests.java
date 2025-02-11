package chapter12;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.CookieManager.*;

public class CookieTests extends BaseTest {

    @Test
    public void removeSpecificCookieTest()
    {
        String cookieName = "optimizelyBuckets";
        var cookieList = getAllCookieNames();
        System.out.println(cookieList);
        deleteSpecificCookie(cookieName);
        boolean result = verifyDeletedCookie(cookieName);
        Assert.assertTrue(result, "The specific cookie is not deleted.");
    }


}
