package BasicCodeCheck;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;


public class BasicCodeCheck {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		//ChromeOptions option= new ChromeOptions();
		//option.addArguments("remote-allow-origins=*");
		// driver = new ChromeDriver(option);
		
		driver.get("https://www.yoox.com/in/men");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		driver.findElement(By.xpath("//a[@href='/in/men/shoponline/gucci_d#/dept=men&d=42']")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'brand font-bold text')])[1]")).click();
		
	}
}
