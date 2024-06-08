package in.debasish.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    public String baseUrl;
    public org.apache.logging.log4j.Logger logger;
    

    @BeforeTest
    public void setUp() {
        
        Properties properties = new Properties();
        try {
            FileInputStream configFile = new FileInputStream("//Users//debasishpruseth//eclipse-workspace//IntelligoPreprod//src//test//resources//config.properties");
            properties.load(configFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String browser = properties.getProperty("browser");
        baseUrl = properties.getProperty("baseUrl");
        logger = LogManager.getLogger(this.getClass());

        switch (browser) {
            case "safari":
            	WebDriverManager.safaridriver().setup();
            	//System.setProperty("webdriver.chrome.binary", "/Users/debasishpruseth/Downloads/Google Chrome");
                driver = new SafariDriver();
                break;
            case "chrome":
            	WebDriverManager.chromedriver().setup();
            	driver=new ChromeDriver();
            	break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "ie":
                driver = new InternetExplorerDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                throw new IllegalArgumentException("Invalid browser specified: " + browser);
        }

     
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    public String captureScreen(String name) {
        String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir") + "\\screenshots\\" + name + "_" + timeStamp + ".png";

        try {
            FileUtils.copyFile(source, new File(destination));
        } catch (Exception e) {
            e.getMessage();
        }
        return destination;
    }
}
