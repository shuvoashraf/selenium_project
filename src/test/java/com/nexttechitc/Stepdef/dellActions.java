package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nextechitc.Pageobjectmodel.dellActionsPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dellActions {
	
	WebDriver driver;
	
	@Given("^Users visit dell home page$")
	public void users_visit_dell_home_page() throws Throwable {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("https://www.dell.com/en-us");
	Thread.sleep(2000);    
	}

	@When("^Users go to Services dropdown menu and able to see View All services$")
	public void users_go_to_Services_dropdown_menu_and_able_to_see_View_All_services() throws Throwable {
	    
		Actions act=new Actions(driver);
		dellActionsPOM obj=new dellActionsPOM(driver);
		
		act.moveToElement(obj.Services()).build().perform();
		obj.Allservices().click();
		Thread.sleep(2000);
	}

	@Then("^Users redirects to Services portfolio$")
	public void users_redirects_to_Services_portfolio() throws Throwable {
	    	}


}
