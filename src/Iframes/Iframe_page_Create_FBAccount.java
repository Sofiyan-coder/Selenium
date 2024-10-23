package Iframes;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ActionClass.FileUploadPopUp.BaseClass;

/*
 * OCT-14 
 * write a script for iframe page 
 * step 1 - open the browser,maximize 
 * step 2 - enter into iframe page 
 * step 3 - click facebook link which is present at the bottom
 * step 4 - click new Account in facbook 
 * step 5 - After clicking the Create new Account click on Google on homepages
 */

public class Iframe_page_Create_FBAccount extends BaseClass {

	public static String url = "C:\\Users\\sofiyan\\Downloads\\iframe.html";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		preCondition03("chrome");
		maxBrowser();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(url);

		// parent iframe
		WebElement iframe = driver.findElement(By.xpath("//iframe[@name=\"frame1\"]"));
		driver.switchTo().frame(iframe);

		Actions action = new Actions(driver);

		WebElement facebook = driver.findElement(By.xpath("//a[text()=\"Facebook\"]"));

		action.keyDown(Keys.CONTROL).click(facebook).keyUp(Keys.CONTROL).perform();

		Set<String> window = driver.getWindowHandles();

		// 		// switch to FB  page
		String originalWindow = driver.getWindowHandle();
		for (String windowHandle : window) {
			if (!windowHandle.equals(originalWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		String facebookWindow = driver.getWindowHandle();
		WebElement createNewAcc = driver.findElement(By.xpath("//span[text()=\"Create new account\"]"));
		action.keyDown(Keys.CONTROL).click(createNewAcc).keyUp(Keys.CONTROL).perform();

		
		// switch to new FB account page
		Set<String> window2 = driver.getWindowHandles();
	
		for (String windowHandle : window2) {
			if (!windowHandle.equals(originalWindow) && !windowHandle.equals(facebookWindow) ) {
				
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		
		
		// switch to parent page
		Thread.sleep(5000);
		driver.switchTo().window(originalWindow);

		Thread.sleep(2000);
		// click on google
		driver.findElement(By.xpath("//a[text()='Google']")).click();

	}

}
