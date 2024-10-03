package ActionClass.KeyBoardActionClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class Login extends KeyBoardActionBase {

	public static void main(String[] args) {
		preCondtion();
		WebElement register_link = driver.findElement(By.xpath("//a[text()='Register']"));
		action.moveToElement(register_link).click().perform();
		//
		// Gender
		WebElement gender = driver.findElement(By.xpath("//input[@name=\"Gender\"]"));
		
		// firstname
		WebElement firstName = driver.findElement(By.xpath("//input[@id=\"FirstName\"]"));
		action.sendKeys(firstName, "Tony").keyDown(Keys.ENTER).perform();
		// Lastname
		WebElement lastName = driver.findElement(By.xpath("//input[@name=\"LastName\"]"));
		action.sendKeys(lastName, "Stark").keyDown(Keys.ENTER).perform();
		// email
		WebElement email = driver.findElement(By.xpath("//input[@name=\"Email\"]"));
		action.sendKeys(email, "tony.stark@starks.com").keyDown(Keys.ENTER).perform();

		// password
		WebElement pass = driver.findElement(By.xpath("//input[@name=\"Password\"]"));
		action.sendKeys(pass, "peperpots").keyDown(Keys.ENTER).perform();
		// re-password
		WebElement repass = driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]"));
		action.sendKeys(repass, "peperpots").keyDown(Keys.ENTER).perform();

		// re-password
		WebElement register_btn = driver.findElement(By.xpath("//input[@name=\"id=\"register-button\"]"));
		action.moveToElement(register_btn).click().perform();
//		
	}

}
