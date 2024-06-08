package in.debasish.PageObject;


import java.net.SocketException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import in.debasish.AbstractComponents.AbstractComponents;

public class AssignLeave extends AbstractComponents{
	WebDriver driver;

	public AssignLeave(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
		
	}
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	WebElement eName;
	
	@FindBy(css = ".oxd-select-text-input")
	WebElement leavetypeDropdown;
	
	
	@FindBy(xpath = "//span[normalize-space()='CAN - Matternity']")
	WebElement canMatternity;
	
	@FindBy(xpath = "(//div[@class='oxd-date-input'])[1]")
	WebElement fromLeave;
	
	@FindBy(xpath = "(//input[@placeholder='dd-mm-yyyy'])[2]")
	WebElement toLeave;
	
	
	@FindBy(css="body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > i:nth-child(2)")
	WebElement calendarBtn;
	
	
	@FindBy(css = "div[class='oxd-layout-context'] div:nth-child(2) div:nth-child(1) div:nth-child(2) div:nth-child(1) div:nth-child(1) input:nth-child(1)")
	WebElement toDateBtn;
	
	
	@FindBy(css = "button[type='submit']")
	WebElement assighnBtn;
	
	
	@FindBy(css= ".oxd-text.oxd-text--p.orangehrm-leave-balance-text.--error")
	WebElement blnError;
	
	@FindBy(css =".oxd-icon.bi-question-circle.oxd-icon-button__icon.--help")
	WebElement leaveBalanceicon;
	
	
	@FindBy(css=".orangehrm-dialog-header-container")
	WebElement modalContent;
	
	
	
	public void enterEmployeeName(String empName) {
		try {
		eName.sendKeys(empName);
	}
		catch (ElementNotInteractableException e) {
			eName.sendKeys(empName);
		}
	}
	
	public void clickonDropdown() {
		leavetypeDropdown.click();
        canMatternity.click();
		
	}
	
	public void selectFromDate() throws InterruptedException {
		
		calendarBtn.click();
		
		String year = "2007";
		String month = "August";
		String date = "20";
		
		while (true) {
			
			String mon1 = driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-month-selected']/p")).getText();
			String yr1 = driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-year-selected']/p")).getText();
			
			if(mon1.equals(month) && yr1.equals(year)) {
				break;
			}
			else {
				driver.findElement(By.xpath("(//i[@class='oxd-icon bi-chevron-left'])[2]")).click();
			}
		}
			
			List<WebElement> allDates = driver
					.findElements(By.xpath("//div[contains(@class,'oxd-calendar-date')]//div//div"));
			
			
			for(WebElement sd: allDates) {
				if(sd.getText().equals(date)) {
					sd.click();
					System.out.println(sd);
					break;
				}
				
			}
			
			Thread.sleep(5000);
		}
	
	public void selectToDate() throws Exception {
		
		    toDateBtn.click();
			
			String year1 = "2028";
			String month1 = "May";
			String date = "15";

			while (true) {
				String mon = driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-month-selected']/p")).getText();
				String yr = driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-year-selected']/p")).getText();

				if (mon.equals(month1) && yr.equals(year1)) {
					break;
				} else {
					driver.findElement(By.xpath("//i[@class='oxd-icon bi-chevron-right']")).click();

				}
			}
			List<WebElement> allDates = driver
					.findElements(By.xpath("//div[contains(@class,'oxd-calendar-date')]//div//div"));
			
			
			for(WebElement sd: allDates) {
				if(sd.getText().equals(date)) {
					sd.click();
					System.out.println(sd);
					break;
				}
				
			}
			
			Thread.sleep(4000);
			
		}
	
	
	
	public void clickonAssighnBtn() {
		
		assighnBtn.click();
	}
		
	public void getErrorMsg() {
		
		String msg=blnError.getText();
		
	}
	
	public void getDialogContent() throws SocketException{
	
		leaveBalanceicon.click();
		String modContent=modalContent.getText();
		System.out.println(modContent);
		
	}
		
	}
	

