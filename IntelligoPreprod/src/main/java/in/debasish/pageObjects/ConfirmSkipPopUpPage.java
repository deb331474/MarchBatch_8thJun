package in.debasish.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmSkipPopUpPage extends BasePage{

	public ConfirmSkipPopUpPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//button[@id='btnSkip']")
	WebElement skipforNowModallink;
	
	
	@FindBy(css = "button[data-dismiss='modal'] span[aria-hidden='true']")
	WebElement closeModalButton;
	
	public void clickonSkipNow() {
		skipforNowModallink.click();
	}
	
	public void clickOnCloseButton() {
		closeModalButton.click();
	}
	
	

}
