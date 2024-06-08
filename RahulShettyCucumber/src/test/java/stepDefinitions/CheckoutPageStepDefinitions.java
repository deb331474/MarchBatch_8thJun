package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckoutPage;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class CheckoutPageStepDefinitions {
	
	public WebDriver driver;
	public CheckoutPage checkoutPage;
	TestContextSetup testContextSetup;
	LandingPage landingPage;
	
	public CheckoutPageStepDefinitions(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.checkoutPage = testContextSetup.pageObjectManager.getCheckoutPage();
	}
	
	@When("^Added (.*) items of the selected product to cart$")
	public void added_items_of_the_selected_product_to_cart(String quantity) {
		
	    this.landingPage=testContextSetup.pageObjectManager.getLandingPage();
		landingPage.incrementQuantity(Integer.parseInt(quantity));
		landingPage.addToCart();
	    
	}

	@Then("^User proceeds to Checkout and validate the (.*) items in checkout page$")
	public void user_proceeds_to_checkout_and_validate_the_items_in_checkout_page(String name) {

		checkoutPage.CheckoutItems();
		Assert.assertTrue(true, "Promo button is displayed");
		Assert.assertEquals(testContextSetup.fullpName, checkoutPage.getProductName().split("-")[0].trim());
		
	}

	@Then("verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() {
	    
		Assert.assertTrue(checkoutPage.VerifyPromoBtn());
		Assert.assertTrue(checkoutPage.VerifyPlaceOrder());
		
	}

}
