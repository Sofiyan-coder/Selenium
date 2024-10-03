package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GiftCard {
	public static void main(String[] args) throws InterruptedException {

		String actual_url = "https://demowebshop.tricentis.com/";
		// Open the browser
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();
		// Wait for 1 second
		Thread.sleep(1000);

		// enter dws web
		driver.navigate().to("https://demowebshop.tricentis.com/");

		// verify using url
		if (actual_url.equals(driver.getCurrentUrl())) {
			System.out.println("we are at dws Webpage");
			// click on gift card

			driver.findElement(By.xpath("//img[@alt=\"Picture of $25 Virtual Gift Card\"]")).click();
			Thread.sleep(2000);

			// verify the page by title

			String card_title = "Demo Web Shop. $25 Virtual Gift Card";
			if (card_title.equals(driver.getTitle())) {
				System.out.println("we are at card Webpage");
				// fill the details
				driver.findElement(By.xpath(
						"/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div/form/div/div[1]/div[2]/div[4]/div[1]/input"))
						.sendKeys("Sofiyan");

				driver.findElement(By.xpath(
						"/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div/form/div/div[1]/div[2]/div[4]/div[2]/input"))
						.sendKeys("sofiyan123@gmail.com");

				driver.findElement(By.xpath(
						"/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div/form/div/div[1]/div[2]/div[4]/div[3]/input"))
						.sendKeys("Pawan");

				driver.findElement(By.xpath(
						"/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div/form/div/div[1]/div[2]/div[4]/div[4]/input"))
						.sendKeys("pawan123@gmail.com");

				driver.findElement(By.xpath(
						"/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div/form/div/div[1]/div[2]/div[4]/div[5]/textarea"))
						.sendKeys("Product");

				driver.findElement(By.xpath("//input[@id='addtocart_2_EnteredQuantity']")).clear();
				driver.findElement(By.xpath("//input[@id='addtocart_2_EnteredQuantity']")).sendKeys("3");
				Thread.sleep(3000);

				driver.findElement(By.xpath(
						"/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div/form/div/div[1]/div[2]/div[6]/div/input[2]"))
						.click();
				Thread.sleep(4000);

				driver.findElement(By.className("ico-cart")).click();
				Thread.sleep(2000);
				WebElement producy_name = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[3]/a"));
				System.out.println("Product is added: "+producy_name.isDisplayed());

			} else {
				System.out.println("We are Not card Webpage");
			}
			Thread.sleep(2000);
		} else {
			System.out.println("We are Not at dws Webpage");
		}

//	        
//	        driver.quit();

	}

}