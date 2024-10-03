package UtilityClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FollowUsOn extends BaseClass {

	public static String exp_rss_url = "https://demowebshop.tricentis.com/news/rss/1";

	public static void main(String[] args) throws InterruptedException {
		preCondition();

		if (verifyUrl(getUrl())) {

			List<WebElement> follow_us = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));

			for (WebElement Links : follow_us) {

				Links.click();
				waitFor(2);

				String actual_rss_url = driver.getCurrentUrl();
				if (actual_rss_url.equals(exp_rss_url)) {
					driver.navigate().back();
					System.out.println("Navigate to Back");
				}

			}

			System.out.println("Test Completed");

		} else {
			System.out.println("I am not in Digital Download page");

		}
		postCondition();
	}

}
