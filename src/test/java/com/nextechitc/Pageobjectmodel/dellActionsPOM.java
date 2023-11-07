package com.nextechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dellActionsPOM {
	
	WebDriver driver;
	
	public  dellActionsPOM (WebDriver driver) {  
		 this.driver=driver;        
		   PageFactory.initElements(driver, this);
		   }
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/button/span") 
	
	WebElement Services;
	   
	 public WebElement Services(){
		return Services;
		
	 }
	 
	 
	 @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/ul/li[3]/a")
		
	 WebElement Click_ViewAllservices;
	   
	 public WebElement Allservices(){
		return Click_ViewAllservices;

	 }

}
