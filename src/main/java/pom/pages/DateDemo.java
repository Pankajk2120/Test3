package pom.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.util.ConstantsConfig;

public class DateDemo extends BasePage{
	
	public DateDemo(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}

	public void RedirectToDateSelectionPage() {
		try {
			test.log(Status.INFO, "Redirecting to the Date");
			driver.navigate().to(ConstantsConfig.DateURL);
			Thread.sleep(1000);
			driver.manage().window().maximize();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void DateSelections() {
		SelectDate1(ConstantsConfig.Datetimepicker1, ConstantsConfig.Year1, ConstantsConfig.Month1, ConstantsConfig.year, ConstantsConfig.month , ConstantsConfig.day);
	}
	
	public void DateSelection() {
		try {
		WebElement dateField = driver.findElement(ConstantsConfig.Datetimepicker1);
        dateField.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ConstantsConfig.Calendar));
       
        WebElement monthDropdown = driver.findElement(ConstantsConfig.Month1);
        Select selectMonth = new Select(monthDropdown);
        selectMonth.selectByVisibleText("March");
        
        Thread.sleep(2000);
        WebElement dayElement = driver.findElement(By.xpath("//span[@aria-label='March 15, 2024']"));
        dayElement.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void TimeSelection(String hour, String minute) {
		try {
		WebElement Hour = driver.findElement(By.xpath("//div[@class='flatpickr-calendar hasTime animate open arrowTop arrowLeft']//input[@aria-label='Hour']"));
		Hour.clear();
		Hour.sendKeys(hour);
		
		WebElement Minute = driver.findElement(By.xpath("//div[@class='flatpickr-calendar hasTime animate open arrowTop arrowLeft']//input[@aria-label='Minute']"));
		Minute.clear();
		Minute.sendKeys(minute);
		
		WebElement time = driver.findElement(By.xpath("//div[@class='flatpickr-calendar hasTime animate open arrowTop arrowLeft']//span[@title='Click to toggle']"));
		String TIME = time.getText();
		System.out.println("Time formate : "+TIME);
			if(TIME.equals("PM")) {
				time.click();
				System.out.println("Time formate : "+TIME);
			}else {
				time.getText();
				System.out.println("Time formate : "+TIME);
			}
		
		
		}catch(Exception e) {
		e.printStackTrace();
	}
	}
}
