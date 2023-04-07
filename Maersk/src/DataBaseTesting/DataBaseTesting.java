package DataBaseTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DataBaseTesting {

	public static void main(String[] args) {
	  //Data
    String cust_firstname = "Prithviraj";
    String cust_lastname = "Zanjurne";
    String cust_email = "zprithvi333@gmail.com";
    String cust_telephone = "1234567890";
    String cust_password = "prithvi123";

    // User Registration
    WebDriver driver = new EdgeDriver();
    driver.get("https://demo.opencart.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();


    driver.findElement(By.xpath("//span[text()='My Account']")).click();
    driver.findElement(By.xpath("//a[text()='Register']")).click();

    driver.findElement(By.name("firstname")).sendKeys(cust_firstname);
    driver.findElement(By.name("lastname")).sendKeys(cust_lastname);
    driver.findElement(By.name("email")).sendKeys(cust_email);
    driver.findElement(By.name("password")).sendKeys(cust_password);
    driver.findElement(By.xpath("//input[@xpath='1']")).click();
    driver.findElement(By.xpath("//button[text()='Continue']")).click();




	}

}


