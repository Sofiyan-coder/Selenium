package ActionClass.MouseActionClass;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionBase {
	public static WebDriver driver = new ChromeDriver();

	public static Actions action = new Actions(driver);
	public static void preCondtion() {
		// TODO Auto-generated method stub
		
		// Maximize browser
		driver.manage().window().maximize();
		// enter into web page
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

	}
	
	public static void randomMoveCursor() throws InterruptedException {
		
		 // Get the size of the window
		  // Define random movement logic
        Random random = new Random();
        
        // Get the size of the window to ensure movements are within bounds
        int width = driver.manage().window().getSize().getWidth();
        int height = driver.manage().window().getSize().getHeight();

        // Perform random movements
        for (int i = 0; i < 10; i++) {
            // Generate random x and y offsets (you can adjust these numbers for more realistic dragging)
            int xOffset = random.nextInt(100) - 50;  // Random offset between -50 and +50
            int yOffset = random.nextInt(100) - 50;

            // Move the element by the random offsets
            action.moveByOffset(xOffset, yOffset).perform();

            // Optional: Add a small delay between movements to simulate more natural dragging
            Thread.sleep(500); // 500 milliseconds delay
        }
		
	}

}
