package com.selenium.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    @FindBy (id = "Email")
    WebElement username;

    @FindBy (name = "Password")
    WebElement password;

    @FindBy (xpath = "//button[@type='submit']")
    WebElement loginButton;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    public void loginApp(String user, String pwd){
        username.clear();
        username.sendKeys(user);
        username.clear();
        password.sendKeys(pwd);
        loginButton.click();
    }


}
