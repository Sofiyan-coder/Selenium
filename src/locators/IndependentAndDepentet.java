package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentAndDepentet {

	public static void main(String[] args) throws InterruptedException {
		
		String Url = "https://demowebshop.tricentis.com/";
		
//		?open the browser
		ChromeDriver driver  = new ChromeDriver();
//		maximize
		driver.manage().window().maximize();
//		waiting condition
		Thread.sleep(3000); 
		
//		enter into the dws webpage
		
		driver.navigate().to(Url);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		Thread.sleep(3000);

		
		WebElement album3rd = driver.findElement(By.xpath("//a[text()='3rd Album']/../../div[3]/div/span"));
		System.out.println(album3rd.getText());
		
		
		List<WebElement> music2 =driver.findElements(By.xpath("//a[text()='Music 2']/../../div[3]/div/span"));
	
		
		for (WebElement product : music2) {
			
			System.out.println(product.getText());
			
		}

	}

}
