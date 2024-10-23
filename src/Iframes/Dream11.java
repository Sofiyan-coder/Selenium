package Iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class Dream11 extends BaseClass {

	public static String url = "https://www.dream11.com/";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		preCondition03("chrome");
		maxBrowser();

		driver.get(url);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// switch to Embbeded pages using index
		// driver.switchTo().frame(0);

		// switch to iframe using id
//		driver.switchTo().frame("send-sms-iframe");

		//switch to iframe using WebElement
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
		driver.switchTo().frame(iframe);

		
		driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("5423244343");
		
		 // parentFrame()
		driver.switchTo().parentFrame();
		
		driver.findElement(By.id("hamburger")).click();
		System.out.println("Test Completed");

	}

}
