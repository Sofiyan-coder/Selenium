package ActionClass.FileUploadPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NaukriResumeUpload extends BaseClass {

	public static String url = "https://www.naukri.com/registration/createAccount?othersrcp=22636";

	public static void main(String[] args) throws InterruptedException {

		preCondition03("chrome");
		driver.get(url);

		// Full name
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("John Chena");
		// email
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("john.chena@yahoo.com");
		// password
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("johnchena@123");
		

		
		
		// mobile
		driver.findElement(By.xpath("//input[@id=\"mobile\"]")).sendKeys("8786789230");
		// work status - Exp
		driver.findElement(By.xpath("//div[@data-val=\"exp\"]")).click();
		
		
		
		Thread.sleep(2000);
		//upload resume 
		
		WebElement resume =  driver.findElement(By.xpath("//input[@type='file']"));
		resume.sendKeys("C:\\\\Users\\\\sofiyan\\\\Downloads\\\\resume template harvard style.docx");
		
		

	}

}
