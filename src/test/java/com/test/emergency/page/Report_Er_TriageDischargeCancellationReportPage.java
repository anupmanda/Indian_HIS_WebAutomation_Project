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
public class Report_Er_TriageDischargeCancellationReportPage extends GeneralBrowserSetting {
	
	protected static String facility = "//select[@id='Facility']";

	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";

	protected static String Report_Tab = "//i[@class='fa fa-user-plus fa-lg']";
	protected static String Centralized_Report_Page = "//a[normalize-space()='Centralized Report']";

	//================================= Triage Patient Bill Status Report  ============================== 
	protected static String Triage_Discharge_Cancellation_Report_Page = "//a[normalize-space()='Triage Discharge Cancellation Report']";
	protected static String Triage_Discharge_Cancellation_Frome_Date = "//input[@id='discanfrmdate']";
	protected static String Triage_Discharge_Cancellation_To_Date = "//input[@id='discantodate']";
	protected static String Click_Print_Icon = "//a[@id='btnsearchtdc']//i[@class='fa fa-print']";
	protected static String Click_Csv_Icon = "//i[@class='fa fa-file-excel-o']";
	
	
	
	
	
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
	public void TriageDischargeCancellationPage (String TriageDischargeCancellation )  throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Triage_Discharge_Cancellation_Report_Page)));
		CommanUtill.clickFunction(Triage_Discharge_Cancellation_Report_Page, TriageDischargeCancellation);
	}
	//============================= Date =============================
		public void FromDateSerach(String From_Date) throws IOException ,InterruptedException {

			WebElement from_Date = driver.findElement(By.xpath(Triage_Discharge_Cancellation_Frome_Date));
			from_Date.sendKeys(Keys.CONTROL +"a");
			from_Date.sendKeys(Keys.DELETE);
			CommanUtill.textEnter(Triage_Discharge_Cancellation_Frome_Date, From_Date);
			from_Date.sendKeys(Keys.TAB);
		}
		public void ToDateSerach(String to_Date) throws IOException ,InterruptedException {

			WebElement To_Date = driver.findElement(By.xpath(Triage_Discharge_Cancellation_To_Date));
			To_Date.sendKeys(Keys.CONTROL +"a");
			To_Date.sendKeys(Keys.DELETE);
			CommanUtill.textEnter(Triage_Discharge_Cancellation_To_Date, to_Date);
			To_Date.sendKeys(Keys.TAB);
		}
		
		public void ClickOnPrintBtn(String print) throws IOException ,InterruptedException {

			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Print_Icon)));
			CommanUtill.clickFunction(Click_Print_Icon, print);
		}
		public void ClickOnCSVBtn(String Csv) throws IOException ,InterruptedException {

			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Csv_Icon)));
			CommanUtill.clickFunction(Click_Csv_Icon, Csv);
		}
  		

}
