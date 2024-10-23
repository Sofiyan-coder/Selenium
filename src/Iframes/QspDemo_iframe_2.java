package Iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ActionClass.FileUploadPopUp.BaseClass;

public class QspDemo_iframe_2 extends BaseClass {

	public static String url = "https://demoapps.qspiders.com/";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		preCondition03("chrome");
		maxBrowser();

		driver.get(url);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// UI Tesitng
		driver.findElement(By.xpath("//*[@id=\"optionsBody\"]/a[1]/div/main")).click();
		// click on frames
		driver.findElement(By.xpath("//section[text()=\"Frames\"]")).click();

		// click on frames
		driver.findElement(By.xpath("//section[text()=\"iframes\"]/..")).click();

//		singleIframe();

//		nestedIframe();

		
		System.out.println("Test Completed");

	}

	private static void nestedIframe() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"demoUI\"]/main/section/div/section/div/div/ul/li[2]/a")).click();

		// parent iframe
		Thread.sleep(5);
		driver.switchTo().frame(0);
		System.out.println("switch to iframe no. 1");

		Thread.sleep(10);
//		WebElement iframe_2 = driver.findElement(By.xpath("//section[@class='main_form_container']/div/iframe"));
		driver.switchTo().frame(1);

		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Admin@gmail.com");

		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Admin@1234");


	}

	private static void singleIframe() {
		// switch to iframe using WebElement
		WebElement iframe = driver
				.findElement(By.xpath("//*[@id=\"demoUI\"]/main/section/article/aside/div/aside/div/iframe"));
		driver.switchTo().frame(iframe);

		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("sofiyan@gmail.com");

		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("12345678");

//				driver.findElement(By.xpath("//button[@id=\"submitButton\"]")).click();

	}

}
