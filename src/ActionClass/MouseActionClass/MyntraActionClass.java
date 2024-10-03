package ActionClass.MouseActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MyntraActionClass {

	public static void main(String[] args) throws InterruptedException {
		
		//url
		String expected_url = "https://www.myntra.com/";
		// open Browser
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// enter into web page
		driver.get("https://www.myntra.com/");
		// Find targeted WebElement
		if (expected_url.equals(driver.getCurrentUrl())) {
			System.out.println("In myntra");
			
			Actions action = new Actions(driver);
			WebElement kibs = driver.findElement(By.xpath("//a[text()='Kids']"));
			Thread.sleep(2000);
			action.moveToElement(kibs).perform();
			Thread.sleep(2000);
			WebElement ethnic_wear = driver.findElement(By.xpath("(//a[text()='Ethnic Wear'])[2]"));
			ethnic_wear.click();
			
		} else {
			System.out.println("No in myntra");
		}

	}

}
