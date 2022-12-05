import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import ControlExtensions.HyperLink;

public class HyperLinksPage extends PageObject{
	
	@FindBy(how=How.XPATH, using = "/a[@id = 'created']")
	private WebElement link;
	
	public HyperLinksPage(WebDriver driver) {
		super(driver);
	}
	
	public HyperLinksPage navigate() {
		this.driver.get("https://demoqa.com/links");
		return this;
	}
	
	public HyperLink getLink() {
		return new HyperLink(this.link);
	}
	
	// TODO:: Find a way to get Status Code
	public String getStatusCode() {
		
	}
}
