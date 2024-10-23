package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import UtilityClass.BaseClass;

public class DWS_Login_positive extends BaseClass {

	// ScreenShot of WebElement

	public static void main(String[] args) throws InterruptedException, IOException {
		String data = LocalDateTime.now().toString();
		data = data.replace(":","-");
		preCondition("chrome");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		browseTo(url);
		logIn();

		try {

			driver.findElement(By.xpath("//a[@class ='ico-logout']"));
			
			

		} catch (Exception e) {
			TakesScreenshot ts = (TakesScreenshot) driver; // explicit Type casting
			File from = ts.getScreenshotAs(OutputType.FILE);
			File to = new File(
					"C:\\JAVA PROJECT\\Workplace\\Selenium\\com.selenium\\src\\TakeScreenShot\\DWS_Login_+ve"+data+".png");
			FileHandler.copy(from, to);

			System.out.println("Screen Shot taken");
		}finally {
			
			TakesScreenshot ts = (TakesScreenshot) driver; // explicit Type casting
			File from = ts.getScreenshotAs(OutputType.FILE);
			File to = new File(
					"C:\\JAVA PROJECT\\Workplace\\Selenium\\com.selenium\\src\\TakeScreenShot\\DWS_Login_+ve"+data+".png");
			FileHandler.copy(from, to);

			System.out.println("Screen Shot taken");
			
		}

	}

}
