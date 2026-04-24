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
 * 21-Apr-2026
 */
public class Er_Report_EmergencyTotalPatientReportPage extends GeneralBrowserSetting {

	protected static String facility = "//select[@id='Facility']";

	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";

	protected static String Report_Tab = "//i[@class='fa fa-user-plus fa-lg']";
	protected static String Centralized_Report_Page = "//a[normalize-space()='Centralized Report']";

	//================================= Total Patient Report ============================== 
	protected static String Total_Patient_Report_Page = "//a[normalize-space()='Emergency Total Patient Report']";
	protected static String Discharge_Report_Radio_Btn = "//input[@id='radDischargeReport']";
	protected static String Emergency_Converted_Patient_Report_Radio_Btn = "//input[@id='rademrconpatrpt']";
	protected static String All_Discharge_Converted_Patient_Report_Radio_Btn = "//input[@id='radAlldispatient']";
	protected static String Emergency_Current_Patient_Report_Radio_Btn = "//input[@id='rademrcurpatient']";
	protected static String ER_Readmission_Report_Radio_Btn = "//input[@id='ERReadmissionReport']";

	protected static String Total_Patient_Report_From_Date = "//input[@id='frmdate']";
	protected static String Total_Patient_Report_To_Date = "//input[@id='todate']";
	protected static String Search_Icon = "//a[@id='btnpreview']//i[@class='fa fa-search']";
	protected static String CSV_Sheet_Icon = "//i[@class='fa fa-file-excel-o']";

	protected String popupMessage = "//div[@id='gritter-notice-wrapper']//p";
	protected String popupCloseBtn = "//div[@id='gritter-notice-wrapper']//div[@class='gritter-close']";






	public void selectByFacilityDropdown(String fieldName) throws IOException, InterruptedException {

		CommanUtill.dropdownSelectByVisibleText(facility, fieldName);
	}
	public void clickOnEmergencyDashbord_StationDrpYesPop(String emergency_Dashbord, String Station_drp, String satrion_yes_popup) throws IOException, InterruptedException {

		CommanUtill.clickFunction(emergency_dashbord, emergency_Dashbord);
		CommanUtill.dropdownSelectByVisibleText(department_drp, Station_drp);
		CommanUtill.clickFunction(yes_popup, Station_drp); 
	}
	public void ErReport_CentralizedReport (String report, String Centralized_Report) throws IOException, InterruptedException { 

		CommanUtill.clickFunction(Report_Tab, report);
		CommanUtill.clickFunction(Centralized_Report_Page , Centralized_Report);
	}
	public void ClickOnEmergencyTotalPatientReport(String TotalPatientReport)  throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Total_Patient_Report_Page)));
		CommanUtill.clickFunction(Total_Patient_Report_Page, TotalPatientReport);
	}
	public void selectRadioBtnInDischargeReport(String Discharge_Report) throws IOException, InterruptedException { 

		WebElement Discharge = driver.findElement(By.xpath(Discharge_Report_Radio_Btn));
		if(! Discharge.isSelected()) {
			CommanUtill.clickFunction(Discharge_Report_Radio_Btn, Discharge_Report);
		}
	}
	public void FromDateSerach(String From_Date) throws IOException ,InterruptedException {

		WebElement from_Date = driver.findElement(By.xpath(Total_Patient_Report_From_Date));
		from_Date.sendKeys(Keys.CONTROL +"a");
		from_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Total_Patient_Report_From_Date, From_Date);
		from_Date.sendKeys(Keys.TAB);
	}
	public void ToDateSerach(String to_Date) throws IOException ,InterruptedException {

		WebElement To_Date = driver.findElement(By.xpath(Total_Patient_Report_To_Date));
		To_Date.sendKeys(Keys.CONTROL +"a");
		To_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Total_Patient_Report_To_Date, to_Date);
		To_Date.sendKeys(Keys.TAB);
	}
	public void SearchReportBtn(String Search) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Search_Icon)));
		CommanUtill.clickFunction(Search_Icon, Search);
	}
	public void ClickOnCSVExcelSheetBtn(String Csv)  throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CSV_Sheet_Icon)));
		CommanUtill.clickFunction(CSV_Sheet_Icon, Csv);
	}

	public void handleDynamicPopup() throws IOException, InterruptedException {

		logger.info("===== Handle Dynamic Popup =====");

		try {
			Thread.sleep(500);
			if (CommanUtill.isElementPresent(popupMessage)) {
				String message = driver.findElement(By.xpath(popupMessage)).getText().trim();
				System.out.println("Popup Message: " + message);
				logger.info("Popup Message: " + message);

				// Close popup
				if (CommanUtill.isElementPresent(popupCloseBtn)) {
					CommanUtill.clickFunction(popupCloseBtn ,"");
					logger.info("Popup closed successfully");
				}

			} else {
				logger.info("Popup not displayed");
				System.out.println("Popup not displayed");
			}

		} catch (Exception e) {
			logger.info("Error while handling popup: " + e.getMessage());
		}
	}
	//=========================== Emergency Converted Patient Report ===========================

	public void EmergencyConvertedPatientReportRadioBtn(String EmergencyConvertedPatient) throws IOException, InterruptedException { 

		WebElement Converted_Patient = driver.findElement(By.xpath(Emergency_Converted_Patient_Report_Radio_Btn));
		if(! Converted_Patient.isSelected()) {
			CommanUtill.clickFunction(Emergency_Converted_Patient_Report_Radio_Btn, EmergencyConvertedPatient);
		}
	}
	//=========================== All Discharge Converted/Patient Report ===========================

	public void AllDischargeConvertedPatientReportRadioBtn(String DischargeConvertedPatient) throws IOException, InterruptedException { 

		WebElement Discharge_Converted_Patient = driver.findElement(By.xpath(All_Discharge_Converted_Patient_Report_Radio_Btn));
		if(! Discharge_Converted_Patient.isSelected()) {
			CommanUtill.clickFunction(All_Discharge_Converted_Patient_Report_Radio_Btn, DischargeConvertedPatient);
		}
	}
	//=========================== Emergency Current Patient Report ===========================

	public void EmergencyCurrentPatientReportRadioBtn(String EmergencyCurrentPatient) throws IOException, InterruptedException { 

		WebElement Current_Patient = driver.findElement(By.xpath(Emergency_Current_Patient_Report_Radio_Btn));
		if(! Current_Patient.isSelected()) {
			CommanUtill.clickFunction(Emergency_Current_Patient_Report_Radio_Btn, EmergencyCurrentPatient);
		}
	}
	//=========================== ER Readmission Report ===========================

	public void ERReadmissionReportRadioBtn(String ReadmissionReport) throws IOException, InterruptedException { 

		WebElement Readmission_Report = driver.findElement(By.xpath(ER_Readmission_Report_Radio_Btn));
		if(! Readmission_Report.isSelected()) {
			CommanUtill.clickFunction(ER_Readmission_Report_Radio_Btn, ReadmissionReport);
		}
	}

}
