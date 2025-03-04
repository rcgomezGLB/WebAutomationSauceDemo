package com.rcgomez.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(id = "checkout")
    WebElement checkoutButton;

    @FindBy(id = "continue-shopping")
    WebElement continueShoppingButton;

    @FindBy(css = ".cart_button")
    List<WebElement> removeItemButtons;


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void goToCheckout() {
        clickElement(checkoutButton);
    }

    public void goToShopping() {
        clickElement(continueShoppingButton);
    }

    public List<WebElement> getRemoveItemButtons() {
        return removeItemButtons;
    }
}
