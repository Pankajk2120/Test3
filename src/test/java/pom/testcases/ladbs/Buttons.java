package pom.testcases.ladbs;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.pages.ButtonsDemo;
import pom.pages.CheckboxDemo;
import pom.pages.LaunchPage;
import pom.pages.Page1;
import pom.testcases.base.BaseTest;

public class Buttons extends BaseTest {
	String testCaseName = "Buttons";
	@Test
    public void testElectricalPermit() {
		ExtentTest test = reports.createTest(testCaseName);
       
        LaunchPage launchPage = new LaunchPage(driver, test);
        PageFactory.initElements(driver, launchPage);

        BasePage basePage = new BasePage(driver, test);
        PageFactory.initElements(driver, basePage);
        
        Page1 Page1 = new Page1(driver, test);
        PageFactory.initElements(driver, Page1);
        
        ButtonsDemo ButtonsDemo = new ButtonsDemo(driver, test);
        PageFactory.initElements(driver, ButtonsDemo);

        test.log(Status.INFO, "Selenium Using Java");
        launchPage.gotoLaunchpage();
        ButtonsDemo.RedirectToButtons();
        ButtonsDemo.Click();
        
        
        
        
}
	
}
