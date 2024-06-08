package in.debasish.generalStore;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import in.debasish.testBase.BaseClass;
import io.appium.java_client.AppiumBy;

public class eCommerceToastValidationTest extends BaseClass{
	
	
	@Test
	public void toastMsgValidation() throws InterruptedException {
		
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
	    
	    driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
	    
	    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))"));
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();
	    
	    driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	    
	    String toastMsg=driver.findElement(By.xpath("//android.widget.Toast[@text='Please enter your name']")).getText();
	    
	    Assert.assertEquals(toastMsg, "Please enter your name");
	}

}
