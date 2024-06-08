package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue ="stepDefinitions"
,monochrome=true, dryRun = false, tags ="@CartPage",
plugin= {"html:target/cucumber.html", "json:target/cucumber.json"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

	
	
}
