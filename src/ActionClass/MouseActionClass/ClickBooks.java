package ActionClass.MouseActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickBooks {
	public static void main(String[] args) throws InterruptedException {
		String Url = "https://demowebshop.tricentis.com/";
	
		String excepted_result = Url;
//		?open the browser
		ChromeDriver driver  = new ChromeDriver();
//		maximize
		driver.manage().window().maximize();
//		waiting condition
	
//		enter into the dws webpage
		driver.get(Url);
		Thread.sleep(2000);
	
//		fetch current url
		String actual_result = driver.getCurrentUrl();
		
		if (excepted_result.equals(actual_result)) {
			
			System.out.println("I am in dws webpage");
			Actions action = new Actions(driver);
			WebElement  books = driver.findElement(By.xpath("//a[contains(text(),'Books')]"));
			action.moveToElement(books).click().perform();
	
			
			
		} else {
			
			System.out.println("I am Not in dws webpage");
			driver.close();

		}
		
//		driver.close();
		
	}

}
