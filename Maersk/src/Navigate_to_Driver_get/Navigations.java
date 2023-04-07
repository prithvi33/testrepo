package Navigate_to_Driver_get;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigations {
	
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.nasa.gov/");
		driver.get("https://www.apple.com/");
		driver.navigate().to("https://www.isro.gov.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.manage().window().maximize();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.quit();
		
		
		
		
		
	}

}
