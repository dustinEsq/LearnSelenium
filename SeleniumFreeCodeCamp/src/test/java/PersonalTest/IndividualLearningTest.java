package PersonalTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class IndividualLearningTest {

    WebDriver driver;

    @BeforeClass
    public void SetUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://toolsqa.com/");
    }

    @AfterClass
    public void Exit()
    {
        //driver.quit();
    }

    @Test
    public void GetToDemoSite()
    {
        //Thread.sleep(2000);

        //WebDriverWait wait = new WebDriverWait(driver, 2);
        //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath());
        //((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);

       //WebElement demoWebsite = driver.findElement(By.linkText("Demo Website"));
       //demoWebsite.click();

        //Thread.sleep(2000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        //String actualResult = driver.findElement(By.name("banner-image")).getText();
        //String expectedResult = "banner-image";
        //Assert.assertEquals(actualResult, expectedResult);
    }


}
