package com.selenium.basics;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenNewTabs{
    public static void main(String[] args) {
        // Set the path to your WebDriver executable
    	
//
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
//
//        // Open the first webpage
//        driver.get("https://www.google.com");
        

        
        driver.get("https://www.flipkart.com");
        System.out.println("Browser title: " + driver.getTitle());
        driver.get("https://www.python.org");
//      

        // Open a new tab using JavaScript
//        ((ChromeDriver) driver).executeScript("window.open('https://www.google.com', '_blank');");
//
        // Get the list of all open tabs
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        // Switch to the new tab
        driver.switchTo().window(tabs.get(1));
//
        // Perform actions on the new tab
        driver.get("https://www.python.org");
//        
        // Switch to the new tab
        driver.switchTo().window(tabs.get(2));
//
        // Perform actions on the new tab
        driver.get("https://www.myntra.com");
        // Switch to the new tab
        driver.switchTo().window(tabs.get(3));
//
        // Perform actions on the new tab
        driver.get("https://www.amazon.com");
        // Switch to the new tab
        driver.switchTo().window(tabs.get(4));
//
        // Perform actions on the new tab
        driver.get("https://www.twitter.com");
        // Switch to the new tab
        driver.switchTo().window(tabs.get(5));
//
        // Perform actions on the new tab
        driver.get("https://www.instagram.com");
        // Switch to the new tab
        driver.switchTo().window(tabs.get(6));
//
        // Perform actions on the new tab
        driver.get("https://www.youtube.com");
        // Switch to the new tab
        driver.switchTo().window(tabs.get(7));
//
        // Perform actions on the new tab
        driver.get("https://www.flipkart.com");
//        
//
        // Optionally, switch back to the original tab
        driver.switchTo().window(tabs.get(0));
//
        // Perform actions on the original tab
        driver.get("https://www.selenium.dev");
//
//        // Close the browser
        driver.quit();
    }
    

}
