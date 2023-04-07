package Get_PageSource_Of_Page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PageSourceOfPage {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.nasa.gov/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		//String source = driver.getPageSource();
		//System.out.println(source);
		
		
		System.out.println(driver.getPageSource());

		}

}
