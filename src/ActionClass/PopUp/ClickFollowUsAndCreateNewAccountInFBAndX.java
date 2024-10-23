package ActionClass.PopUp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import UtilityClass.BaseClass;

public class ClickFollowUsAndCreateNewAccountInFBAndX extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		
	
		
		
		if (verifyTitle()) {
			
			System.out.println("I am in dws webpage");
			
			List<WebElement> follow_us = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
			



			for (WebElement Links : follow_us) {

				
				Links.click();
				
				Thread.sleep(2000);
				String actual_rss_url = driver.getCurrentUrl();
				if(actual_rss_url.equals(url)) {
					driver.navigate().back();
					
				}
				
				
			}
			
			System.out.println("Test Completed");
			
		} else {
			
			System.out.println("I am Not in dws webpage");
			driver.close();

		}
		Thread.sleep(3000);
//		driver.close();
		
		
	}

}

