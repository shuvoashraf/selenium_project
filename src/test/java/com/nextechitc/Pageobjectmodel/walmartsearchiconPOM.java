package com.nextechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class walmartsearchiconPOM {
	

	WebDriver driver;                     
	   
	public  walmartsearchiconPOM (WebDriver driver) {  
	   this.driver=driver;           
	   PageFactory.initElements(driver, this);
	   }
	
    @FindBy (xpath="//input[@type=\"search\"]")
    WebElement type_walmartsearch;
    
    public WebElement walmartsearch (){
    	return type_walmartsearch;
    }
    
     @FindBy (xpath="//input[@type=\"search\"]")
     WebElement click_walmartsearchicon;
     
     public WebElement walmartsearchicon() {
    	 return click_walmartsearchicon;
     }
}


