import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductCategoryPage extends PageObject {
	
	public ProductCategoryPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public String clickBuyNowSCRDI() {
		var buyLink = this.driver.findElement(By.xpath("//a[@class='cta generic-buy-button-2021']"));
		buyLink.click();
		
		//make driver wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		var itemProcess = this.driver.findElement(By.xpath("//div[@class='oma-title']//span[@data-omabind='html: title']")).getText();
		return itemProcess;
	}
}