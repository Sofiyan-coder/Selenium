package Iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ActionClass.FileUploadPopUp.BaseClass;

public class NestediFrames extends BaseClass {

	public static String url = "https://www.dezlearn.com/nested-iframes-example/";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		preCondition03("chrome");
		maxBrowser();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(url);

		// parent iframe
		WebElement parent_iframe = driver.findElement(By.xpath("//iframe[@id=\"parent_iframe\"]"));
		driver.switchTo().frame(parent_iframe);

		driver.findElement(By.xpath("//button[@id=\"u_5_5\"]")).click();
		System.out.println("Parent iframe button Clicked");

		// child iframe
		WebElement child_iframe = driver.findElement(By.xpath("//iframe[@id=\"iframe1\"]"));
		driver.switchTo().frame(child_iframe);

		driver.findElement(By.xpath("//button[@id=\"u_5_6\"]")).click();
		System.out.println("Child iframe button Clicked");

		System.out.println("Test completed");
	}

}
