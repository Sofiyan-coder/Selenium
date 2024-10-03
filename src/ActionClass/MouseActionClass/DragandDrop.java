package ActionClass.MouseActionClass;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v116.dom.DOM.GetFrameOwnerResponse;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// open Browser
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// enter into web page
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		Actions action = new Actions(driver);

		WebElement src;
		WebElement trg;
		


		for (int i = 1; i <= 7; i++) {
			src = driver.findElement(By.id("box" + i));
			trg = driver.findElement(By.id("box10" +i));
			
			action.dragAndDrop(src, trg).perform();
			Thread.sleep(1000);

		}

	}

}
