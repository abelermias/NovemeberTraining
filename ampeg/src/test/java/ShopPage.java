import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ShopPage extends PageObject{
	
	public ShopPage(WebDriver driver) {
		super(driver);
	}

	public HardwarePage clickBEHardwareLink() {
		WebElement element = driver.findElement(By.xpath("//a[@id='ui-id-3']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		var dpHardwareLink = this.driver.findElement(By.xpath("//a[@id='ui-id-8']"));
		dpHardwareLink.click();
		
		return new HardwarePage(this.driver);
	}
	
	public SoftwarePage clickPluginSoftwareLink() {
		WebElement element = driver.findElement(By.xpath("//a[@id='ui-id-2']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		var pluginLink = this.driver.findElement(By.xpath("//a[@id='ui-id-6']"));
		pluginLink.click();
		
		return new SoftwarePage(this.driver);
	}
}
