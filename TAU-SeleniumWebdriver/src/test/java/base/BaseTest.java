package base;

import com.google.common.io.Files;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.homepage.HomePage;
import utilities.EventReporter;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import static utilities.Utility.setUtilityDriver;

public class BaseTest {

    public WebDriver driver;
    protected HomePage homePage;
    private EventReporter eventReporter;
    private WebDriver decoratedDriver;

    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver(getChromeOptions());
        driver.manage().window().maximize();

        // Create an instance of the event listener
        eventReporter = new EventReporter();

        // Wrap the WebDriver instance with the EventFiringDecorator to listen to events
        // decoratedDriver = new EventFiringDecorator<>(eventReporter).decorate(driver);

        // exploration test: assigning the original driver to the EventFiringDecorator
        // while passing the driver to the decorate function
        driver = new EventFiringDecorator<>(eventReporter).decorate(driver);

        // implicit wait
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        LoadApplication();
        homePage = new HomePage(driver);
        setUtilityDriver(homePage);
        //setCookie();
    }

    @BeforeMethod
    public void LoadApplication()
    {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterMethod
    public void recordFailure(ITestResult result)
    {
        if (ITestResult.FAILURE == result.getStatus())
        {
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);

            try{
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            }catch (IOException e)
            {
                e.printStackTrace();
            }

            System.out.println("Screenshot taken: " + screenshot.getAbsolutePath());
        }
    }


    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

    private ChromeOptions getChromeOptions()
    {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        return options;
    }

}
