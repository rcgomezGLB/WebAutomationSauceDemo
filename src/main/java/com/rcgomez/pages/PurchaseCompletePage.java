package com.rcgomez.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchaseCompletePage extends BasePage {

    @FindBy(css = ".complete-header")
    WebElement orderConfirmationHeader;

    public PurchaseCompletePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getOrderConfirmationHeader() {
        return orderConfirmationHeader;
    }
}
