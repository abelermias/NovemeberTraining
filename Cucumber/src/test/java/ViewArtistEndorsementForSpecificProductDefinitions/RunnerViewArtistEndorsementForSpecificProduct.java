package ViewArtistEndorsementForSpecificProductDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/ViewArtistEndoresementForSpecificProduct",
					glue = {"Definitions"})

public class RunnerViewArtistEndorsementForSpecificProduct{
}