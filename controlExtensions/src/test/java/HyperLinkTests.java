import org.testng.annotations.Test;

import Foundations.TestBase;
import org.testng.annotations.BeforeMethod;

public class HyperLinkTests extends TestBase{
	
	private String URL = "https://demoqa.com/links";
	
	@BeforeMethod
	public void beforeMethod() {
		this.driver.navigate().to(URL);
	}
	
	@Test
	public void canClickHyperLink() {
		
		var expectedStatus = "201";
		
		HyperLinksPage link = HyperLinksPage(this.driver)
							.navigate()
							.getLink()
							.click();
		
	}
}
