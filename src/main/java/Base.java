

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Base {
   WebDriver driver;
	public WebDriver initializeBroswer(String browser) throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		if(browser.equals("chrome")) {
			dc.setBrowserName("chrome");
		}
		if(browser.equals("IE")) {
			dc.setBrowserName("internet explorer");
		}
		if(browser.equals("edge")) {
			dc.setBrowserName("MicrosoftEdge");
		}
		
		driver=new RemoteWebDriver(new URL("http://localhost:4444"),dc);
		return driver;
		
	}
	
}
