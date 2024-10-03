package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavBarMenuOptions {
	public static void main(String[] args) throws InterruptedException {
		String Url = "https://demowebshop.tricentis.com/";
		String excepted_title = "Demo Web Shop";
		String wishlist_url = "https://demowebshop.tricentis.com/wishlist";
//		?open the browser
		ChromeDriver driver  = new ChromeDriver();
//		maximize
		driver.manage().window().maximize();
//		waiting condition
		Thread.sleep(3000); 
		
//		enter into the dws webpage
		
		driver.navigate().to(Url);
		Thread.sleep(3000);
//		fetch current url
		String actual_title= driver.getTitle();
		
		
		if (excepted_title.equals(actual_title)) {
			
			System.out.println("I am in dws webpage");
			
			List<WebElement> nav_menu = driver.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));
			



			for (WebElement options : nav_menu) {

				
				options.click();
				
				Thread.sleep(3000);
				
				String actual_wishlist_url = driver.getCurrentUrl();
				if(actual_wishlist_url.equals(wishlist_url)) {
					break;
					
				}
				
				driver.navigate().back();
				System.out.println("Navigate to Back");
				
				
				
			
				
				
			}
			
			System.out.println("Test Completed");
			
		} else {
			
			System.out.println("I am Not in dws webpage");
			driver.close();

		}
		Thread.sleep(3000);
//		driver.close();
		
		
	}

}

