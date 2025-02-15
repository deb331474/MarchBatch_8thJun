package in.debasish.testBase;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {

	public AndroidDriver driver;
	public AppiumDriverLocalService service;

	@BeforeClass
	public void configureAppiumServer() throws MalformedURLException {
		File app = new File("//Users//debasishpruseth//Downloads//General-Store.apk");

		File js = new File("/opt/homebrew/lib/node_modules/appium/build/lib/main.js");

		service = new AppiumServiceBuilder().withAppiumJS(js).withIPAddress("127.0.0.1").usingPort(4722).build();
		service.start();
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("emulator-5554");
		options.setApp("//Users//debasishpruseth//Downloads//General-Store.apk");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4722"), options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	public void longPressActions(WebElement ele) {

		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(), "duration", 2000));
	}

	@AfterClass
	public void tearDown() {
		if (driver != null)
			driver.quit();
		service.close();
	}

}
