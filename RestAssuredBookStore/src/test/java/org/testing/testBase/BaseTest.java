package org.testing.testBase;

import java.io.IOException;
import java.util.Properties;

import org.testing.utilities.Log;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public Properties properties;

    @BeforeSuite
    public void beforeSuite() {
        Log.initializeLogger();
        Log.info("Before Suite: Setup global resources.");
    }

    @AfterSuite
    public void afterSuite() {
        Log.info("After Suite: Cleanup global resources.");
    }

    @BeforeTest
    public void beforeTest() {
        Log.info("Before Test: Setup test-specific resources.");
    }

    @AfterTest
    public void afterTest() {
        Log.info("After Test: Cleanup test-specific resources.");
    }

    @BeforeClass
    public void setUp() throws IOException {
        Log.info("Before Class: Initialize properties and setup prerequisites.");
        properties = PropertiesHandle.loadProperties("../RestAssuredBookStore/URI.properties");
    }

    @AfterClass
    public void tearDown() {
        Log.info("After Class: Cleanup operations.");
    }
}
