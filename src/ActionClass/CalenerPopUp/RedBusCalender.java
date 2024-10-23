package ActionClass.CalenerPopUp;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBusCalender extends BaseClass {

	public static String url = "https://www.redbus.in";

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			driver.get(url);
			
			Thread.sleep(2000);
			driver.findElement(By.id("onwardCal")).click();
	
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()=\"23\"]")).click();
			
//			for(;;) {
//				try {
//					driver.findElement(By.xpath("//span[@data-selenium-date=\"2025-01-06\"]")).click();
//					break;
//					
//				} catch (Exception e) {
//					// TODO: handle exception
//					//next month
//					driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[1]/div[3]")).click();
//				}
//			}
//			
			
			
			
			
			System.out.println("Test Completed");
			


			
			
	}

}
