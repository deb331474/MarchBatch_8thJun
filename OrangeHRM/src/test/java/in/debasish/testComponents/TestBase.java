package in.debasish.testComponents;
	
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.time.Duration;
	import java.util.Date;
	import java.util.Properties;

	import org.apache.commons.io.FileUtils;
	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.core.Logger;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.edge.EdgeOptions;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.firefox.FirefoxOptions;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	
	public class TestBase {
	    public static WebDriver driver;
	    public WebDriverWait wait;
	    public String baseUrl;
	    public org.apache.logging.log4j.Logger logger;

	    @BeforeTest
	    public void setUp() {
	        initializeDriver();
	        configureDriver();
	        initializeWait();
	        loadBaseUrl();
	    }

	    @AfterTest
	    public void tearDown() {
	            driver.quit();
	    }

	    public void initializeDriver() {
	        Properties properties = new Properties();
	        try {
	            FileInputStream configFile = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config.properties");
	            properties.load(configFile);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        String browser = properties.getProperty("browser");
	        baseUrl = properties.getProperty("baseUrl");
	        logger = LogManager.getLogger(this.getClass());

	        switch (browser) {
	            case "chrome":
	                driver = new ChromeDriver();
	                break;
	            case "safari":
	                driver = new SafariDriver();
	                break;
	            case "firefox":
	                FirefoxOptions firefoxOptions = new FirefoxOptions();
	                firefoxOptions.setCapability("moz:firefoxOptions", true);
	                driver = new FirefoxDriver(firefoxOptions);
	                break;
	            case "ie":
	                InternetExplorerOptions ieOptions = new InternetExplorerOptions();
	                ieOptions.ignoreZoomSettings();
	                driver = new InternetExplorerDriver(ieOptions);
	                break;
	            case "edge":
	                EdgeOptions edgeOptions = new EdgeOptions();
	                driver = new EdgeDriver(edgeOptions);
	                break;
	            default:
	                throw new IllegalArgumentException("Invalid browser specified: " + browser);
	        }
	    }

	    public void configureDriver() {
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        logger.info("Browser Set-up loaded");
	    }

	    public void initializeWait() {
	        wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	    }

	    public void loadBaseUrl() {
	        driver.get(baseUrl);
	    }

		public String captureScreen(String name) {
			String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

			TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
			File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
			String destination = System.getProperty("user.dir") + "//screenshots//" + name + "_" + timeStamp + ".png";

			try {
				FileUtils.copyFile(source, new File(destination));
			} catch (Exception e) {
				e.getMessage();
			}
			return destination;
		}
	}
