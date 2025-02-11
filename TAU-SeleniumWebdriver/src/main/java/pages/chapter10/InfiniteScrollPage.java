package pages.chapter10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utilities.JavaScriptUtility.scrollToInfiniteParagraph;

public class InfiniteScrollPage {

    private WebDriver driver;
    private By textBlocks = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver)
    {
        this.driver = driver;
    }

    private int getNumberOfParagraphsPresent()
    {
        return driver.findElements(textBlocks).size();
    }

    public void scrollToParagraph(int index)
    {
        int currentParagraphs = getNumberOfParagraphsPresent();
        scrollToInfiniteParagraph(index, currentParagraphs, textBlocks);
    }

}
