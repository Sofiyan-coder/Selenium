package Assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import UtilityClass.ShopperStackBaseClass;

public class ShopperStackLogin extends ShopperStackBaseClass{

	public static void main(String[] args) throws InterruptedException {
	
		preCondition("chrome");
		if (verifyUrl(url)) {
			System.out.println("I am in Shopper Stack");
			logIn();
			waitFor(4);
			WebElement category = driver.findElement(By.xpath("//*[@id=\"category\"]"));
			Select select = new Select(category);
			select.selectByVisibleText("men");
			waitFor(2);
			driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("shirts");
			waitFor(4);
//			WebElement products = driver.findElement(By.xpath("//*[@id=\"browsers\"]"));
//			Select select2 = new Select(products);
//			select2.selectByVisibleText("shirts");
			
			waitFor(4);
			driver.findElement(By.id("searchBtn")).click();
			waitFor(4);
			
			
			
		} else {
			System.out.println("I am Not in Shopper Stack");
			closeBrowser();

		}
		
		postCondition();

	}

}
