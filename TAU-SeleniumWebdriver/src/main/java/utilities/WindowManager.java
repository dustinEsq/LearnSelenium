package utilities;

import org.openqa.selenium.WebDriver;

/**
 * This class employs the Webdriver Navigation.
 * The driver is gotten from the Utility class as this class
 * extends to it.
 */
public class WindowManager extends Utility{

    private static WebDriver.Navigation navigate = driver.navigate();

    public static void windowGoBack()
    {
        navigate.back();
    }

    public static void widowGoForward()
    {
        navigate.forward();
    }

    public static void windowRefresh()
    {
        navigate.refresh();
    }

    public static void windowGoTo(String url)
    {
        navigate.to(url);
    }

    public static void switchToTab(String tabTitle)
    {
        var windows = driver.getWindowHandles();
        System.out.println("Number of tabs: " + windows.size());
        System.out.println("Window Handles: ");
        windows.forEach(System.out::println);
        for (String window : windows)
        {
            System.out.println("Switching to window: " + window);
            driver.switchTo().window(window);
            System.out.println(("Current window title: " + driver.getTitle()));
            if (tabTitle.equals(driver.getTitle()))
            {
                break;
            }
        }
    }

    public static void switchToNewTab()
    {
        var windows = driver.getWindowHandles();
        for (String window : windows)
        {
            driver.switchTo().window(window);
        }
    }


}
