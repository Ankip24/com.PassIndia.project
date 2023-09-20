package globalObject;



import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

public class ObjectPage {
	// Objetct 
	
	/* public sataic void driver This variable is declared in a class (DriverInit) and initialized 
	 in "@BeforeClass" of various Test Plans(Test Classes). The initialized variable (driver)
	  will be used across the project 
	in various re-usable functions and @test methods.*/
	public static WebDriver driver;
	
	// when we get on HTML page report which one connect through the Objecttest which extends with ExtentTest
	public static ExtentTest objextenttest;
	
	public void setWebDriver(WebDriver driver) {
		
		
		ObjectPage.driver=driver;     
	}
	public static WebDriver getWebDriver() {
		return driver;
	}
	public static void setExtentTest(ExtentTest objextentTest) {
		ObjectPage.objextenttest= objextenttest;
	}
	
	public static ExtentTest getExtentTest() {
		return objextenttest;
	}

}
