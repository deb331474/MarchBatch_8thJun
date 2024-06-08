package in.debasish.generalStore;

import java.util.List;
import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import in.debasish.testBase.BaseClass;
import io.appium.java_client.AppiumBy;

public class eCommerceAddProductTest2 extends BaseClass {

    @Test
    public void addtoCart() throws InterruptedException {
        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Debasish");
        driver.hideKeyboard();

        Thread.sleep(4000);

        driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();

        driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();

        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))"));

        Thread.sleep(3000);

        driver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();

        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

        Thread.sleep(4000);

        driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(0).click();
        
        driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(1).click();
        
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        
        wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text","Cart"));
        
        List<WebElement> prodPrices=driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
        int count=prodPrices.size();
        double sum=0;
        
        for(int i=0;i<count;i++) {
        	
        	String amountString=prodPrices.get(i).getText();
        	double price=Double.parseDouble(amountString.substring(1));
        	sum=sum+price;
        	
        }
        
        String displayedSum=driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
        
        double displayedTotalSum=Double.parseDouble(displayedSum.substring(1));
        
        Assert.assertEquals(sum, displayedTotalSum,"Value are not Matched");
        
        
        
    }
}
