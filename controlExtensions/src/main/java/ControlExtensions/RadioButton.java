package ControlExtensions;

import org.openqa.selenium.WebElement;

public class RadioButton extends ControlExtension{
	
	public RadioButton(WebElement mappedElement) {
		super(mappedElement);
	}
	
	public void select() {
		mappedElement.click();
	}
}
