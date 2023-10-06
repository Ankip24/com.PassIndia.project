package testCases;

import org.testng.annotations.Test;

import com.passIndia.pageObject.Vaibhavi_Homepage_Pageobject;

import Utilities.BaseTest;

public class Vaibhavi_TC_Enquiryform extends BaseTest {
	
  @Test
  
  public void FirstTest() {
	  Vaibhavi_Homepage_Pageobject g = new Vaibhavi_Homepage_Pageobject(driver);
	  g.enterName();
	  g.enterEmail();
  }
}
