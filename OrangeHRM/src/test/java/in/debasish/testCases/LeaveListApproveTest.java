package in.debasish.testCases;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import in.debasish.PageObject.LeaveListApprovePage;
import in.debasish.PageObject.LoginPage;
import in.debasish.testComponents.TestBase;

public class LeaveListApproveTest extends TestBase{
	
	String name="Anthony";
	
	@Test
	public void leaveListApproveTest() throws InterruptedException {
		
	LoginPage lp=new LoginPage(driver);
	lp.LogintoApplication("Admin", "admin123");
	lp.isDashboardPresent();
	logger.info("Logged into the application");
	LeaveListApprovePage leaveListApproveTest=lp.gotoLeavelistApprovePage();
	//leaveListApproveTest.selectleaveStatusDropdown();
	//leaveListApproveTest.clickonSearchBtn();
	leaveListApproveTest.getRecordCount();
	Thread.sleep(4000);
	List<String> allData=  leaveListApproveTest.getAllthePendingRequest();
	System.out.print(allData);
	logger.info("Gettting all the list of Pending Leave Request");
	Thread.sleep(5000);
	leaveListApproveTest.approveLeaveRequest(name);
	Assert.assertTrue(true,leaveListApproveTest.getSuccessMsg());
	logger.info("Leave Request approved successfully");

	}
}
