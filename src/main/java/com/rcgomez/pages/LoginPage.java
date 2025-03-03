package com.rcgomez.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends  BasePage {

    @FindBy(id = "user-name")
    private WebElement userNameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void typeUser(String user) {
        userNameInput.sendKeys(user);
    }

    public void typePassword(String password) {
        userNameInput.sendKeys(password);
    }

    public void login(String user, String password) {
        typeUser(user);
        typePassword(password);
        loginButton.click();
    }
}
