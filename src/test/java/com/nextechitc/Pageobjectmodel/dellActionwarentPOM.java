package com.nextechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dellActionwarentPOM {
	
	
    WebDriver driver;
	
	public  dellActionwarentPOM (WebDriver driver) {  
		 this.driver=driver;        
		   PageFactory.initElements(driver, this);
		   }

	
	
    @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/button/span") 
	
	WebElement Services;
	   
	 public WebElement Service(){
		return Services;
		
	 }
	 
	 
	 @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/ul/li[4]/a")
		
	 WebElement click_warranty_extension;
	   
	 public WebElement warranty(){
		return click_warranty_extension;

	 }
}
