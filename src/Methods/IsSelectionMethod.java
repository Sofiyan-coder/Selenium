package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectionMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expectedUrl = "https://demowebshop.tricentis.com/";
		// Open the Browser
		ChromeDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		// Waiting condition
		Thread.sleep(2000);
		// Enter into dws
		driver.get(expectedUrl);
		Thread.sleep(2000);

		// verify web page
		Thread.sleep(2000);
		WebElement excellent = driver.findElement(By.id("pollanswers-1"));
		if (excellent.isDisplayed()) {
			System.out.println("excellent webelemnt is ready for action");
			excellent.click();
			if (excellent.isSelected()) {
				System.out.println("excellent webelemnt is Succesfullly selected");
			} else {
				System.out.println("excellent webelemnt is Not Succesfullly selected");
			}
		} else {
			System.out.println("excellent webelemnt not present");
		}
	}

}
