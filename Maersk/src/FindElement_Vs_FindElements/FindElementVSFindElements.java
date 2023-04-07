package FindElement_Vs_FindElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElementVSFindElements {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		// Findelemet() --> method it returns single webelement only .
		
		WebElement p = driver.findElement(By.xpath("//input[@id='newsletter-email']"));
		p.sendKeys("zprithvi32@gmail.com");
		
		// we can fetch one single element from multiple elements ...
		WebElement q = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(q.getText());
		
// if the element is not present then findelement() method is throws the NoSuchElementFoundException error
		
		WebElement search = driver.findElement(By.xpath("//button[@fdprocessedid='5lm1d']"));
		
		
		
		
	}
}
