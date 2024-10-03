package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaviagateMethod {
	
	public static void main(String[] args) throws InterruptedException {
		String Url = "https://demowebshop.tricentis.com/";
		String Url2 = "https://www.youtube.com/";
	
//		?open the browser
		ChromeDriver driver  = new ChromeDriver();
//		maximize
		driver.manage().window().maximize();
//		waiting condition
		Thread.sleep(3000); 
		
//		enter into the dws webpage
		driver.navigate().to(Url);
	
		Thread.sleep(3000);
		driver.get(Url2);
		
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("music");
		
		driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon/span/div")).click();
		
		
		
//		Thread.sleep(3000);
//		driver.navigate().back();
//		
//		Thread.sleep(3000);
//		driver.navigate().forward();


		Thread.sleep(2000);
//		driver.close();
		
	}
}
