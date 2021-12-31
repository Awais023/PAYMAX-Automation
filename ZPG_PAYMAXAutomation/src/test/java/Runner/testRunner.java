package Runner;

import org.junit.runner.RunWith; 

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/resources/adminFeatures"
,glue= {"adminPAYMAX_Test"}
,tags= {"@Addrole"}
)
public class testRunner {

}
