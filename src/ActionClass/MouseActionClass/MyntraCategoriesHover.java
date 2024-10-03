package ActionClass.MouseActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraCategoriesHover {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		// url
		String expected_title = "Myntra";
		// open Browser
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// enter into web page
		driver.get("https://www.myntra.com/");
		// Find targeted WebElement
		if (driver.getTitle().contains(expected_title)) {
			System.out.println("In myntra");
			Actions action = new Actions(driver);
			List<WebElement> categories = driver.findElements(By.xpath("//a[@data-type=\"navElements\"]"));
			for (WebElement webElement : categories) {
				Thread.sleep(1000);
				action.moveToElement(webElement).perform();
				
			}
			
		} else {
			System.out.println("Not In myntra");
		}
		
		

	}

}
