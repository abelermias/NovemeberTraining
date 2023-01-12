import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Foundations.TestBase;

public class RadioButtonTests extends TestBase{
	
	private String URL = "https://demoqa.com/radio-button";
	
	@BeforeMethod
	public void beforeMethod() {
		this.driver.navigate().to(URL);
	}
	
	@Test
	public void canSelectYesButton() {
		
		var expectedLabel = "Yes";
		
		var radioGroup = new RadioButtonPage(this.driver)
								.navigate()
								.getRadioGroup();
		
		radioGroup.getButton(expectedLabel).select();
		
		var actualLabel = radioGroup.getSelected();
		
		assertEquals(actualLabel, expectedLabel, "Yes Radio Button expected");
	}
	
	@Test
	public void canSelectImpressiveButton() {
		
		var expectedLabel = "Impressive";
		
		var radioGroup = new RadioButtonPage(this.driver)
								.navigate()
								.getRadioGroup();
		
		radioGroup.getButton(expectedLabel).select();
		
		var actualLabel = radioGroup.getSelected();
		
		assertEquals(actualLabel, expectedLabel, "Impressive Radio Button expected");
	}
	
	@Test
	public void cannotSelectNoButton() {
		
		var expectedLabel = "null";
		
		var radioGroup = new RadioButtonPage(this.driver)
								.navigate()
								.getRadioGroup();
		
		radioGroup.getButton("No").select();
		
		var actualLabel = radioGroup.getSelected();
		
		// TODO:: find a way to assert this test
		assertEquals(actualLabel, expectedLabel, "Null expected");
	}
  
}
