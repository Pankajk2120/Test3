package pom.testcases.ladbs;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.pages.ButtonsDemo;
import pom.pages.LaunchPage;
import pom.pages.Page1;
import pom.pages.UploadFilePage;
import pom.testcases.base.BaseTest;

public class UploadFile extends BaseTest{
	String testCaseName = "UploadFile";
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

        UploadFilePage UploadFilePage = new UploadFilePage(driver, test);
        PageFactory.initElements(driver, UploadFilePage);
        
        test.log(Status.INFO, "Selenium Using Java");
        launchPage.gotoLaunchpage();
        UploadFilePage.RedirectToUploadDownLoadFilePage();
        UploadFilePage.DownloadFile();
        
}
}

