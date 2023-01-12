package ControlExtensions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioGroup extends ControlExtension{

	public RadioGroup(WebElement mappedElement) {
		super(mappedElement);
	}

	public RadioButton getButton(String label) {
		
		WebElement button = this.mappedElement.findElement(By.xpath("//label[text()='" + label + "']/../label"));
		return new RadioButton(button);
	}

	public String getSelected() {
		
		WebElement selected = this.mappedElement.findElement(By.xpath("//p/span"));
		
		if(selected != null)
			return selected.getText();
		else
			return null;
	}

}
