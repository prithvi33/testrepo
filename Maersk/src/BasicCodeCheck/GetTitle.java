package BasicCodeCheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTitle {
	
	public static void main(String[] args) throws InterruptedException {
		
		 // System.setProperty("wedriver.chrome.driver", "C:\\webdrive\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new EdgeDriver();
		  driver.get("https://twitter.com/");
		  
		  Thread.sleep(4000);
		  
		  driver.close();
		  
		  String Tittle1 = driver.getTitle();
		  System.out.println(Tittle1);   // its actual tittle of url...
		  
		  String expectedtittle = "Explore / Twitter";
		  
		  if(Tittle1.equalsIgnoreCase(expectedtittle)) {
			  System.out.println("Navigate to Correct Page");
		  }
		  else {
			  System.out.println("Navigate to Inavaid Page");
			  
			  }

}
}
