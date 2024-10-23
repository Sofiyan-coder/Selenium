package Iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ActionClass.FileUploadPopUp.BaseClass;

public class Demo_nested_iframe extends BaseClass {

	public static String url = "https://demo.automationtesting.in/Frames.html";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		preCondition03("chrome");
		maxBrowser();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(url);

		singleIframe();

		nestedIframe();

		System.out.println("Test completed");
	}

	private static void nestedIframe() {

		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();

		// parent iframe
//		WebElement iframe = driver.findElement(By.xpath("//iframe[@id=\"Multiple\"]"));
		driver.switchTo().frame(1);

		// child iframe
		WebElement child_iframe = driver.findElement(By.xpath("//div[@class='iframe-container']/iframe"));
		driver.switchTo().frame(child_iframe);

		driver.findElement(By.tagName("input")).sendKeys("Hi Sofiyan");
		System.out.println("Text send to TextField");

	}

	private static void singleIframe() {
		driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();

		// parent iframe
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]"));
		driver.switchTo().frame(iframe);

		driver.findElement(By.tagName("input")).sendKeys("Hi Sofiyan");
		System.out.println("Text send to TextField");
		driver.switchTo().parentFrame();

	}

}
