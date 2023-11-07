package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nextechitc.Pageobjectmodel.dellActionwarentPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class delActionwarent {
	
	WebDriver driver;
	
	@Given("^users visit dell home page\\.$")
	public void users_visit_dell_home_page() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.dell.com/en-us");
		Thread.sleep(2000);  
	}

	@When("^users go to services dropdown menu and able to see warranty extension\\.$")
	public void users_go_to_services_dropdown_menu_and_able_to_see_warranty_extension() throws Throwable {
	 
		Actions act=new Actions(driver);
		dellActionwarentPOM warrant=new dellActionwarentPOM(driver);
		act.moveToElement(warrant.Service()).build().perform();
		warrant.warranty().click();
		}

	@Then("^users redirects to warranty extension portfolio\\.$")
	public void users_redirects_to_warranty_extension_portfolio() throws Throwable {
	    
	}



}
