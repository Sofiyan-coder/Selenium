package Assignments;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
/*
assign 2
step 1 - open the browser maximize
step 2 - enter into url
step 3 - enter in to dws 
step 4 - verify the url
step 5 - click  login button
step 6 - fill all the details a do Login
step 7 - close the driver
*/

public class LoginAutoFill   {
	
	static String url = "https://demowebshop.tricentis.com/";

	static ChromeDriver driver = new ChromeDriver();
	
	public static void verifyUrl(String url) {
		if (url.equals(driver.getCurrentUrl())) {
			
			System.out.println("U r in Dws");
			
		} else {
			
			System.out.println("Not in Dws");


		}
	}
	
	public static void waitFor(int sec) throws InterruptedException {
		
		int s = sec*1000;
		Thread.sleep(s);
		
	}
	
	public static void logIn() throws InterruptedException{
		
		driver.findElement(By.partialLinkText("Log")).click();
		
		driver.findElement(By.id("Email")).sendKeys("sofiyan@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("123456");
		
		driver.findElement(By.xpath("//*[@id=\"RememberMe\"]")).click();

		waitFor(2);
		
		driver.findElement(By.xpath("//*[@id=\"RememberMe\"]")).click();

		driver.findElement(By.cssSelector("input[value= \"Log in\"]")).click();
	
		waitFor(2);	
		
		System.out.println("Login Successfull");
		
	}
	
	public static void closeBrowser() {
		driver.close();
		
	}
	
	public static void maxBrowser() {
		
		driver.manage().window().maximize();
		
		
	}
	
	public static void browseTo(String url) {
		
	driver.navigate().to(url);
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
	
		maxBrowser();	
		browseTo(url);
		verifyUrl(url);
		logIn();
		waitFor(2);
//		closeBrowser();
		
			
		
		
	
		
		
		
		
		
	}
}
