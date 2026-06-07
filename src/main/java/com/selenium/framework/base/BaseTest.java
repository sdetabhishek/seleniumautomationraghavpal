package com.selenium.framework.base;


import com.selenium.framework.utils.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


    protected WebDriver driver;

    @BeforeMethod
    public void setup(){

        Log.info("Initiating Browser Instance");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Log.info("Navigating to URL");
        driver.get("https://admin-demo.nopcommerce.com/login");
    }

    @AfterMethod
    public void tearDown(){
        if(driver!=null){
            Log.info("Closing Browser");
            driver.quit();
        }
    }
}
