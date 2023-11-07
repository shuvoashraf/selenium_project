package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nextechitc.Pageobjectmodel.AmazonpharmacyPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonPharmacy {
	
	WebDriver driver;
	
	@Given("^users visits amazon homepage$")
	public void users_visits_amazon_homepage() throws Throwable {
    try {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	driver = new ChromeDriver();
    
	// Implicitly wait (outside of application)
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	//how to open URL
	driver.get("https://www.amazon.com/gp/bestsellers/?ref_=nav_cs_bestsellers");
	
	//Maximize Window
	driver.manage().window().maximize();
    }
    
	catch(Exception e){
		System.out.println("amazon search option");
    	 }
	}

	@When("^user click All and select Amazom Pharmacy$")
	public void user_click_All_and_select_Amazom_Pharmacy() throws Throwable {
	
		// java try and catch use 
		try {
		AmazonpharmacyPOM pharmacy=new AmazonpharmacyPOM(driver);
		pharmacy.DropAll().click();
		
		Select pharma=new Select(pharmacy.select_Amazonpharmacy);
		pharma.selectByVisibleText("Amazon Pharmacy");
		
		//explicitly wait inside application
		WebDriverWait wait=new WebDriverWait(driver,30);
	}
	catch(Exception e) {
		System.out.println("amazon pharmach option");
		}
	}
	    	

	@Then("^user should able to see the Amazom Pharmacy items$")
	public void user_should_able_to_see_the_Amazom_Pharmacy_items() throws Throwable {
	    


	}
}
