package DropDownMenu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import UtilityClass.BaseClass;

public class MultiSelectDropDown extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// open Browser
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// enter into web page
		driver.get("file:///C:/Users/sofiyan/Downloads/demo.html");
		// Find targeted WebElement
		WebElement multi_select = driver.findElement(By.id("multiple_cars"));
		// create and Object for Select class
		Select select = new Select(multi_select);
//				waitFor(3);
//				select.selectByVisibleText("Honda");
//				waitFor(2);
//		
//				select.selectByValue("for");
//				waitFor(2);
//				select.selectByValue("jgr");
//				waitFor(2);
//				// Index start from 0
//				select.selectByIndex(7);
//				waitFor(2);
//				
//				System.out.println("DeSelecting");
//				select.deselectByVisibleText("Honda");
//				waitFor(1);
//				select.deselectByValue("for");
//				waitFor(1);
//				select.deselectByValue("jgr");
//				waitFor(1);
//				select.deselectByIndex(7);
//				waitFor(1);
//				System.out.println("Deselecting Completed");
////				select.deselectAll();

		int i = 0;
		List<WebElement> cars = select.getOptions();

		for (WebElement options : cars) {
			waitFor(1);
			select.selectByIndex(i++);

		}

		// Get all selected options in the multi-select dropdown
		List<WebElement> selectedOptions = select.getAllSelectedOptions();

		for (WebElement option : selectedOptions) {
			System.out.println("Selected option: " + option.getText());
		}

		int j = cars.size() - 1;

		for (WebElement opt : cars) {
			waitFor(1);
			select.deselectByIndex(j--);

		}

		// Close Browser
//				driver.quit();

	}

}
