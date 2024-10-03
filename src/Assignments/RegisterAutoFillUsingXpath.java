package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterAutoFillUsingXpath {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		String expected_url = "https://demowebshop.tricentis.com/";
		String excepted_text = "COMMUNITY POLL";
		driver.manage().window().maximize();
		driver.get(expected_url);
		Thread.sleep(3000);

		String actual_text = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/strong"))
				.getText();
		String registerPageTitle = driver.getTitle() + ". Register";

		if (excepted_text.equals(actual_text)) {

			System.out.println("I am in Demo Shop Page");

			driver.findElements(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
			Thread.sleep(2000);
			if (driver.getTitle().equals(registerPageTitle)) {
				System.out.println("I am in Register Page");
				Thread.sleep(2000);

				driver.findElement(By.xpath(
						"/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[1]/div[1]/input"))
						.click();

				driver.findElement(
						By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[2]/input"))
						.sendKeys("Sofiyan");

				driver.findElement(
						By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[3]/input"))
						.sendKeys("Malidwale");

				driver.findElement(
						By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/input"))
						.sendKeys("sofiyan123456@gmail.com");

				driver.findElement(
						By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[1]/input"))
						.sendKeys("123456");
				

				driver.findElement(
						By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/input"))
						.sendKeys("123456");
				

				driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[4]/input"))
						.click();

				System.out.println("Registeration Completed");

			} else {

				System.out.println("Your not in Register Wed-page");

			}

		} else {
			System.out.println("I not in Dws page");
		}
		Thread.sleep(2000);
//		driver.close();

	}

}
