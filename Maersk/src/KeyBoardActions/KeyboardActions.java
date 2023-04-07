package KeyBoardActions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
		
		Actions p = new Actions(driver);
		
		p.sendKeys(Keys.CANCEL).perform();
		Thread.sleep(3000);
		
		p.sendKeys(Keys.ALT).perform();
		Thread.sleep(3000);
		
		p.sendKeys(Keys.CLEAR).perform();
		Thread.sleep(3000);
		
		p.sendKeys(Keys.DELETE).perform();
		Thread.sleep(3000);  // new added for github..
		
		
		driver.close();
		
		
		
		
	
	
	}

}
