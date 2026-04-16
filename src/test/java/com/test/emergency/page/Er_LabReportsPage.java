/**
 * 
 */
package com.test.emergency.page;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.browser.setup.GeneralBrowserSetting;
import com.test.ui.helper.CommanUtill;

/**
 * @author Anup
 *
 * 15-Apr-2026
 */
public class Er_LabReportsPage extends GeneralBrowserSetting {

	protected static String facility = "//select[@id='Facility']";

	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";

	//=========================== Er Lab Report ============================

	protected static String Er_Order_Tab = "//span[normalize-space()='ER Order']";
	protected static String Er_Lab_Report_page = "//a[normalize-space()='Lab Reports']";

	//=========================== Search In Date Wise ============================
	protected static String Patient_Facility = "//select[@id='ddlfac']";
	protected static String search_Icon = "//i[@id='popupshow']";
	protected static String Date_Radio_Btn = "//input[@id='rdbtnpopdt']";
	protected static String Date_Radio_From_Date = "//input[@id='frmdt']";
	protected static String Date_Radio_To_Date = "//input[@id='todt']";
	protected static String Ward_Drp = "//select[@id='ddlward']";
	protected static String Seaech_And_Find_Report = "//i[@id='scrbtn']";
	protected static String Close_Seaech_And_Find_Report_pop = "//i[@id='popclose']";
	//============================ UHID ==================================
	protected static String UHID_Radio_Btn = "//input[@id='rdbtnpopuhid']";
	protected static String Enter_UHID = "//input[@id='txtbxcmn']";


	public void selectByFacilityDropdown(String fieldName) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(facility, fieldName);
	}
	public void clickOnEmergencyDashbord_StationDrpYesPop(String emergency_Dashbord, String Station_drp, String satrion_yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(emergency_dashbord, emergency_Dashbord);
		CommanUtill.dropdownSelectByVisibleText(department_drp, Station_drp);
		CommanUtill.clickFunction(yes_popup, Station_drp); 
	}
	public void clickOnEmercencyErLabReport(String emergency_btn, String LabReport ) throws IOException, InterruptedException { 

		CommanUtill.clickFunction(Er_Order_Tab, emergency_btn);
		CommanUtill.clickFunction(Er_Lab_Report_page, LabReport);
	}
	public void SelectPatientFaclilityReportDrp(String Faclility_Drp , String Search_Btn) throws IOException, InterruptedException { 

		CommanUtill.dropdownSelectByVisibleText(Patient_Facility, Faclility_Drp);
		CommanUtill.clickFunction(search_Icon, Search_Btn);
	}

	public void SearchDateFromeAndToDate(String Date_Radio_Button , String FromDate , String ToDate) throws IOException, InterruptedException { 

		CommanUtill.clickFunction(Date_Radio_Btn, Date_Radio_Button);

		WebElement fromDateField = driver.findElement(By.xpath(Date_Radio_From_Date));
		fromDateField.sendKeys(Keys.CONTROL + "a");
		fromDateField.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Date_Radio_From_Date, FromDate);
		fromDateField.sendKeys(Keys.TAB);

		WebElement ToDateField = driver.findElement(By.xpath(Date_Radio_To_Date));
		ToDateField.sendKeys(Keys.CONTROL + "a");
		ToDateField.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Date_Radio_To_Date, ToDate);
		ToDateField.sendKeys(Keys.TAB);
	}
	public void SelectWardDrp(String Ward ) throws IOException, InterruptedException { 

		CommanUtill.dropdownSelectByVisibleText(Ward_Drp, Ward);
	}
	public void ClickOnSearchAndFindReport(String Searxch_Icon ) throws IOException, InterruptedException { 

		CommanUtill.clickFunction(Seaech_And_Find_Report, Searxch_Icon);
	}
	public void CloseFindPatientReportPop(String Search_Pop)throws IOException, InterruptedException { 
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Close_Seaech_And_Find_Report_pop)));
		CommanUtill.clickFunction(Close_Seaech_And_Find_Report_pop, Search_Pop);
	}
	
	//============================ UHID ==================================
	public void ClickOnRadioBtnInUHID(String UHID_Radio_Button, String Enter_UHId) throws IOException, InterruptedException {
		
		CommanUtill.clickFunction(UHID_Radio_Btn, UHID_Radio_Button);
		CommanUtill.textEnter(Enter_UHID, Enter_UHId);
		
	}

		



}
