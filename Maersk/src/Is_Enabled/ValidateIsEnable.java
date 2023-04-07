package Is_Enabled;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ValidateIsEnable {
	
	public static void main(String[] args) {
		WebDriver driver = new  EdgeDriver();
		driver.get("https://www.nasa.gov/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		WebElement enabled = driver.findElement(By.xpath("//input[@id='ember25']"));
	    
		 boolean p = enabled.isEnabled();
		 System.out.println(p);
		 
		 if(p) {
			 System.out.println("Given element is enabled");
		 }
		 else {
			 
			 System.out.println("Given element is  not enabled");
			 
		 }
	
	
	}
}
