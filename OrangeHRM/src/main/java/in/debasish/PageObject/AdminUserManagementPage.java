package in.debasish.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import in.debasish.AbstractComponents.AbstractComponents;

public class AdminUserManagementPage extends AbstractComponents{

	public AdminUserManagementPage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(xpath = "//span[normalize-space()='User Management']")
	WebElement userManagementTab;
	
	
	
	

}
