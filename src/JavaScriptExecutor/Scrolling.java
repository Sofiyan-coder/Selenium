package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


import UtilityClass.BaseClass;

public class Scrolling extends BaseClass {

	public static String url = "https://www.amazon.in/";

	public static void main(String[] args) throws InterruptedException {

		preCondition("chrome");
		browseTo(url);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		//scrolling();
		scrollIntoView();
	}

	private static void scrolling() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);"); // scroll down
		waitFor(2);
		js.executeScript("window.scrollBy(0,-500);"); // scroll up
		waitFor(2);
		js.executeScript("window.scrollTo(0,500);"); // scroll down
		waitFor(2);
		js.executeScript("window.scrollTo(0,-500);"); // scroll up

		
	}

	public static void scrollIntoView() {
		org.openqa.selenium.WebElement backToUp = driver.findElement(By.xpath("//div[@class=\"navFooterBackToTop\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false);", backToUp); // scroll down

	}

}
