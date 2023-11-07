package com.nextechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonsearchPOM {
	
    	WebDriver driver;       //this driver is a global variable//store data globally//access anywhere
	   
    	public  AmazonsearchPOM (WebDriver driver) {  //this driver is local driver
		this.driver=driver;     //both are same//this means hi//local driver allow global driver for access
		   PageFactory.initElements(driver, this);
		   }
		 
    	//constructor is not a method but a special type of method
	    //1. where constructor name same as class name
	    //2.there is no return type
	    //but regular method name is different from class name

		
    	@FindBy(id="twotabsearchtextbox")
		 WebElement Type_amazonsearch;
		   
		 public WebElement Amazonsearch(){
			return Type_amazonsearch;
			
		 }
		 
		 //@FindBy(id="nav-search-submit-button")
		 @FindBy(xpath="//input[@id=\"nav-search-submit-button\"]")
			
		 WebElement Click_searchicon;
		   
		 public WebElement searchicon(){
			return Click_searchicon;

		 }

}
