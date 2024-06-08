package in.debasish.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

	public DashboardPage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(css = "#aha-customer-name")
	WebElement userNameLink;
	
	
	@FindBy(css="#acc-dashboard")
	WebElement dashboardLink;
	
	
	
	@FindBy(css="#manage-address")
	WebElement manageAddressLink;
	
	
	@FindBy(css="#addnewaddress")
	WebElement addNewAdress;
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public void clickOnUserprofileLink() {
		userNameLink.click();
		
	}
	
	public void clickOnDashboardLink() {
		dashboardLink.click();
		
	}
	
	public void clickOnManageAddressLink() {
		js.executeScript("arguments[0].scrollIntoView();",manageAddressLink);
		js.executeScript("arguments[0].click();", manageAddressLink);
		
	}
	
	public AddanewAddressPage gotoaddanewAddressPage() {
		js.executeScript("arguments[0].scrollIntoView();",addNewAdress);
		js.executeScript("arguments[0].click();", addNewAdress);
		return new AddanewAddressPage(driver);
		
	}
	

}
