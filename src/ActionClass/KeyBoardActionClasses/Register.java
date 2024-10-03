package ActionClass.KeyBoardActionClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class Register extends KeyBoardActionBase {

	public static void main(String[] args) {
		preCondtion();
		WebElement login_link = driver.findElement(By.xpath("//a[text()='Log in']"));
		action.moveToElement(login_link).click().perform();
		
		// email
		WebElement email = driver.findElement(By.xpath("//input[@name=\"Email\"]"));
		action.sendKeys(email, "tony.stark@starks.com").keyDown(Keys.ENTER).perform();

		// password
		WebElement pass = driver.findElement(By.xpath("//input[@name=\"Password\"]"));
		action.sendKeys(pass, "peperpots").keyDown(Keys.ENTER).perform();
		// re-password
		WebElement rememberMe = driver.findElement(By.xpath("//input[@id='RememberMe']"));
		action.sendKeys(rememberMe).click().perform();

		// re-password
		WebElement login_btn = driver.findElement(By.xpath("//input[@value='Log in']"));
		action.moveToElement(login_btn).click().perform();
//		
	}

}
