package in.debasish.testCases;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import in.debasish.PageObject.LeaveListApprovePage;
import in.debasish.PageObject.LeaveListRejectPage;
import in.debasish.PageObject.LoginPage;
import in.debasish.testComponents.TestBase;

public class LeaveListRejectTest extends TestBase{
	
	@Test
	public void rejectListApprove() throws InterruptedException {
		
	
	LoginPage lp=new LoginPage(driver);
	lp.LogintoApplication("Admin","admin123");
	lp.isDashboardPresent();
	logger.info("Logged into the application");
	LeaveListRejectPage leaveListRejectPage=lp.goToLeaveListRejectPage();
	
	List<String> allPendingList=leaveListRejectPage.getAlltheList();
	System.out.println(allPendingList);
	
	leaveListRejectPage.rejectLeaveRequest("Anthony Nolan");
	Assert.assertTrue(true,leaveListRejectPage.getSuccessMsg());
	}
	
	

}
