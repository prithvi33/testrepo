package Get_Handle_ListBox_DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleListBoxOrDropdown {
	
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		 WebElement months = driver.findElement(By.id("month"));
		
		 Select p = new Select(months);
		 //p.selectByVisibleText("May");
		// p.selectByIndex(4);
		 p.selectByValue("5");
		 
		
	
	}

}
