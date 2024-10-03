package com.selenium.basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByTitle {
	public static void main(String[] args) throws InterruptedException {
		String Url = "https://demowebshop.tricentis.com/";
		
		String excepted_result = "Demo Web Shop";
//		?open the browser
		ChromeDriver driver  = new ChromeDriver();
//		maximize
		driver.manage().window().maximize();
//		waiting condition
		Thread.sleep(3000); 
		
//		enter into the dws webpage
		driver.get(Url);
		Thread.sleep(3000);
//		fetch current Title
		String actual_result = driver.getTitle();
		
		if (excepted_result.equals(actual_result)) {
			
			System.out.println("I am in dws webpage");
			
		} else {
			
			System.out.println("I am Not in dws webpage");
			driver.close();

		}
		Thread.sleep(3000);
		driver.close();
		
		
		
		
	}

}
