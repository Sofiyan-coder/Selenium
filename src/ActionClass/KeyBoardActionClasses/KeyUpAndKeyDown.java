package ActionClass.KeyBoardActionClasses;

import org.openqa.selenium.Keys;

public class KeyUpAndKeyDown  extends KeyBoardActionBase{

	public static void main(String[] args) throws InterruptedException {
		
		preCondtion();
		
		
		
	
			action.keyDown(Keys.PAGE_DOWN).perform();
			Thread.sleep(500);
			action.keyDown(Keys.PAGE_UP).perform();
		
		

	}

}
