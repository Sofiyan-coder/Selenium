package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterAutoFill {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		String expected_url = "https://demowebshop.tricentis.com/";
		driver.manage().window().maximize();
		driver.get(expected_url);
		Thread.sleep(3000);
		
		String current_url = driver.getCurrentUrl();
		String registerPageTitle = driver.getTitle()+". Register";
		
		if(expected_url.equals(current_url)) {
			
			driver.findElement(By.className("ico-register")).click();
			Thread.sleep(2000);
			if (driver.getTitle().equals(registerPageTitle)) {
				
				Thread.sleep(2000);
				
				driver.findElement(By.id("gender-male")).click();
				
				driver.findElement(By.id("FirstName")).sendKeys("Sofiyan");
				
				driver.findElement(By.id("LastName")).sendKeys("Malidwale");
				
				driver.findElement(By.id("Email")).sendKeys("sofiyan1234@gmail.com");
				
				driver.findElement(By.id("Password")).sendKeys("123456");;
				
				driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");;
				
				driver.findElement(By.id("register-button")).click();
				
				System.err.println("Registeration Completed");



			  } else {
				
				System.out.println("Your not in Register Wed-page");


			}
			
		}else {
			System.out.println("Your in Wrong Wed-page");
		}
		Thread.sleep(2000);
//		driver.close();
				
		
	}

}
