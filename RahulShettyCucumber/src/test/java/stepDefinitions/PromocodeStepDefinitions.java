package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.PromocodePage;
import utils.TestContextSetup;

public class PromocodeStepDefinitions {
	
	public WebDriver driver;
	public PromocodePage promocodePage;
	TestContextSetup testContextSetup;
	
	
	public PromocodeStepDefinitions(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.promocodePage = testContextSetup.pageObjectManager.getPromoCode();
	}
	
	@Then("^User enters (.+) promocode in the cart page and get the error message$")
	public void user_enters_promocode_in_the_cart_page_and_get_the_error_message(String promoCode) throws InterruptedException {
		
	   promocodePage.enterPromoCode(promoCode);
	   promocodePage.clickOnapplyBtn();
	   Thread.sleep(3000);
	  Assert.assertEquals("Invalid code ..!", promocodePage.getErrorMsg());
	   
		

	}

}
