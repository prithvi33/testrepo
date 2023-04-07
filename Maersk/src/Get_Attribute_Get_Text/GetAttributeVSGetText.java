package Get_Attribute_Get_Text;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetAttributeVSGetText {
	
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.manage().window().maximize();
		
		 WebElement mail = driver.findElement(By.id("Email"));
		 mail.clear();
		 mail.sendKeys("admin@yourstore.com");
		 
		// capturing text from inputbox
		System.out.println("result from getattribute:" +mail.getAttribute("value"));
		
		
		System.out.println("result from gettext:"  +mail.getText());
		// in this  case gettext method will not return anything , because gettext method return the
		// value inside  the  text. means like >Prithvi<
		
		//for login button we will try to use gettext method because here Inertext is available ...
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
	  System.out.println("result from GetAttribute:"  +loginbutton.getAttribute("class"));
	  System.out.println("result from GetAttribute:"  +loginbutton.getAttribute("type"));
	  
	  System.out.println("result form GetText:"  +loginbutton.getText());
	  
	  // IMP point --> :
	  // The getText() method returns the innertext of an element.
	  // The getAttribute() method fetches the text contained by an attribute in an html document.
	
	}

}
