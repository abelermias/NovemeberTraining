import org.testng.Assert;
import org.testng.annotations.Test;

public class DataProviderTests {
  @Test
  public void canGetStateName() {
	  
	  //arrange
	  var expectedState = "Texas";
	  
	  //act
	  var actualState = States.Texas.Name;
	  
	  //assert
	  Assert.assertEquals(actualState, expectedState, "State name should be returned.");
  }


  @Test
  public void canGetStateAbbreviation() {
	
	  var expectedAbbreviation = "TX";
	
	  var actualAbbreviation = States.Texas.Abbreviation;
	
	  Assert.assertEquals(actualAbbreviation, expectedAbbreviation, "Abbreviation should be returned.");
  }
  @Test
  public void canGetStateNameFromObjectMother() {
	  
	  var expectedState = "Louisiana";
	
	  var actualState = getState(LocationObjectMothers.NewOrleans());
	
	  Assert.assertEquals(actualState.Name, expectedState, "State Should be returned.");
  }
  
  @Test
  public void canGetCityFromObjectMother() {
	  
	  var expectedCity = "Asheville";
	  
	  var actualCity = getCity(LocationObjectMothers.Asheville());
	  
	  Assert.assertEquals(actualCity, expectedCity, "City Should be returned.");
  }
  
  
  @Test
  public void canGetCity() {
	  
	  var expectedCity = "Nashville";
	  
	  var actualCity = Cities.Nashville.name; 
	  
	  Assert.assertEquals(actualCity, expectedCity, "city be returned.");
  }
  
  @Test
  public void canGetCounty() {
	  
	  var expectedCounty = "Buncombe";
	  
	  var actualCounty = Cities.Asheville.county;
	  
	  Assert.assertEquals(actualCounty, expectedCounty, "county be returned.");
  }
  
  @Test
  public void canGetCountyFromObjectMother() {
	  
	  var expectedCounty = "Montgomery";
		
	  var actualCounty = getCounty(LocationObjectMothers.Houston());
	
	  Assert.assertEquals(actualCounty, expectedCounty, "County Should be returned.");
  }


  private State getState(LocationObjectMother mother) {
	  return mother.State;
  }
  
  private String getCity(LocationObjectMother mother) {
	  return mother.City.name;
  }
  
  private String getCounty(LocationObjectMother mother) {
	  return mother.City.county;
  }

}


