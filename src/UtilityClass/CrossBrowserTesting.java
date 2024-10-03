	package UtilityClass;

import org.openqa.selenium.By;

public class CrossBrowserTesting extends BaseClass {

	public static void main(String[] args) {

		preCondition("firefox");

		if (verifyUrl(getUrl())) {
			
			driver.findElement(By.id("small-searchterms")).sendKeys("Laptop");
			driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();;
			
			
		} else {
				System.out.println("Not in dws");
		}

		postCondition();

	}

}
