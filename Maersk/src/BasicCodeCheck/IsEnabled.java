package BasicCodeCheck;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class IsEnabled {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.khanacademy.org/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id='login-or-signup']")).click();
		
		driver.findElement(By.xpath("//input[@data-test-id='identifier-field']")).sendKeys("zprithvi900@gmail.com");
		
		driver.findElement(By.xpath("//input[@data-test-id='password-field']")).sendKeys("Prithvi@0712");
		
		driver.findElement(By.xpath("//button[@data-test-id='log-in-submit-button']")).click();
		
		WebElement custom = driver.findElement(By.xpath("//button[@class='_12iepmsr']"));
		custom.click();
		
		 WebElement continue1 = driver.findElement(By.xpath("(//button[@class='_6t500vf'])[1]"));
	  
		boolean p = continue1.isEnabled();
		System.out.println(p);
		
		driver.quit();
		
		if(p) {
			System.out.println("Given element is enabled");
		}
		
		else {
			System.out.println("Given element is not enabled");
			
		}
	
	}

}
