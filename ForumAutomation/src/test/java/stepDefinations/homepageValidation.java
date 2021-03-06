package stepDefinations;


import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utilities.browserEngine;
import Utilities.logCollector;
import Utilities.testData;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


		@RunWith(Cucumber.class)

		public class homepageValidation {
		public static WebDriver driver;
	
		@Given("^Home page of the forum web site$")
	    public void home_page_of_the_forum_web_site() throws Throwable {
		 
		driver=browserEngine.getBrowser();
	        
	    }

	    @When("^user launch the home page$")
	    public void user_launch_the_home_page() throws Throwable {
	    	
	    	driver.get(testData.appurl);
	        
	    }

	    @Then("^home page is loaded$")
	    public void home_page_is_loaded() throws Throwable {
	    	
	    	System.out.println("Home page loaded");
	    	logCollector.debug("Home page loaded");
	    	
	    }

	    @And("^Title of home page is valided$")
	    public void title_of_home_page_is_valided() throws Throwable {
	    	
	    	String homepgaeetitle= "Forum Automation";
	    	String homepageatitle=driver.getTitle();
	    	Assert.assertEquals(homepgaeetitle, homepageatitle);
	    	
	        
	    }

}
