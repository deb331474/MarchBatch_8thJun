package org.testing.testScripts;

import org.testing.resources.JsonHandle;
import org.testing.testBase.BaseTest;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.Log;
import org.testng.annotations.Test;

public class TC4_RickAndGetAllParticular extends BaseTest{
	
	@Test
	public void getAllRickAndMorty() throws Exception {
		
		Log.info("Test Case: TC4_RickAndGetAllParticular started");
		//String requestBody = JsonHandle.readJsonData("../RestAssuredBookStore/src/test/java/org/testing/resources/requestBody.json");
		HTTPMethods hm=new HTTPMethods(properties);
		hm.get("QA_URI_RickMond");
		Log.info("Test Case_TC4_RickAndGetAllParticular finished");
	}

}
