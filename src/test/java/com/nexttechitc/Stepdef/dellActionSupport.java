package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nextechitc.Pageobjectmodel.dellActionSupportPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dellActionSupport {
	
	
	WebDriver driver;
	
	
	@Given("^user visit dell home page\\.$")
	public void user_visit_dell_home_page() throws Throwable {
	    
	    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.dell.com/en-us");
		Thread.sleep(2000);    
		}

	

	@When("^user go to support dropdown menu and able to see support home\\.$")
	public void user_go_to_support_dropdown_menu_and_able_to_see_support_home() throws Throwable {
		
		Actions act=new Actions(driver);
		dellActionSupportPOM obj=new dellActionSupportPOM(driver);
		act.moveToElement(obj.Support()).build().perform();
		obj.supportH().click();
		
	    
	}

	@Then("^user redirects to support home portfolio\\.$")
	public void user_redirects_to_support_home_portfolio() throws Throwable {
	    
	}

}
