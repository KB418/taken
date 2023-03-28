package testrunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/featurefiles", glue = "stepdefintion", monochrome = true, tags="@demo",
						plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
								//"html:target/cucumber.html", "json:target/cucumber.json"}
							)
	
		
public class DemoRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
		
	}
	
}
