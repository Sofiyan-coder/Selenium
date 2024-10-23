package ActionClass.AlertPopUpTypes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AlertPopUp extends BaseClass {

	public static String url = "https://demo.automationtesting.in/Alerts.html";

	public static void main(String[] args) throws InterruptedException {
		
		preCondition03("chrome");
		driver.get(url);

		simpleAlert();
		Thread.sleep(3000);
		
		comfirmationAlert();
		Thread.sleep(3000);
		
		promptAlert();
//		

	}

	public static void simpleAlert() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		alt.accept();

	}

	public static void comfirmationAlert() throws InterruptedException {

		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		alt.accept();

	}

	public static void promptAlert() throws InterruptedException {

		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alt.getText());

		alt.sendKeys("Sofiyan");
		
		alt.accept();

	}

}
