package com.selenium.basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByURLRedbus {
	
	public static void main(String[] args) throws InterruptedException {
		
		String Url = "https://www.redbus.com/";
		String expected_result = Url;
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.get(Url);
		String actual_result = driver.getCurrentUrl();
		System.err.println(actual_result);
		
		if (expected_result.equals(actual_result)) {
			
			System.out.println("I am in  Redbus Webpage");
			
		} else {
			
			System.out.println("I am Not in  Redbus Webpage");
			driver.close();

		}
//		
		Thread.sleep(3000);
		driver.close();
	}

}
