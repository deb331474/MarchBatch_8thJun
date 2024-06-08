package in.debasish.setUp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverManager {

	private static WebDriver driver;

	public static void quitDriver() {
		if (null != getDriver()) {
			getDriver().quit();
		}
	}

	public static WebDriver getDriver() {

		return driver;
	}

	public static void createDriver(final String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			final ChromeOptions options = new ChromeOptions();
			driver = new ChromeDriver(options);

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("Browser driver is not available!");
		}
		setupBrowserTimeouts();
	}

	private static void setupBrowserTimeouts() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

}
