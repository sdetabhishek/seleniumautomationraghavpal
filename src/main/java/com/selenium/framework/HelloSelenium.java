package com.selenium.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HelloSelenium {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://admin-demo.nopcommerce.com/login");
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
        WebElement email = driver.findElement(By.id("Email"));
        email.clear();
        email.sendKeys("admin@yourstore.com");
        WebElement password = driver.findElement(By.name("Password"));
        password.clear();
        password.sendKeys("admin");
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        System.out.println("Text: " +loginButton.getText());
        driver.quit();
    }
}
