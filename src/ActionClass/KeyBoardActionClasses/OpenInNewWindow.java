package ActionClass.KeyBoardActionClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class OpenInNewWindow extends KeyBoardActionBase{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		preCondtion();
		Thread.sleep(3000);
		// Open In new window
		// short-cut:  + mouse click
		WebElement books = driver.findElement(By.xpath("//a[contains(text(),'Books')]"));
		action.keyDown(Keys.SHIFT).click(books).perform();
		
	}

}
