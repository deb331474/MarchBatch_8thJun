package in.debasish.PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import in.debasish.AbstractComponents.AbstractComponents;

public class UserManagementDetailsPage extends AbstractComponents{

	WebDriver driver;
	public UserManagementDetailsPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}
	
	
	@FindBy(xpath = "//a[@href='/web/index.php/admin/viewAdminModule']")
	WebElement adminLink;
	
	@FindBy(xpath = "(//div[@class='oxd-table-body'])[1]")
	List<WebElement> allUserDetails; 
	
	
	@FindBy(xpath = "//div[contains(text(),'Aaliyah.Haq')]")
	WebElement partcularName;
	
	
	
	@FindBy(xpath = "(//button[@type='button'])[8]")
	WebElement deletePartName;

	
	public void clickOnAdminModule() {
		
		adminLink.click();
	}
	
	public List<WebElement> getalltheUserManagementData(){
		
		for(WebElement ws:allUserDetails) {
			System.out.println(ws.getText());
		}
		return allUserDetails;
	}
	
	public WebElement getParticularElement(String userName) {
		
		WebElement prod=allUserDetails.stream().filter(product->product.equals(userName)).findFirst().orElse(null);
		deletePartName.click();
		return prod;
	}
	
	public WebElement printAllnameWithstartsS(String str) {
		
		return adminLink;
	 
	}
	
}
