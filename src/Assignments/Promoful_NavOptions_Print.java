package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Promoful_NavOptions_Print {
	
	public static String url = "https://www.promoful.com/";

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
	List<WebElement> nav_options = 	  driver.findElements(By.xpath("//*[@id=\"header-items\"]/div/nav/ul/li/a"));
		
		
		for (WebElement webElement : nav_options) {
			
			System.out.println(webElement.getText());
			
		}

	}

}
