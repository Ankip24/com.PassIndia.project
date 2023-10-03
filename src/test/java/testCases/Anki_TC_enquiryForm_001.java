	package testCases;

	import org.testng.annotations.Test;

	import com.passIndia.pageObject.Anki_homepage;

	import Utilities.BaseTest;

	public class Anki_TC_enquiryForm_001 extends BaseTest // testnottashion perform a cycle @before @test @afterclass---Communiaction happens help of extend class
	{
		
	    
		@Test
		public void FirstPage() throws InterruptedException {
			
			//ExtentTest test = ObjectPage.getExtentTest();
		    //test.log(Status.INFO, "Enquiry Form Test");
			
			Anki_homepage hp = new Anki_homepage(driver); // object create for home page 
			
			hp.enterName(); // object. refrence of method name of homepage 
			Thread.sleep(1000);
			//test.log(Status.PASS,"Enter Name");
			
			hp.email();
			Thread.sleep(1000);
			//test.log(Status.PASS,"Enter Email");
			
			hp.mobile();
			Thread.sleep(1000);
			//test.log(Status.PASS,"Enter Mobile No");
			
			hp.select();
			Thread.sleep(1000);
			//test.log(Status.PASS,"Select Drop Down");
			
			hp.submit();
			//Thread.sleep(2000);
			//test.log(Status.PASS,"Enquiry Form Submited");
		}
	}


}
