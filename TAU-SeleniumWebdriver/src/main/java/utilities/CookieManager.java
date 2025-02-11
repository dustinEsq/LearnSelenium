package utilities;

import org.openqa.selenium.Cookie;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CookieManager extends Utility{

    public static void setCookie()
    {
        Cookie cookie = new Cookie.Builder("tau", "123")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }


    public static void deleteSpecificCookie(String cookieName)
    {
        Set<Cookie> cookies =  driver.manage().getCookies();
        for (Cookie cookie : cookies)
        {
            if (cookie.getName().equals(cookieName))
            {
                driver.manage().deleteCookie(cookie);
            }
        }
    }

    public static boolean verifyDeletedCookie(String cookieName)
    {
        Set<Cookie> cookies =  driver.manage().getCookies();
        for (Cookie cookie : cookies)
        {
            if (cookie.getName().equals(cookieName))
            {
               return false;
            }
        }

        return true;
    }

    public static List<String> getAllCookieNames()
    {
        Set<Cookie> cookies = driver.manage().getCookies();
        return cookies.stream().map(e->e.getName()).toList();
    }
}
