package com.rcgomez.tests;

import base.LoggedInBaseTest;
import com.rcgomez.pages.*;
import com.rcgomez.util.RandomSelectionUtil;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class TestPurchaseProduct extends LoggedInBaseTest {

   private InventoryPage inventoryPage;
   private CartPage cartPage;
   private CheckoutPage checkoutPage;
   private OverviewPage overviewPage;
   private PurchaseCompletePage purchaseCompletePage;

   @BeforeClass
   void classSetUp() {
      inventoryPage = new InventoryPage(driver);
      cartPage = new CartPage(driver);
      checkoutPage = new CheckoutPage(driver);
      overviewPage = new OverviewPage(driver);
      purchaseCompletePage = new PurchaseCompletePage(driver);
   }

   @Parameters({"numberProducts", "firstName", "lastName", "postalCode"})
   @Test
   public void purchaseProduct(int numberProducts, String firstName, String lastName, String postalCode) throws Exception {
      List<WebElement> addProductButtonList = inventoryPage.getButtonsList();
      List<WebElement> selectedProductList = RandomSelectionUtil.randomSelect(addProductButtonList, numberProducts);

      for (WebElement element: selectedProductList) {
         inventoryPage.clickElement(element);
      }

      inventoryPage.goToShoppingCart();

      cartPage.goToCheckout();

      checkoutPage.typeFirstName(firstName);
      checkoutPage.typeLastName(lastName);
      checkoutPage.typePostalCode(postalCode);
      checkoutPage.continueToOverview();

      overviewPage.finishCheckout();

      Assert.assertNotNull(purchaseCompletePage.getOrderConfirmationHeader());

   }
}
