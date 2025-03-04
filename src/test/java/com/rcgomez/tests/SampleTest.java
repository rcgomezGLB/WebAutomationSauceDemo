package com.rcgomez.tests;

import base.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {
   @Parameters({"username", "password"})
   @Test
   public void test(String user, String password) {
      logIn(user, password);
   }
}
