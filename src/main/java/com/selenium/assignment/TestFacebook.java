package com.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

public class TestFacebook {
    public static void main(String[] args) throws IOException {

        String userDataDir = "/tmp/selenium/user-data-dir-" + UUID.randomUUID().toString();

        // Create the directory if it doesn't exist
        Files.createDirectories(Paths.get(userDataDir));

        // Set up Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=" + userDataDir);

        // Start the WebDriver
        WebDriver driver = new ChromeDriver(options);


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
