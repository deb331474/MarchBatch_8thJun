package in.debasish.testCases;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import in.debasish.pageObjects.AddanewAddressPage;
import in.debasish.pageObjects.ConfirmSkipPopUpPage;
import in.debasish.pageObjects.DashboardPage;
import in.debasish.pageObjects.HomePage;
import in.debasish.pageObjects.LoginPage;
import in.debasish.pageObjects.RegAfterLoginPage;
import in.debasish.testBase.BaseTest;

public class AddressBookTest extends BaseTest{

	@Test
	public void addNewAddress() throws InterruptedException {
		
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
		DashboardPage dp=new DashboardPage(driver);
		dp.clickOnUserprofileLink();
		dp.clickOnDashboardLink();
		dp.clickOnManageAddressLink();
		AddanewAddressPage addanewAddressPage=dp.gotoaddanewAddressPage();
		addanewAddressPage.setFirstName("debasish");
		addanewAddressPage.setLastName("pruseth");
		addanewAddressPage.setCompanyName("impelsys");
		addanewAddressPage.setCountryName(" 201-555-0123");
		addanewAddressPage.setStreetAddress("Laida");
		addanewAddressPage.setCity("Sambalpur");
		addanewAddressPage.setCountry();
		addanewAddressPage.setState();
		addanewAddressPage.setZipcode("12345");
		Thread.sleep(5000);
		addanewAddressPage.clickSaveBtn();
		Thread.sleep(5000);
		Assert.assertEquals("You saved the address.",addanewAddressPage.getMessage());
		Thread.sleep(3000);
		
	}
	
}
