package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nextechitc.Pageobjectmodel.walmartsearchiconPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class walmartsearchicon {
	
	WebDriver driver;
	
	@Given("^users visits Walmart homepage$")
	public void users_visits_Walmart_homepage() throws Throwable {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("http://www.walmart.com)");
	    
	}

	@When("^users types \"([^\"]*)\" and click search icon$")
	public void users_types_and_click_search_icon(String arg1) throws Throwable {
		
		walmartsearchiconPOM walmart=new walmartsearchiconPOM(driver);
		walmart.walmartsearch().sendKeys(arg1);
		walmart.walmartsearchicon().click();
	    	}

	@Then("^users should able to see the expected product$")
	public void users_should_able_to_see_the_expected_product() throws Throwable {
	    
	}



}
