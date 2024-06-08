package in.debasish.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement passWord;
	
	@FindBy(xpath = "//button[@id='btnSignIn']")
	WebElement signInbtn;
	
	public void enterUsername(String username) {
		userName.clear();
		userName.sendKeys(username);
	}
	public void enterPassword(String password) {
		passWord.clear();
		passWord.sendKeys(password);
	}

	public void clickOnSignButton(){
		signInbtn=waitForElementToBeClickable(By.xpath("//button[@id='btnSignIn']"));
		signInbtn.click();
	}
}
