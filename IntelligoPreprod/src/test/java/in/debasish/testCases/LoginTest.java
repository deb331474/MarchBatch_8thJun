package in.debasish.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import in.debasish.pageObjects.ConfirmSkipPopUpPage;
import in.debasish.pageObjects.HomePage;
import in.debasish.pageObjects.LoginPage;
import in.debasish.pageObjects.RegAfterLoginPage;
import in.debasish.testBase.BaseTest;

public class LoginTest extends BaseTest {
	
	@Test
	public void loginTest() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.clickOnSignjInLink();
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername("qaregion@gmail.com");
		lp.enterPassword("Welcome1#");
		lp.clickOnSignButton();
		RegAfterLoginPage rft=new RegAfterLoginPage(driver);
		AssertJUnit.assertEquals("Complete Your Registration", rft.getMessage());
		rft.clickonSkiplink();
		ConfirmSkipPopUpPage csp=new ConfirmSkipPopUpPage(driver);
		csp.clickonSkipNow();
		
	}

}
