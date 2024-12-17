package pom.testcases.ladbs;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.pages.CheckboxDemo;
import pom.pages.LaunchPage;
import pom.pages.LinksDemo;
import pom.pages.Page1;
import pom.testcases.base.BaseTest;

public class Links_apiCall extends BaseTest {
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
        
        Map<String, String> linkToResponseDivMap = new HashMap<>();
        linkToResponseDivMap.put("created", "create");
        linkToResponseDivMap.put("no-content", "nocontent");
        linkToResponseDivMap.put("moved", "move");
        linkToResponseDivMap.put("bad-request", "brequest");
        linkToResponseDivMap.put("unauthorized", "authorize");
        linkToResponseDivMap.put("forbidden", "bidden");
        linkToResponseDivMap.put("not-found", "nfound");
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        for (Map.Entry<String, String> entry : linkToResponseDivMap.entrySet()) {
            String linkId = entry.getKey();
            String responseDivClass = entry.getValue();

            // Click the link by its ID
            WebElement link = driver.findElement(By.id(linkId));
            System.out.println("Clicking link: " + link.getText());
            link.click();

            // Wait for the corresponding response div to be visible
            WebElement responseDiv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(responseDivClass)));

            // Get the response text
            String responseText = responseDiv.getText();
            System.out.println("Response for " + link.getText() + ": " + responseText);

            Thread.sleep(1000);
        }
        
	}
	
}
