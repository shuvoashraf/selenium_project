package com.nextechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dellActionInfraPOM {
	
	
    WebDriver driver;
	
	public  dellActionInfraPOM (WebDriver driver) {  
		 this.driver=driver;        
		   PageFactory.initElements(driver, this);
		   }
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/button/span") 
	
	WebElement IT_Infrastructure;
	   
	 public WebElement Infrasrtucture(){
		return IT_Infrastructure;
		
	 }
	 
	 
	 @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[8]/a")
		
	 WebElement Click_Developers_and_WebOps;
	   
	 public WebElement WebOps(){
		return Click_Developers_and_WebOps;

	 }


}
