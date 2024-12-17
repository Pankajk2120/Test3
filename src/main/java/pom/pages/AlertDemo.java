package pom.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.util.ConstantsConfig;

public class AlertDemo extends BasePage  {
	private Alert alert;
	public AlertDemo(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	public void RedirectToAlerts() {
		try {
			test.log(Status.INFO, "Opening Browser");
			driver.navigate().to(ConstantsConfig.AlertURL);
			driver.manage().window().maximize();	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void ClickingOnAlert1(){
		try {
			test.log(Status.INFO, "Redirecting to the Alert 1");
			driver.findElement(ConstantsConfig.Alert1).click();
			Thread.sleep(1000);
			alert = driver.switchTo().alert();
			String AlertText1 = alert.getText();
			System.out.println("AlertText1 : "+AlertText1);
			test.log(Status.INFO, "Text on Alert: "+AlertText1);
			alert.accept();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void ClickingOnAlert2(){
		try {
			test.log(Status.INFO, "Redirecting to the Alert 2");
			driver.findElement(ConstantsConfig.Alert2).click();
			Thread.sleep(6000);
			alert = driver.switchTo().alert();
			String AlertText2 = alert.getText();
			System.out.println("AlertText2 : "+AlertText2);
			test.log(Status.INFO, "Text on Alert: "+AlertText2);
			alert.accept();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void ClickingOnAlert3(){
		try {
			test.log(Status.INFO, "Redirecting to the Alert 3");
			driver.findElement(ConstantsConfig.Alert3).click();
			Thread.sleep(1000);
			alert = driver.switchTo().alert();
			String AlertText3 = alert.getText();
			System.out.println("AlertText3 : "+AlertText3);
			test.log(Status.INFO, "Text on Alert: "+AlertText3);
			alert.dismiss();
			WebElement AlertResult = driver.findElement(ConstantsConfig.AlertResult);
			System.out.println("AlertResult: "+AlertResult.getText());
			Thread.sleep(1000);
			driver.findElement(ConstantsConfig.Alert3).click();
			alert = driver.switchTo().alert();
			alert.accept();
			System.out.println("AlertResult: "+AlertResult.getText());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void ClickingOnAlert4(){
		try {
			test.log(Status.INFO, "Redirecting to the Alert 4");
			driver.findElement(ConstantsConfig.Alert4).click();
			Thread.sleep(1000);
			alert = driver.switchTo().alert();
			String AlertText4 = alert.getText();
			System.out.println("AlertText4 : "+AlertText4);
			test.log(Status.INFO, "Text on Alert: "+AlertText4);
			alert.sendKeys("Fleming Clara");
			alert.accept();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
