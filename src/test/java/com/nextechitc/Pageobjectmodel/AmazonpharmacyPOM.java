package com.nextechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonpharmacyPOM {
	
	WebDriver driver;
	
	public AmazonpharmacyPOM(WebDriver driver) {
		this.driver=driver;        
		   PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@class=\"nav-search-scope nav-sprite\"]")
	WebElement click_all;
	public WebElement DropAll() {
		return click_all;
	}
	@FindBy(name="url")
	public WebElement select_Amazonpharmacy;
	

}
