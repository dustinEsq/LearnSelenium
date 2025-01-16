package PersonalTest.pom.practice.base;

import com.PersonalPractice.pages.base.BasePagePractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static utilities.Utility.SetUtilityDriver;

public class BaseTestPractice {

    WebDriver driver;
    String AUT_URL = " "; // to be included later
    // variables for page object class -> to be added
    BasePagePractice basePagePractice;

    @BeforeTest
    public void SetUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();


    }

    @BeforeMethod
    public void LoadApplication()
    {
        // driver.get("insert URL");
        basePagePractice = new BasePagePractice();
        basePagePractice.SetDriver(driver);
        SetUtilityDriver();
        // then other page object to be inserted later
    }

    @AfterClass
    public void TearDown() //throws InterruptedException
    {
        //Thread.sleep(3000);
        driver.quit();
    }



}
