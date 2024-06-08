package in.debasish.PageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import in.debasish.AbstractComponents.AbstractComponents;

public class LeaveListApprovePage extends AbstractComponents {

	public LeaveListApprovePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(css = "div[class='oxd-multiselect-wrapper'] div[class='oxd-select-text oxd-select-text--active']")
	WebElement leaveStausDropdown;

	@FindBy(xpath = "(//div[@role='option'])[3]")
	WebElement selectItemDropdown;

	@FindBy(css = ".oxd-switch-input")
	WebElement pastEmployeeSwitch;

	@FindBy(css = "button[type='submit']")
	WebElement searchBtn;

	@FindBy(css = "span[class='oxd-text oxd-text--span']")
	WebElement recordcntBefore;

	@FindBy(css = ".orangehrm-header-container .oxd-text--span")
	WebElement recordcntAfter;

	@FindBy(xpath = "//div[@id='oxd-toaster_1']")
	WebElement succMsg;

	@FindBy(css = ".oxd-table-card")
	List<WebElement> allRows;

	@FindBy(css = ".oxd-table-cell")
	List<WebElement> allCells;
	
	@FindBy(xpath = "//div[@class='orangehrm-container']//div")
	List<WebElement> inclusiveCols;

	public void selectleaveStatusDropdown() {
		leaveStausDropdown.click();
		selectItemDropdown.click();
	}

	public void clickonSearchBtn() {
		searchBtn.click();
	}

	public void getRecordCount() {

		System.out.println(recordcntBefore.getText());
	}

	public List<String> getAllthePendingRequest() {
		List<String> al = new ArrayList<String>();
		for (WebElement ws : allRows) {
			String getAllData = ws.getText();
			al.add(getAllData);
		}
		return al;
	}

	public void approveLeaveRequest(String name) throws InterruptedException {

		for (WebElement wr : allRows) {

				if (wr.getText().contains(name)) {

					WebElement approveBtn = wr
							.findElement(By.cssSelector(".oxd-table-cell-actions .oxd-button--label-success"));
					try {
						Thread.sleep(5000);
						approveBtn.click();
					} catch (StaleElementReferenceException e) {

						approveBtn.click();
					}
					break;
				}
			}
		}

	
	public String getSuccessMsg() {
		waitforElementToBeVisible(succMsg);
		return succMsg.getText();
	}
}
