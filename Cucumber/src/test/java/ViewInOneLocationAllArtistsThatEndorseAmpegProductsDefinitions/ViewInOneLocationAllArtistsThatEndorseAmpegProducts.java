package ViewInOneLocationAllArtistsThatEndorseAmpegProductsDefinitions;

import org.openqa.selenium.By;

import foundation.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewInOneLocationAllArtistsThatEndorseAmpegProducts extends TestBase{

	@Given("User navigates to website")
	public void userNavigatesToWebsite() {
		this.driver.navigate().to("https://ampeg.com/index.html");
	}
	
	@When("User clicks on the artist button")
	public void userClicksOnTheArtistButton() {
		this.driver.findElement(By.xpath("//*[@id=\"global-topnav\"]/ul/li[2]/a")).click();
	}
	
	//TODO:: Find a way to store all artists
	@Then("User can view all artists in one location")
	public void userCanViewAllArtistsInOneLocation() {
	}
}
