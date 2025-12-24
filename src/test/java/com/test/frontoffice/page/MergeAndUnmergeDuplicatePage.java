/**
 * 
 */
package com.test.frontoffice.page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;


/**
 * @author Anup
 *
 * 15-Dec-2025
 */
public class MergeAndUnmergeDuplicatePage extends GeneralBrowserSetting{


	public String secondaryUHID;   
	public static String mergedPrimaryUHID;


	protected static String select_facility = "//select[@id='Facility']";
	protected static String click_dashbord_front_office_btn  = "//*[@id=\"OPDSubmit\"]/span[1]/a/img";
	protected static String department_drp = "//select[@id='Department']";
	protected static String clik_yes_popup = "//*[@id=\"btn_yes_desh\"]";

	protected static String addPatient_meanu = "//*[@id=\"FOAddPatientMenu\"]/a/span";
	protected static String patient_merge_page = "//a[normalize-space()='Merge Duplicates']";
	
	//----------------------------------merge Duplicates----------------------------------------
	protected static String popup_atleast_one= "//p[normalize-space()='Please fill atleast one detail']";	

	protected static String first_name_merge_txt = "//input[@id='firstaname_mearge']";
	protected static String last_name_merge_tet = "//input[@id='lastname_mearge']";
	protected static String mobile_no = "//input[@id='mobilenumber_mearge']";
	protected static String city_text = "//input[@id='city_mearge']";
	protected static String date_brith = "//input[@id='city_mearge']";
	protected static String search_btn = "//a[@id='Searchmaearge_mearge']//i[@class='fa fa-search']";
	protected static String serach_new = "//i[@class='fa fa-search-plus']";
	protected static String clear_btn = "//a[@id='Clear']//i[@class='fa fa-refresh']";
	protected static String merge_icon = "//i[@class='fa fa-male']";

	protected static String first_primary_checkbox = "//input[starts-with(@id,'checkBox_primary0')]";   //dyanmic xpath 
	protected static String second_uhid_checkbox = "#checkBox_selection1";
	protected static String thrid_uhid_checkbox = "#checkBox_selection2";
	protected static String SELECTED_UHID_MERGED_MESSAGE = "//p[contains(text(),'Selected UHID have been merged with')]";


	//----------------------------------Unmerge Duplicates----------------------------------------
   protected static String meanu_bar = "//img[@id='showmenuIcon']";
   protected static String patient_unmerge_page = "//a[normalize-space()='UnMerge Duplicates']";
   protected static String enter_uhid = "//input[@id='uHid']";
   protected static String first_unmerge_checkbox = "input#checkBox_selection0"; 
   protected static String Second_unmerge_checkbox = "input#checkBox_selection1"; 
   protected static String unmerge_icon = "//i[@class='fa fa-male']";
   
   protected static String unmerge_popup_message = "//p[normalize-space()'Selected UHID have been Unmerged with SPSL.']";
   





	public void selectByFacilityDropdwon(String facilityText) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(select_facility, facilityText);
	}

	public void clickOnDashboardFrontOfficeBtn(String fo_click , String departmentText ,String Yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_dashbord_front_office_btn, fo_click);
		CommanUtill.dropdownSelectByVisibleText(department_drp, departmentText);
		CommanUtill.clickFunction(clik_yes_popup, Yes_popup);
	}

	public void clickOnMergePatient(String add_patient , String merge_page) throws IOException, InterruptedException {

		CommanUtill.clickFunction(addPatient_meanu, add_patient);
		CommanUtill.clickFunction(patient_merge_page, merge_page);
	}
    //---------------------Enter First Name And Serach In Merge Page-----------------------
	public void enterFirstNameAndSerachInMergePage(String firstName , String Serach_icon) throws IOException, InterruptedException {

		CommanUtill.textEnter(first_name_merge_txt, firstName);
		CommanUtill.clickFunction(search_btn, Serach_icon);

	}

	//---------------------click Primary UHID -----------------------
	public void clickPrimaryAndPrintUHIDAndRegDate(String logMsg) throws IOException, InterruptedException {

		CommanUtill.clickFunction(first_primary_checkbox, logMsg);

	}

	//---------------------click Secondary UHID And Print UHID-----------------------

	public void selectSecondaryUHIDAndPrint(String Secondry_UHID_Radio_Button) throws IOException, InterruptedException {

	    // Secondary row (2nd row)
	    String secondaryRow = "(//table[@id='searchResultsdata_mearge_An']//tbody//tr)[2]";

	    // Checkbox / Radio
	    String secondaryCheckbox =  secondaryRow + "//input[@type='checkbox']";

	    // UHID = 3rd td (no id available)
	    String secondaryUHIDXpath = secondaryRow + "/td[3]";

	    // Click radio / checkbox
	    CommanUtill.clickFunction(secondaryCheckbox, Secondry_UHID_Radio_Button);

	    // Get & print UHID
	     secondaryUHID = driver.findElement(By.xpath(secondaryUHIDXpath)).getText();

	    System.out.println("Secondary UHID is : " + secondaryUHID);
	}
	
	public void clickThridUHIDMerge(String secondry_uhoid) throws IOException, InterruptedException {

		driver.findElement(By.cssSelector(thrid_uhid_checkbox)).click();
		logger.info("Third UHID Checkbox Clicked");
	}

	public void ClickOnMergeIconSelectedUHIDs(String merge_icon_click) throws IOException, InterruptedException {

		CommanUtill.clickFunction(merge_icon, merge_icon_click);
	}
	
	
	public boolean verifyUHIDMergedMessage(String message) throws InterruptedException{
		Thread.sleep(3000);
		if(driver.findElement(By.xpath(popup_atleast_one)).getText().contains(message))
			
		{
			logger.info("UHID Merged Message Is Present");
			return true;
		}
		else{
			return false;
		}
	}
	/*
	public String getMergedInPrimaryUHIDPopup() throws InterruptedException {
		//driver.turnOnImplicitWaits(); 
		String message = driver.findElement(By.xpath(SELECTED_UHID_MERGED_MESSAGE)).getText();
		String [] message1= message.split("with");
		String uhid1 = message1[1];
		logger.info("Merged UHID Is  "+uhid1);
		System.out.println("Merged UHID Is  "+uhid1);
		return uhid1;
	}
	
	*/
	public String getMergedInPrimaryUHIDPopup() throws IOException, InterruptedException {

	    String message = driver.findElement(
	            By.xpath(SELECTED_UHID_MERGED_MESSAGE)
	    ).getText();

	    String[] splitMsg = message.split("with");
	    String uhidNumber = splitMsg[1].trim();   

	    // Add prefix
	    mergedPrimaryUHID = "SPSL." + uhidNumber;

	    logger.info("Merged UHID Is : " + mergedPrimaryUHID);
	 
	    return mergedPrimaryUHID;
	}

//----------------------------------Unmerge Duplicates----------------------------------------
	
	public void clickOnMenuBar(String menu_bar_click) throws IOException, InterruptedException {

		CommanUtill.clickFunction(meanu_bar, menu_bar_click);
	}

	public void clickOnDashboardFrontOffice(String fo_click , String departmentText ,String Yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(click_dashbord_front_office_btn, fo_click);
		CommanUtill.dropdownSelectByVisibleText(department_drp, departmentText);
		CommanUtill.clickFunction(clik_yes_popup, Yes_popup);
	}

	public void clickOnUnMergePatient(String add_patient, String unmerge_page) throws IOException, InterruptedException {

		CommanUtill.clickFunction(addPatient_meanu, add_patient);
		CommanUtill.clickFunction(patient_unmerge_page, unmerge_page);
	}
	
	public void enterUHIDInUnmergePage(String uhid_value) throws IOException, InterruptedException {

	    if (uhid_value == null || uhid_value.isEmpty()) {
	        throw new RuntimeException("UHID value is null or empty in Unmerge Page");
	    }

	    CommanUtill.textEnter(enter_uhid, uhid_value);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.findElement(By.xpath(enter_uhid)).sendKeys(Keys.ENTER);
	    
	}
	public void unmergeUHIDFirst(String first_unmerge_checkbox_click) throws IOException, InterruptedException {

		driver.findElement(By.cssSelector(first_unmerge_checkbox)).click();
		logger.info("First UHID Unmerge Checkbox Clicked");
	}
	
	public void unmergeUHIDSecond(String second_unmerge_checkbox_click) throws IOException, InterruptedException {

		driver.findElement(By.cssSelector(Second_unmerge_checkbox)).click();
		logger.info("Second UHID Unmerge Checkbox Clicked");
	}

	public void clickOnUnMergeIcon(String unmerge_icon_click) throws IOException, InterruptedException {

		CommanUtill.clickFunction(unmerge_icon, unmerge_icon_click);
	}
	


}
