package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import utils.TestContextSetup;

public class OffersPageStepDefinitions {
	
	
	TestContextSetup testContextSetup;
	OffersPage offersPage;
	public String offerPageProductName;
	
	public OffersPageStepDefinitions(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.offersPage=testContextSetup.pageObjectManager.getOffersPage();
	
	}
	
	
	
	
	@Then("^user searched for (.+) shortname in offers page$")
	public void user_searched_for_same_shortname_in_offers_page(String shortName) throws InterruptedException {
	    //offer pafe->enter_>grab text

		switchToOffersPage();
		//OffersPage offersPage  =testContextSetup.pageObjectManager.getOffersPage();
		offersPage.searchItem(shortName);
		Thread.sleep(2000);
		 offerPageProductName = offersPage.getProductName();
		 System.out.println(offerPageProductName);
		
			
	}

	public void switchToOffersPage() throws InterruptedException
	{
		//if switched to offer page-> skip below part
		LandingPage landingPage  =testContextSetup.pageObjectManager.getLandingPage();
		landingPage.selectTopDealsPage();
		testContextSetup.genericUtils.SwitchWindowToChild();
		Thread.sleep(5000);
		//explicit wait, parse string
		
		
	}
	@Then("validate product name in offers page matches with Landing Page")
	public void validate_product_name_in_Offers_page() throws InterruptedException
	{
		
		Assert.assertEquals(testContextSetup.fullpName,offerPageProductName);
	}

}
