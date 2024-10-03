package DropDownMenu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import UtilityClass.BaseClass;

/*
 * 
 * 
write a Script fro Dws
step 1 - open the browser,maximize
step 2 - enter into url
step 3 - enter in to dws
step 4 - verify the title
step 5 - click on DigitalDownload
step 7 - click all options present in sort by Dropdown menu
step 8 - close the driver
 * 
 * 
 * 
    StaleElementReferenceException occurs due to refresh of page after each sort by option Dropdown
 * */
public class DigitalDownloadDropDown02 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		

		preCondition("chrome");

		

		if (verifyTitle()) {
			System.out.println("I am in dws page");
			

			driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')][1]")).click();
			// DropDown in Dynamic Page  
			
			WebElement dropDown = driver.findElement(By.id("products-pagesize"));
			// create and Object for Select class
			Select select = new Select(dropDown);

			int i = 0;
			List<WebElement> options = select.getOptions();

			for (WebElement opt : options) {
				
				
				// Handling StaleElementReferenceException
				dropDown = driver.findElement(By.id("products-pagesize"));
				
				select = new Select(dropDown);

				select.selectByIndex(i++);
				waitFor(1);

			}
		} else {
			
			System.out.println("I Not am in dws page");

		}
		waitFor(4);
		postCondition();

	}

}
