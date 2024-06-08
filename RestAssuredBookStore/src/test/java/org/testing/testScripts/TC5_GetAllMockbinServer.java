package org.testing.testScripts;

import org.testing.testBase.BaseTest;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.Log;
import org.testng.annotations.Test;

public class TC5_GetAllMockbinServer extends BaseTest{
	
	@Test
	public void getAllTest() {
		Log.info("Test Case: TC5_GetAllMockbinServer started");
		//String requestBody = JsonHandle.readJsonData("../RestAssuredBookStore/src/test/java/org/testing/resources/requestBody.json");
		HTTPMethods hm=new HTTPMethods(properties);
		hm.get("QA_URI_MyMockBin");
		Log.info("Test Case_TC5_GetAllMockbinServer finished");
	
	}

}
