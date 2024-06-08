package in.debasish.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import in.debasish.AbstractComponents.AbstractComponents;

public class DashboardPage extends AbstractComponents{
	
	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	@FindBy(xpath = "//button[@title='Assign Leave']")
	WebElement assighnLeave;
	
	public void clickOnAssighnLeave() {
		assighnLeave.click();
	}
	
	
	
	
	

}
