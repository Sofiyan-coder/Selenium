package UtilityClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class BaseClass {

	public static String Title = "Demo Web Shop";
	public static String url = "https://demowebshop.tricentis.com/";

	public static WebDriver driver;

	public static boolean verifyUrl(String url) {

		if (url.equals(driver.getCurrentUrl())) {

			return true;

		}
		return false;
	}

	public static boolean verifyTitle() {

		if (getTitle().equals(driver.getTitle())) {

			return true;

		}
		return false;
	}

	public static String getTitle() {
		return Title;
	}

	public static void setTitle(String title) {
		Title = title;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		BaseClass.driver = driver;
	}

	public static void closeBrowser() {
		driver.quit();

	}

	public static void logIn() {

		driver.findElement(By.partialLinkText("Log")).click();

		driver.findElement(By.id("Email")).sendKeys("sofiyan@gmail.com");

		driver.findElement(By.id("Password")).sendKeys("123456");

		driver.findElement(By.cssSelector("input[value= \"Log in\"]")).click();

		System.out.println("Login Successfull");

	}
	
	public static void notLogIn() {

		driver.findElement(By.partialLinkText("Log")).click();

		driver.findElement(By.id("Email")).sendKeys("sofiyan@gmail.com");

		driver.findElement(By.id("Password")).sendKeys("123");

		driver.findElement(By.cssSelector("input[value= \"Log in\"]")).click();

		System.out.println("Not Login Successfull");

	}

	public static void logOut() {

		driver.findElement(By.xpath("//a[@class ='ico-logout']")).click();

	}

	public static void waitFor(int sec) throws InterruptedException {

		int s = sec * 1000;
		Thread.sleep(s);

	}

	public static void preCondition(String browser) {

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
//		browseTo(getUrl());
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

//		maxBrowser();

	}

	public static void preCondition() {

		driver = new ChromeDriver();

	}

	public static void postCondition() {

		logOut();
		closeBrowser();

	}

	public static void maxBrowser() {

		driver.manage().window().maximize();

	}

	public static void browseTo(Object object) {

		driver.navigate().to((String) object);

	}

	public static void checkBox() throws InterruptedException {

		maxBrowser();
		waitFor(2);
		browseTo(getUrl());

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

	public static String getUrl() {
		return url;
	}

	public static void setUrl(String url) {
		BaseClass.url = url;
	}

}
