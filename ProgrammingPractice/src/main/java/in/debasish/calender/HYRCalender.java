package in.debasish.calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HYRCalender {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		
		Calendar calendar=Calendar.getInstance();
		String targetDate="2023-12-23";
		
		SimpleDateFormat targetDateFormat=new SimpleDateFormat("yyyy-MM-dd");
		Date formattedTargetDate=targetDateFormat.parse(targetDate);
		try {
			targetDateFormat.setLenient(false);
			formattedTargetDate=targetDateFormat.parse(targetDate);
			calendar.setTime(formattedTargetDate);
			
			int targetDay=calendar.get(Calendar.DAY_OF_MONTH);
			int targetMonth=calendar.get(Calendar.MONTH);
			int targetYear=calendar.get(Calendar.YEAR);
			
	
			driver.findElement(By.id("second_date_picker")).click();
			Thread.sleep(5000);
			
			String actualDate=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			System.out.println(actualDate);
			
			calendar.setTime(new SimpleDateFormat("yyyy MM").parse(actualDate));
			
			int actualMonth=calendar.get(Calendar.MONTH);
			int actualYear=calendar.get(Calendar.YEAR);
			
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			while(targetMonth<actualMonth || targetYear<actualYear) {
				
				WebElement prevBtn=driver.findElement(By.className("ui-datepicker-prev"));
				
				js.executeScript("arguments[0].click();", prevBtn);
				
				actualDate = driver.findElement(By.className("ui-datepicker-title")).getText(); 
				calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));

				actualMonth = calendar.get(Calendar.MONTH);
				actualYear = calendar.get(Calendar.YEAR);
			}
			
			
			while(targetMonth > actualMonth || targetYear > actualYear) {
				
				WebElement nextBtn=driver.findElement(By.className("ui-datepicker-next"));
				
				js.executeScript("arguments[0].click();", nextBtn);
				
				actualDate = driver.findElement(By.className("ui-datepicker-title")).getText(); 
				calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));

				actualMonth = calendar.get(Calendar.MONTH);
				actualYear = calendar.get(Calendar.YEAR);
			}
			
			
			driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="+targetDay+"]")).click();
		}
		catch (ParseException e) {

		throw new Exception("Invalid date is provided, please check the current date format");
		
		
		}
		
	}

}
