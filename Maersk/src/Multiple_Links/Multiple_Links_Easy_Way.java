package Multiple_Links;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Multiple_Links_Easy_Way {
	
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.apple.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.manage().window().maximize();
		
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 System.out.println(links.size());
		 
		 for (WebElement link : links) {
			 System.out.println(link.getText());
			 System.out.println(link.getAttribute("href"));
		 }
	}

}
