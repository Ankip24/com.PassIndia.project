package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.passIndia.pageObject.Anki_RissuePassportPage;

import Utilities.BaseTest;

public class Anki_TC_Rissuepassport_005 extends BaseTest{

	
    
	@Test
	public void risuuepa() throws InterruptedException {
		
		//ExtentTest test = ObjectPage.getExtentTest();
	    //test.log(Status.INFO, "Enquiry Form Test");
		
		
		//RissuePassportPage rp = new RissuePassportPage(driver); // object create for home page 
		Anki_RissuePassportPage rp=new Anki_RissuePassportPage (driver);// driver is declare public in baseTestclass 
		rp.selectReissuelink(); // object. refrence of method name of homepage 
		Thread.sleep(1000);
		//test.log(Status.PASS,"Enter Name");
		
		
	}
}

	


