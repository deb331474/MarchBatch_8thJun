package in.debasish.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponents {
	
	WebDriver driver;
	WebDriverWait wait;
	
	//common headers are to be placed here

	public AbstractComponents(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
	
	public WebElement waitforElementToBeClickable(By locator) {
		return  wait.until(ExpectedConditions.elementToBeClickable(locator));
		
	}
	public WebElement waitforElementToBeVisible(By locator) {
		return  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	public WebElement waitforElementToBeVisible(WebElement element) {
		return  wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public void waitForElementToDisappear(WebElement ele) throws InterruptedException
	{
		Thread.sleep(1000);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//		wait.until(ExpectedConditions.invisibilityOf(ele));

	}
	

}
