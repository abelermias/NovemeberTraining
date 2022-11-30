import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class ProductPurchaseTests extends AmpegTests {
	
	// this test has to be modified. Could not find proper css to proceed to next step
	@Test
	public void canPurchaseBassEnclosure() {
		var expectedResult = "FIND A DEALER";

		var actualResult = new HomePage(this.driver, BASEURL)
				.clickShopLink()
				.clickBEHardwareLink()
				.clickPN410HLFDealerLink()
				.clickBuyNowWithBananaPN410HLF();

		assertEquals(actualResult, expectedResult, "Should return find a dealer, found the item.");
	}

	@Test
	public void canBuyPluginSoftware() {
		var expectedResult = "1";

		var actualResult = new HomePage(this.driver, BASEURL)
				.clickShopLink()
				.clickPluginSoftwareLink()
				.clickAddToCart();

		assertEquals(actualResult, expectedResult, "Should show the cart with one more item added");
	}
	
	@Test
	public void canBuySCRDIPedal() {
		var expectedResult = "Unable to process";

		var actualResult = new HomePage(this.driver, BASEURL)
				.clickProductsLink()
				.clickPedalsLink()
				.clickBuy()
				.clickBuyNowSCRDI();

		assertEquals(actualResult, expectedResult, "Should show a pop screen of being unable to process the reqeuest");
	}
}
