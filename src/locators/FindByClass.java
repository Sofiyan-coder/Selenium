package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByClass {
	public static void main(String[] args) throws InterruptedException {
		String Url = "https://demowebshop.tricentis.com/";
		String Url2 = "https://www.youtube.com/";
		String excepted_result = Url;
//		?open the browser
		ChromeDriver driver  = new ChromeDriver();
//		maximize
		driver.manage().window().maximize();
//		waiting condition
		Thread.sleep(3000); 
//		enter into the dws webpage
		driver.get(Url);
		Thread.sleep(3000);
//		fetch current url
		String actual_result = driver.getCurrentUrl();
		
		if (excepted_result.equals(actual_result)) {
			
			System.out.println("I am in dws webpage");
			
			
			WebElement RegisterLabel = driver.findElement(By.className("ico-register"));
			RegisterLabel.click();
			
			Thread.sleep(3000);
			
			WebElement LogInLabel = driver.findElement(By.className("ico-login"));
			LogInLabel.click();
			
			Thread.sleep(3000);
			
			WebElement ShoppingCartLabel = driver.findElement(By.className("ico-cart"));
			ShoppingCartLabel.click();
			
			Thread.sleep(3000);
			
			WebElement WishListLabel = driver.findElement(By.className("ico-wishlist"));
			WishListLabel.click();
			
			Thread.sleep(3000);
			
			
		} else {
			
			System.out.println("I am Not in dws webpage");
			driver.close();

		}
		Thread.sleep(3000);
		driver.close();
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
	
//		driver.close();
		
		
	}

}
