import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import ControlExtensions.RadioGroup;

public class RadioButtonPage extends PageObject{
	
	@FindBy(how = How.XPATH, using = "//div[@class='mb-3']/..")
	private WebElement radioGroup;
	
	public RadioButtonPage(WebDriver driver) {
		super(driver);
	}
	
	public RadioButtonPage navigate() {
		this.driver.get("https://demoqa.com/radio-button");
		return this;
	}
	
	public RadioGroup getRadioGroup() {
		return new RadioGroup(radioGroup);
	}

	
}
