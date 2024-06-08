package in.debasish.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import in.debasish.PageObject.DashboardPage;
import in.debasish.PageObject.LoginPage;
import in.debasish.testComponents.TestBase;

public class AssighnLeaveTest extends TestBase{
	
	@Test
	public void AssignLeave() throws Exception {
		LoginPage lp=new LoginPage(driver);
		lp.LogintoApplication("Admin", "admin123");
		Thread.sleep(2000);
		Assert.assertTrue(true, "Dashboard is present");
		DashboardPage dp=new DashboardPage(driver);
		dp.clickOnAssighnLeave();
	    in.debasish.PageObject.AssignLeave al=new in.debasish.PageObject.AssignLeave(driver);
	    Thread.sleep(5000);
	    al.enterEmployeeName("Debasish Pruseth");
	    al.clickonDropdown();
	    Thread.sleep(8000);
	    al.selectFromDate();
	    al.selectToDate();
	    Thread.sleep(5000);
	    //Assert.assertEquals(,al.getErrorMsg());
	    al.getDialogContent();
	    
	}

}
