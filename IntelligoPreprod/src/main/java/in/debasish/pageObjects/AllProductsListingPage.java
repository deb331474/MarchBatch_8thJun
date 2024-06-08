package in.debasish.pageObjects;

import java.net.SocketException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllProductsListingPage extends BasePage {

	public AllProductsListingPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "(//select[contains(@aria-label,'per page select dropdown')])[2]")
	WebElement itemsPerPagedropdown;

	@FindBy(xpath = "(//a[contains(@aria-label,'Previous page')])[1]")
	WebElement previousButton;

	@FindBy(xpath = "(//a[contains(@aria-label,'Next page')])[1]")
	WebElement nextButton;
	
	@FindBy(css = "body > div:nth-child(1)")
	WebElement loader;
	
	@FindBy(xpath = "(//span[contains(text(),'»')])[1])")
	WebElement nextSign;
	
	@FindBy(xpath = "//h3[normalize-space()='Telehealth Certification']")
	WebElement telehealthCertification;
	
	
	
	@FindBy(xpath = "//a[normalize-space()='View Details']")
	WebElement viewDetailsBtn;
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

	public void selectItemsPerPage(String itemsPerPage) {
		Select dropdown = new Select(itemsPerPagedropdown);
		dropdown.selectByVisibleText(itemsPerPage);
	}

	public void clickNextPage() throws SocketException, InterruptedException {
		try {

			nextButton = waitForElementToBeVisible(By.xpath("(//a[contains(@aria-label,'Next page')])[1]"));
			js.executeScript("arguments[0].click();", nextButton);
		} catch (ElementClickInterceptedException e) {
			js.executeScript("arguments[0].click();", nextButton);
		} catch (StaleElementReferenceException e) {
			nextButton = waitForElementToBeVisible(By.xpath("(//a[contains(@aria-label,'Next page')])[1]"));
			js.executeScript("arguments[0].click();", nextButton);
		}
	}

	public void waitForLoaderToDisappear() {
	    By loaderLocator = By.xpath("//body/div[@role='alert']/div[@class='loader']/p[1]");

	    wait.until(ExpectedConditions.invisibilityOfElementLocated(loaderLocator));
	}


	public void clickPrevPage() {
		previousButton.click();
	}

	public boolean isNextPageAvailable() {
		return nextButton.isEnabled();
	}

	List<String> allContents=new ArrayList<String>();
	public void navigateThroughallthePages() throws SocketException, InterruptedException {

		    int currentPage = 1;
		    
		    while (true) {
		        List<WebElement> getAllContents = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@aria-label,'Card')]/child::div")));
		        List<String> pageContents = new ArrayList<>();
		        
		        for (WebElement ws : getAllContents) {
		            pageContents.add(ws.getText());
		        }
		        
		        for (String content : pageContents) {
		            allContents.add(content);
		        }
		        
		        // Print or process the collected contents for the current page
		        for (String content : pageContents) {
		        	
		        	if(content.contains("Strive to Revive Symposium 2021 (b)")) {
		        		viewDetailsBtn.click();
		        	}
		            System.out.println(content);
		        }
		        // Check for the "Next" button and navigate if it's available
		            clickNextPage();
		           Thread.sleep(5000);
		            currentPage++;
		            System.out.println("Navigated through " + currentPage + " pages.");
		        

		        }
		    }
		}
