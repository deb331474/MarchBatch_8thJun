package in.debasish.testCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import in.debasish.PageObject.LoginPage;
import in.debasish.PageObject.UserManagementDetailsPage;
import in.debasish.testComponents.TestBase;

public class AlluserDetailsTest extends TestBase{
	
@Test
	public void getallUserManagementDetails() throws InterruptedException {
	LoginPage lp=new LoginPage(driver);
	lp.LogintoApplication("Admin", "admin123");
	
	UserManagementDetailsPage udp=new UserManagementDetailsPage(driver);
	udp.clickOnAdminModule();
	Thread.sleep(5000);
	udp.getalltheUserManagementData();
	udp.getParticularElement("deepak");
	
	}
	
}
