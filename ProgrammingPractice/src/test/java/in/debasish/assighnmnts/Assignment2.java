package in.debasish.assighnmnts;

import java.io.File;
import java.time.Duration;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

    public static void main(String[] args) {
        

        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to AJIO website
            driver.get("https://www.ajio.com");

            // Maximize the window
            driver.manage().window().maximize();

            // Implicit wait
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Search for Levis t-shirt
            WebElement searchBox = driver.findElement(By.name("searchVal"));
            searchBox.sendKeys("Levis t-shirt");
            searchBox.sendKeys(Keys.RETURN);

            // Apply color filter 'Black' (left side menu)
            driver.findElement(By.xpath("//span[@aria-label='colors']")).click();
            WebElement colorFilter = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("(//div)[436]")));
            colorFilter.click();

            // Apply size filter 'Medium'
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[@aria-label='size & fit']")));

            WebElement sizeMFilter = driver.findElement(By.cssSelector("label[for='M']"));
            sizeMFilter.click();

            // Remove applied 'Black' filter
            WebElement blackFilterClose = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("(//div)[436]")));
            blackFilterClose.click();

            // Scroll down to 20th product
            List<WebElement> products = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='item rilrtl-products-list__item item']")));
            WebElement twentiethProduct = products.get(19); // 0-based index
            Actions actions = new Actions(driver);
            actions.moveToElement(twentiethProduct).perform();

            // Hover on the product and click on quick view
            WebElement quickViewButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='item rilrtl-products-list__item item'][20]//div[contains(@class,'quick-view')]")));
            quickViewButton.click();

            // Take a screenshot of quick view product
            File quickViewScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(quickViewScreenshot, new File("quick_view_product.png"));

            // Capture the price of the product
            WebElement quickViewPriceElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='price  ']")));
            String quickViewProductPrice = quickViewPriceElement.getText();
            System.out.println("Quick View Product Price: " + quickViewProductPrice);

            // Select any size and add the product to cart/bag
            WebElement sizeMButton = driver.findElement(By.xpath("//button[contains(text(),'M')]"));
            sizeMButton.click();
            WebElement addToBagButton = driver.findElement(By.xpath("//span[contains(text(),'ADD TO BAG')]"));
            addToBagButton.click();

            // Open the cart/bag page
            WebElement cartIcon = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ic-cart ']")));
            cartIcon.click();

            // Verify the same product is added to the cart
            WebElement cartProductPriceElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='price  ']")));
            String cartProductPrice = cartProductPriceElement.getText();
            System.out.println("Cart Product Price: " + cartProductPrice);

            // Compare and verify the added product's price and order total amount
            if (quickViewProductPrice.equals(cartProductPrice)) {
                System.out.println("Product price matches in the cart.");
            } else {
                System.out.println("Product price does not match in the cart.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
