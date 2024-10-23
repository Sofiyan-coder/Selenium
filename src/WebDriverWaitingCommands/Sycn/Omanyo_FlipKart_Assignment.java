package WebDriverWaitingCommands.Sycn;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import UtilityClass.BaseClass;
import org.openqa.selenium.Alert;

public class Omanyo_FlipKart_Assignment extends BaseClass {

	public static String url = "https://omayo.blogspot.com/";

	public static void main(String[] args) throws InterruptedException {

		preCondition03("chrome");
		maxBrowser();

		// Enter the URL
		driver.navigate().to(url);

		Actions action = new Actions(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		// Scroll down to the Dropdown and click on Flipkart
		action.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN)
				.perform();

		driver.findElement(By.xpath("//button[text()=\"Dropdown\"]")).click();

		// explicit wait for the dropdown to appear
		// Use WebDriverWait to wait for the Flipkart link to become clickable
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement flipkartLink = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Flipkart']")));

		// Find the Flipkart link and open it in a new tab

		action.keyDown(Keys.CONTROL).click(flipkartLink).keyUp(Keys.CONTROL).perform();

		Set<String> window = driver.getWindowHandles();

		// Switch back to the original tab (omayo blogspot)
		String originalWindow = driver.getWindowHandle();
		for (String windowHandle : window) {
			if (!windowHandle.equals(originalWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		// Step 4: Enter 'watch' in the search field of Flipkart and press Enter
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("watch");
		searchField.sendKeys(Keys.ENTER);

		// Switch back to the original tab (omayo blogspot)
		driver.switchTo().window(originalWindow);

		// Step 5: Refresh the omayo blogspot page
		driver.navigate().refresh();

		// Step 6: Click on Button 3 (Timer enable button) and handle the pop-up
//        WebElement timerButton = driver.findElement(By.xpath("//input[@value='Button3']"));

		// Wait to Button be enable
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(6));
		WebElement timerButton = wait2
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Button3']")));

		timerButton.click();

		// Wait for the alert to appear and get the text

		Alert alert = driver.switchTo().alert();

		System.out.println("Alert Pop-up text: " + alert.getText());

		alert.accept();

		driver.quit();

	}
}
