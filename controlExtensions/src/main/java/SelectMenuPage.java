import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class SelectMenuPage extends PageObject{
	
	@FindBy(how=How.CSS, using = "#oldSelectMenu")
	private WebElement oldStyleSelectMenu;
	
	
	public SelectMenuPage(WebDriver driver) {
		super(driver);
	}
	
	public SelectMenuPage navigate() {
		this.driver.get("https://demoqa.com/select-menu");
		return this;
	}

	public Select getSelectMenu() {
		return new Select(oldStyleSelectMenu);
	}
	
	public MultiSelect getMultiSelectMenu() {
		return new MultiSelect(multiSelectMenu);
	}
}
