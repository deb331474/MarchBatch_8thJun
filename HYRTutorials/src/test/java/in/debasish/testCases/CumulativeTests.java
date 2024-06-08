package in.debasish.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import in.debasish.testBase.BaseTest;

public class CumulativeTests extends BaseTest{
	
	@Test
	public void TestGoogle() throws InterruptedException {
		driver.get("https://www.google.com/");
		extentTest.info("Navigated to Url");
		driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
		extentTest.info("Entered text in search box");
		String expectedTitle = "HYR Tutorials - Google Search";
		String actualTitle = driver.getTitle();
		Thread.sleep(5000);
		AssertJUnit.assertEquals(actualTitle, expectedTitle, "Title is mismatched");
		extentTest.pass("Assertion is passed for webpage title");
	}
	
	@Test
	public void testFacebook() {
		driver.get("https://www.facebook.com/");
		extentTest.info("Navigated to URL");
		driver.findElement(By.name("email")).sendKeys("HYR Tutorials",Keys.ENTER);
		
		SoftAssert softAssert=new SoftAssert();
		String actTitle=driver.getTitle();
		String expTitle="Log in to Facebook";
		softAssert.assertEquals(actTitle, expTitle,"Title is Mismatched");
		
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.facebook.com";
		softAssert.assertEquals(actualUrl, expectedUrl,"URL Mismatched");
		
		String actualBorder=driver.findElement(By.name("email")).getCssValue("border");
		String expectedBorder="1px solid rgb(240, 40, 73)";
		
		softAssert.assertEquals(actualBorder, expectedBorder,"Border is mismatched");
		
		
		
		
		
	}
	
	

}
