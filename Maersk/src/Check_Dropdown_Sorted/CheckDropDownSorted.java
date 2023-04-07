package Check_Dropdown_Sorted;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckDropDownSorted {
	
	  public static void main(String[] args) {
	        WebDriver driver = new EdgeDriver();
	        driver.get("https://twoplugs.com/");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        driver.manage().window().maximize();

	        driver.findElement(By.xpath("//a[text()='Live Posting']")).click();

	        WebElement dropele = driver.findElement(By.xpath("//select[@name='category_id']"));
	        Select dropselect = new Select(dropele);

	        List<WebElement> options = dropselect.getOptions();

	        ArrayList originallist = new ArrayList();
	        ArrayList Templist = new ArrayList();

	        for (WebElement option : options) {
	        	
	            originallist.add(option.getText());
	            Templist.add(option.getText());
	        }

	        System.out.println("original list:" +originallist);
	        System.out.println("temp list:" +Templist);
	        
	       Collections.sort(Templist); //sorting
	       
	       System.out.println("original list:" +originallist);
	       System.out.println("temp list after sorting:" +Templist);
	       
	       if(originallist.equals(Templist)) {
	    	   System.out.println("Dropdown sorted");
	       }
	       else {
	    	   System.out.println("Dropdown unsorted");
	       }
	       
	       }

}
