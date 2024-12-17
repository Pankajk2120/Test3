package pom.testcases.ladbs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.pages.CheckboxDemo;
import pom.pages.LaunchPage;
import pom.pages.LinksDemo;
import pom.pages.Page1;
import pom.testcases.base.BaseTest;
import pom.util.ConstantsConfig;

public class Links extends BaseTest {
	String testCaseName = "Links";
	@Test
    public void Links() throws InterruptedException {
		ExtentTest test = reports.createTest(testCaseName);
       
        LaunchPage launchPage = new LaunchPage(driver, test);
        PageFactory.initElements(driver, launchPage);

        BasePage basePage = new BasePage(driver, test);
        PageFactory.initElements(driver, basePage);
        
        Page1 Page1 = new Page1(driver, test);
        PageFactory.initElements(driver, Page1);
        
        CheckboxDemo CheckboxDemo = new CheckboxDemo(driver, test);
        PageFactory.initElements(driver, CheckboxDemo);
        
        LinksDemo LinksDemo = new LinksDemo(driver, test);
        PageFactory.initElements(driver, LinksDemo);
        
        test.log(Status.INFO, "Selenium Using Java");
        launchPage.gotoLaunchpage();
        LinksDemo.RedirectToLinksPage();
        List<WebElement> links = driver.findElements(ConstantsConfig.TotalLinks);
        System.out.println("Total number of links on the page: " + links.size());
        for(WebElement link : links) {
        	String linkText = link.getText();
            String linkHref = link.getAttribute("href");
            System.out.println("Link Text: " + linkText + " | URL: " + linkHref);	
        }
        
        if(!links.isEmpty()) {
        	WebElement firstLink = links.get(0);
        	System.out.println("Clicking On First Link : "+firstLink.getText());
        	firstLink.click();
        	Thread.sleep(2000);
        	driver.navigate().back();
        }

}
	
}
