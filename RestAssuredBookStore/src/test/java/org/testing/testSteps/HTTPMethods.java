package org.testing.testSteps;

import java.util.Properties;

import org.testing.utilities.Log;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTPMethods {

    public Properties pr;

    public HTTPMethods(Properties pr) {
        this.pr = pr;
    }

    public Response get(String uriKeyName) {
        String uriValue = pr.getProperty(uriKeyName);
        Response res = given().contentType(ContentType.JSON)
                .when().get(uriValue);

        Log.info("GET Request to URI: " + uriKeyName);
        Log.info("Response Status Code: " + res.getStatusCode());
        Log.info("Response Body: " + res.asPrettyString());

        return res;
    }
    
    public Response getParticular(String uriKeyName, String endPoint) {
        String url = pr.getProperty(uriKeyName) + "/" + endPoint;

        Response res = given().contentType(ContentType.JSON)
                .when()
                .get(url);

        Log.info("POST Request with ID to URL: " + url);
        Log.info("Response Status Code: " + res.getStatusCode());
        Log.info("Response Body: " + res.asPrettyString());

        return res;
    }

    public Response createUsersbyPost(String jsonBody, String uriKeyName) {
        String uriValue = pr.getProperty(uriKeyName);
        Response res = given().contentType(ContentType.JSON).body(jsonBody)
                .when().post(uriValue).then().extract().response();

        Log.info("POST Request to URI: " + uriValue);
        Log.info("Request Body: " + jsonBody);
        Log.info("Response Status Code: " + res.getStatusCode());
        Log.info("Response Body: " + res.asPrettyString());

        return res;
    }
}
