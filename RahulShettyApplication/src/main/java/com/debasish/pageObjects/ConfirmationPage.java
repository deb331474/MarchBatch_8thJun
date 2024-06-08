package com.debasish.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.debasish.AbstractComponents.AbstractComponent;


public class ConfirmationPage extends AbstractComponent{
	
	WebDriver driver;

	public ConfirmationPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".hero-primary")
	WebElement confirmationMessage;
	
	@FindBy(xpath = "//button[@routerlink='/dashboard/myorders']")
	WebElement orderLink;
	
	public String getConfirmationMessage()
	{
		CheckoutPage cp = new CheckoutPage(driver);	
		return confirmationMessage.getText();
	}
	
	public OrderHistoryPage gotoHistoryPage() {
		orderLink.click();
		return new OrderHistoryPage(driver);
	}
	

}
