package tests;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Two extends Base{
	WebDriver driver;
    @Test
	public void test1() {
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	    System.out.println(driver.getTitle());
	    driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Ankita Yadav");
	    
	}
		@BeforeTest
		public void setup() throws MalformedURLException {
			driver=initializeBroswer("chrome");
		}
		
		public void teardown() {
			driver.close();
		}
}
