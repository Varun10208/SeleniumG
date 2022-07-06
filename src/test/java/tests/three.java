package tests;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class three extends Base{
	WebDriver driver;

	public void test1() {
		driver.get("https://www.google.com");
	    System.out.println(driver.getTitle());
	}
		@BeforeTest
		public void setup() throws MalformedURLException {
			driver=initializeBroswer("internet explorer");
		}
		
		public void teardown() {
			driver.close();
		}
}
