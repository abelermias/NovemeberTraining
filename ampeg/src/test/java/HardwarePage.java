import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HardwarePage extends PageObject{
	
	public HardwarePage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public HardwarePage clickPN410HLFDealerLink() {
		var beLink = this.driver.findElement(By.xpath("//button[@data-product='99-030-2801']"));
		beLink.click();
		
		return new HardwarePage(this.driver, baseUrl);
	}

	public String clickBuyNowWithBananaPN410HLF() {
		var buyNowLink = this.driver.findElement(By.xpath("//button[@data-product='99-030-2801']"));
		return buyNowLink.getText();
	}
	
}