package com.nextechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonAccountPOM {
	
	WebDriver driver;
	
	public AmazonAccountPOM(WebDriver driver) {
		this.driver=driver;        
		   PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]/span")
	WebElement AccountList;
	public WebElement Account() {
		return AccountList;
	}

	@FindBy(xpath="//*[@id=\"nav-al-your-account\"]/a[1]/span")
	WebElement click_List;
	public WebElement Lists() {
		return click_List;
	}

}
