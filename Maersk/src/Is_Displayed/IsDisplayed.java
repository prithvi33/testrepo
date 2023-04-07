package Is_Displayed;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IsDisplayed {
	
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.nasa.gov/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.manage().window().maximize();
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='ember25']"));
		System.out.println("Dislpay status:" +searchbox.isDisplayed()); // true
		
		
	}

}
