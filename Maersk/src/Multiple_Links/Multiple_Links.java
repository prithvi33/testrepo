package Multiple_Links;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Multiple_Links {
	
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		 List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		System.out.println(links.size());
		
		for(int i = 0; i<links.size(); i++) {
			System.out.println(links.get(i).getText()+":"+links.get(i).getAttribute("href"));
		}
		
	}

}
