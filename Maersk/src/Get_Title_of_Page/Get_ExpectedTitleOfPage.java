package Get_Title_of_Page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Get_ExpectedTitleOfPage {
	
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.nasa.gov/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String expected = "NASA";
		
		if (title.equalsIgnoreCase(expected)) {
			System.out.println("Navigate to correct page");
		}
		
		else {
			System.out.println("Navigate to invalid page");
			
		}
	}

}
