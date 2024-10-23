package ActionClass.ChildAndParentWindowPopUp;

import java.util.Set;

import org.openqa.selenium.By;

public class ThreeEcommerceWebSites extends ActionClass.ChildAndParentWindowPopUp.BaseClass {

	public static String BNUrl = "https://www.barbequenation.com/";
	public static String OGUrl = "https://www.olivegarden.com/home";

	public static void main(String[] args) throws InterruptedException {

		preCondition("chrome");

		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(2000);
		
		
		maximizeAll(); // task 1
		barbequeNation(); //task 2
		oliveGarden(); // task 3

	}

	public static void oliveGarden() throws InterruptedException {

		Set<String> Browser_windows = driver.getWindowHandles();
		System.out.println(Browser_windows);

		for (String child : Browser_windows) {

			driver.switchTo().window(child);
			String actual_url = driver.getCurrentUrl();

			if (OGUrl.equals(actual_url)) {

				driver.manage().window().maximize();

			}

			// minimize parent
			else if (url.equals(actual_url)) {

				driver.manage().window().minimize();
				Thread.sleep(2000);

			}

		}
		Thread.sleep(4000);
		driver.quit();

	}

	public static void barbequeNation() throws InterruptedException {

		Set<String> Browser_windows = driver.getWindowHandles();
		System.out.println(Browser_windows);

		for (String child : Browser_windows) {

			driver.switchTo().window(child);
			String actual_url = driver.getCurrentUrl();

			if (BNUrl.equals(actual_url)) {

				driver.manage().window().maximize();
				driver.findElement(By.xpath("//a[text()='LOGIN']")).click();

			}

			Thread.sleep(3000);

			if (!(BNUrl.equals(actual_url))) {

				driver.close();

			}

		}

	}

	public static void maximizeAll() {

		Set<String> Browser_windows = driver.getWindowHandles();
		System.out.println(Browser_windows);

		for (String child : Browser_windows) {

			driver.switchTo().window(child).manage().window().maximize();

		}

	}

}
