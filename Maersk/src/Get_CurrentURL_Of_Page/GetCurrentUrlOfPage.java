package Get_CurrentURL_Of_Page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetCurrentUrlOfPage {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.nasa.gov/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.manage().window().maximize();
		
		 String currenturl = driver.getCurrentUrl();
		 System.out.println(currenturl);
		 
		 String expectedurl = "https://www.nasa.gov/";
		 
		 if (currenturl.equalsIgnoreCase(expectedurl)) {
			 System.out.println("its correct url");
		 }
		 else {
			 System.out.println("its invalid url");
		 }
	}
}
