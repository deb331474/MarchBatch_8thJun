package in.debasish.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import in.debasish.AbstractComponents.AbstractComponents;

public class LoginPage extends AbstractComponents{
	
	WebDriver driver;
	

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}
	
	
	@FindBy(css = "input[name='username']")
	WebElement userName;
	
	
	
	@FindBy(css = "input[name='password']")
     WebElement passWord;
	
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement loginButton;
	
	
	@FindBy(xpath = "//h6[normalize-space()='Dashboard']")
	WebElement dashboard;
	
	@FindBy(xpath = "//a[contains(@href,'viewLeaveModule')]")
	WebElement leaveMenu;
	
	
	@FindBy(xpath = "//span[normalize-space()='Reports']")
	WebElement leaveReports;
	
	
	@FindBy(css = "button[title='Leave List']")
	WebElement leaveList;
	

	public void setUsername(String username) {
		userName.sendKeys(username);
	}
	public void setPassword(String pswd) {
		passWord.sendKeys(pswd);
	}
	
	public void LogintoApplication(String username,String pswd) {
		userName.sendKeys(username);
		passWord.sendKeys(pswd);
		loginButton.click();
	}
	
	public String isDashboardPresent() {
		
	return dashboard.getText();
 
}
	
	public LeaveReport gotoLeaveReportPage() throws InterruptedException {
		leaveMenu.click();
		Thread.sleep(5000);
		leaveReports.click();
		
		return new LeaveReport(driver);
		
	}
	public LeaveListApprovePage gotoLeavelistApprovePage() {
		waitforElementToBeVisible(leaveList);
		leaveList.click();
		
		return new LeaveListApprovePage(driver);
		
	}
	
	public LeaveListRejectPage goToLeaveListRejectPage() {
		waitforElementToBeVisible(leaveList);
		leaveList.click();
		
		return new LeaveListRejectPage(driver);
		
	}
	
	
}
