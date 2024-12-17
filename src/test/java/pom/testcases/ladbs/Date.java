package pom.testcases.ladbs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.pages.DateDemo;
import pom.pages.LaunchPage;
import pom.pages.Page1;
import pom.testcases.base.BaseTest;
import pom.util.ConstantsConfig;

public class Date extends BaseTest {
	String testCaseName = "Date";
	@Test
    public void testElectricalPermit() throws InterruptedException {
		ExtentTest test = reports.createTest(testCaseName);
       
        LaunchPage launchPage = new LaunchPage(driver, test);
        PageFactory.initElements(driver, launchPage);

        BasePage basePage = new BasePage(driver, test);
        PageFactory.initElements(driver, basePage);
        
        Page1 Page1 = new Page1(driver, test);
        PageFactory.initElements(driver, Page1);
        
        DateDemo DateDemo = new DateDemo(driver, test);
        PageFactory.initElements(driver, DateDemo);
        
        test.log(Status.INFO, "Selenium Using Java");
        DateDemo.RedirectToDateSelectionPage();
        DateDemo.DateSelection();
        DateDemo.TimeSelection("10","10");
        
        
        
}
}
