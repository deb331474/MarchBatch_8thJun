package com.debasish.pageObjects;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.debasish.AbstractComponents.AbstractComponent;

public class OrderHistoryPage extends AbstractComponent{
	
	WebDriver driver;

	public OrderHistoryPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(css=".ng-star-inserted")
	List<WebElement> allOrders;
	
	
	@FindBy(xpath ="//table[@class='table table-bordered table-hover ng-star-inserted']//tr")
    List<WebElement> allTabledata;
	
	
	@FindBy(xpath = "//table[@class='table table-bordered table-hover ng-star-inserted']//tr//td[2]")
	List<WebElement> productNames;
	
	
	@FindBy(xpath = "//table[@class='table table-bordered table-hover ng-star-inserted']//tr")
	List<WebElement> ordersId;
	
	
	@FindBy(xpath = "//tbody/tr[1]/td[5]/button[1]")
	WebElement viewButton;
	
	
	public List<WebElement> getAllOrders(){
		for(WebElement ws:allOrders) {
			System.out.println(ws.getText());
			
		}
		return allOrders;
	}
	public WebElement getInvoicetbyName(String productName){
			 WebElement prod= productNames.stream().filter(produc -> produc.getText().equalsIgnoreCase(productName)).findFirst().orElse(null);
			 return prod;
		}
	
	public List<WebElement>  getOrdersForProduct(String productName) {

		List<WebElement> filterdOrders = getAllOrders().stream().filter(order->order.getText().contains(productName)).collect(Collectors.toList());
		if(filterdOrders.isEmpty()) {
			System.out.println("No orders found for the product: "+productName);
		}
		else {
			for(WebElement order:filterdOrders) {
				System.out.println(order.getText());
			}
		}
		return filterdOrders;
	}
	
	public long getCountOfParticularOrders(String productName) {
		long orderCount=getAllOrders().stream().filter(prod->prod.getText().contains(productName)).count();
		System.out.println("Total orders found for product " + productName + ": " + orderCount);
		return orderCount;
	}
	
	public WebElement deleteAParticularOrder(String dName){
	  WebElement allOrder=(WebElement) getAllOrders().stream().filter(ord->ord.getText().contains(dName));
	  return allOrder;
		
	}
	
	
		
	   
	}
