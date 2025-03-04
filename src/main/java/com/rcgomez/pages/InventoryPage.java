package com.rcgomez.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class InventoryPage extends BasePage {

    private static final Logger log = LoggerFactory.getLogger(InventoryPage.class);
    @FindAll({@FindBy(css = ".btn_inventory")})
    List<WebElement> buttonsList;

    @FindBy(css = ".shopping_cart_link")
    WebElement shoppingCartButton;



    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getButtonsList() {
        return buttonsList;
    }

    public void goToShoppingCart() {
        clickElement(shoppingCartButton);
    }

}
