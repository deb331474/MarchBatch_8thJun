package in.debasish.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegAfterLoginPage extends BasePage{

	public RegAfterLoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//h1[normalize-space()='Complete Your Registration']")
	WebElement compltRegistrationText;
	
	
	@FindBy(xpath = "//strong[normalize-space()='Skip']")
	WebElement skipLink;
	
	
	public String getMessage() {
		return compltRegistrationText.getText();
		
	}
	public void clickonSkiplink() {
		skipLink=waitForElementToBeClickable(By.xpath("//strong[normalize-space()='Skip']"));
		skipLink.click();
	}

}
