package in.debasish.tests;
import static in.debasish.setUp.DriverManager.createDriver;
import static in.debasish.setUp.DriverManager.quitDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	@BeforeClass(alwaysRun = true)
    @Parameters({"browser"})
    public void setupTest (final String browser) {
		createDriver(browser);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown () {
        quitDriver ();
    }

}
