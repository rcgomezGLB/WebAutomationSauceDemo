package com.rcgomez.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends BasePage {

    @FindBy(css = ".complete-header")
    WebElement orderConfirmationHeader;

    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getOrderConfirmationHeader() {
        return orderConfirmationHeader;
    }
}
