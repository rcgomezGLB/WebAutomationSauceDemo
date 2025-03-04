package com.rcgomez.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage extends BasePage {

    @FindBy(id = "finish")
    WebElement finishButton;

    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    public void finishCheckout() {
        clickElement(finishButton);
    }
}
