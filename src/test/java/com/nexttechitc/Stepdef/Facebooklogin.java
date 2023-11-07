package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.nextechitc.Pageobjectmodel.FacebookloginPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebooklogin {
	
	WebDriver driver;
	
	@Given("^Users visits facebook homepage$")
	public void users_visits_facebook_homepage() throws Throwable {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");    
	}

	@When("^Users type \"([^\"]*)\" \"([^\"]*)\" and click fb login button$")
	public void users_type_and_click_fb_login_button(String arg1, String arg2) throws Throwable {
		
		FacebookloginPOM facebook=new FacebookloginPOM(driver);
		
		facebook.fb().sendKeys(arg1);
		facebook.fb1().sendKeys(arg2);
		facebook.fb2().click();
	    
	}

	@Then("^Users should able to facebook login$")
	public void users_should_able_to_facebook_login() throws Throwable {
	    
	}


}
