
  package stepDefinition;
  
  import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
	  org.openqa.selenium.chrome.ChromeDriver; import
	  org.openqa.selenium.support.ui.ExpectedConditions; import
	  org.openqa.selenium.support.ui.WebDriverWait;
	  
	 // import cucumber.api.java.en.And; 
	//  import cucumber.api.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.LoggerHelper;
import io.cucumber.java.en.Given;
  public class login {
  
  
  public WebDriver driver;
	Logger log = LoggerHelper.getLogger(login.class);
  
	/*
	 * @Given("^user open the browser in chrome$") public void
	 * user_open_the_browser_in_chrome() {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\14168\\Downloads\\chromedriver_win32\\chromedriver.exe"); driver
	 * = new ChromeDriver(); driver.get("https://www.google.ca/");
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); WebDriverWait
	 * wait = new WebDriverWait(driver,30);
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
	 * xpath("(//input[@class='gLFyf gsfi'])")));
	 * 
	 * 
	 * }
	 * 
	 * 
	 * @Then("^the results are displayed$") public void the_results_are_displayed()
	 * throws Throwable {
	 * 
	 * System.out.println("Results displayed"); Thread.sleep(2000); throw new
	 * PendingException(); }
	 * 
	 * 
	 * @And("^clicks on search button$") public void clicks_on_search_button() {
	 * 
	 * //
	 * driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
	 * 
	 * driver.findElement(By.xpath("(//span[text()='automation'])[1]")).click();
	 * 
	 * }
	 * 
	 * @And("^enter the value \"([^\"]*)\"$") public void
	 * enter_the_value_something(String strArg1){
	 * driver.findElement(By.xpath("(//input[@class='gLFyf gsfi'])")).sendKeys(
	 * "Automation"); driver.manage().timeouts().implicitlyWait(5,
	 * TimeUnit.SECONDS); //
	 * driver.findElement(By.xpath("(//span[text()='automation'])[1]")).click();
	 * 
	 * 
	 * }
	 * 
	 * }
	 */
 



@Given("user open the browser in chrome")
public void user_open_the_browser_in_chrome() {
	
	  System.setProperty("webdriver.chrome.driver",
	  "C:\\Users\\14168\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		/*
		 * ChromeOptions options = new ChromeOptions(); options.addExtensions(new
		 * File("Path to CRX File")); DesiredCapabilities capabilities = new
		 * DesiredCapabilities(); capabilities.setCapability(ChromeOptions.CAPABILITY,
		 * options);
		 */
	  driver
	  = new ChromeDriver(); 
	  
	  driver.get("https://www.google.ca/");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); WebDriverWait
	  wait = new WebDriverWait(driver,30);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.
	  xpath("(//input[@class='gLFyf gsfi'])")));
	 
	
	System.out.println("TestFile given");
	log.info("TestFile given");

}

@When("clicks on search button")
public void clicks_on_search_button() {
	
	  driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
	  
	//  driver.findElement(By.xpath("(//span[text()='automation'])[1]")).click();
	 
	System.out.println("TestFile when");

}

@Then("enter the value {string}")
public void enter_the_value(String string) {
	driver.findElement(By.xpath("(//input[@class='gLFyf gsfi'])")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//input[@class='gLFyf gsfi'])")).sendKeys(
			  "Automation"); 
	driver.manage().timeouts().implicitlyWait(5,
			  TimeUnit.SECONDS); //
			  driver.findElement(By.xpath("(//span[text()='automation'])[1]")).click();
	System.out.println("TestFile Then");
	driver.close();
	driver.quit();

}
}