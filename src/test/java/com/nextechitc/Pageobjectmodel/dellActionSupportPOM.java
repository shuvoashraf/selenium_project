package com.nextechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dellActionSupportPOM {
	
    WebDriver driver;
	
	public  dellActionSupportPOM (WebDriver driver) {  
		 this.driver=driver;        
		   PageFactory.initElements(driver, this);
		   }
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[5]/button/span") 
	
	WebElement Supportmenu;
	   
	 public WebElement Support(){
		return Supportmenu;
		
	 }
	 
	 
	 @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[5]/ul/li[3]/a")
		
	 WebElement Click_Support_Home;
	   
	 public WebElement supportH(){
		return Click_Support_Home;

	 }


}
