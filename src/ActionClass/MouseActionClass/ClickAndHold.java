package ActionClass.MouseActionClass;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold extends MouseActionBase {

	public static void main(String[] args) throws InterruptedException {
		// open Browser
		preCondtion();

		WebElement rome = driver.findElement(By.xpath("//div[@id='box6']"));
		Thread.sleep(2000);
		action.clickAndHold(rome).perform();
		System.out.println("click and Hold actived");

		randomMoveCursor();

		// Release the held element after random movements
		WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));
		Thread.sleep(2000);
		action.release(italy).perform();

	}

}
