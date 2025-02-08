package com.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFacebook {
    public static void main(String[] args) {

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open Facebook Login Page
        driver.get("https://www.facebook.com");

        // Find email field and enter credentials
        driver.findElement(By.id("email")).sendKeys("your-email@example.com");
        driver.findElement(By.id("pass")).sendKeys("your-password");

        // Find and click the login button
        driver.findElement(By.name("login")).click();

        // Wait for login to complete and verify
        try {
            Thread.sleep(5000); // Sleep for 5 seconds to see the result
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
