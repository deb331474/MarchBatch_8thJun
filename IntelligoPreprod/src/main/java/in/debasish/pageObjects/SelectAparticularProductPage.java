package in.debasish.pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectAparticularProductPage extends BasePage{

	public SelectAparticularProductPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//h3[contains(text(),'Certified Professional by the American Heart Assoc')]")
	WebElement certifiedProfessionalTobaccoTrt;
	
	@FindBy(xpath = "(//a[contains(@href,'tobacco-treatment')])[2]")
	WebElement viewDetailsBtn;
	
	@FindBy(css="#product-addtocart-button")
	WebElement addtoCartBtn;
	
	
	@FindBy(css="#consentcheckbox")
	WebElement chkBoxbtn;
	
	@FindBy(css="#consent-checkbox-error")
	WebElement chkBoxError;
	
	
	@FindBy(xpath = "(//a[contains(@aria-label,'Next page')])[1]")
	WebElement nextPaginationBtn;
	
	@FindBy(css="a.product-item-link.d-block.mb-2.mb-sm-2.card-title.mb-lg-3")
	List<WebElement> allProducts;
	
	@FindBy(xpath = "(//a[contains(@aria-label,'current page')])[1]")
	WebElement currentPages;
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	public void navigateThroughPages() throws Exception {
	
			for(WebElement ws:allProducts) {
				if(ws.getText().equals("Certified Professional by the American Heart Association - Tobacco Treatment")) {
					
					try {
					js.executeScript("arguments[0].click();", viewDetailsBtn);
				}
				catch (StaleElementReferenceException e) {
					js.executeScript("arguments[0].click();", viewDetailsBtn);
				}
					break;
					
			}
			}
		
	}
	
	
	public void clickonAddtoCartBtn() {
		waitForElementToBeVisible(addtoCartBtn);
		js.executeScript("arguments[0].scrollIntoView(true);", addtoCartBtn);
		js.executeScript("arguments[0].click();", addtoCartBtn);
		addtoCartBtn.click();
	}
	
	public String getErrorMessage() {
		waitForElementToBeVisible(chkBoxError);
		String errMsg=chkBoxError.getText();
		return errMsg;
	}
}
