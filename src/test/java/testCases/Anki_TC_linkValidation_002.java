package testCases;

import org.testng.annotations.Test;

import com.passIndia.pageObject.Anki_homepage;

import Utilities.BaseTest;

public class Anki_TC_linkValidation_002 extends BaseTest {
	@Test
	public void linkValidation() {
		Anki_homepage hp = new Anki_homepage(driver);
		hp.linkValidation(hp.NewApplication);
		hp.linkValidation(hp.ReissuePassport);
		hp.linkValidation(hp.TrackApplication);
		hp.linkValidation(hp.RequiredDocuments);
		hp.linkValidation(hp.Faq);
		hp.linkValidation(hp.Fees);
		hp.linkValidation(hp.ContactUs);
	}

}
