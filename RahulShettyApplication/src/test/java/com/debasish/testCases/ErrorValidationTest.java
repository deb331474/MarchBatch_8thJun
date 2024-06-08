package com.debasish.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.debasish.pageObjects.CartPage;
import com.debasish.pageObjects.ProductCataloguePage;
import com.debasish.testComponents.BaseTest;

public class ErrorValidationTest extends BaseTest{
	
	
	@Test()
	public void getErrorMessage() {
		landingPage.loginApplication("rupesh.debasish279@gmail.com", "debudo@211");
		AssertJUnit.assertEquals("Incorrect email or password.",landingPage.getErrorMessage());
		
	}
	
	@Test
	public void errorProductValidation() throws InterruptedException {
		
		String productName="ZARA COAT 3";
		ProductCataloguePage productCataloguePage= landingPage.loginApplication("rupesh.debasish279@gmail.com", "Debudon@211");
		List<WebElement> products=productCataloguePage.getProductList();
		productCataloguePage.addProductToCart(productName);
		CartPage cartPage=productCataloguePage.goToCartPage();
		boolean match= cartPage.verifyProductDisplay("Zara jara");
		AssertJUnit.assertFalse(match);
		
		
		
		
	}

}
