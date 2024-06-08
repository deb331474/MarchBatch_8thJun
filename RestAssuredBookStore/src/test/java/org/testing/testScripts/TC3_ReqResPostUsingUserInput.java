package org.testing.testScripts;

import java.util.Scanner;

import org.testing.testBase.BaseTest;
import org.testing.testSteps.HTTPMethods;
import org.testing.resources.*;
import org.testing.utilities.JsonParsing;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.Log;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC3_ReqResPostUsingUserInput extends BaseTest {

    public static String returnIdValue;

   
    @Test
    public void createUserByInputTest() throws Exception {
        Log.info("Test Case: TC3_ReqResPostUsingUserInput started");

       // System.out.println("Current working directory: " + System.getProperty("user.dir"));

        String requestBody = JsonHandle.readJsonData("../RestAssuredBookStore/src/test/java/org/testing/resources/requestBody.json");

        HTTPMethods httpMethods = new HTTPMethods(properties);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the name value:");
        String nameValue = scanner.nextLine();

        System.out.println("Please enter the job value:");
        String jobValue = scanner.nextLine();

        requestBody = JsonReplacement.readAndReplace(requestBody, "{{name}}", nameValue);
        requestBody = JsonReplacement.readAndReplace(requestBody, "{{job}}", jobValue);

        Log.info("Request Body after replacements: " + requestBody);

        Response resObj = httpMethods.createUsersbyPost(requestBody, "QA_URI_Reqres");

        Log.info("Response from server: " + resObj.asPrettyString());

        returnIdValue = JsonParsing.doParsing(resObj, "id");

        Log.info("Captured ID from response: " + returnIdValue);

        // Assertions
        Assert.assertNotNull(returnIdValue, "ID value is null.");
        Assert.assertEquals(JsonParsing.doParsing(resObj, "name"), nameValue, "Name value does not match.");
        Assert.assertEquals(JsonParsing.doParsing(resObj, "job"), jobValue, "Job value does not match.");

        Log.info("Test Case: TC3_ReqResPostUsingUserInput completed");
    
    }
}
