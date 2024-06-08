package in.debasish.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ViewDetailsPage extends BasePage{

	public ViewDetailsPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(xpath = "//input[@id='bundle-option-81-128']")
	WebElement selectRadioBtn1;
	
	
	@FindBy(xpath = "//span[normalize-space()='Add to Cart']")
	WebElement addToCartBtn;
	
	
	@FindBy(css="#ui-id-1")
	WebElement cartSubtotal;
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	public void selectFirstRadioBtn() {
		
		js.executeScript("arguments[0].click();", selectRadioBtn1);
		selectRadioBtn1.click();

	}
	
	public void clickonAddToCartBtn() {
		addToCartBtn.click();
	}
	
	public void getModalContents() {
		cartSubtotal.getText();
	}

}
