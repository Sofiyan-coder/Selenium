package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsOnHomePage {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		String expected_url = "https://demowebshop.tricentis.com/";
		String excepted_text = "COMMUNITY POLL";
		driver.manage().window().maximize();
		driver.get(expected_url);
		Thread.sleep(3000);

		String actual_text = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/strong"))
				.getText();
		

		if (excepted_text.equals(actual_text)) {

			System.out.println("I am in Demo Shop Page");

			Thread.sleep(2000);

			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div/ul/li[1]/input"))
					.click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div/ul/li[2]/input"))
					.click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div/ul/li[3]/input"))
					.click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div/ul/li[4]/input"))
					.click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div/div[1]/input"))
					.click();
			System.out.println("Test completed");

		} else {
			System.out.println("I not in Dws page");
		}
		Thread.sleep(2000);
		driver.close();

	}

}
