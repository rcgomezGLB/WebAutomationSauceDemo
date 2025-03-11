package com.rcgomez.tests;

import base.LoggedInBaseTest;
import com.rcgomez.pages.InventoryPage;
import com.rcgomez.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogout extends LoggedInBaseTest {
    private InventoryPage inventoryPage;
    private LoginPage loginPage;

    @BeforeMethod
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
