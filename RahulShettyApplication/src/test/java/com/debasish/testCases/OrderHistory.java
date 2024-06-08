package com.debasish.testCases;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.debasish.pageObjects.CartPage;
import com.debasish.pageObjects.CheckoutPage;
import com.debasish.pageObjects.ConfirmationPage;
import com.debasish.pageObjects.OrderHistoryPage;
import com.debasish.pageObjects.ProductCataloguePage;
import com.debasish.testComponents.BaseTest;

public class OrderHistory extends BaseTest{
	
	//String productName = "zara coat 3";
	
	@Test(dataProvider = "getData")
	public void orderHistory(HashMap<String, String> input) throws InterruptedException {
		ProductCataloguePage productCataloguePage=landingPage.loginApplication(input.get("email"),input.get("password"));
		List<WebElement> products=productCataloguePage.getProductList();
		productCataloguePage.addProductToCart(input.get("product"));
		
		CartPage cartPage=productCataloguePage.goToCartPage();
        Boolean match=cartPage.verifyProductDisplay(input.get("product"));
        Assert.assertTrue(match);
        
        CheckoutPage checkoutPage=cartPage.goToCheckout();
        checkoutPage.selectCountry("india");
        ConfirmationPage confirmationPage = checkoutPage.submitOrder();
		String confirmMessage = confirmationPage.getConfirmationMessage();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		
		OrderHistoryPage orderHistoryPage=confirmationPage.gotoHistoryPage();
		Thread.sleep(5000);
		orderHistoryPage.getAllOrders();
		orderHistoryPage.getOrdersForProduct(input.get("product"));
		orderHistoryPage.getCountOfParticularOrders(input.get("product"));
		
	}
	
	@DataProvider
	public Object[][] getData() throws IOException{
		
		//return new Object[][]  {{"rupesh.debasish279@gmail.com","Debudon@211","zara coat 3"},{"deb331474@gmail.com","Debudon@211","ADIDAS ORIGINAL"}};
//		HashMap<String, String> map=new HashMap<String, String>();
//		map.put("email", "rupesh.debasish279@gmail.com");
//		map.put("password", "Debudon@211");
//		map.put("product","zara coat 3");
//		
//		HashMap<String, String> map1=new HashMap<String, String>();
//		map1.put("email", "deb331474@gmail.com");
//		map1.put("password", "Debudon@211");
//		map1.put("product","ADIDAS ORIGINAL");
//		return new Object[][] {{map},{map1}};
		
		
		List<HashMap<String, String>> data=getJsonDataToMap(System.getProperty("user.dir")+"//src//main//java//com//debasish//data//PurchaseOrder.json");
		
		return new Object[][] {{data.get(0)},{data.get(1)}};
		
		
		//System.getProperty("user.dir")+"//src//main//java//com//debasish//data//PurchaseOrder.json")
		
//		List<HashMap<String,String>> data=getJsonDataToMap(System.getProperty("user.dir")+"//src//main//java//com//debasish//data//PurchaseOrder.json");
//		
//		return new Object[][] {{data.get(0),data.get(1)}};
	}
}
