package Assignments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DigitalDownloadProducts {
	
	


	public static void main(String[] args) throws InterruptedException {
		
		String expected_title = "Demo Web Shop";
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		String actaul_title = driver.getTitle();
		
		if (expected_title.equals(actaul_title)) {
			System.out.println("I am in dws page");
			
//			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/div[3]/div[2]/input")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')][1]")).click();// ByUsing ContainsFunctions Syntax
			
			Thread.sleep(2000);
			
//			driver.findElement(By.id("products-orderby")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//option[@value='https://demowebshop.tricentis.com/digital-downloads?orderby=6']")).click();
			
			WebElement prodName = driver.findElement(By.xpath("(//a[@href='/album-3'])[1]")); //ByUsing GroupOfIndex Syntax
			
			if (prodName.isDisplayed()) {
				System.out.println("I am in Digital Download page");
				
				List<WebElement> cart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
				
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
					Thread.sleep(1000);
					
					price1.add(Double.parseDouble (web.getText()));
				}
				Thread.sleep(1000);
				double max = Collections.max(price1);
				System.out.println(max);
				
				ArrayList<String> values = new ArrayList<String>();
				
				List<WebElement> list = driver.findElements(By.name("removefromcart"));
				for (WebElement web : list) {
					values.add(web.getAttribute("value"));
				}
				
				int ct = 0;
				
				for (WebElement web : price) {
					Thread.sleep(2000);
					
					if (web.getText().equals(String.format("%.2f", max))) {
						
						driver.findElement(By.xpath("//input[@value= "+values.get(ct)+" ]")).click();
						Thread.sleep(1000);
						
						driver.findElement(By.xpath("//input[@name='updatecart']")).click();
						System.out.println();
						Thread.sleep(4000);
						driver.close();
					}
					ct++;
				}
			}else {
				System.out.println("I am not in Digital Download page");
			}
			
		} else {
			System.out.println("I am not in dws page");
		}
	}
}