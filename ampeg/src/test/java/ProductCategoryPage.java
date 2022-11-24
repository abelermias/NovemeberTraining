import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductCategoryPage extends PageObject {
	
	public ProductCategoryPage(WebDriver driver) {
		super(driver);
	}

	public String clickBuyNowSCRDI() {
		var buyLink = this.driver.findElement(By.xpath("//a[@class='cta generic-buy-button-2021']"));
		buyLink.click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		var itemProcess = this.driver.findElement(By.xpath("//div[@class='oma-title']//span[@data-omabind='html: title']")).getText();
		return itemProcess;
	}
	
	
}
