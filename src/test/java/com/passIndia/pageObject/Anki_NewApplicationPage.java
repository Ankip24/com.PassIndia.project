package com.passIndia.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Anki_NewApplicationPage {
	public static WebDriver driver; //= ObjectPage.getWebDriver();
	//ExtentTest test = ObjectPage.getExtentTest();

	// Initialization
	public Anki_NewApplicationPage(WebDriver rdriver) {
	
		driver = rdriver;
		PageFactory.initElements(rdriver, this);// Page Factory -->init element 
	}

	// Declaration
	// New Application link
	@FindBy(xpath = "(//a[@href='new-passport.php'])[1]")
	WebElement newapplication;
	
	@FindBy(xpath="//select[@name='1_application_for']")
	WebElement applicationfor;

	@FindBy(xpath="(//select[@class='form-control select'])[1]")
	WebElement TypeofApplication;

	// Usage
	// enguiry form
	public void selectapplication() throws InterruptedException {
		Thread.sleep(3000);
		newapplication.click();
	}
		
		public void dropapplicationfor() {
			
			Select select = new Select(applicationfor);
			select.selectByVisibleText("New / Fresh Passport");
		}
		public void typeappliction() {
			Select appselect=new Select(TypeofApplication);
			appselect.selectByVisibleText("Tatkaal");
		}
		
		
		
	}

