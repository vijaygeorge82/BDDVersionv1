package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
//import gherkin.events.PickleEvent;


@CucumberOptions(
        features="src/test/resources/Features",
        glue="stepDefinition",
     //   tags = "@UdhayAshwin",
       monochrome = true
         ,dryRun = false
         ,plugin = "json:target/cucumber-reports/CucumberTestReport.json"
)
public class udhayTestNG {

	 private TestNGCucumberRunner testNGCucumberRunner;
	 @BeforeClass(alwaysRun = true)
	    public void setUpClasss() throws Exception {
	        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	    }
	

		
		  @Test( description = "Runs cucumber Scenarios", dataProvider = "scenarios")
		  public void scenario(PickleWrapper pickleEvent, FeatureWrapper featureWrapper) throws Throwable {
		  testNGCucumberRunner.runScenario(pickleEvent.getPickle());
		  
		  }
		  
		  @DataProvider public Object[][] scenarios()
		  {
			  return
		  testNGCucumberRunner.provideScenarios(); }
		  
		 
		 
	    @AfterClass(alwaysRun = true)
	    public void tearDownClass() {
	        testNGCucumberRunner.finish();
	    }

}
