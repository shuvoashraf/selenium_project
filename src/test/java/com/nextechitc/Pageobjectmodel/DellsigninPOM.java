package com.nextechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellsigninPOM {
	
    WebDriver driver;
	
	public  DellsigninPOM (WebDriver driver) {  
		 this.driver=driver;        
		   PageFactory.initElements(driver, this);
		   }
	
	@FindBy(xpath="//span[@id=\"um-si-label\"]") 
	
	WebElement Signin;
	   
	 public WebElement go_signin(){
		return Signin;
		
	 }
	 
	 
	 @FindBy(xpath="//a[@href=\"//www.dell.com/Identity/global/LoginOrRegister/98254675-AC6F-47D9-A7E4-4537724F135D?c=us&l=en&r=us&s=corp&redirectUrl=\"]")
		
	 WebElement Click_account;
	   
	 public WebElement go_acccount(){
		return Click_account;

	 }

}
