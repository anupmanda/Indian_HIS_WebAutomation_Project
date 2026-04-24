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
public class Report_TriageDeptWiseTestAndRevenuePage extends GeneralBrowserSetting {

	protected static String facility = "//select[@id='Facility']";

	protected static String emergency_dashbord = "//li[@id='btn_Emergency']";
	protected static String department_drp = "//select[@id='Department']";
	protected static String yes_popup = "//a[@id='btn_yes_desh']";

	protected static String Report_Tab = "//i[@class='fa fa-user-plus fa-lg']";
	protected static String Centralized_Report_Page = "//a[normalize-space()='Centralized Report']";

	//================================= Triage Patient Bill Status Report  ============================== 
	protected static String Triage_Dept_Wise_Test_Revenue_Page = "//a[normalize-space()='Triage Dept Wise Test & Revenue']";
	protected static String Triage_Dept_Wise_Test_Revenue_Summary_Radio_Btn = "//input[@id='rblPatientWiseReport']";
	protected static String Triage_Dept_Wise_Test_Revenue_Detail_Radio_Btn = "//input[@id='rblFacilityWiseReport']";
	protected static String Triage_Dept_Wise_Test_Revenue_From_Date = "//input[@id='txtFromDate']";
	protected static String Triage_Dept_Wise_Test_Revenue_To_Date = "//input[@id='txtToDate']";

	protected static String Triage_Dept_Wise_Test_Revenue_All_Radio_Btn = "//input[@id='rblAll']";
	protected static String Triage_Dept_Wise_Test_Revenue_Specific_Radio_Btn = "//input[@id='rblSpecific']";
	protected static String Click_Print_Icon = "//a[@id='btnprint']//i[@class='fa fa-print']";
	protected static String Click_CSV_Iocn = "//i[@class='fa fa-file-excel-o']";
	protected static String Click_Refresh_Btn = "//a[@id='btnRefresh']//i[@class='fa fa-refresh']";

	//====================== Select Department Check Box ============================
	protected static String Department_Check_Box = "//table[@id='tblDeparment']//tbody//tr[7]//input";
	


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
	public void TriageDeptWiseTestAndRevenuePage (String TriageDeptWiseTestAndRevenue )  throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Triage_Dept_Wise_Test_Revenue_Page)));
		CommanUtill.clickFunction(Triage_Dept_Wise_Test_Revenue_Page, TriageDeptWiseTestAndRevenue);
	}
	
	//============================= Triage Dept Wise Test Revenue  =============================

	public void ClickOnSummaryRadioBtn (String Summary )  throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Triage_Dept_Wise_Test_Revenue_Summary_Radio_Btn)));
		CommanUtill.clickFunction(Triage_Dept_Wise_Test_Revenue_Summary_Radio_Btn, Summary);
	}
	public void ClickOnDetailyRadioBtn (String  Detail )  throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Triage_Dept_Wise_Test_Revenue_Detail_Radio_Btn)));
		CommanUtill.clickFunction(Triage_Dept_Wise_Test_Revenue_Detail_Radio_Btn,  Detail);
	}
	public void FromDateSerach(String From_Date) throws IOException ,InterruptedException {

		WebElement from_Date = driver.findElement(By.xpath(Triage_Dept_Wise_Test_Revenue_From_Date));
		from_Date.sendKeys(Keys.CONTROL +"a");
		from_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Triage_Dept_Wise_Test_Revenue_From_Date, From_Date);
		from_Date.sendKeys(Keys.TAB);
	}
	public void ToDateSerach(String to_Date) throws IOException ,InterruptedException {

		WebElement To_Date = driver.findElement(By.xpath(Triage_Dept_Wise_Test_Revenue_To_Date));
		To_Date.sendKeys(Keys.CONTROL +"a");
		To_Date.sendKeys(Keys.DELETE);
		CommanUtill.textEnter(Triage_Dept_Wise_Test_Revenue_To_Date, to_Date);
		To_Date.sendKeys(Keys.TAB);
	}
	public void ClickAllRadioBtn (String All )  throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Triage_Dept_Wise_Test_Revenue_All_Radio_Btn)));
		CommanUtill.clickFunction(Triage_Dept_Wise_Test_Revenue_All_Radio_Btn, All);
	}
	//============================ Specific =============================
	public void ClickSpecificRadioBtn (String Specific , String Department)  throws IOException, InterruptedException { 

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Triage_Dept_Wise_Test_Revenue_Specific_Radio_Btn)));
		CommanUtill.clickFunction(Triage_Dept_Wise_Test_Revenue_Specific_Radio_Btn, Specific);
		CommanUtill.clickFunction(Department_Check_Box, Department);
	}
	//===================== *********** ===============================
	public void ClickOnPrintBtn(String print) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Print_Icon)));
		CommanUtill.clickFunction(Click_Print_Icon, print);
	}
	public void ClickOnCSVBtn(String Csv) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_CSV_Iocn)));
		CommanUtill.clickFunction(Click_CSV_Iocn, Csv);
	}
	public void ClickOnRefreshBtn(String Clean) throws IOException ,InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Click_Refresh_Btn)));
		CommanUtill.clickFunction(Click_Refresh_Btn, Clean);
	}
	
	


}
