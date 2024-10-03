package DropDownMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import UtilityClass.BaseClass;

public class SingleSelectingDropDownMenu extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// open Browser
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// enter into web page
		driver.get("file:///C:/Users/sofiyan/Downloads/demo.html");
		// Find targeted WebElement
		WebElement single_select = driver.findElement(By.id("standard_cars"));
		// create and Object for Select class
		Select select = new Select(single_select);
		waitFor(3);
		select.selectByVisibleText("Honda");
		waitFor(2);
		select.deselectByVisibleText("Honda");

		// Get the first selected option in the dropdown
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		System.out.println("First selected option: " + firstSelectedOption.getText());

//		select.selectByValue("bmw");
//		waitFor(2);
//		select.selectByValue("for");
//		waitFor(2);
//		select.selectByValue("jgr");
//		waitFor(2);
//		// Index start from 0
//		select.selectByIndex(7);
//		waitFor(2);
//		select.selectByIndex(10);
//		waitFor(2);
		// Close Browser
		driver.quit();

	}

}
