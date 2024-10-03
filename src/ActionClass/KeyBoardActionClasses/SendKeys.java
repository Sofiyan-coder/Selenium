package ActionClass.KeyBoardActionClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SendKeys extends KeyBoardActionBase {

	public static void main(String[] args) throws InterruptedException {

		preCondtion();

		WebElement search_field = driver.findElement(By.xpath("//input[@name='q']"));
		action.moveToElement(search_field).click().perform();
		Thread.sleep(1000);
		action.sendKeys("laptop").keyDown(Keys.ENTER).perform();
//		using method chaining
//		action.sendKeys(search_field, "Moblie").keyDown(Keys.ENTER).perform();

	}

}
