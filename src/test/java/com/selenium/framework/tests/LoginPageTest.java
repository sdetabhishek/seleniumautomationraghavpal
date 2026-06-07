package com.selenium.framework.tests;

import com.selenium.framework.base.BaseTest;
import com.selenium.framework.pages.LoginPage;

import com.selenium.framework.utils.Log;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void validLoginTest(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginApp("admin@yourstore.com","admin");
        System.out.println("Title of Page: " + driver.getTitle());
        Log.info("Asserting Page Title");
        Assert.assertEquals(driver.getTitle(), "nopCommerce demo store. Login");
    }
}
