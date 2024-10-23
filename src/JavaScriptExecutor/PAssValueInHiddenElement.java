package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import UtilityClass.BaseClass;


// click on disable download button 
public class PAssValueInHiddenElement extends BaseClass {

	public static String url = "https://www.facebook.com/";

	public static void main(String[] args) throws InterruptedException {

		preCondition("chrome");
		browseTo(url);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.findElement(By.xpath("//*[contains(text(),\"Create new account\")]")).click();
		org.openqa.selenium.WebElement hidden_text = driver.findElement(By.xpath("//*[@id='custom_gender']"));

		js.executeScript("arguments[0].value='trans'", hidden_text);

	}
	
}
