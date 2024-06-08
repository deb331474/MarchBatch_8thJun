package in.debasish.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.net.SocketException;
import org.testng.Assert;
import org.testng.annotations.Test;

import in.debasish.pageObjects.AllProductsListingPage;
import in.debasish.pageObjects.CheckoutTelePage;
import in.debasish.pageObjects.ConfirmSkipPopUpPage;
import in.debasish.pageObjects.HomePage;
import in.debasish.pageObjects.LoginPage;
import in.debasish.pageObjects.PortfolioDetalsPage;
import in.debasish.pageObjects.RegAfterLoginPage;
import in.debasish.pageObjects.ViewCartTelePage;
import in.debasish.pageObjects.ViewDetailsPage;
import in.debasish.testBase.BaseTest;

public class PaginationTest extends BaseTest{
	
	
	@Test
	public void paginationNavigation() throws InterruptedException,SocketException {
		
		logger.info("Starting the login process....");
		HomePage hp=new HomePage(driver);
		hp.clickOnSignjInLink();
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername("qaregion@gmail.com");
		lp.enterPassword("Welcome1#");
		lp.clickOnSignButton();
		RegAfterLoginPage rft=new RegAfterLoginPage(driver);
		AssertJUnit.assertEquals("Complete Your Registration", rft.getMessage());
		logger.info("Login Completed");
		rft.clickonSkiplink();
		
		ConfirmSkipPopUpPage csp=new ConfirmSkipPopUpPage(driver);
		csp.clickonSkipNow();
		logger.info("Login Completed");
		
		PortfolioDetalsPage pdp=new PortfolioDetalsPage(driver);
		pdp.clickOnPortfolioMenu();
		pdp.clickOnProductsLink();
		logger.info("Clicked on the PortfolioDetails link");
		AllProductsListingPage aplp=new AllProductsListingPage(driver);
		aplp.selectItemsPerPage("10");
		try {
		aplp.navigateThroughallthePages();
		logger.info("Pagination completed");
		}
		catch (Exception e) {
			e.getMessage();
		}
		
	}
	
	
	
	

}
