package FindProductDealersForIndividualProductsDefintions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import foundation.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FindProductDealersForIndividualProducts extends TestBase{
	
	@Given("User navigates to website")
	public void userNavigatesToWebsite() {
		this.driver.navigate().to("https://ampeg.com/index.html");
	}
	
	@When("User clicks on the product button")
	public void userClicksOnTheProductButton() {
		this.driver.findElement(By.xpath("//*[@id=\"global-topnav\"]/ul/li[1]/a")).click();
	}
	
	@When("User selects product's category")
	public void userSelectsProductsCategory() {
		this.driver.findElement(By.xpath("//*[@id=\"productIndex\"]/table/tbody/tr[2]/td[2]/p/a")).click();
	}
	
	@When("User clicks BUY NOW on desired product")
	public void userClicksBuyNoweOnDesiredProduct() {
		this.driver.findElement(By.xpath("//*[@id=\"first-prod\"]/div/div[2]/div[1]/a")).click();
	}
	
	@Then("User is able to see product dealers")
	public void userIsAbleToSeeProductsSpecifications() {
		WebElement element = this.driver.findElement(By.xpath("//*[@id=\"oma-online-market\"]/div/div[2]/div[1]/div[1]/div/div[2]/div[1]"));
		
		assertEquals(element.getText(), "Here is one of the product's dealers");
	}


}
