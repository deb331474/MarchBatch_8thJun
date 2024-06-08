package in.debasish.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import in.debasish.AbstractComponents.AbstractComponents;

public class UserManagementSearchRecordPage extends AbstractComponents{

	WebDriver driver;
	public UserManagementSearchRecordPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement userName;
	
	
	@FindBy(xpath = "((//div[@class='oxd-select-wrapper'])[1]//div)[1]")
	WebElement usrRoledropdown;
	
	@FindBy(css="input[placeholder='Type for hints...']")
	WebElement employeeName;
	
	
	@FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[2]/div")
	WebElement statusDropdown;
	
	
	@FindBy(xpath = "//button[normalize-space()='Search']")
	WebElement searchBtn;
	
	
	@FindBy(xpath = "//button[normalize-space()='Reset']")
	WebElement resetBtn;
	
	public void getUsername() {
		
	}
	
	
	

}
