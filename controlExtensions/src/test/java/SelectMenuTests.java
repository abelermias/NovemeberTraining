import org.testng.annotations.Test;

import Foundations.TestBase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;

public class SelectMenuTests extends TestBase{
	
	private String URL = "https://demoqa.com/select-menu";

	@BeforeMethod
	public void beforeMethod() {
		this.driver.navigate().to(URL);
	}
	
	@Test
	public void canSetValue() {
		
		var expectedText = "Indigo";
		
		SelectMenuPage selectMenuPage = new SelectMenuPage(this.driver).navigate();
		Select selectMenu = selectMenuPage.getSelectMenu();
		selectMenu.selectByVisibleText(expectedText);
		
		var actualText = selectMenu.getFirstSelectedOption().getText();
		
		assertEquals(actualText, expectedText, "Should return selected text");
	}
	
	@Test
	public void canGetAllOptions() {
		
		String[] expectedOptions = {"Red", "Blue", "Green", "Yellow", "Purple", "Black", "White", "Violet", "Indigo", "Magenta", "Aqua"};
		
		SelectMenuPage selectMenuPage =  new SelectMenuPage(this.driver).navigate();
		
		//TODO:: find a way to return options and make asserts on each
		// Some type of for loop for each item
		//String[] actualOptions = selectMenuPage.getSelectMenu().getOptions()
	}
}
