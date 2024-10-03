package DropDownMenu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import UtilityClass.BaseClass;

public class BothDropDownMenuActions extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// enter into web page
		driver.get("file:///C:/Users/sofiyan/Downloads/demo.html");
		// Find targeted WebElement
		WebElement dropDowmMenu = driver.findElement(By.id("multiple_cars"));
		// create and Object for Select class
		Select select = new Select(dropDowmMenu);

		if (select.isMultiple()) {

			int i = 0;
			List<WebElement> options = select.getOptions();

			for (WebElement opt : options) {
				waitFor(1);
				select.selectByIndex(i++);

			}
			

		} else {
			
			int i = 0;
			List<WebElement> options = select.getOptions();

			for (WebElement opt : options) {
				waitFor(1);
				select.selectByIndex(i++);

			}
			select.deselectAll();
			
			

		}

	}

}
