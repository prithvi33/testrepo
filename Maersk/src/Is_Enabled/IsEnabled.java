package Is_Enabled;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IsEnabled {
	
	public static void main(String[] args) {
		WebDriver driver = new  EdgeDriver();
		driver.get("https://www.nasa.gov/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		WebElement enabled = driver.findElement(By.xpath("//input[@id='ember25']"));
		System.out.println(enabled.isEnabled()); // true
		
		
			
		
		
		
	}

}
