package org.testing.utilities;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class JsonParsing {
	
	  public static String doParsing(Response response, String jsonPath) {
	        JsonPath jsonPathEvaluator = response.jsonPath();
	        return jsonPathEvaluator.getString(jsonPath);
	    }

}
