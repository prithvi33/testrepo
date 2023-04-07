package Get_Handle_Bootstrap_Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BootstrapDropdown {
	
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
		
		List<WebElement> button = driver.findElements(By.xpath("//div[@x-placement='bottom-start']/a"));
		
		System.out.println( +button.size());
		
		
	}

}
