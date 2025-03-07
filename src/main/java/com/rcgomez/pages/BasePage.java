package com.rcgomez.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    // Elements present in all pages
    @FindBy(id = "react-burger-menu-btn")
    WebElement burgerMenuButton;

    @FindBy(id = "logout_sidebar_link")
    WebElement logoutButton;

    @FindBy(id = "react-burger-cross-btn")
    WebElement getBurgerMenuCrossButton;


    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public void logOut(WebDriver driver) {
        if (getBurgerMenuCrossButton.isDisplayed()) { // Side menu could be displayed
            clickElement(getBurgerMenuCrossButton);
        }
        clickElement(burgerMenuButton);

        Wait<WebDriver> wait;
        wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until((d) -> logoutButton.isDisplayed()); // To ensure animation of side menu is completed

        clickElement(logoutButton);
    }
}
