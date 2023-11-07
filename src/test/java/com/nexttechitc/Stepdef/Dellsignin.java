package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nextechitc.Pageobjectmodel.DellsigninPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dellsignin {
	

WebDriver driver;	

@Given("^User go to dell home page$")
public void user_go_to_dell_home_page() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("https://www.dell.com/en-us");
    
}

@When("^User go to sign in  dropdown menu and click Accounts$")
public void user_go_to_sign_in_dropdown_menu_and_click_Accounts() throws Throwable {
	
	Actions obj=new Actions(driver);
	DellsigninPOM dellAC=new DellsigninPOM(driver);
	obj.moveToElement(dellAC.go_signin()).build().perform();
	dellAC.go_acccount().click();
    
}

@Then("^User redirects to Accounts portfolio$")
public void user_redirects_to_Accounts_portfolio() throws Throwable {
    }


}
