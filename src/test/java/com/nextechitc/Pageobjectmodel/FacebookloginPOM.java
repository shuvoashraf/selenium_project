package com.nextechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookloginPOM {

	WebDriver driver;                         
   
	public  FacebookloginPOM (WebDriver driver) { 
	   this.driver=driver;            
	   PageFactory.initElements(driver, this);
	   
	}
	
	@FindBy(xpath="//input[@name=\"email\"]")
	WebElement type_email;
	public WebElement fb() {
	return type_email;
	  }
	@FindBy(xpath="//*//input[@id=\"pass\"]")
	WebElement type_pw;
	public WebElement fb1() {
	return type_pw;
	   }
	    
	@FindBy(xpath="//button[@data-testid=\"royal_login_button\"]")
	WebElement click_login;
	public WebElement fb2() {
	return  click_login;
	}

	   
	
}



