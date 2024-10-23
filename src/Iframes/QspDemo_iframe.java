package Iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ActionClass.FileUploadPopUp.BaseClass;

public class QspDemo_iframe extends BaseClass {

	public static String url = "https://demoapps.qspiders.com/";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		preCondition03("chrome");
		maxBrowser();

		driver.get(url);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
			//   UI Tesitng 
		driver.findElement(By.xpath("//*[@id=\"optionsBody\"]/a[1]/div/main")).click();
		
		
		
		// click on frames
		driver.findElement(By.xpath("//section[text()=\"Frames\"]")).click();
		
		// click on frames
		driver.findElement(By.xpath("//section[text()=\"iframes\"]/..")).click();
		// switch to iframe using WebElement
		WebElement iframe = driver
				.findElement(By.xpath("//*[@id=\"demoUI\"]/main/section/article/aside/div/aside/div/iframe"));
		driver.switchTo().frame(iframe);

		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("sofiyan@gmail.com");

		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("12345678");

//		driver.findElement(By.xpath("//button[@id=\"submitButton\"]")).click();

		System.out.println("Test Completed");

	}

}
