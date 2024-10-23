package Assignments;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Verify_Pune_Titile {

	public static void main(String[] args) {

		String url = "https://www.google.com";
		String expected_title = "Pune";

		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();

		// Maximize browser
		driver.manage().window().maximize();

		// Navigate to URL
		driver.get(url);

		// Wait until the page loads
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Actions alt = new Actions(driver);

		// Search "Pune Wiki" in the search field
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Pune Wiki");
		alt.sendKeys(Keys.ENTER).perform();

		// Wait for results to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String parent = driver.getWindowHandle();

		// Click on the Wikipedia link for Pune
		WebElement pune_wiki = driver.findElement(By.xpath("//h3[text()='Pune - Wikipedia']/.."));
		alt.keyDown(Keys.CONTROL).click(pune_wiki).keyUp(Keys.CONTROL).perform();

		// Switch to the new tab
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			if (!parent.equals(window)) {
				driver.switchTo().window(window);
			}
		}

		// Wait for the page to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Find the title and fetch the text
		String actual_title = driver.findElement(By.xpath("//span[text()='Pune']")).getText();

		// Verify the title
		if (expected_title.equals(actual_title)) {
			System.out.println("Title verified successfully");
		} else {
			System.out.println("Title verification failed");
		}

		// Close the driver
		driver.quit();
	}
}
