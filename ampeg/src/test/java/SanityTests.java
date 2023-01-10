import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class SanityTests {
	
	private WebDriver driver;
	
	@AfterMethod
	public void Cleanup() {
		if(this.driver == null) {
			return;
		}
		this.driver.quit();
	}
	
	@Test
	public void canLaunchWebDriver() {
		var chromeDriverPath = "/Users/abel/git/NovemeberTraining/ampeg/lib/chromedriver";
		var url = "https://www.selenium.dev/";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
	  
		this.driver = new ChromeDriver();
		driver.navigate().to(url);
		var currentUrl = driver.getCurrentUrl();
	  
		assertEquals(currentUrl, url, "if selenium is setup correctly then navigte to the url should be successful.");
	}
	
	
	// Dont have ms installed
	@Test
	public void canLaunchMsEdgeDriver() {
		var driverPath = "C:\\Users\\dtaylor\\Downloads\\msedgedriver.exe";
		var url = "https://www.selenium.dev/";
		System.setProperty("webdriver.edge.driver", driverPath);

		this.driver = new EdgeDriver();
		driver.navigate().to(url);
		var currentUrl = driver.getCurrentUrl();

		assertEquals(currentUrl, url, "if selenium is setup correctly then navigating to the url should be successful.");  
	}
}
