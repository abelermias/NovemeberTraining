import org.openqa.selenium.WebDriver;

public abstract class PageObject {
	protected WebDriver driver;
	protected String URL;
	protected String baseUrl;
	
	protected PageObject(WebDriver driver, String baseUrl) {
		this.driver = driver;
		this.baseUrl = baseUrl;
	}
}
