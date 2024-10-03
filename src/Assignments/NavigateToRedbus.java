package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

/*
 * \assign - 1
write a script for demo workshop
step 1 - open the browser,maximize
step 2 - enter into url
step 3 - enter in to dws
step 4 - verify the url
step 5 - enter into redbus web-page
step 6 - to back to dws
step 7 - verify the page using title
step 8 - to back to redbus
step 9 - refresh the page
step 10 - close the driver*/

public class NavigateToRedbus {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://demowebshop.tricentis.com/";
		String dwsTitle = "Demo Web Shop";
		String redbusUrl = "https://www.redbus.com";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to(url);
		Thread.sleep(3000);
		
		
		driver.navigate().to(redbusUrl);
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
	   if (dwsTitle.equals(driver.getTitle())) {
		   System.out.println("Ur in Dws");
		    driver.navigate().forward();
		    Thread.sleep(1000); 
		    driver.navigate().refresh();
		   
		
	} else {
		
		System.out.println("Not in Dws");

	}
	   
	   driver.close();
		
		

	}

}
