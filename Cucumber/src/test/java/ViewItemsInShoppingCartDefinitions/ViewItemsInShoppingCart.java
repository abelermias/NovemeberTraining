package ViewItemsInShoppingCartDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import foundation.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewItemsInShoppingCart extends TestBase{

	@Given("User navigates to website")
	public void userNavigatesToWebsite() {
		this.driver.navigate().to("https://ampeg.com/index.html");
	}
	
	@When("User clicks on the cart button")
	public void userClicksOnTheCartButton() {
		this.driver.findElement(By.xpath("//*[@id=\"global-topnav\"]/ul/li[7]/a/span")).click();
	}
	
	@When("User clicks on the software button")
	public void userClicksOnTheSoftwareButton() {
		this.driver.findElement(By.xpath("//*[@id=\"menu\"]/nav/ul[1]/li[1]/a")).click();
	}
	
	@When("User adds SVT Suite to the cart")
	public void userAddsSVTSuiteToTheCart() {
		this.driver.findElement(By.xpath("//*[@id=\"product-listing-container\"]/div[1]/ul/li/article/div/div/div[2]/a")).click();
	}
	
	@When("User clicks Hardware Button")
	public void userClicksHardwareButton() {
		this.driver.findElement(By.xpath("//*[@id=\"menu\"]/nav/ul[1]/li[2]/a")).click();
	}
	
	@When("User clicks All Hardware Button")
	public void userClicksAllHardwareButton() {
		this.driver.findElement(By.xpath("//*[@id=\"navPages-36\"]/ul/li[11]/a")).click();
	}
	
	@When("User adds Liquifier Analog Chorus Pedal to cart")
	public void userAddsLiquifierAnalogChorusPedalToCart() {
		this.driver.findElement(By.xpath("//*[@id=\"product-listing-container\"]/div[1]/ul/li[2]/article/div/div/div[2]/a")).click();
	}
	
	//TODO:: Find a way to assert that the items are in the cart
	@Then("User can view items in cart")
	public void userCanViewItemsInCart() {
		
		WebElement SVTElement = this.driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div/div[3]/table/tbody/tr[1]/td[2]/h2/a"));
		WebElement PedalElement = this.driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div/div[3]/table/tbody/tr[2]/td[2]/h2/a"));
		System.out.println(SVTElement.getText());
		System.out.println(PedalElement.getText());
	
	}
}
