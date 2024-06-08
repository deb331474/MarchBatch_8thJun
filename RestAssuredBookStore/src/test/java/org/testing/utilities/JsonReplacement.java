package org.testing.utilities;

public class JsonReplacement {
	public static String readAndReplace(String requestBody, String placeholder, String replacementValue) {
	    return requestBody.replace("\\" + placeholder, replacementValue);
	}

}
