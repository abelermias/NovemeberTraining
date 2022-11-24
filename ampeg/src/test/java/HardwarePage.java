import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HardwarePage extends PageObject{
	
	public HardwarePage(WebDriver driver) {
		super(driver);
	}

	public HardwarePage clickPN410HLFDealerLink() {
		var BELink = this.driver.findElement(By.xpath("//button[@data-product='99-030-2801']"));
		BELink.click();
		
		return new HardwarePage(this.driver);
	}

	public String clickBuyNowWithBananaPN410HLF() {
		var buyNowLink = this.driver.findElement(By.xpath("//button[@data-product='99-030-2801']"));
		return buyNowLink.getText();
	}
	
}
