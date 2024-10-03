package UtilityClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DigitalDownload extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		preCondition();
		if (verifyUrl(getUrl())) {
			
			
			driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')][1]")).click();// ByUsing ContainsFunctions Syntax

			// for verify Digital Download page 1 album is used
			WebElement prodName = driver.findElement(By.xpath("(//a[@href='/album-3'])[1]")); // ByUsing GroupOfIndex
																								// Syntax

			
				System.out.println("I am in Digital Download page");

				List<WebElement> cart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
				// added to cart
				for (WebElement web : cart) {
					web.click();
					Thread.sleep(2000);
				}
				Thread.sleep(2000);
				driver.findElement(By.xpath("//li[@id='topcartlink']/a/span[1]")).click();

				List<WebElement> price = driver.findElements(By.xpath("//span[@class='product-subtotal']"));
				Thread.sleep(2000);

				ArrayList<Double> price1 = new ArrayList<Double>();

				for (WebElement web : price) {
					

					price1.add(Double.parseDouble(web.getText()));
				}
				
				double max = Collections.max(price1);
				System.out.println(max);

				ArrayList<String> values = new ArrayList<String>();

				// checkbox list
				List<WebElement> list = driver.findElements(By.name("removefromcart"));
				for (WebElement web : list) {
					values.add(web.getAttribute("value"));
				}

				int ct = 0;

				for (WebElement web : price) {
					

					if (web.getText().equals(String.format("%.2f", max))) {

						driver.findElement(By.xpath("//input[@value= " + values.get(ct) + " ]")).click();
						

						driver.findElement(By.xpath("//input[@name='updatecart']")).click();
						System.out.println();
						
					
					}
					ct++;
				}
			

		} else {

			System.out.println("Ur not in Dws");

		}
		
		postCondition();
	}

}
