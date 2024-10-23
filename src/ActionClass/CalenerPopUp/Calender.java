package ActionClass.CalenerPopUp;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender extends BaseClass {

	public static String url = "https://www.agoda.com/";

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			driver.get(url);
			
			Thread.sleep(2000);
			driver.findElement(By.id("check-in-box")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@data-selenium-date=\"2024-10-09\"]")).click();
			Thread.sleep(2000);
//			driver.findElement(By.xpath("//span[@data-selenium-date=\"2024-10-12\"]")).click();
			
			for(;;) {
				try {
					driver.findElement(By.xpath("//span[@data-selenium-date=\"2025-01-06\"]")).click();
					break;
					
				} catch (Exception e) {
					// TODO: handle exception
					//next month
					driver.findElement(By.xpath("//button[@data-selenium=\"calendar-next-month-button\"]")).click();
				}
			}
			
			
			
			
			
			System.out.println("Test Completed");
			


			
			
	}

}
