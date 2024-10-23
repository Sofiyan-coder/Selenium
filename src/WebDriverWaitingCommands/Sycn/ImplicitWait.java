package WebDriverWaitingCommands.Sycn;



import java.time.Duration;

import org.openqa.selenium.By;

import UtilityClass.ShopperStackBaseClass;

public class ImplicitWait extends ShopperStackBaseClass {

	public static void main(String[] args) throws InterruptedException {

		preCondition("chrome");
		maxBrowser();
		// implictWait Condition
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		browseTo(url);

		driver.findElement(By.id("loginBtn")).click();

//		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		
		waitFor(3);
		driver.quit();
		System.out.println("Test Completed");
		
		

	}

}
