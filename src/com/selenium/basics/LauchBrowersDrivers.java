package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LauchBrowersDrivers {
public static void main(String[] args) throws InterruptedException {
//	  open chrome
    WebDriver driver = new ChromeDriver();
 // to maximize the window 
    	driver.manage().window().maximize();
    driver.get("https://www.youtube.com");
    
    System.out.println("Browser title: " + driver.getTitle());
    
    
//    driver.get("https://www.youtube.com");
//    System.out.println("Browser title: " + driver.getTitle());


    driver.get("https://www.flipkart.com");
    System.out.println("Browser title: " + driver.getTitle());
    
    driver.get("https://www.amazon.com");
    System.out.println("Browser title: " + driver.getTitle());
    
    driver.get("https://www.twitter.com");
    System.out.println("Browser title: " + driver.getTitle());
    
    driver.get("https://www..com");
    System.out.println("Browser title: " + driver.getTitle());
    

     
      
      
////		  open FireFox
//	      WebDriver driver2 = new FirefoxDriver();
//	      driver2.get("https://www.firefox.com");
//	      System.out.println("Browser title: " + driver2.getTitle());
	      
// to maximize the window 
//	        driver.manage().window().maximize();
 }}