import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDirectoryPage extends PageObject {

	public ProductDirectoryPage(WebDriver driver) {
		super(driver);
	}
	
	public ProductCategoryPage clickClassicBassHeadsAndEnclosuresLink() {
		var productLink = this.driver.findElement(By.cssSelector("img[alt='Classic Series: Bass heads & enclosures']"));
		productLink.click();	
		
		return new ProductCategoryPage(this.driver);
	}
	
	public ProductDirectoryPage clickPedalsLink() {
		var productLink = this.driver.findElement(By.cssSelector("img[alt='Ampeg Pedals']"));
		productLink.click();	
		
		return new ProductDirectoryPage(this.driver);
	}
	
	public ProductCategoryPage clickBuy() {
		var buyLink = this.driver.findElement(By.xpath("//a[@class='buy']"));
		buyLink.click();	
		
		return new ProductCategoryPage(this.driver);
	}
	
	
}
