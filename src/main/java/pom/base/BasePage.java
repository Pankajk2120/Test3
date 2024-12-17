package pom.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

public class BasePage {
	public WebDriver driver;
	public ExtentTest test;

	public BasePage(WebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
	}
	
	public static void waitForVisibility(WebElement element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void clickonElement(By buttonID){
		try{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		 js.executeScript("arguments[0].click();", driver.findElement(buttonID));
		}
			catch(Exception ex){
		ex.printStackTrace();
				}
	}
	
	public void scrollToElement(By scrollElement){
		try{
			WebElement element = driver.findElement(scrollElement);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void scrollToElement1(WebElement element) {
	    try {
	    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	        Thread.sleep(500);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public void SelectDate(By calendarId, By Year, By Month, int year, String month, String daycellclass, int day) {
	    try {
	    	WebElement calendarWidget = driver.findElement(calendarId);
            calendarWidget.click();
            
            WebElement yearSpinner = driver.findElement(Year);
            yearSpinner.clear();
            Thread.sleep(2000);
            yearSpinner.sendKeys(String.valueOf(year));
            
            WebElement monthDropdown = driver.findElement(Month);
            Select monthSelect = new Select(monthDropdown);
            monthSelect.selectByVisibleText(month);
            
            WebElement dayCell = driver.findElement(By.xpath("//td[@class='"+daycellclass+"'][normalize-space()='"+day+"']"));
            dayCell.click();
	    	
            System.out.println("Date selected: " + year + "-" + month + "-" + day);
	    	
	    } catch (Exception e) {
	        e.printStackTrace();
	        System.err.println("Error while selecting the date: " + e.getMessage());
	    }
	}

	public void SelectDate1(By calendarId, By Year, By Month, int year, String month, int day) {
	    try {
	    	WebElement calendarWidget = driver.findElement(calendarId);
            calendarWidget.click();
            
            WebElement yearSpinner = driver.findElement(Year);
            
            yearSpinner.clear();
            Thread.sleep(2000);
            yearSpinner.sendKeys(String.valueOf(year));
            Thread.sleep(2000);
            
           WebElement Dropdown = driver.findElement(By.xpath("//div[@class='flatpickr-calendar hasTime animate open arrowTop arrowLeft']//select[@aria-label='Month']"));
           Dropdown.click();
           WebElement monthDropdown = driver.findElement(Month);
           Select monthSelect = new Select(monthDropdown);
            monthSelect.selectByVisibleText(month);
            Thread.sleep(2000);
        
            WebElement Day = driver.findElement(By.xpath("//div[@class='flatpickr-calendar hasTime animate arrowTop arrowLeft open']//span[contains(@class, 'flatpickr-day') and (not(contains(@class, 'prevMonthDay')) and not(contains(@class, 'nextMonthDay')))][normalize-space()='"+day+"']"));
	    	Day.click();
            System.out.println("Date selected: " + year + "-" + month + "-" + day);
	    	
	    } catch (Exception e) {
	        e.printStackTrace();
	        System.err.println("Error while selecting the date: " + e.getMessage());
	    }
	}
	
	
}
