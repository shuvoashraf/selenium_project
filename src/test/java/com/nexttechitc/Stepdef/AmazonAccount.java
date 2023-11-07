package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nextechitc.Pageobjectmodel.AmazonAccountPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonAccount {

	WebDriver driver;
	
	
	@Given("^user visits amazon homepage$")
	public void user_visits_amazon_homepage() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
				
		//how to open URL
		driver.get("https://www.amazon.com/");
		    
	    
	}

	@When("^user go Account and lists and clicks Accounts$")
	public void user_go_Account_and_lists_and_clicks_Accounts() throws Throwable {
		
		Actions obj=new Actions(driver);
		AmazonAccountPOM actlist=new AmazonAccountPOM(driver);
		obj.moveToElement(actlist.Account()).build().perform();
		actlist.Lists().click();
	    
	}

	@Then("^user should able to see the Amazom accounts$")
	public void user_should_able_to_see_the_Amazom_accounts() throws Throwable {
	    	}


}
