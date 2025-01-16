package utilities;

import com.demoqa.pages.pom.BasePage;
import org.openqa.selenium.WebDriver;

public class Utility {

    public  static WebDriver driver;

    public static void SetUtilityDriver()
    {
        driver = BasePage.driver;
    }

    //Can include functions such as generate a random number and such


}
