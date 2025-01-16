package com.demoqa.pages.pom.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.ClickJS;
import static utilities.JavaScriptUtility.ScrollToElementJS;

public class PracticeFormPage extends FormsPage{

    // Variables
    // [Category: Radio Button]
    private By femaleRadioButton = By.cssSelector("#gender-radio-2");

    // [Category: Check Boxes]
    private By sportsHobbyCheckbox = By.id("hobbies-checkbox-1");
    private By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private By musicHobbyCheckbox = By.id("hobbies-checkbox-3");

    // Functions -> Radio Button
    public void ClickFemaleRadioButton()
    {
        ScrollToElementJS(femaleRadioButton);
        ClickJS(femaleRadioButton);
    }

    public boolean VerifyFemaleRadioButtonSelected()
    {
        return FindWebElement(femaleRadioButton).isSelected();
    }

    // Functions -> Check Boxes
    public void ClickSportsCheckBox()
    {
        if (!FindWebElement(sportsHobbyCheckbox).isSelected())
        {
            ScrollToElementJS(sportsHobbyCheckbox);
            ClickJS(sportsHobbyCheckbox);
        }
    }

    public void ClickReadingCheckBox()
    {
        if (!FindWebElement(readingHobbyCheckbox).isSelected())
        {
            ScrollToElementJS(readingHobbyCheckbox);
            ClickJS(readingHobbyCheckbox);
        }
    }

    public void ClickMusicCheckBox()
    {
        if (!FindWebElement(musicHobbyCheckbox).isSelected())
        {
            ScrollToElementJS(musicHobbyCheckbox);
            ClickJS(musicHobbyCheckbox);
        }
    }

    public void UnclickReadingCheckBox()
    {
        if (FindWebElement(readingHobbyCheckbox).isSelected())
        {
            ScrollToElementJS(readingHobbyCheckbox);
            ClickJS(readingHobbyCheckbox);
        }
    }

    public boolean VerifyReadingCheckBoxSelected()
    {
        return FindWebElement(readingHobbyCheckbox).isSelected();
    }

}
