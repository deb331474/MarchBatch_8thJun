package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {

	public WebDriver driver;
	public String fullpName;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	public String cartPageProductName;
	public String offerPageProductName;

	
	public TestContextSetup() throws IOException
	{
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		genericUtils = new GenericUtils(testBase.WebDriverManager());
		
		
		

	}
	
}
