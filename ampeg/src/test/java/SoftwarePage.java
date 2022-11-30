import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SoftwarePage extends PageObject{
	public SoftwarePage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public String clickAddToCart() {
		var addLink = this.driver.findElement(By.xpath("//button[@class='action tocart primary']"));
		addLink.click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		var itemCart = this.driver.findElement(By.xpath("//a[@class='action showcart']"));
		itemCart.click();
		
		var itemCartCount = this.driver.findElement(By.xpath("//div[@id='minicart-content-wrapper']//span[@class='count']")).getText();
		
		return itemCartCount;
	}
	
	

}
