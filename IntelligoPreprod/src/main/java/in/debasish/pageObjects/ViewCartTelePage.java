package in.debasish.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewCartTelePage extends BasePage{

	public ViewCartTelePage(WebDriver driver) {
		super(driver);
       }
	
	
	@FindBy(xpath = "//div[@class='secondary checkout-area']")
	WebElement viewCartBtn;
	
	
	@FindBy(xpath = "//h2[normalize-space()='Telehealth Certification']")
	WebElement productName;
	
	public void clickViewCartBtn() {
		
		viewCartBtn.click();
	}
	
	public void getProductName() {
		
		try {
			productName.getText();
		}
		catch (Exception e) {

       e.getMessage();
       
		}
	}
	
	

}
