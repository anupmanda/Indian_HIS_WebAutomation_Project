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
 * 22-Apr-2026
 */
public class Report_TriagePatientBillStatusReportPage extends GeneralBrowserSetting {

	protected static String facility = "//select[@id='Facility']";

	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";

	protected static String Report_Tab = "//i[@class='fa fa-user-plus fa-lg']";
	protected static String Centralized_Report_Page = "//a[normalize-space()='Centralized Report']";

	//================================= Triage Patient Bill Status Report  ============================== 
	protected static String Triage_Patient_Bill_Status_Report_Page = "//a[normalize-space()='Triage Patient Bill Status']";
	protected static String Triage_Patient_Bill_Status_From_Date = "//input[@id='txtFromDate']";
	protected static String Triage_Patient_Bill_Status_To_Date = "//input[@id='txtToDate']";
	protected static String Triage_Patient_Bill_Status_Sort_By_Drp = "//select[@id='cmbsortby']";
	protected static String Triage_Patient_Bill_Status_Ascending_Radio_Btn = "//input[@id='rbdAsc']";
	protected static String Triage_Patient_Bill_Status_Descending_Radio_btn = "//input[@id='rbdDesc']";

	protected static String Click_Print_Btn = "//a[@id='btnReport']//i[@class='fa fa-print']";
	protected static String Click_On_CSV_Btn = "//i[@class='fa fa-file-excel-o']";
	protected static String Refresh_Btn = "//a[@id='btnClear']//i[@class='fa fa-refresh']";





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
	public void TriagePatientBillStatusReportPage (String TriagePatientBillStatusReport )  throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Triage_Patient_Bill_Status_Report_Page)));
		CommanUtill.clickFunction(Triage_Patient_Bill_Status_Report_Page, TriagePatientBillStatusReport);
	}
	//============================= Date =============================
	public void FromDateSerach(String From_Date) throws IOException ,InterruptedException {

		WebElement from_Date = driver.findElement(By.xpath(Triage_Patient_Bill_Status_From_Date));
		from_Date.sendKeys(Keys.CONTROL +"a");
		from_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Triage_Patient_Bill_Status_From_Date, From_Date);
		from_Date.sendKeys(Keys.TAB);
	}
	public void ToDateSerach(String to_Date) throws IOException ,InterruptedException {

		WebElement To_Date = driver.findElement(By.xpath(Triage_Patient_Bill_Status_To_Date));
		To_Date.sendKeys(Keys.CONTROL +"a");
		To_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Triage_Patient_Bill_Status_To_Date, to_Date);
		To_Date.sendKeys(Keys.TAB);
	}
	public void SelectBtSortByDrp(String SortBy) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Triage_Patient_Bill_Status_Sort_By_Drp)));
		CommanUtill.dropdownSelectByVisibleText(Triage_Patient_Bill_Status_Sort_By_Drp, SortBy);
	}
	public void SelectBtSortByDrpValue(int SortBy) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Triage_Patient_Bill_Status_Sort_By_Drp)));
		CommanUtill.dropdownSelectByIndex(Triage_Patient_Bill_Status_Sort_By_Drp, SortBy);
	}
	public void AscendingRadioBtn(String Ascending) throws IOException ,InterruptedException {

		WebElement Ascending_Radio_Btn = driver.findElement(By.xpath(Triage_Patient_Bill_Status_Ascending_Radio_Btn));
		if(! Ascending_Radio_Btn.isSelected()) {
		CommanUtill.clickFunction(Triage_Patient_Bill_Status_Ascending_Radio_Btn, Ascending);
		}
	}
	public void DescendingRadioBtn(String Descending) throws IOException ,InterruptedException {

		WebElement Ascending_Radio_Btn = driver.findElement(By.xpath(Triage_Patient_Bill_Status_Descending_Radio_btn));
		if(! Ascending_Radio_Btn.isSelected()) {
		CommanUtill.clickFunction(Triage_Patient_Bill_Status_Descending_Radio_btn, Descending);
		}
	}
	public void ClickOnPrintBtn(String print) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Print_Btn)));
		CommanUtill.clickFunction(Click_Print_Btn, print);
	}
	public void ClickOnCSVBtn(String Csv) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_On_CSV_Btn)));
		CommanUtill.clickFunction(Click_On_CSV_Btn, Csv);
	}
	public void ClickOnRefreshBtn(String Clean) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Refresh_Btn)));
		CommanUtill.clickFunction(Refresh_Btn, Clean);
	}
	
	
	

}
