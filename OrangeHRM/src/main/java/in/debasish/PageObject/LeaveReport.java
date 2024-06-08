package in.debasish.PageObject;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import in.debasish.AbstractComponents.AbstractComponents;

public class LeaveReport extends AbstractComponents{
	
	WebDriver driver;

	public LeaveReport(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}
	
	@FindBy(xpath = "//a[normalize-space()='Leave Entitlements and Usage Report']")
	WebElement leaveEntitlementsReports;
	
	@FindBy(css = ".oxd-text.oxd-text--h5.oxd-table-filter-title")
	WebElement leaveEntitlementsReportsText;
	
	
	@FindBy(xpath = "//button[normalize-space()='Generate']")
	WebElement generateBtn;
	
	
	public void clickonLeaveEntitlementsReport() {
		
		leaveEntitlementsReports.click();
	}
	
	public String verifyTextIsPresent() {
		
		String actText=leaveEntitlementsReportsText.getText();
		
		return actText;
	}
	
    public void clickonGenerateBtn() {
		
		generateBtn.click();
	}

}
