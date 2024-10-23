package Assignments;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class ClickFollowUsAndCreateNewAccountInFBAndX extends BaseClass {
	public static void main(String[] args) throws InterruptedException {

		preCondition("chrome");

		String exp_rss_url = "https://demowebshop.tricentis.com/news/rss/1";
		String fbUrl = "https://facebook.com/nopCommerce";
		String TUrl = "https://twitter.com/nopCommerce";
		String YUrl = "https://www.youtube.com/user/nopCommerce";
		String GUrl = "https://workspaceupdates.googleblog.com/2023/04/new-community-features-for-google-chat-and-an-update-currents%20.html";

		System.out.println("I am in dws webpage");
		String parent = driver.getWindowHandle();

		System.out.println(parent);
		Actions act = new Actions(driver);

		act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		List<WebElement> follow_us = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));

		for (WebElement Links : follow_us) {

			Links.click();

			String actual_rss_url = driver.getCurrentUrl();
			if (actual_rss_url.equals(exp_rss_url)) {
				driver.navigate().back();

			}
			Thread.sleep(2000);

		}
		Set<String> Browser_windows = driver.getWindowHandles();
		System.out.println(Browser_windows);

		for (String child : Browser_windows) {

			driver.switchTo().window(child);
			Thread.sleep(2000);
			String actual_url = driver.getCurrentUrl();
			Thread.sleep(2000);

			if (fbUrl.equals(actual_url)) {

				driver.findElement(By.xpath("//span[text()='Create new account']")).click();

			} else if (TUrl.equals(actual_url)) {

				driver.findElement(By.xpath("//span[text()='Create account']")).click();

			} else if (YUrl.equals(actual_url)) {

				driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Marvel");
				act.keyDown(Keys.ENTER).perform();

			} else if (GUrl.equals(actual_url)) {

				driver.findElement(By.xpath("//input[@name='EMAIL']")).sendKeys("Hello world");

			}

		}
	}

//		driver.close();

}
