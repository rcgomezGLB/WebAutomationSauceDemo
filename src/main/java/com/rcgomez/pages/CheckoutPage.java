package com.rcgomez.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

    @FindBy(id = "first-name")
    WebElement firstNameInput;

    @FindBy(id = "last-name")
    WebElement lastNameInput;

    @FindBy(id = "postal-code")
    WebElement postalCodeInput;

    @FindBy(id = "cancel")
    WebElement cancelButton;

    @FindBy(id = "continue")
    WebElement continueButton;


    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void typeFirstName(String input) {
        firstNameInput.sendKeys(input);
    }

    public void typeLastName(String input) {
        lastNameInput.sendKeys(input);
    }

    public void typePostalCode(String input) {
        postalCodeInput.sendKeys(input);
    }

    public void continueToOverview() {
        clickElement(continueButton);
    }
}
