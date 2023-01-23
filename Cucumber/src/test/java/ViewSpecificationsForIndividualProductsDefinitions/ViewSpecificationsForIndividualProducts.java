package ViewSpecificationsForIndividualProductsDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import foundation.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewSpecificationsForIndividualProducts extends TestBase{

	@Given("User navigates to website")
	public void userNavigatesToWebsite() {
		this.driver.navigate().to("https://ampeg.com/index.html");
	}
	
	@Given("User clicks on the product button")
	public void userClicksOnTheProductButton() {
		this.driver.findElement(By.xpath("//*[@id=\"global-topnav\"]/ul/li[1]/a")).click();
	}
	
	@When("User selects product's category")
	public void userSelectsProductsCategory() {
		this.driver.findElement(By.xpath("//*[@id=\"productIndex\"]/table/tbody/tr[2]/td[2]/p/a")).click();
	}
	
	@When("User clicks learn more on desired product")
	public void userClicksLearnMoreOnDesiredProduct() {
		this.driver.findElement(By.xpath("//*[@id=\"first-prod\"]/div/div[1]/a")).click();
	}
	
	@Then("User is able to see products specifications")
	public void userIsAbleToSeeProductsSpecifications() {
		WebElement element = this.driver.findElement(By.xpath("//*[@id=\"v-4b\"]/div/div[4]/div/div/div/div/div[1]/ul/li[1]/text()"));
		
		assertEquals(element.getText(), "Here is the product's specifications");
	}	
}
