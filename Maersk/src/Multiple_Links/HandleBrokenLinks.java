package Multiple_Links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleBrokenLinks {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		
		int brokenLinks = 0;
		
		for (WebElement link : links) {
			  String url = link.getAttribute("href");
			  
			  if(url == null || url.isEmpty()) {
				  System.out.println("Url is empty");
				  continue;
		 }
			  
			  URL link1 = new URL (url);
			  
			try {
				HttpURLConnection httpconn = (HttpURLConnection) link1.openConnection();
				httpconn.connect();
				if (httpconn.getResponseCode()>=400) {
					System.out.println(httpconn.getResponseCode()+url+"  is"+" Broken link");
					brokenLinks++;
				}
				
				else {
					System.out.println(httpconn.getResponseCode()+url+"  is"+" Valid link");
				}
				
				
				
			} catch (Exception e) {
				
			}
			  
			}
		
		System.out.println("No. of Broken links:" +brokenLinks);
	}

}
