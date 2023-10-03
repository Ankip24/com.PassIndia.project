package com.passIndia.pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Anki_RissuePassportPage {
	public static WebDriver driver; //= ObjectPage.getWebDriver();
	//ExtentTest test = ObjectPage.getExtentTest();

	// Initialization
	public Anki_RissuePassportPage(WebDriver rdriver) {
		this.driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// Declaration
	// enquiry form
	@FindBy(xpath = "(//a[@href='reissue-passport.php'])[1]")
	WebElement reissuePassport;

	

	// Usage
	// enguiry form
	public void selectReissuelink() throws InterruptedException {
		Thread.sleep(3000);
		reissuePassport.click();
		
		
	}

	
	
	

	
	
	}

	


	


