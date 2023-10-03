package testCases;

import org.testng.annotations.Test;

import com.passIndia.pageObject.Anki_NewApplicationPage;

import Utilities.BaseTest;

public class Anki_TC_newapplication_006 extends BaseTest{
	  
		@Test
		public void risuuepa() throws InterruptedException {
			
			//ExtentTest test = ObjectPage.getExtentTest();
		    //test.log(Status.INFO, "Enquiry Form Test");
			
			
			//RissuePassportPage rp = new RissuePassportPage(driver); // object create for home page 
			Anki_NewApplicationPage ap=new Anki_NewApplicationPage(driver);// driver is declare public in baseTestclass 
			ap.selectapplication(); // object. refrence of method name of homepage 
			Thread.sleep(1000);
			
			ap.dropapplicationfor();
			Thread.sleep(1000);
			
			 
			ap.typeappliction(); // object. refrence of method name of homepage 
			Thread.sleep(1000);
			
			
			
		}

}

