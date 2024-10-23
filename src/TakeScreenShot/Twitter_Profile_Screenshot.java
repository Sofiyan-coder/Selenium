package TakeScreenShot;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import UtilityClass.BaseClass;

public class Twitter_Profile_Screenshot extends BaseClass {

	public static String url = "https://www.google.com";

	// ScreenShot of WebElement

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		preCondition03("chrome");
		maxBrowser();

		driver.get(url);
		Actions action = new Actions(driver);
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Vijay deverkonda twitter");
		action.keyDown(Keys.ENTER).perform();

		
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3/..")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		org.openqa.selenium.WebElement icon = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div[1]/div[2]/div/div[2]/div")); // explicit Type casting
		File from = icon.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\JAVA PROJECT\\Workplace\\Selenium\\com.selenium\\src\\TakeScreenShot\\TwitteriIcon.png");
		FileHandler.copy(from, to);

		System.out.println("ScreenShot taken");
	}

}
