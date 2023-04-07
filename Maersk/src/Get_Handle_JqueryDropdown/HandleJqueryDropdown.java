package Get_Handle_JqueryDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleJqueryDropdown {
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(27));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("//input[@id='justAnInputBox']")).click();
		
		
	}
	public static void SelectChoiceValues(WebDriver driver, String...value) {
		List<WebElement> lists = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
	
	
	}

}
