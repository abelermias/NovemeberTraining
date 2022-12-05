import org.testng.annotations.Test;
import Foundations.TestBase;

import static org.testng.Assert.assertEquals;

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
		
		HyperLinksPage linkPage = new HyperLinksPage(this.driver).navigate();
		linkPage.getLink();
		linkPage.click();
		
		var actualStatus = linkPage.getStatusCode();
		
		assertEquals(actualStatus, expectedStatus, "Should return status code");
	}
}
