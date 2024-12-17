package pom.util;

import org.openqa.selenium.By;

public class ConstantsConfig {
	
	public static final String URL="https://www.tutorialspoint.com/selenium/practice/text-box.php";
	public static final String ChromeDriverPath="C:/Users/IDC-212/Downloads/Selenium Code/ExtentReportGeneration/drivers/chromedriver.exe";

	public static final String AlertURL= "https://www.tutorialspoint.com/selenium/practice/alerts.php";
	public static final String ModalDialogs = "https://www.tutorialspoint.com/selenium/practice/modal-dialogs.php";
	public static final String AccordionURL = "https://www.tutorialspoint.com/selenium/practice/accordion.php";
	public static final String SliderURL = "https://www.tutorialspoint.com/selenium/practice/slider.php";
	public static final String ToolTipsURL= "https://www.tutorialspoint.com/selenium/practice/tool-tips.php";
	public static final String SelectMenu = "https://www.tutorialspoint.com/selenium/practice/select-menu.php";
	public static final String SortableURL= "https://www.tutorialspoint.com/selenium/practice/sortable.php";
	public static final String SelectableURL = "https://www.tutorialspoint.com/selenium/practice/selectable.php";
	public static final String ResizeableURL = "https://www.tutorialspoint.com/selenium/practice/resizable.php";
	public static final String DragDropURL = "https://www.tutorialspoint.com/selenium/practice/droppable.php";
	public static final String DragabbleURL = "https://www.tutorialspoint.com/selenium/practice/dragabble.php";
	public static final String DateURL = "https://www.tutorialspoint.com/selenium/practice/date-picker.php";
	
	//Selenium Using Java
	public static final By ClickOn_TextBox=By.xpath("//a[normalize-space()='Text Box']");
	public static final By FullName = By.xpath("//input[@id='fullname']");
	public static final By Email = By.xpath("//input[@id='email']");
	public static final By CurrentAddress = By.xpath("//textarea[@id='address']");
	public static final By Password = By.xpath("//input[@id='password']");
	public static final By SubmitBtn = By.xpath("//input[@value='Submit']");
	
	public static final String FullName1 = "Joel Smith";
	public static final String Email1 = "Joel@yopmail.com";
	public static final String CurrentAddress1 = "201 n Fig";
	public static final String Password1 = "Abc@123";
	
	public static final By CheckboxPage = By.xpath("//a[normalize-space()='Check Box']");
	public static final By ButtonsPage = By.xpath("//a[normalize-space()='Buttons']");
	public static final By RadioButtonPage = By.xpath("//a[normalize-space()='Radio Button']");
	public static final By LinksPage = By.xpath("//a[normalize-space()='Links']");
	public static final By UploadFilePage = By.xpath("//a[normalize-space()='Upload and Download']");
	
	public static final By MainLevel1_Checkbox = By.xpath("//input[@id='c_bs_1']");
	public static final By MainLevel1_Plus = By.xpath("//li[@id='bs_1']/span[1]");
	
	public static final By SubLevel1_Checkbox = By.xpath("//input[@id='c_bf_1']");
	public static final By SubKevel1_Plus = By.xpath("//li[@id='bf_1']//span[@class='plus']");
	public static final By LastLevel1 = By.xpath("//input[@id='c_io_1']");
	public static final By LastLevel2 = By.xpath("//input[@id='c_io_2']");
	public static final By LastLevel3 = By.xpath("//input[@id='c_io_3']");
	public static final By LastLevel4 = By.xpath("//input[@id='c_io_4']");
	
	public static final By SubLevel2_Checkbox = By.xpath("//input[@id='c_bf_2']");
	public static final By SubKevel2_Plus = By.xpath("//li[@id='bf_2']//span[@class='plus']");
	public static final By LastLevel5 = By.xpath("//input[@id='c_io_5']");
	public static final By LastLevel6 = By.xpath("//input[@id='c_io_6']");
	public static final By LastLevel7 = By.xpath("//input[@id='c_io_7']");
	public static final By LastLevel8 = By.xpath("//input[@id='c_io_8']");
	
	
	public static final By MainLevel2_Checkbox = By.xpath("//input[@id='c_bs_2']");
	public static final By MainLevel2_Plus = By.xpath("//li[@id='bs_2']/span[1]");
	
	public static final By SubLevel3_Checkbox = By.xpath("//input[@id='c_bf_4']");
	public static final By SubLevel4_Checkbox = By.xpath("//input[@id='c_bf_4']");
	
	//Buttons
	public static final By Click = By.xpath("//button[normalize-space()='Click Me']");
	public static final By RightClick = By.xpath("//button[normalize-space()='Right Click Me']");
	public static final By DoubleClick = By.xpath("//button[normalize-space()='Double Click Me']");
	public static final By ClickMessage = By.xpath("//div[@id='welcomeDiv']");
	
	//Radio Buttons
	public static final By Yes_Radio = By.xpath("//input[@value='igottwo']");
	public static final By Impressive_Radio = By.xpath("//input[@value='igotthree']");
	public static final By Disable_Radio = By.xpath("//input[@value='option3']");
	
	public static final By Yes_RadioCheckedMessage = By.xpath("//b[normalize-space()='Yes']");
	public static final By Impressive_RadioCheckedMessage = By.xpath("//b[normalize-space()='Impressive']");

	public static final By YesRadioMessage = By.xpath("//div[@id='check' and contains(text(), 'You have checked')]");
	public static final By ImpressiveRadioMessage = By.xpath("//div[@id='check' and contains(text(), 'You have checked')]");
	
	public static final By TotalLinks = By.xpath("//*[@class='col-md-8 col-lg-8 col-xl-8']//a");

	//Upload-Download File
	public static final By UploadFile = By.xpath("//input[@id='uploadFile']");
	public static final By DownloadFile = By.xpath("//a[@id='downloadButton']");
	public static String FilePath = "D:\\Pankaj\\File\\sampleFile.jpeg";
	
	//Alert
	public static final By Alert1 = By.xpath("//div[@class='d-flex justify-content-between']/button");
	public static final By Alert2 = By.xpath("//div[@class='d-flex justify-content-between mt-4'][1]/button");
	public static final By Alert3 = By.xpath("//div[@class='d-flex justify-content-between mt-4'][2]/button");
	public static final By Alert4 = By.xpath("//div[@class='d-flex justify-content-between mt-4'][3]/button");
	
	public static final By AlertResult = By.xpath("//div[@id='desk']");
	
	public static final By SmallModal = By.xpath("//button[normalize-space()='Small Modal']");
	public static final By LargeModal = By.xpath("//button[normalize-space()='Large Modal']");
	
	public static final By SmallModalCloseBtn = By.xpath("//*[@class='btn btn-primary'][@data-bs-target='#exampleModalToggle2']");
	public static final By SmallModalText = By.xpath("//div[@class='modal-dialog modal-sm']//div[@class='modal-body'][contains(text(),'Show a second modal and hide this one with the but')]");
	
	public static final By LargeModalCloseBtn = By.xpath("//*[@class='btn btn-primary'][@data-bs-target='#exampleModalLg'][normalize-space()='Close']");
	public static final By LargeModalText = By.xpath("//div[@class='modal-dialog modal-lg']//div[@class='modal-body'][contains(text(),'Show a second modal and hide this one with the but')]");
	
	//Accordion
	public static final By Accordion1 = By.xpath("//h2[@id='headingTwentyOne']");
	public static final By Accordion2 = By.xpath("//h2[@id='headingTwentyTwo']");
	public static final By Accordion3 = By.xpath("//h2[@id='headingTwentyThree']");
	
	public static final By sliderHandle = By.xpath("//input[@id='ageInputId']");
	
	public static final By TooltiponTop = By.xpath("//button[@data-bs-toggle='tooltip' and @data-bs-placement='top']");
	public static final By TooltiponRight = By.xpath("//button[@data-bs-toggle='tooltip' and @data-bs-placement='right']");
	public static final By TooltiponBottom = By.xpath("//button[@data-bs-toggle='tooltip' and @data-bs-placement='bottom']");
	public static final By TooltiponLeft = By.xpath("//button[@data-bs-toggle='tooltip' and @data-bs-placement='left']");

	public static final By MultipleSelect = By.xpath("//input[@id='demo-multiple-select-input']");

	public static final By List = By.xpath("//tbody/tr/td/span");
	public static final By Select = By.xpath("//ul[@class='list-group rounded mt-4']/li");
	public static final By Draggable = By.xpath("//div[@id='draggable']");
	public static final By Droppable = By.xpath("//div[@id='droppable']");
	
	public static final By Draggables = By.xpath("//div[@id='draggables']");
	public static final By DragX = By.xpath("//div[@id='div_element']");
	public static final By DragY = By.xpath("//div[@id='div_elementy']");
	public static final By NavigatetoAxis = By.xpath("//button[text()='Axis Restricted']");
	
	//Calender
	public static final By Datetimepicker1 = By.xpath("//input[@id='datetimepicker1']");
	public static final By Calendar = By.xpath("//div[@class='flatpickr-calendar hasTime animate open arrowTop arrowLeft']");
	public static final By Year1 = By.xpath("//div[@class='flatpickr-calendar hasTime animate open arrowTop arrowLeft']//input[@aria-label='Year']");
	public static final By Month1 = By.xpath("//div[@class='flatpickr-calendar hasTime animate open arrowTop arrowLeft']//select[@aria-label='Month']");
	public static final int year= 2024;
	public static final String month = "December";
	public static final int day = 30;
	
}