package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBar {
	public static void main(String[] args) throws InterruptedException {
		String Url = "https://demowebshop.tricentis.com/";
		
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
			
			driver.findElement(By.tagName("input")).sendKeys("Mobile");
			WebElement SearchBar = driver.findElement(By.className("search-box-button"));
			SearchBar.click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.tagName("input")).sendKeys("Laptop");
			driver.findElement(ById.id("small-searchterms")).click();
			
			
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
