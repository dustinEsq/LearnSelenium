package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends Utility{

    // good for when the elements are already in the DOM
    public static void scrollToElement(By locator)
    {
        WebElement element = driver.findElement(locator);
        String script = "arguments[0].scrollIntoView()";
        ((JavascriptExecutor)driver).executeScript(script, element);
    }

    /**
     * Scolls until paragraph with index specified is in view
     * @param index 1-based
     */
    public static void scrollToInfiniteParagraph(int index, int current, By locator)
    {
        int target = current;
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor)driver;
        while (target < index)
        {
            jsExecutor.executeScript(script);
            target = driver.findElements(locator).size();
        }

    }

    public static void setAttributeElementJS(By locator)
    {
        WebElement element = driver.findElement(locator);
        String script = "arguments[0].setAttribute('multiple', '')";
        ((JavascriptExecutor)driver).executeScript(script, element);
    }

}
