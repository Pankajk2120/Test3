package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.util.ConstantsConfig;

public class SelectMenuDemo extends BasePage {

	public SelectMenuDemo(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	public void RedirectToSelectMenu() {
		try {
			test.log(Status.INFO, "Opening Browser");
			driver.navigate().to(ConstantsConfig.SelectMenu);
			driver.manage().window().maximize();	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void RedirectTo() {
		try {
			test.log(Status.INFO, "Opening Browser");
			driver.findElement(ConstantsConfig.MultipleSelect);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
