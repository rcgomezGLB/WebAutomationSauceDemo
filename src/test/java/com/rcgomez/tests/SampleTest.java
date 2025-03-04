package com.rcgomez.tests;

import base.BaseTest;
import com.rcgomez.pages.InventoryPage;
import com.rcgomez.pages.LoginPage;
import org.testng.annotations.*;

public class SampleTest extends BaseTest {

   @Parameters({"username", "password"})
   @BeforeMethod
   void testSetUp(String user, String password) {
      LoginPage loginPage = new LoginPage(driver);
      InventoryPage inventoryPage = new InventoryPage(driver);
      loginPage.login(user, password);
      inventoryPage.goToShoppingCart();
   }

   @Test
   public void test() {
   }
}
