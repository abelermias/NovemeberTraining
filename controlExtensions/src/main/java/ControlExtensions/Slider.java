package ControlExtensions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Slider extends ControlExtension{
	
	private WebElement slider;
	private WebElement sliderValue;
	
	public Slider(WebElement mappedElement) {
		super(mappedElement);
		this.slider = this.mappedElement.findElement(By.tagName("input"));
	}
	
	public void setValue(String value) {
		
		sliderValue = mappedElement.findElement(By.id("sliderValue"));
		
		int currVal = Integer.parseInt(sliderValue.getAttribute("value"));
		
		if(currVal < Integer.parseInt(value)) {
			while(!sliderValue.getAttribute("value").equals(value))
				this.slider.sendKeys(Keys.ARROW_RIGHT);
		}
		
		if(currVal > Integer.parseInt(value)) {
			while(!sliderValue.getAttribute("value").equals(value))
				this.slider.sendKeys(Keys.ARROW_LEFT);
		}
		
		
	}
	
	public String getValue() {
		return this.slider.getAttribute("value");
	}	
}
