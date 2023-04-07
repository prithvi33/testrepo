package KeyBoardActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionMultipleKeys {
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement input1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement input2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		
		input1.sendKeys("Life is very shorten baa... Always be happy");
		
		Actions act = new Actions(driver);
		
		//CTRL + A 
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//CTRL + C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//CTRL + Tab
		act.keyDown(Keys.TAB);
		act.perform();
		
		//CTRL + V
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		// compared text
		if(input1.getAttribute("value").equals(input2.getAttribute("value"))) {
		System.out.println("Text copied");
		}
		else {
			System.out.println("Text not copied");
		}
		
		
	}

}
