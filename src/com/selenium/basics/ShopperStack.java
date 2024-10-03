package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStack {
	public static void main(String[] args) throws InterruptedException {
		String Url = "https://www.shoppersstack.com/";
		
		String excepted_result = Url;
//		?open the browser
		ChromeDriver driver  = new ChromeDriver();
//		maximize
		driver.manage().window().maximize();
//		waiting condition
		Thread.sleep(3000); 
		
//		enter into the dws webpage
		driver.get(Url);
		
//		fetch current url
		String actual_result = driver.getCurrentUrl();
		
		if (excepted_result.equals(actual_result)) {
			
			System.out.println("I am in Shopper Stack");
			Thread.sleep(30000);
			
			driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
			
		} else {
			
			System.out.println("I am Not in Shopper Stack");
			driver.close();

		}
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
