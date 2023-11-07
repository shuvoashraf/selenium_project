package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nextechitc.Pageobjectmodel.fbSignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fbSignup {
	
	
	WebDriver driver;
	
	
	@Given("^user visiting facebook url$")
	public void user_visiting_facebook_url() throws Throwable {
	
		try {
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	driver.get("https://www.facebook.com/reg/");
	
	driver.manage().window().maximize();
		}
		catch(Exception e) {
			System.out.println("browser not opening");
		}
	}

	@When("^user enter \"([^\"]*)\"  \"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	 
		// use try catch block
		try {
		fbSignupPOM FB=new fbSignupPOM(driver);
		
		FB.facebok().sendKeys(arg1);
		FB.facebok2().sendKeys(arg2);
		FB.facebok3().sendKeys(arg3);
		FB.facebok4().sendKeys(arg4);
		WebDriverWait wait=new WebDriverWait(driver,30);
		}
		catch (Exception e){
			System.out.println("element not found");
			
		}
		
	}

	@Then("^user select dropdown Month and dropdown Day and dropdown Year and select gender$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year_and_select_gender() throws Throwable {
		
		try {
		fbSignupPOM FB=new fbSignupPOM(driver);
		
		Select drop=new Select(FB.click_month);
		drop.selectByVisibleText("Jan");
		
		Select drop2=new Select(FB.click_day);
		drop2.selectByValue("5");
		
		Select drop3=new Select(FB.click_year);
		drop3.selectByVisibleText("2023");
		
		FB.facebok5().click();
		
		WebDriverWait wait=new WebDriverWait(driver,30);	}
		
		catch(Exception e){
		}
		
	    	}

}
