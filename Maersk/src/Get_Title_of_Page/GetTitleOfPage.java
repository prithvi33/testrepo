package Get_Title_of_Page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTitleOfPage {
	
	public static void main(String[] args) {
		WebDriver driver = new  EdgeDriver();
		driver.get("https://www.nasa.gov/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.manage().window().maximize();
		
		System.out.println("Title of the page is:" +driver.getTitle());
		System.out.println("Current Url of page is:" +driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
	}

}
