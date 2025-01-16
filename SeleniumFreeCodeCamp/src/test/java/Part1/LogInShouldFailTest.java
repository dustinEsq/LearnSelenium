package Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogInShouldFailTest {

    WebDriver driver;

    @BeforeClass
    public void SetUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass
    public void TearDown()
    {
        //driver.quit();
    }

    @Test
    public void TestLoggingIntoApplication() throws  InterruptedException
    {
        Thread.sleep(2000);

        // when testing there are two steps
        // first: find the element
        WebElement username = driver.findElement(By.name("username"));
        // second: do something about the element
        username.sendKeys("Admin");

        // second way to find an element using the "var" keyword
        var password = driver.findElement(By.name("password"));
        password.sendKeys(("admin123"));

        // third way to find an element by using the ".findElement()" function from selenium
        // and does not have an object reference
        driver.findElement(By.tagName("button")).click();

        Thread.sleep(2000);

        // check the results
        String actualResult = driver.findElement(By.tagName(("h6"))).getText();
        String expectedResult = "Dashboard";
        Assert.assertNotEquals(actualResult, expectedResult);
    }
}
