package in.debasish.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import in.debasish.PageObject.LeaveReport;
import in.debasish.PageObject.LoginPage;
import in.debasish.testComponents.TestBase;

public class LeaveEntitlementsReportsTest extends TestBase{

	
	@Test
	public void getLeaveEntitlementsReports() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.LogintoApplication("Admin", "admin123");
		Thread.sleep(2000);
		Assert.assertTrue(true, "Dashboard is present");
		Thread.sleep(5000);
		LeaveReport lep=lp.gotoLeaveReportPage();
		lep.clickonLeaveEntitlementsReport();
		String expectedText = "Leave Entitlements and Usage Report";
        String actualText = lep.verifyTextIsPresent();
        Assert.assertTrue(actualText.contains(expectedText),
                "Expected text is not present. Actual text: " + actualText);
		lep.clickonGenerateBtn();
	}
}
