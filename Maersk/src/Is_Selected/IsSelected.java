package Is_Selected;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IsSelected {
	
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println(male.isSelected()); // false
		System.out.println(female.isSelected()); // false
		
		// if we clicked male radio button, then it will fetch male radio is selected
		
		System.out.println("********************After clicked on male radio button*****************");
		
		male.click();
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
	
	// if we clicked on female radio button then, it  will fetch female radio button is selected....
		
		System.out.println("*********************After clicked on female radio button***************");
	
		female.click();
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		
		
	
	
	
	}

}
