package UtilityClass;

import org.openqa.selenium.By;

public class VerfiyUrl extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		preCondition();
		waitFor(3);
		driver.findElement(By.className("ico-register")).click();
		waitFor(3);
		postCondition();
	}

}
