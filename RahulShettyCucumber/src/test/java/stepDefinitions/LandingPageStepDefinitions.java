package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinitions {
	
	public WebDriver driver;
	TestContextSetup testContextSetup;
	public String fullpName;
	LandingPage landingPage;
	
	public LandingPageStepDefinitions(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.landingPage =testContextSetup.pageObjectManager.getLandingPage();
	}
	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
			
			Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
	}

		@When("^user searched with Shortname (.+) and extracted actual name of product$")
		public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName ) throws InterruptedException {
			
			landingPage.searchItem(shortName);
			Thread.sleep(5000);
			System.out.println(shortName);
			String prodName=landingPage.getProductName(shortName);
			System.out.println(prodName);
			
			testContextSetup.fullpName = prodName.split("-")[0].trim();
			
			System.out.println(fullpName);
				
	}
	

}
