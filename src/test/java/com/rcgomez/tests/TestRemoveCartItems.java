package com.rcgomez.tests;

import base.LoggedInBaseTest;
import com.rcgomez.pages.CartPage;
import com.rcgomez.pages.InventoryPage;
import com.rcgomez.util.RandomSelectionUtil;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.List;

public class TestRemoveCartItems extends LoggedInBaseTest {
    private InventoryPage inventoryPage;
    private CartPage cartPage;

    @BeforeClass
    private void classSetUp() {
        inventoryPage = new InventoryPage(driver);
        cartPage = new CartPage(driver);
    }

    @Parameters({"numberProducts"})
    @Test
    void removeCartItems(int numberProducts) {
        List<WebElement> addProductButtonList = inventoryPage.getButtonsList();
        List<WebElement> selectedProductList = RandomSelectionUtil.randomSelect(addProductButtonList, numberProducts);

        for (WebElement button: selectedProductList) {
            inventoryPage.clickElement(button);
        }

        inventoryPage.goToShoppingCart();

        List<WebElement> removeButtonsList = cartPage.getRemoveItemButtons();
        for (WebElement button: removeButtonsList) {
            cartPage.clickElement(button);
        }

        // Get if remove buttons are remaining
        Assert.assertTrue(cartPage.getRemoveItemButtons().isEmpty());

    }
}
