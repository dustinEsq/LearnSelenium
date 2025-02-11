package pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.chapter10.DropdownPageJS;
import pages.chapter10.InfiniteScrollPage;
import pages.chapter10.LargeDeepDomPage;
import pages.chapter11.MultipleWindowsPage;
import pages.chapter4.DropdownPage;
import pages.chapter4.LoginPage;
import pages.chapter5.HoversPage;
import pages.chapter6.HorizontalSliderPage;
import pages.chapter6.KeyPressesPage;
import pages.chapter7.ContextMenuPage;
import pages.chapter7.FileUploaderPage;
import pages.chapter7.JavaScriptAlertsPage;
import pages.chapter8.FramesPage;
import pages.chapter8.WysiwygEditorPage;
import pages.chapter9.DynamicLoadingPage;

public class HomePage {

    private WebDriver driver;
    private By formAuthenticationLink = By.cssSelector("[href = '/login']");
    private By dropdownLink = By.cssSelector("[href = '/dropdown']");
    private By hoversLink = By.cssSelector("a[href = '/hovers']");
    private By keyPressesLink = By.cssSelector("[href='/key_presses']");
    private By horizontalSliderLink = By.cssSelector("[href='/horizontal_slider']");
    private By jsAlertLink = By.cssSelector("[href='/javascript_alerts']");
    private By fileUploadLink = By.cssSelector("[href='/upload']");
    private By contextMenuLink = By.cssSelector("[href='/context_menu']");
    private By editorPageLink = By.cssSelector("[href='/tinymce']");
    private By framesPageLink = By.cssSelector("[href='/frames']");
    private By dymanicLoadingPageLink = By.cssSelector("[href='/dynamic_loading']");
    private By largeAndDeepDomLink = By.cssSelector("[href='/large']");
    private By infiniteScrollLink = By.cssSelector("[href='/infinite_scroll']");
    private By multipleWindowLink = By.cssSelector("[href='/windows']");

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication()
    {
        clickLink(formAuthenticationLink);
        return new LoginPage(driver);
    }

    public HoversPage clickHovers()
    {
        clickLink(hoversLink);
        return new HoversPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider()
    {
        clickLink(horizontalSliderLink);
        return new HorizontalSliderPage(driver);
    }


    public KeyPressesPage clickKeyPress()
    {
        clickLink(keyPressesLink);
        return new KeyPressesPage(driver);
    }

    public DropdownPage clickDropdown()
    {
        clickLink(dropdownLink);
        return new DropdownPage(driver);
    }

    public JavaScriptAlertsPage clickJSLink()
    {
        clickLink(jsAlertLink);
        return new JavaScriptAlertsPage(driver);
    }

    public ContextMenuPage clickContextmenu()
    {
        clickLink(contextMenuLink);
        return new ContextMenuPage(driver);
    }

    public FileUploaderPage clickFileUpload(){
        clickLink(fileUploadLink);
        return new FileUploaderPage(driver);
    }

    public WysiwygEditorPage clickEditorPage()
    {
        clickLink(editorPageLink);
        return new WysiwygEditorPage(driver);
    }

    public FramesPage clickFramesPage()
    {
        clickLink(framesPageLink);
        return new FramesPage(driver);
    }

    public DynamicLoadingPage clickLoadingPage()
    {
        clickLink(dymanicLoadingPageLink);
        return new DynamicLoadingPage(driver);
    }

    public LargeDeepDomPage clickDeepDomPage()
    {
        clickLink(largeAndDeepDomLink);
        return new LargeDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll()
    {
        clickLink(infiniteScrollLink);
        return new InfiniteScrollPage(driver);
    }

    public DropdownPageJS clickDropdownJS()
    {
        clickLink(dropdownLink);
        return new DropdownPageJS(driver);
    }

    public MultipleWindowsPage clickMultipleWindows()
    {
        clickLink(multipleWindowLink);
        return new MultipleWindowsPage(driver);
    }



    private void clickLink(By locator)
    {
        driver.findElement(locator).click();
    }

}
