package in.debasish.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CheckoutTelePage extends BasePage{

	public CheckoutTelePage(WebDriver driver) {
		super(driver);

	}
	
	
	@FindBy(xpath = "(//span[contains(text(),'Checkout')])[1]")
	WebElement checkoutBtn;
	
	@FindBy(css = "#shop-cart-note-974335")
	WebElement tooltipId;
	
	
	public void clickonCheckoutBtn() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value = 'New Value';",checkoutBtn);
		checkoutBtn.click();
	}
	
	public void getthtooltipId() {
		Actions actions=new Actions(driver);
		actions.moveToElement(tooltipId).build().perform();
	}
	

}
