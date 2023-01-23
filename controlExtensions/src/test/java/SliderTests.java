import org.testng.annotations.Test;

import ControlExtensions.Slider;
import Foundations.TestBase;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;

public class SliderTests extends TestBase{
	
	private String URL = "https://demoqa.com/slider";
	
	@BeforeMethod
	public void beforeMethod() {
		this.driver.navigate().to(URL);
	}
	
	@Test
	public void canSetValueTo80() {
		
		var expectedValue = "80";
		
		SliderPage sliderPage = new SliderPage(this.driver).navigate();
		
		Slider slider = sliderPage.getSlider();
		slider.setValue(expectedValue);
		
		var actualValue = slider.getValue();
		
		assertEquals(actualValue, expectedValue, "Should return Slider Value");
	}
	
	@Test
	public void canSetValueTo17() {
		
		var expectedValue = "17";
		
		SliderPage sliderPage = new SliderPage(this.driver).navigate();
		
		Slider slider = sliderPage.getSlider();
		slider.setValue(expectedValue);
		
		var actualValue = slider.getValue();
		
		assertEquals(actualValue, expectedValue, "Should return Slider Value");
	}
	
	@Test
	public void canSetValueTo0() {
		
		var expectedValue = "0";
		
		SliderPage sliderPage = new SliderPage(this.driver).navigate();
		
		Slider slider = sliderPage.getSlider();
		slider.setValue(expectedValue);
		
		var actualValue = slider.getValue();
		
		assertEquals(actualValue, expectedValue, "Should return Slider Value");
	}
	
	@Test
	public void canSetValueTo100() {
		
		var expectedValue = "100";
		
		SliderPage sliderPage = new SliderPage(this.driver).navigate();
		
		Slider slider = sliderPage.getSlider();
		slider.setValue(expectedValue);
		
		var actualValue = slider.getValue();
		
		assertEquals(actualValue, expectedValue, "Should return Slider Value");
	}
}
