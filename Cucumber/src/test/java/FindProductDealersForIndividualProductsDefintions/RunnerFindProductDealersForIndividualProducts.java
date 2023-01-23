package FindProductDealersForIndividualProductsDefintions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=  "src/test/java/Features",
					glue = {"CanFindProductDealersForIndividualProductsDefinitions"})

public class RunnerFindProductDealersForIndividualProducts {

}
