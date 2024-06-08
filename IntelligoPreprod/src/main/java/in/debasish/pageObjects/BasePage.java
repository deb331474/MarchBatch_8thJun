package in.debasish.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage{
	
	WebDriver driver;
	WebDriverWait wait;

	public BasePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	public WebElement waitForElementToBeClickable(By locator){
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    
    public WebElement waitForElementToBeVisible(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    
    public Boolean waitForElementToBeInVisible(By locator){
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }
    
    public WebElement waitForElementToBeVisible(WebElement webElement){
        return wait.until(ExpectedConditions.visibilityOf(webElement));
    }

}
