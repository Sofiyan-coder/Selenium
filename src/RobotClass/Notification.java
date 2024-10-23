package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;

public class Notification extends BaseClass {
	public static String url = "https://demoapps.qspiders.com/ui/browserNot?sublist=0";
	public static void main(String[] args) throws AWTException, InterruptedException {

		preCondition03("chrome");
		
		driver.get(url);
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"browNotButton\"]"));
		// Create an instance of Robot class
		Robot robot = new Robot();

		// Pause for a moment to observe the actions
		Thread.sleep(2000);

		int x = 800; // X coordinate
		int y = 500; // Y coordinate

		robot.mouseMove(x, y);

		// Simulate a mouse click (press and release)
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Press left mouse button
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		// Pause for observation
		Thread.sleep(2000);
	}
}
