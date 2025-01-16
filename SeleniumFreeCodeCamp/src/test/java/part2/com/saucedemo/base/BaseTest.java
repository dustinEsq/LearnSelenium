package part2.com.saucedemo.base;

import com.saucedemo.pages.pom.BasePage;
import com.saucedemo.pages.pom.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    private String url = "https://www.saucedemo.com/v1/";

    @BeforeClass
    public void SetUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        basePage = new BasePage();
        basePage.SetDriver(driver);
        loginPage = new LoginPage();
    }

    @AfterClass
    public void TearDown()
    {
        driver.quit();
    }
}
