package in.debasish.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//a[@aria-label='Sign in or Sign up']")
	WebElement signUpLink;
	
	public void clickOnSignjInLink(){
		signUpLink=waitForElementToBeClickable(By.xpath("//a[@aria-label='Sign in or Sign up']"));
		signUpLink.click();
	}
	
	
	
	
	

}
