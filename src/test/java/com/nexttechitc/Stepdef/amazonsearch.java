package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nextechitc.Pageobjectmodel.AmazonsearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class amazonsearch {
	
    WebDriver driver;
		
	@Given("^user visit amazon homepage$")
	public void user_visit_amazon_homepage() throws Throwable {
		
		
		//how to open the browser
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	driver = new ChromeDriver();
		
		//how to open URL
		driver.get("https://www.amazon.com/");
	}

	@When("^user type \"([^\"]*)\" and click search icon$")
	public void user_type_and_click_search_icon(String arg1) throws Throwable {
		
	 //create the object for POM class
		
      AmazonsearchPOM obj=new AmazonsearchPOM(driver);//this driver deliver method from POM to here
      obj.Amazonsearch().sendKeys(arg1);
      obj.searchicon().click();
	
	}

	
	@Then("^User should able to see the expected product$")
	public void user_should_able_to_see_the_expected_product() throws Throwable {
		
		
		//how to close the window
		//driver.close();
		
		//how to quit the window
		//driver.quit();
	    
	}
		
}
