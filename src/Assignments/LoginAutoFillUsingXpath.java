package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutoFillUsingXpath {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		String url = "https://demowebshop.tricentis.com/";
		String excepted_Title = "Demo Web Shop";
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);

		String actual_Title = driver.getTitle();

		if (excepted_Title.equals(actual_Title)) {

			System.out.println("I am in Demo Shop Page");

			WebElement login = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));

			if (login.isEnabled()) {

				login.click();
				String loginTitle = driver.getTitle();

				Thread.sleep(2000);
				if (driver.getTitle().equals(loginTitle)) {
					System.out.println("I am in Login Page");
					Thread.sleep(2000);

					driver.findElement(By.xpath(
							"/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/input"))
							.sendKeys("sofiyan12345@gmail.com");

					driver.findElement(By.xpath(
							"/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[3]/input"))
							.sendKeys("123456");

					driver.findElement(By.xpath(
							"/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"))
							.click();

					System.out.println("Login SuccessFul");

				} else {

					System.out.println("Your not in Login Wed-page");
					

				}

			} else {
				System.out.println("Login Text is Disabled");
			}

		} else {
			System.out.println("I not in Dws page");
		}
		Thread.sleep(3000);
		driver.close();

	}

}
