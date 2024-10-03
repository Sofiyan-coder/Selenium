package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByLinkText {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		String expected_url = "https://demowebshop.tricentis.com/";
		driver.manage().window().maximize();
		driver.get(expected_url);
		Thread.sleep(3000);
		
		String current_url = driver.getCurrentUrl();
	
		
		if(expected_url.equals(current_url)) {
			
			System.out.println("U r in Demo web-page");
			driver.findElement(By.linkText("Facebook")).click();
			driver.findElement(By.partialLinkText("Shopping")).click();;
			Thread.sleep(2000);
			
//			driver.findElement(By.partialLinkText("Log")).click();
			
			
//			Thread.sleep(1000);
			
//			driver.findElement(By.partialLinkText("Wishlist")).click();
			
			Thread.sleep(1000);
			
			
			
			
		}else {
			
			System.out.println("U r not in Demo web-page");
			
			
			
		}
		
		Thread.sleep(4000);
//		driver.close();
		driver.quit();

	}

}
