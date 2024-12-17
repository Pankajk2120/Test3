package pom.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.util.ConstantsConfig;

public class SelectableDemo extends BasePage{

	public SelectableDemo(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	public void RedirectToSelectable() {
		try {
			test.log(Status.INFO, "Opening Browser");
			driver.navigate().to(ConstantsConfig.SelectableURL);
			driver.manage().window().maximize();	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Selections() {
		try {
			test.log(Status.INFO, "Opening Browser");
			List<WebElement> items = driver.findElements(ConstantsConfig.Select);
			if (items.size() > 0) {
                // Initialize the Actions class
                Actions actions = new Actions(driver);
                actions.click(items.get(0)).click(items.get(1)).click(items.get(2)).build().perform();
                System.out.println("Items selected successfully!");
                for (int i = 0; i < 3; i++) {
                    WebElement item = items.get(i);
                    if (item.getAttribute("class").contains("list-group-li active")) {
                        System.out.println("Item " + (i + 1) + " is selected.");
                    } else {
                        System.out.println("Item " + (i + 1) + " is NOT selected.");
                    }
                }
            } else {
                System.out.println("No selectable items found.");
            }
				
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
