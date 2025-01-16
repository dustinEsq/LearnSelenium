package Part3_4.com.demoqa.base;

import com.demoqa.pages.pom.BasePage;
import com.demoqa.pages.pom.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static com.demoqa.pages.pom.BasePage.Delay;
import static utilities.Utility.SetUtilityDriver;

public class BaseTest {

    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String DEMOQA_URL = "https://demoqa.com/";

    @BeforeClass
    public void SetUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void LoadApplication()
    {
        driver.get(DEMOQA_URL);
        basePage = new BasePage();
        basePage.SetDriver(driver);
        SetUtilityDriver();
        homePage = new HomePage();
    }

    @AfterClass
    public void TearDown()
    {
        Delay(3000);
        driver.quit();
    }
}
