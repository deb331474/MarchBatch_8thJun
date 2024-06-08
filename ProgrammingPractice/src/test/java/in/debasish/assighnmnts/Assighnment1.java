package in.debasish.assighnmnts;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assighnment1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		try {

			driver.get("https://www.ajio.com");

			/*
			 * 
			 * a. Go to AJIO b. Mouse hover on men from menu  c. Mouse hover on brands in
			 * the menu opened d. Click on brand Gap e. In Gap page apply sort by 'low to
			 * high' and verify products are sorted  f. Apply size filter 'M' g. Scroll down
			 * to the 15th product, click on that product n to go to its product page  h.
			 * Capture the price of the product. i. Take a screenshot of the product page.
			 * j. Add the product (size M) to the cart/bag. k. Open the cart/bag page and
			 * verify the same product is added. l. Compare and verify the added
			 * product's price and order total amount are the same  m. Show the test case
			 * report
			 * 
			 */
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			WebElement menMenu = driver.findElement(By.xpath("//span[@aria-label='MEN']"));
			Actions actions = new Actions(driver);
			actions.moveToElement(menMenu).perform();

			// Mouse hover on Brands in the opened menu
			WebElement brandsMenu = driver
					.findElement(By.xpath("//li[contains(@data-test,'li-MEN')]//a[normalize-space()='BRANDS']"));
			actions.moveToElement(brandsMenu).perform();

			// Click on brand Gap
			WebElement gapBrand = driver.findElement(By
					.xpath("//li[contains(@data-test,'li-MEN')]//a[contains(@title,'GAP')][normalize-space()='GAP']"));
			gapBrand.click();
			
			WebElement sortByDropdown=driver.findElement(By.id("sortBy"));
			sortByDropdown.click();
			
			
			

			Thread.sleep(4000);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close the browser
			driver.close();
		}
	}

}
