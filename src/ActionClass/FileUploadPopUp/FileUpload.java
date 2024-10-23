package ActionClass.FileUploadPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends BaseClass {

	public static String url = "https://www.ilovepdf.com/word_to_pdf";

	public static void main(String[] args) throws InterruptedException {
		preCondition03("chrome");

		driver.get(url);

		waitFor(2);

		WebElement uploadFile = driver.findElement(By.xpath("//input[@type='file']"));
		uploadFile.sendKeys("C:\\Users\\sofiyan\\Downloads\\resume template harvard style.docx");

		Thread.sleep(2000);
		
		WebElement downloadFile = driver.findElement(By.id("processTask"));
		downloadFile.click();
		
		
		//download
		WebElement downloadbtn = driver.findElement(By.id("pickfiles"));
		downloadbtn.click();

	}

}
