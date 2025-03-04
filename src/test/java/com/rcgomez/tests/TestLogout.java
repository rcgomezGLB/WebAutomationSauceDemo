package com.rcgomez.tests;

import base.LoggedInBaseTest;
import com.rcgomez.pages.CartPage;
import com.rcgomez.pages.InventoryPage;
import com.rcgomez.pages.LoginPage;
import com.rcgomez.util.RandomSelectionUtil;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class TestLogout extends LoggedInBaseTest {
    private InventoryPage inventoryPage;
    private LoginPage loginPage;

    @BeforeClass
    private void classSetUp() {
        inventoryPage = new InventoryPage(driver);
        loginPage= new LoginPage(driver);
    }

    @Test
    void logoutRedirectsToLoginPage() {
        inventoryPage.logOut(driver);
        Assert.assertTrue(loginPage.getLoginButton().isDisplayed());
    }
}
