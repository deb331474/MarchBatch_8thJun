package in.debasish.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddanewAddressPage extends BasePage {

	public AddanewAddressPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "#firstname")
	WebElement firstName;

	@FindBy(css = "#lastname")
	WebElement lastName;

	@FindBy(css = "#company")
	WebElement company;

	@FindBy(css = "#country_list")
	WebElement countryDropdown;

	@FindBy(xpath = "//span[normalize-space()='United States']")
	WebElement countrySelect;

	@FindBy(css = "#telephone")
	WebElement phnNumber;

	@FindBy(css = "#street_1")
	WebElement streetAddress;

	@FindBy(css = "#city")
	WebElement city;

	@FindBy(css = "#region_id")
	WebElement stateSelect;

	@FindBy(css = "#country")
	WebElement country;

	@FindBy(css = "#zip")
	WebElement zipcode;

	@FindBy(xpath = "//button[@id='save-address-button']")
	WebElement saveBtn;
	
	@FindBy(xpath = "(//div[@class='toast-icons font-500'])[1]")
	WebElement successMsg;

	public void setFirstName(String fname) {
		firstName.clear();
		firstName.sendKeys(fname);

	}

	public void setLastName(String lname) {
		lastName.clear();
		lastName.sendKeys(lname);

	}

	public void setCompanyName(String cname) {
		company.clear();
		company.sendKeys(cname);

	}

	public void setCountryName(String phnNo) {
		countryDropdown.click();
		countrySelect.click();
		phnNumber.clear();
		phnNumber.sendKeys(phnNo);

	}

	public void setStreetAddress(String sAddress) {
		streetAddress.clear();
		streetAddress.sendKeys(sAddress);

	}

	public void setCity(String cAddress) {
		city.clear();
		city.sendKeys(cAddress);

	}

	public void setCountry() {

		country.click();
		Select se = new Select(country);
		se.selectByVisibleText("United States");

	}

	public void setZipcode(String zip) {
		zipcode.sendKeys(zip);
	}

	public void setState() {

		stateSelect.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Select se = new Select(stateSelect);
		se.selectByVisibleText("American Samoa");

	}

	public void clickSaveBtn() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", saveBtn);
		js.executeScript("arguments[0].click();", saveBtn);
	}
	
	public String getMessage() {
		
		String sucMsg=successMsg.getText();
		return sucMsg;
	}
}
