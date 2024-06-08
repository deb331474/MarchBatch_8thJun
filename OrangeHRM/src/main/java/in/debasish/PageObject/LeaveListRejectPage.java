package in.debasish.PageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import in.debasish.AbstractComponents.AbstractComponents;

public class LeaveListRejectPage extends AbstractComponents{

	public LeaveListRejectPage(WebDriver driver) {
		super(driver);

	}
	

	@FindBy(css = ".oxd-table-card")
	List<WebElement> allRows;

	@FindBy(css = ".oxd-table-cell")
	List<WebElement> allCells;
	
	@FindBy(xpath = "//div[@id='oxd-toaster_1']")
	WebElement succMsg;
	
	
	public List<String> getAlltheList(){
		
		List<String> rl=new ArrayList<String>();
		for(WebElement wr:allRows) {
			String getCon=wr.getText();
			rl.add(getCon);
			System.out.println(rl);
		}
		
		return rl;
	}
	
	/*public void rejectLeaveRequest() {
		
		for(WebElement de:allRows) {
				WebElement rejectBtn=de.findElement(By.cssSelector(".oxd-table-cell-actions .oxd-button--label-danger"));
				rejectBtn.click();
			}
		}*/
	
	public void rejectLeaveRequest(String name) throws InterruptedException {

		for (WebElement wr : allRows) {

				if (wr.getText().contains(name)) {

					WebElement rejectBtn = wr
							.findElement(By.cssSelector(".oxd-table-cell-actions .oxd-button--label-danger"));
					try {
						Thread.sleep(5000);
						rejectBtn.click();
					} catch (StaleElementReferenceException e) {

						rejectBtn.click();
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
