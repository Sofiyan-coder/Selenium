package ActionClass.PopUp;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class DWSFacebookClick extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		preCondition("chrome");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		
		Set<String> child_windows = driver.getWindowHandles();
		
		//switch to child
		for (String string : child_windows) {
			
			driver.switchTo().window(string);
		}
		
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("(//input[@name='email'])[2]"));
		email.sendKeys("tony.stark@gmail.com");
		

	}

}
