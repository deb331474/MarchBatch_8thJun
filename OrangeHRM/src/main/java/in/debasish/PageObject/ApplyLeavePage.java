package in.debasish.PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import in.debasish.AbstractComponents.AbstractComponents;

public class ApplyLeavePage extends AbstractComponents{

	public ApplyLeavePage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(xpath = "//div[contains(text(),'CAN - Bereavement')]")
	WebElement selectTypeDropdown;

	@FindBy(css = ".oxd-table-cell")
	List<WebElement> allCells;
	
	@FindBy(xpath = "//div[@id='oxd-toaster_1']")
	WebElement succMsg;
	
	
	
	

}
