package Multiple_Links;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Multiple_Links_New_Method {
	
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.lamborghini.com/en-en");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.manage().window().maximize();
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links presents:" +links.size());
		
		for(int i = 0; i<=links.size(); i++) {
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
			
		}
		
		
		// new method
		//for (WebElement link : links) {
		//	System.out.println(link.getText());
		//	System.out.println(link.getAttribute("href"));
		//}
		
	}

}
