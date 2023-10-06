package com.passIndia.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vaibhavi_Homepage_Pageobject {
	public static WebDriver driver; //= ObjectPage.getWebDriver();
	//ExtentTest test = ObjectPage.getExtentTest();
	
	
	//initialization  //we need to declare constructor here
	public Vaibhavi_Homepage_Pageobject(WebDriver rdriver) {
		this.driver = rdriver;
		PageFactory.initElements(rdriver, this);  //
	}
	
	
	//declaration //we need to declare xpath here
	@FindBy(xpath = "//input[@id='name']")
	WebElement txtName;
	@FindBy (xpath = "//input[@id='email']")
	WebElement txtEmail;
	
	
	
	
	//usage     //we need right syntax here

	public void enterName() {
		txtName.sendKeys("vaibhavi");
	}
	
	public void enterEmail() {
		txtEmail.sendKeys("navaibhavi123@gmail.com");
	}
	
}
