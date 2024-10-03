package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DigitalDownloadOption {
	public static void main(String[] args) throws InterruptedException {
		String Url = "https://demowebshop.tricentis.com/";
		String excepted_text = "COMMUNITY POLL";
//		?open the browser
		ChromeDriver driver  = new ChromeDriver();
//		maximize
		driver.manage().window().maximize();
//		waiting condition
		Thread.sleep(3000); 
		
//		enter into the dws webpage
		driver.get(Url);
		Thread.sleep(3000);
//		fetch current url
		String actual_text= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/strong")).getText();
		
		
		if (excepted_text.equals(actual_text)) {
			
			System.out.println("I am in dws webpage");
			driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
			
		} else {
			
			System.out.println("I am Not in dws webpage");
			driver.close();

		}
		Thread.sleep(3000);
//		driver.close();
		
		
	}

}

