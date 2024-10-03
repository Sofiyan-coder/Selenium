package ActionClass.KeyBoardActionClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DemoRegister extends KeyBoardActionBase {

	public static void main(String[] args) {
		preCondition2();

		// firstname
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		action.sendKeys(firstName, "Tony").keyDown(Keys.ENTER).perform();
		// Lastname
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
		action.sendKeys(lastName, "Stark").keyDown(Keys.ENTER).perform();

		// Address
		WebElement address = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
		action.sendKeys(address, "Stark Tower, New York, USA").keyDown(Keys.ENTER).perform();
		// email
		WebElement email = driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
		action.sendKeys(email, "tony.stark@gmail.com").keyDown(Keys.ENTER).perform();

		// mobile
		WebElement mobile = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
		action.sendKeys(mobile, "6998080899").keyDown(Keys.ENTER).perform();

		//
		// Gender
		WebElement gender = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
		action.click(gender).perform();
		// Hobbies
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("checkbox3")).click();
		
		action.keyDown(Keys.PAGE_DOWN).perform();
		
		
		// Language
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		WebElement english = driver.findElement(By.xpath("//a[text()='English']"));
		
		action.click(english).perform();

//				

//				
//		

		// Find skills targeted WebElement
		WebElement skill = driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
		// create and Object for Select class
		Select select = new Select(skill);

		select.selectByVisibleText("Java");

		// select country

		// Find targeted WebElement
		WebElement country = driver.findElement(By.xpath("//*[@id=\"country\"]"));
		// create and Object for Select class
		Select sel2 = new Select(country);

		sel2.selectByVisibleText("United States of America");

		// Find targeted DOY WebElement
		WebElement year = driver.findElement(By.xpath("//*[@id=\"yearbox\"]"));
		// create and Object for Select class
		Select sel3 = new Select(year);

		sel3.selectByVisibleText("1988");

		// Find targeted DOM WebElement
		WebElement month = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
		// create and Object for Select class
		Select sel4 = new Select(month);

		sel4.selectByVisibleText("May");

		// Find targeted DOD WebElement
		WebElement day = driver.findElement(By.xpath("//*[@id=\"daybox\"]"));
		// create and Object for Select class
		Select sel5 = new Select(day);

		sel5.selectByVisibleText("15");

		// password
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"firstpassword\"]"));
		action.sendKeys(pass, "peperpots").keyDown(Keys.ENTER).perform();
		// re-password
		WebElement repass = driver.findElement(By.xpath("//*[@id=\"secondpassword\"]"));
		action.sendKeys(repass, "peperpots").keyDown(Keys.ENTER).perform();

		// sumbit btn
		WebElement register_btn = driver.findElement(By.xpath("//*[@id=\"submitbtn\"]"));
		action.moveToElement(register_btn).click().perform();
//		
		
//		

	}

}
