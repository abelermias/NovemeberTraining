import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.BeforeMethod;
import com.opencsv.bean.CsvToBeanBuilder;

public class BassCSVTests {
	
	List<Bass> bass;
	
	private Map<String, String> getHashMap() {
		Map<String, String> bassHashMap = new HashMap<String, String>();
		
		for(Bass tmp : this.bass)
			bassHashMap.put(tmp.getMake(), tmp.getModel());
		
		return bassHashMap;
	}
	
	@BeforeMethod
	public void beforeMethod() throws FileNotFoundException {
		String bassFile = "/Users/abel/git/NovemeberTraining/javaIO/src/test/resources/9_basses.csv";
		FileReader bassReader = new FileReader(bassFile);
		
		this.bass = new CsvToBeanBuilder<Bass>(bassReader).withType(Bass.class).build().parse();
	}
	
	@Test
	public void canGetCSVFileIntoHashMapMakesAndModels() {
		
		var expected = new HashMap<>(){{ 	put("Warwick","Corvette");
											put("Warwick","Thumb");
											put("Warwick","Streamer");
											put("Fender","Precision");
											put("Fender","Jazz");
											put("Yamaha","BB500");
        }};
        
        var actual = getHashMap();
        assertEquals(actual.keySet(), expected.keySet(), "Same HashMap keys expected");
        
        for(String key : actual.keySet())
        	assertEquals(actual.get(key), expected.get(key), "Same HashMap value expected");
	}
	
	@Test
	public void canHydrate() {
		Bass[] expected = { new Bass("Warwick", "Corvette", 	"5"),
		           			new Bass("Warwick", "Thumb", 		"5"),
		           			new Bass("Warwick", "Streamer", 	"5"),
		           			new Bass("Fender",  "Precision", 	"4"),
		           			new Bass("Fender",  "Jazz", 		"4"),
		           			new Bass("Yamaha",  "BB500", 		"5")
		};
		
		Bass[] actual = this.bass.toArray(new Bass[0]);
		
		for(var i = 0; i < actual.length; i++)
			assertEquals(actual[i], expected[i], "Same bass expected");
	
		//System.out.println("actual: " + actual[0] + " expected: " + expected[0]);
	}
}
