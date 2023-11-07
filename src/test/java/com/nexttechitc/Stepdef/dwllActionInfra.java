package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nextechitc.Pageobjectmodel.dellActionInfraPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dwllActionInfra {
	
	WebDriver driver;
	
	@Given("^User visit dell home page\\.$")
	public void user_visit_dell_home_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.dell.com/en-us");
		Thread.sleep(2000);    
	    
	}

	@When("^User go to IT Infrastructure dropdown menu and able to see Developers and DevOps$")
	public void user_go_to_IT_Infrastructure_dropdown_menu_and_able_to_see_Developers_and_DevOps() throws Throwable {
	    
		Actions act=new Actions(driver);
		dellActionInfraPOM debops=new dellActionInfraPOM(driver);
		act.moveToElement(debops.Infrasrtucture()).build().perform();
	    
		debops.WebOps().click();
		
	}

	@Then("^User redirects to Developers and DevOps portfolio$")
	public void user_redirects_to_Developers_and_DevOps_portfolio() throws Throwable {
	    
	}

}
