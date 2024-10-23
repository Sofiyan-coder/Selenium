package WebDriverWaitingCommands.Sycn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import UtilityClass.ShopperStackBaseClass;

public class ExplicitWait extends ShopperStackBaseClass {

	public static void main(String[] args) {

		preCondition("chrome");
		maxBrowser();
		browseTo(url);

		// WebDirverWiat object
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

		// Condition
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));

		driver.findElement(By.id("loginBtn")).click();

		// wait condition for specific WebElement in case [maybe element be disabled]
		// Condition
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Create Account']")));

		driver.findElement(By.xpath("//span[text()='Create Account']")).click();

	}

}
