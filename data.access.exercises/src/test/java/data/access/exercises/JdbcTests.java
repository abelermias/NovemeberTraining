package data.access.exercises;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class JdbcTests {
	
	private DatabaseUtility accessor;
	
	@BeforeMethod
	public void Setup() { 
		this.accessor = new DatabaseUtility();
	}

	@Test
	public void canGetTenCitiesInDescAplhaOrder() {
		var expectedCities = "";
		var resultCities = this.accessor.Execute("SELECT * FROM CITY ORDER BY CITY DESC LIMIT 10");
	}
	
	@Test
	public void canGetHighestPaymentAmount() {
		var expectedAmount = 11.99;
		var resultAmount = this.accessor.ExecuteSingleCell("SELECT MAX(amount) AS \"HighestPayment\" FROM PAYMENT");
		Assert.assertEquals(resultAmount, expectedAmount, "Highest payment should be returned");
	}
	
	@Test
	public void canGetFilmInfoBobFawcettUsingView() {
		var resultFilmInfo = this.accessor.ExecuteSingleColumn("SELECT * FROM film_list WHERE LOWER(ACTORS) LIKE '%Bob Fawcett%'");
	}
	
	@Test
	public void canGetInventoryIdForAlienCenterFromStore2() {
		var resultId = this.accessor.ExecuteSingleColumn("SELECT * FROM film_list WHERE LOWER(ACTORS) LIKE '%Bob Fawcett%'");
	}
}