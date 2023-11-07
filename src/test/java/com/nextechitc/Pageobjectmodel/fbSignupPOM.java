package com.nextechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbSignupPOM {
	
	WebDriver driver;
	
	public fbSignupPOM (WebDriver driver) { 
		   this.driver=driver;            
		   PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath="//input[@name=\"firstname\"]")
	WebElement enter_firstname;
	public WebElement facebok() {
	return enter_firstname;
	  }
	@FindBy(xpath="//input[@name=\"lastname\"]")
	WebElement enter_lastname;
	public WebElement facebok2() {
	return enter_lastname;
	   }
	@FindBy(xpath="//input[@name=\"reg_email__\"]")
	WebElement enter_email;
	public WebElement facebok3() {
	return enter_email;
	  }
	@FindBy(xpath="//input[@name=\"reg_passwd__\"]")
	WebElement enter_pw;
	public WebElement facebok4() {
	return enter_pw;
	   }
	@FindBy(xpath="//select[@name=\"birthday_month\"]")
    public WebElement click_month;
		
	@FindBy(xpath="//select[@name=\"birthday_day\"]")
	public WebElement click_day;
		
	@FindBy(xpath="//select[@aria-label=\"Year\"]")
	public WebElement click_year;
	
	@FindBy(xpath="//input[@value=\"1\"]")
	WebElement click_gender;
	public WebElement facebok5() {
	return click_gender;
	


	
}}
