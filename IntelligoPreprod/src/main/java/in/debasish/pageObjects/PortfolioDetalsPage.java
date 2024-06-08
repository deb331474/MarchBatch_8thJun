package in.debasish.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PortfolioDetalsPage extends BasePage{

	public PortfolioDetalsPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//span[text()='Portfolios']")
	WebElement portfolioMenu;
	
	@FindBy(xpath = "//span[normalize-space()='All Products']")
	WebElement allProductsLink;
	
	
	public void clickOnPortfolioMenu() {
		portfolioMenu.click();
	}
	
	public void clickOnProductsLink() {
		allProductsLink.click();
	}
	
	

}
