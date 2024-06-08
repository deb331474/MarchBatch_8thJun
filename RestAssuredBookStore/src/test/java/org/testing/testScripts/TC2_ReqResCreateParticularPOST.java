package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.resources.JsonHandle;
import org.testing.testBase.BaseTest;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.Log;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2_ReqResCreateParticularPOST extends BaseTest{
	
	@Test
	public void createPostRequest() throws Exception {
		
		 Log.info("Test Case: TC2_CreateParticularPOST started");

	        String requestBody = JsonHandle.readJsonData("../RestAssuredBookStore/src/test/java/org/testing/resources/requestBody.json");
	        HTTPMethods httpMethods = new HTTPMethods(properties);

	        Response response = httpMethods.createUsersbyPost(requestBody,"QA_URI_Reqres");
	        
	        Log.info("Response Status Code: " + response.getStatusCode());
	        Log.info("Response Body: " + response.asPrettyString());

	        Log.info("Test Case: TC2_CreateParticularPOST completed");
		
	}

}
