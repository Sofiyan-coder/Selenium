package ActionClass.MouseActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// enter into web page
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		Actions action = new Actions(driver);

		WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement dou_click = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//			
//				
//		WebElement copy = driver.findElement(By.xpath("//span[text()='Copy']"));
////		action.moveToElement(right_click).perform();
////		Thread.sleep(1000);
////		action.contextClick().perform();
////		Thread.sleep(1000);
////		action.click(copy).perform();
//	
//		// using method chaining
//		action.contextClick(right_click).click(copy).perform();
		action.doubleClick(dou_click).perform();
		
		
		
	
		

	}

}
