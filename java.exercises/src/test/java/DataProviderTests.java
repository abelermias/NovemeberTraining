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


  private State getState(LocationObjectMother mother) {
	  return mother.State;
  }

}


