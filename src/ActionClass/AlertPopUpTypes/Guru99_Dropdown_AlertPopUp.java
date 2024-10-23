package ActionClass.AlertPopUpTypes;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import UtilityClass.BaseClass;

public class Guru99_Dropdown_AlertPopUp extends BaseClass {

	/*
	 * Sele assignment wsf guru99.com Step 1 open the browser Step 2 enter into
	 * guru99.com Step 3 click a right click and click all 6 opts by using
	 * findElemets() * handle popups Only using single for loop
	 */
	public static String url = "https://demo.guru99.com/test/simple_context_menu.html";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		preCondition03("chrome");
		maxBrowser();

		driver.get(url);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// mouse action
		Actions action = new Actions(driver);

		WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
		// mouse action
		action.contextClick(right_click).perform();

	
		// Independent and Dependent xpath
		List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"authentication\"]/ul/li/span"));
		
		int clicks = 1;
		for (WebElement webElement : options) {

			action.click(webElement).perform();
			// Alert Pop-Up handling
			Alert alt = driver.switchTo().alert();
			Thread.sleep(2000);
			alt.accept();
			if (clicks < options.size()) {
				action.contextClick(right_click).perform();
				clicks++;

			}

		}
		
		System.out.println("Test Completed");

	}

}
