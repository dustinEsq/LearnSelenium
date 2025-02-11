package utilities;

import org.openqa.selenium.WebDriver;
import pages.homepage.HomePage;

public class Utility {

    public static WebDriver driver;

    public static void setUtilityDriver(HomePage homePage)
    {
       driver = homePage.getDriver();
    }


}
