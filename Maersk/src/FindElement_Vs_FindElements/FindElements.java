package FindElement_Vs_FindElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElements {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.isro.gov.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		//FindElement() --> method returns multiple web elements...
		
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-top']//a"));
		System.out.println(links.size()); // it will get the links size 19
		
		// if you want to execute all the links which is involved in links variable then we create loop
		// because here we declared Findelements()method  so here we cant do direct action by using ...
		// driver.gettext() method, findelement method contains multiple webelemets , whenever you have
		// multiple webelement then we need to use loop statement...
		
		// normal loop 
		
	//	for(int i = 0; i<=links.size(); i++) {
	//		System.out.println(links.get(i).getText());
					
	//	}
		
		// new loop method
		for (WebElement p : links) {
			System.out.println(p.getText());
			
		}
		
		// if there are no elements in the webpage then findelements method does not throw any exception 
		// instead of that it will return 0 in console ..
		
		
		List<WebElement> noelement = driver.findElements(By.xpath("//img[@class='one']"));
		// fakexpath is wirtten here for validating the findelements methos is throwing  any error
		// in case of element is found ...
		
		System.out.println(noelement.size()); // it will get 0 output , 
	
		
	}
}
