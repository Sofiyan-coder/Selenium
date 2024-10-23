package ActionClass.CalenerPopUp;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EaseMyTrip {

	public static String url = "https://www.easemytrip.in";

	public static void main(String[] args) throws InterruptedException {
		// Set Chrome options to disable notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");

		// Initialize the WebDriver
		WebDriver driver = new ChromeDriver(options);

		// Open browser and maximize
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Navigate to EasyMyTrip website
		driver.get(url);
		Thread.sleep(3000);

//		//from 
//		driver.findElement(By.xpath("//input[@id='(a_FromSector_show']")).sendKeys("Pune");
//		
//		//TO
//		driver.findElement(By.xpath("//input[@id='(a_FromSector_show']")).sendKeys("Pune");

		// Select Departure Date (current date)
		driver.findElement(By.id("dvfarecal")).click();

		driver.findElement(By.xpath("//li[@id='snd_4_10/10/2024']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("divRtnCal")).click();
		Thread.sleep(2000);
//		
		// Construct the XPath for the return date
		String returnDateXpath = "//span[@id='" + returnDate(160) + "']";

//		System.out.println("return Date: "+returnDate(160));

		// Loop to handle clicking the next month until the desired date is found
		for (;;) {
			try {
				driver.findElement(By.xpath(returnDateXpath + "/..")).click();
				break;
			} catch (Exception e) {
				// If the desired date is not found, click the next month button
				driver.findElement(By.xpath("(//div[@class='month3'])[2]")).click();
			}
		}

//		

//		driver.quit();
		System.out.println("Test Completed");
	}

	public static String returnDate(int afterDays) {

		// Calculate the date 160 days from today
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_YEAR, afterDays);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String returnDate = dateFormat.format(cal.getTime());
		return returnDate;
	}
}
