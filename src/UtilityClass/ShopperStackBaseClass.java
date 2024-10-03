package UtilityClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShopperStackBaseClass {

	public static String url = "https://www.shoppersstack.com/";

	public static WebDriver driver;

	public static boolean verifyUrl(String url) {

		if (url.equals(driver.getCurrentUrl())) {

			return true;

		}
		return false;
	}

	public static boolean verifyTitle(String title) {
		
		if (title.equals(driver.getTitle())) {

			return true;

		}
		return false;
	}

	public static void closeBrowser() {
		driver.quit();

	}

	public static void logIn() throws InterruptedException {
		
		
		
		waitFor(3);
		driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
//

//
		driver.findElement(By.id("Email")).sendKeys("sofiyan@gmail.com");

		driver.findElement(By.id("Password")).sendKeys("Abc@1234");
//
		driver.findElement(By.xpath("//*[@id=\"Login\"]/span[1]")).click();
		
		
//		

		System.out.println("Login Successfull");
		waitFor(2);

	}

	public static void logOut() throws InterruptedException {
		waitFor(1);
		driver.findElement(By.xpath("//*[@id=\"root\"]/section[1]/article/div[3]/div[1]/button")).click();
		waitFor(2);
		
		driver.findElement(By.xpath("//*[@id=\"account-menu\"]/div[3]/ul/li[7]")).click();
		System.out.println("Logout....");
		

	}

	public static void waitFor(int sec) throws InterruptedException {

		int s = sec * 1000;
		Thread.sleep(s);

	}

	public static void preCondition(String browser) throws InterruptedException {

		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

		} else {
			driver = new ChromeDriver();

		}

		maxBrowser();
		browseTo(url);
		waitFor(30);
//		logIn();

	}

	public static WebDriver preCondition02(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			return new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			return new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {

			return new EdgeDriver();

		} else {
			return new ChromeDriver();

		}

	}

	public static void preCondition03(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

		} else {
			driver = new ChromeDriver();

		}

		maxBrowser();

	}

	public static void preCondition() {

		driver = new ChromeDriver();

	}

	public static void postCondition() throws InterruptedException {

		logOut();
		closeBrowser();

	}

	public static void maxBrowser() {

		driver.manage().window().maximize();

	}

	public static void browseTo(String  url) {

		driver.navigate().to(url);

	}

	public static void checkBox() throws InterruptedException {

		maxBrowser();
		waitFor(2);
		browseTo(url);

		waitFor(2);

		WebElement excellent = driver.findElement(By.cssSelector("input[id='pollanswers-1']"));

		if (excellent.isEnabled()) {

			System.out.println("Excellent is Enabled");
			excellent.click();
			waitFor(2);
			System.out.println("Selected: " + excellent.isSelected());

		} else {

			System.out.println("Excellent is Enabled");

		}
		waitFor(2);

	}

	public static void verifyWebPageByVoteBtn() throws InterruptedException {
		preCondition();

		WebElement voteBtn = driver.findElement(By.cssSelector("input[id='vote-poll-1']"));

		if (voteBtn.isDisplayed()) {

			System.out.println("I am in Dws");

		} else {

			System.out.println("I am Not in Dws");

		}
		waitFor(2);

	}

	
}
