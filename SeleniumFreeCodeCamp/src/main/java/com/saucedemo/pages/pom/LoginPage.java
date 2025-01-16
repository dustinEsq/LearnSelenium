package com.saucedemo.pages.pom;

import org.openqa.selenium.By;

/* Notes: Methods (Excluding the Setter and Getter)
    1. Transition Methods should have a return type
    2. The return type should be the webpage you're going to
        or what you're transitioning into
    3. Convenience Methods are methods that you want to combine 2 or more
        functions in a single method
*/
public class LoginPage extends BasePage {

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By logInButton = By.id("login-button");
    private By errorMessage = By.cssSelector("#login_button_container h3");

    public void SetUsername(String username)
    {
        Set(usernameField, username);
    }

    public void SetPassword(String password)
    {
        Set(passwordField, password);
    }

    // transition method
    public ProductsPage ClickLogInButton()
    {
        Click(logInButton);
        return new ProductsPage();
    }

    // convenience method
    public ProductsPage LogIntoApplication(String username, String password)
    {
        SetUsername(username);
        SetPassword(password);
        return ClickLogInButton();
    }

    public String GetErrorMessage()
    {
        return Find(errorMessage).getText();
    }


}
