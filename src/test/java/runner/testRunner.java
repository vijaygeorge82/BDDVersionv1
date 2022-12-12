
  
  
  package runner;
  
  
  
  
	
	  import org.junit.runner.RunWith;
	  
	  import io.cucumber.junit.Cucumber; import io.cucumber.junit.CucumberOptions;
	  
	  @RunWith(Cucumber.class)
	  
	  @CucumberOptions ( features = {"src/test/resources/Features"},
	  glue={"stepDefinition","support"}, //glue={"stepsdefs","support"}, //tags= "P2"
	  plugin= {"html:target/cucumber-html-report",
	  "json:target/cucumber-json-report.json"} , monochrome= true, dryRun= false
	  
	  ) public class testRunner {
	  
	  }
	 
  
  
  
  
  
  
  
  
  
  
  
	/*
	 * import org.junit.runner.RunWith;
	 * 
	 * 
	 * import io.cucumber.junit.Cucumber; import io.cucumber.junit.CucumberOptions;
	 * 
	 * @RunWith(Cucumber.class)
	 * 
	 * @CucumberOptions( features = "src/test/resources/Features"
	 * ,glue={"stepDefinition"} )
	 * 
	 * public class testRunner {
	 * 
	 * }
	 */
  
  
 