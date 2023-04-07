package BasicCodeCheck;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class IsDisplayedCheck {
	

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
		
		 WebElement Finance = driver.findElement(By.xpath("//label[@data-test-subject-slug='core-finance']"));
		
		
		boolean result = Finance.isDisplayed();
		System.out.println(result);
	
	}


}
