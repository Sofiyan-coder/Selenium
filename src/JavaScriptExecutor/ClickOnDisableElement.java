package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import UtilityClass.BaseClass;

// click on disable download button 
public class ClickOnDisableElement extends BaseClass {

	
	public static String url = "https://www.oracle.com/in/java/technologies/downloads/";

	public static void main(String[] args) throws InterruptedException {

		preCondition("chrome");
		browseTo(url);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		try {
			org.openqa.selenium.WebElement jdk = driver
					.findElement(By.xpath("//*[contains(text(),\"jdk-23_linux-x64_bin.tar\")]"));

			js.executeScript("arguments[0].scrollIntoView(false);", jdk); 
			jdk.click();

		} catch (Exception e) {
			org.openqa.selenium.WebElement diable_element = driver
					.findElement(By.xpath("//*[contains(text(),\"download jdk-23\")]"));

			js.executeScript("arguments[0].click();", diable_element); 
		}

	}


}
