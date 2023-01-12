import org.testng.annotations.Test;

import Foundations.TestBase;

import org.testng.annotations.BeforeMethod;

public class MultiSelectTests extends TestBase{

	private String URL = "https://demoqa.com/select-menu";

	@BeforeMethod
	public void beforeMethod() {
		this.driver.navigate().to(URL);
	}
	
	@Test
	public void canSelectMultipleOptions() {
		
		String[] expectedOptions = {"Black", "Indigo"};
		
		MultiSelect multiSelect = new SelectMenuPage(this.driver).navigate();
		multiSelect.getMultiSelectMenu();
		
	}


}
