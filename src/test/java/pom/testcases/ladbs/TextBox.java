package pom.testcases.ladbs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import pom.util.ConstantsConfig;
import pom.base.BasePage;
import pom.pages.LaunchPage;
import pom.pages.Page1;
import pom.testcases.base.BaseTest;

public class TextBox extends BaseTest {
	
	String testCaseName = "Electrical Permit";
	@Test
    public void testElectricalPermit() {
		ExtentTest test = reports.createTest(testCaseName);
       
        LaunchPage launchPage = new LaunchPage(driver, test);
        PageFactory.initElements(driver, launchPage);

        BasePage basePage = new BasePage(driver, test);
        PageFactory.initElements(driver, basePage);
        
        Page1 Page1 = new Page1(driver, test);
        PageFactory.initElements(driver, Page1);

        test.log(Status.INFO, "Selenium Using Java");
        launchPage.gotoLaunchpage();
        Page1.TextBox();
    }
}


