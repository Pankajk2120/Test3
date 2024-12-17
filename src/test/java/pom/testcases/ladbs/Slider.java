package pom.testcases.ladbs;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.pages.AccordionDemo;
import pom.pages.AlertDemo;
import pom.pages.ButtonsDemo;
import pom.pages.LaunchPage;
import pom.pages.Page1;
import pom.pages.SliderDemo;
import pom.testcases.base.BaseTest;

public class Slider extends BaseTest {
	String testCaseName = "Accordion";
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

        AlertDemo AlertDemo = new AlertDemo(driver, test);
        PageFactory.initElements(driver, AlertDemo);
        
        AccordionDemo AccordionDemo = new AccordionDemo(driver, test);
        PageFactory.initElements(driver, AccordionDemo);
       
        SliderDemo SliderDemo = new SliderDemo(driver, test);
        PageFactory.initElements(driver, SliderDemo);
        
        test.log(Status.INFO, "Selenium Using Java");
        SliderDemo.RedirectToSlider();
        SliderDemo.MoveTheSlider1();
        
	}

}
