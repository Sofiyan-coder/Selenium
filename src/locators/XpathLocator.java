package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {
	
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
			WebElement  register = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
			 register.click();
			 System.out.println("Navigate to Register Successfull ");
	
			
			
		} else {
			
			System.out.println("I am Not in dws webpage");
			driver.close();

		}
		Thread.sleep(3000);
//		driver.close();
		
	}
	
	

}
