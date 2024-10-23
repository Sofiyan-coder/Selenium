package ActionClass.AlertPopUpTypes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class SimpleAlert extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		preCondition("chrome");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[value='Search']")).click();
		Thread.sleep(2000);

		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();

	}

}
