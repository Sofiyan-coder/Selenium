package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import UtilityClass.BaseClass;

public class WebPage extends BaseClass {

	public static String url = "https://www.amazon.in/";

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		preCondition03("chrome");
		maxBrowser();

		driver.get(url);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		TakesScreenshot ts = (TakesScreenshot) driver; // explicit Type casting
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\JAVA PROJECT\\Workplace\\Selenium\\com.selenium\\src\\TakeScreenShot\\WebpageScreenshot.png");
		FileHandler.copy(from, to);
		
		System.out.println("Screen Shot taken");
	}

}
