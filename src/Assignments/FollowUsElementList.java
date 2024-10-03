package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowUsElementList {
	public static void main(String[] args) throws InterruptedException {
		String Url = "https://demowebshop.tricentis.com/";
		String exp_rss_url = "https://demowebshop.tricentis.com/news/rss/1";
		String excepted_text = "COMMUNITY POLL";
//		?open the browser
		ChromeDriver driver  = new ChromeDriver();
//		maximize
		driver.manage().window().maximize();
//		waiting condition
		Thread.sleep(3000); 
		
//		enter into the dws webpage
		
		driver.navigate().to(Url);
		Thread.sleep(3000);
//		fetch current url
		String actual_text= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/strong")).getText();
		
		
		if (excepted_text.equals(actual_text)) {
			
			System.out.println("I am in dws webpage");
			
			List<WebElement> follow_us = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
			



			for (WebElement Links : follow_us) {

				
				Links.click();
				
				Thread.sleep(2000);
				String actual_rss_url = driver.getCurrentUrl();
				if(actual_rss_url.equals(exp_rss_url)) {
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

