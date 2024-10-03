package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	static String url = "https://demowebshop.tricentis.com/";

	static ChromeDriver driver = new ChromeDriver();

	public static void verifyUrl(String url) {

		if (url.equals(driver.getCurrentUrl())) {

			System.out.println("U r in Dws");

		} else {

			System.out.println("Not in Dws");

		}
	}

	public static void waitFor(int sec) throws InterruptedException {

		int s = sec * 1000;
		Thread.sleep(s);

	}

	public static void closeBrowser() {
		driver.close();

	}

	public static void maxBrowser() {

		driver.manage().window().maximize();

	}

	public static void browseTo(String url) {

		driver.navigate().to(url);

	}

	public static void checkBox() throws InterruptedException {

		maxBrowser();
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
		maxBrowser();
		browseTo(url);
		waitFor(2);

		WebElement voteBtn = driver.findElement(By.cssSelector("input[id='vote-poll-1']"));

		if (voteBtn.isDisplayed()) {

			System.out.println("I am in Dws");

		} else {

			System.out.println("I am Not in Dws");

		}
		waitFor(2);


	}

	
}
