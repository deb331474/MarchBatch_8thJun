package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testBase.BaseTest;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.Log;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC1_ReqResGetAll extends BaseTest {
	
	@Test
	public void getAllBooksTest() throws IOException {
		
		Log.info("Test Case: TC1_GetAllBooks started");
        HTTPMethods hm = new HTTPMethods(properties);
        hm.get("QA_URI_Reqres");
        Log.info("Test Case: TC1_GetAllBooks completed");
		
		
	}

}
