package in.debasish.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import in.debasish.PageObject.LoginPage;
import in.debasish.testComponents.TestBase;

public class LoginTest extends TestBase{
	
	@Test
	public void login() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.LogintoApplication("Admin", "admin123");
		Thread.sleep(2000);
		Assert.assertTrue(true, "Dashboard is present");
		
		
	}

}
