package ActionClass.KeyBoardActionClasses;

import org.openqa.selenium.Keys;

//Only using Keyboard searching laptop in search bar
public class SearchWtihOnlySendKeys extends KeyBoardActionBase {

	public static void main(String[] args) throws InterruptedException {

		preCondtion();

		for (int i = 0; i < 6; i++) {
			action.keyDown(Keys.TAB).perform();
		}

		Thread.sleep(1000);
		action.sendKeys("laptop").keyDown(Keys.ENTER).perform();

	}

}
