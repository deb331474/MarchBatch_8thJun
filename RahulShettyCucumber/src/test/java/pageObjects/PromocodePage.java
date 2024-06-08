package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PromocodePage {
	
	public WebDriver driver;
	
	public PromocodePage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	 By promoCodeeditField=By.cssSelector(".promoCode");
	 By applyBtn=By.cssSelector(".promoBtn");
	 By errorMsg=By.cssSelector(".promoInfo");
	 
	 public void enterPromoCode(String promoCode) {
		 driver.findElement(promoCodeeditField).sendKeys(promoCode);
	 }
	 
	 public void clickOnapplyBtn() {
		 driver.findElement(applyBtn).click();
	 }
	 
	 public String getErrorMsg() {
		 return driver.findElement(errorMsg).getText();
	 }

}
