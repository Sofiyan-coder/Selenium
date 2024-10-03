package Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class GetWindowsHandle extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		preCondition("chrome");
		 String dws = driver.getWindowHandle();
		 System.out.println(dws);
		 List<WebElement> products = driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
		 Actions action = new Actions(driver);
		 for (WebElement webElement : products) {
			 
			 action.keyDown(Keys.CONTROL).click(webElement).perform();
			 Thread.sleep(2000);
			
		}
		 System.out.println(driver.getWindowHandles().size() +" : "+ driver.getWindowHandles());

	}

}
