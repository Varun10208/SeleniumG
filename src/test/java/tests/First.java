package tests;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class First extends Base{
WebDriver driver;

@Test
public void test1() {
	driver.get("https://www.google.com");
    String actual=driver.getTitle();
    Assert.assertEquals("Google", actual);
}
	@BeforeTest
	public void setup() throws MalformedURLException {
		driver=initializeBroswer("chrome");
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
